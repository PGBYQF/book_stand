package com.book.interceptor;

import com.book.common.HttpCodeEnum;
import com.book.common.JsonUtil;
import com.book.common.ResultResponse;
import io.micrometer.core.instrument.util.JsonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

@Component
public class PermissionsFilter implements Filter {

    @Value("${ignore-url}")
    private String ignoreUrl;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        //判断方法不进行过滤
        String requestURI = httpServletRequest.getRequestURI();
        System.out.println();
        String [] ignoreUrlList = ignoreUrl.split(",");
        boolean boolIgnore = false;
        for (String ignoreUrlString : ignoreUrlList) {
            if (requestURI.contains(ignoreUrlString)) {
                chain.doFilter(request, response);
                boolIgnore = true;
            }
        }
        if (boolIgnore == false) {
            String userToken = httpServletRequest.getHeader("userToken");
            if (userToken == null || "".equals(userToken)) {
                ResultResponse resultResponse = new ResultResponse(HttpCodeEnum.NULLTOKEN.getCode(),"NO TOKEN , CAN'T OPERATE");
                ReturnPrintWriter(response,resultResponse);
                chain.doFilter(request, response);
            }else if("panguibao".equals(userToken)){
                chain.doFilter(request, response);
            }else{
                ResultResponse resultResponse = new ResultResponse(HttpCodeEnum.NULLTOKEN.getCode(),"TOKEN ERROR , CAN'T OPERATE");
                ReturnPrintWriter(response,resultResponse);
                chain.doFilter(request, response);
            }

        }
    }

    /**
     * 返回错误信息
     * @param response
     * @param resultResponse
     * @throws IOException
     */
    private void ReturnPrintWriter(ServletResponse response,ResultResponse resultResponse) throws IOException {
        ServletOutputStream printWriter = response.getOutputStream();
        printWriter.print(JsonUtil.object2Json(resultResponse));
        printWriter.flush();
        printWriter.close();
    }
}
