package com.book.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * book_info
 * @author 
 */
@Data
@Setter
@Getter
@ApiModel(value = "BookInfoPojo",description = "书基础信息类")
public class BookInfoPojo implements Serializable {
    /**
     * 书编号
     */
    private String bookCode;

    /**
     * 书名称
     */
    private String bookName;

    /**
     * 书状态（1更新 2完结）
     */
    private Integer bookState;

    /**
     * 类型编号
     */
    private String bookTypeCode;

    /**
     * 类型名称
     */
    private String bookTypeName;

    /**
     * 简介
     */
    private String bookDesc;

    /**
     * 封面
     */
    private String bookImg;

    /**
     * 标签
     */
    private String bookLabel;

    /**
     * 最后变更时间
     */
    private String bookLastTime;

    /**
     * 最后更新时间
     */
    private String bookModifyTime;

    /**
     * 发布时间
     */
    private String bookCreateTime;

    /**
     * 作者
     */
    private String bookAutor;

    /**
     * 点击数
     */
    private Integer bookClicks;

    /**
     * 喜爱数
     */
    private Integer bookLove;

    /**
     * 讨厌数
     */
    private Integer bookHate;

    private Integer bookCollection;

    /**
     * 书总字数
     */
    private Integer bookNumber;

    private static final long serialVersionUID = 1L;

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookState() {
        return bookState;
    }

    public void setBookState(Integer bookState) {
        this.bookState = bookState;
    }

    public String getBookTypeCode() {
        return bookTypeCode;
    }

    public void setBookTypeCode(String bookTypeCode) {
        this.bookTypeCode = bookTypeCode;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookLabel() {
        return bookLabel;
    }

    public void setBookLabel(String bookLabel) {
        this.bookLabel = bookLabel;
    }

    public String getBookLastTime() {
        return bookLastTime;
    }

    public void setBookLastTime(String bookLastTime) {
        this.bookLastTime = bookLastTime;
    }

    public String getBookModifyTime() {
        return bookModifyTime;
    }

    public void setBookModifyTime(String bookModifyTime) {
        this.bookModifyTime = bookModifyTime;
    }

    public String getBookCreateTime() {
        return bookCreateTime;
    }

    public void setBookCreateTime(String bookCreateTime) {
        this.bookCreateTime = bookCreateTime;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public void setBookAutor(String bookAutor) {
        this.bookAutor = bookAutor;
    }

    public Integer getBookClicks() {
        return bookClicks;
    }

    public void setBookClicks(Integer bookClicks) {
        this.bookClicks = bookClicks;
    }

    public Integer getBookLove() {
        return bookLove;
    }

    public void setBookLove(Integer bookLove) {
        this.bookLove = bookLove;
    }

    public Integer getBookHate() {
        return bookHate;
    }

    public void setBookHate(Integer bookHate) {
        this.bookHate = bookHate;
    }

    public Integer getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(Integer bookCollection) {
        this.bookCollection = bookCollection;
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
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
        BookInfoPojo other = (BookInfoPojo) that;
        return (this.getBookCode() == null ? other.getBookCode() == null : this.getBookCode().equals(other.getBookCode()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookState() == null ? other.getBookState() == null : this.getBookState().equals(other.getBookState()))
            && (this.getBookTypeCode() == null ? other.getBookTypeCode() == null : this.getBookTypeCode().equals(other.getBookTypeCode()))
            && (this.getBookTypeName() == null ? other.getBookTypeName() == null : this.getBookTypeName().equals(other.getBookTypeName()))
            && (this.getBookDesc() == null ? other.getBookDesc() == null : this.getBookDesc().equals(other.getBookDesc()))
            && (this.getBookImg() == null ? other.getBookImg() == null : this.getBookImg().equals(other.getBookImg()))
            && (this.getBookLabel() == null ? other.getBookLabel() == null : this.getBookLabel().equals(other.getBookLabel()))
            && (this.getBookLastTime() == null ? other.getBookLastTime() == null : this.getBookLastTime().equals(other.getBookLastTime()))
            && (this.getBookModifyTime() == null ? other.getBookModifyTime() == null : this.getBookModifyTime().equals(other.getBookModifyTime()))
            && (this.getBookCreateTime() == null ? other.getBookCreateTime() == null : this.getBookCreateTime().equals(other.getBookCreateTime()))
            && (this.getBookAutor() == null ? other.getBookAutor() == null : this.getBookAutor().equals(other.getBookAutor()))
            && (this.getBookClicks() == null ? other.getBookClicks() == null : this.getBookClicks().equals(other.getBookClicks()))
            && (this.getBookLove() == null ? other.getBookLove() == null : this.getBookLove().equals(other.getBookLove()))
            && (this.getBookHate() == null ? other.getBookHate() == null : this.getBookHate().equals(other.getBookHate()))
            && (this.getBookCollection() == null ? other.getBookCollection() == null : this.getBookCollection().equals(other.getBookCollection()))
            && (this.getBookNumber() == null ? other.getBookNumber() == null : this.getBookNumber().equals(other.getBookNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookCode() == null) ? 0 : getBookCode().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookState() == null) ? 0 : getBookState().hashCode());
        result = prime * result + ((getBookTypeCode() == null) ? 0 : getBookTypeCode().hashCode());
        result = prime * result + ((getBookTypeName() == null) ? 0 : getBookTypeName().hashCode());
        result = prime * result + ((getBookDesc() == null) ? 0 : getBookDesc().hashCode());
        result = prime * result + ((getBookImg() == null) ? 0 : getBookImg().hashCode());
        result = prime * result + ((getBookLabel() == null) ? 0 : getBookLabel().hashCode());
        result = prime * result + ((getBookLastTime() == null) ? 0 : getBookLastTime().hashCode());
        result = prime * result + ((getBookModifyTime() == null) ? 0 : getBookModifyTime().hashCode());
        result = prime * result + ((getBookCreateTime() == null) ? 0 : getBookCreateTime().hashCode());
        result = prime * result + ((getBookAutor() == null) ? 0 : getBookAutor().hashCode());
        result = prime * result + ((getBookClicks() == null) ? 0 : getBookClicks().hashCode());
        result = prime * result + ((getBookLove() == null) ? 0 : getBookLove().hashCode());
        result = prime * result + ((getBookHate() == null) ? 0 : getBookHate().hashCode());
        result = prime * result + ((getBookCollection() == null) ? 0 : getBookCollection().hashCode());
        result = prime * result + ((getBookNumber() == null) ? 0 : getBookNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookCode=").append(bookCode);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookState=").append(bookState);
        sb.append(", bookTypeCode=").append(bookTypeCode);
        sb.append(", bookTypeName=").append(bookTypeName);
        sb.append(", bookDesc=").append(bookDesc);
        sb.append(", bookImg=").append(bookImg);
        sb.append(", bookLabel=").append(bookLabel);
        sb.append(", bookLastTime=").append(bookLastTime);
        sb.append(", bookModifyTime=").append(bookModifyTime);
        sb.append(", bookCreateTime=").append(bookCreateTime);
        sb.append(", bookAutor=").append(bookAutor);
        sb.append(", bookClicks=").append(bookClicks);
        sb.append(", bookLove=").append(bookLove);
        sb.append(", bookHate=").append(bookHate);
        sb.append(", bookCollection=").append(bookCollection);
        sb.append(", bookNumber=").append(bookNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}