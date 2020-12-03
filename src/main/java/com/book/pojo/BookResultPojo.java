package com.book.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * book_result
 * @author 
 */
@Data
@Setter
@Getter
public class BookResultPojo implements Serializable {
    /**
     * 标识code
     */
    private String resultCode;

    /**
     * 书编号
     */
    private String bookCode;

    private Date resultDate;

    /**
     * 当日点击数
     */
    private Integer dateClicks;

    private Integer dataLove;

    private Integer dataHate;

    /**
     * 当日收藏书
     */
    private Integer dataCollection;

    private static final long serialVersionUID = 1L;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Date getResultDate() {
        return resultDate;
    }

    public void setResultDate(Date resultDate) {
        this.resultDate = resultDate;
    }

    public Integer getDateClicks() {
        return dateClicks;
    }

    public void setDateClicks(Integer dateClicks) {
        this.dateClicks = dateClicks;
    }

    public Integer getDataLove() {
        return dataLove;
    }

    public void setDataLove(Integer dataLove) {
        this.dataLove = dataLove;
    }

    public Integer getDataHate() {
        return dataHate;
    }

    public void setDataHate(Integer dataHate) {
        this.dataHate = dataHate;
    }

    public Integer getDataCollection() {
        return dataCollection;
    }

    public void setDataCollection(Integer dataCollection) {
        this.dataCollection = dataCollection;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BookResultPojo other = (BookResultPojo) that;
        return (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getBookCode() == null ? other.getBookCode() == null : this.getBookCode().equals(other.getBookCode()))
            && (this.getResultDate() == null ? other.getResultDate() == null : this.getResultDate().equals(other.getResultDate()))
            && (this.getDateClicks() == null ? other.getDateClicks() == null : this.getDateClicks().equals(other.getDateClicks()))
            && (this.getDataLove() == null ? other.getDataLove() == null : this.getDataLove().equals(other.getDataLove()))
            && (this.getDataHate() == null ? other.getDataHate() == null : this.getDataHate().equals(other.getDataHate()))
            && (this.getDataCollection() == null ? other.getDataCollection() == null : this.getDataCollection().equals(other.getDataCollection()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getBookCode() == null) ? 0 : getBookCode().hashCode());
        result = prime * result + ((getResultDate() == null) ? 0 : getResultDate().hashCode());
        result = prime * result + ((getDateClicks() == null) ? 0 : getDateClicks().hashCode());
        result = prime * result + ((getDataLove() == null) ? 0 : getDataLove().hashCode());
        result = prime * result + ((getDataHate() == null) ? 0 : getDataHate().hashCode());
        result = prime * result + ((getDataCollection() == null) ? 0 : getDataCollection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resultCode=").append(resultCode);
        sb.append(", bookCode=").append(bookCode);
        sb.append(", resultDate=").append(resultDate);
        sb.append(", dateClicks=").append(dateClicks);
        sb.append(", dataLove=").append(dataLove);
        sb.append(", dataHate=").append(dataHate);
        sb.append(", dataCollection=").append(dataCollection);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}