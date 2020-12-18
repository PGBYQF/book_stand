package com.book.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author jobob
 * @since 2020-12-17
 */
@Data
@Setter
@Getter
@ApiModel(value="BookUser对象", description="用户表")
public class BookUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户编号")
    private String userCode;

    @ApiModelProperty(value = "用户昵称")
    private String userName;

    @ApiModelProperty(value = "用户电话")
    private String userPhone;

    @ApiModelProperty(value = "用户标签")
    private String userLabel;

    @ApiModelProperty(value = "用户最后一次在线时间")
    private LocalDateTime userLastTime;

    @ApiModelProperty(value = "用户年龄")
    private Integer userAge;


}
