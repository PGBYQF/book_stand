package com.book.pojo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * book_chapter
 * @author 
 */
@Data
@Setter
@Getter
@ApiModel(value = "BookResultPojo 书结果类")
public class BookChapterPojo implements Serializable {
    /**
     * 标识编号
     */
    private String chapterCode;

    /**
     * 章节名
     */
    private String chapterName;

    /**
     * 书编号
     */
    private String bookCode;

    /**
     * 章节字数
     */
    private Integer chapterNumber;

    /**
     * 章节内容
     */
    private String chapterContent;

    private static final long serialVersionUID = 1L;

    public String getChapterCode() {
        return chapterCode;
    }

    public void setChapterCode(String chapterCode) {
        this.chapterCode = chapterCode;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getChapterContent() {
        return chapterContent;
    }

    public void setChapterContent(String chapterContent) {
        this.chapterContent = chapterContent;
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
        BookChapterPojo other = (BookChapterPojo) that;
        return (this.getChapterCode() == null ? other.getChapterCode() == null : this.getChapterCode().equals(other.getChapterCode()))
            && (this.getChapterName() == null ? other.getChapterName() == null : this.getChapterName().equals(other.getChapterName()))
            && (this.getBookCode() == null ? other.getBookCode() == null : this.getBookCode().equals(other.getBookCode()))
            && (this.getChapterNumber() == null ? other.getChapterNumber() == null : this.getChapterNumber().equals(other.getChapterNumber()))
            && (this.getChapterContent() == null ? other.getChapterContent() == null : this.getChapterContent().equals(other.getChapterContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChapterCode() == null) ? 0 : getChapterCode().hashCode());
        result = prime * result + ((getChapterName() == null) ? 0 : getChapterName().hashCode());
        result = prime * result + ((getBookCode() == null) ? 0 : getBookCode().hashCode());
        result = prime * result + ((getChapterNumber() == null) ? 0 : getChapterNumber().hashCode());
        result = prime * result + ((getChapterContent() == null) ? 0 : getChapterContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chapterCode=").append(chapterCode);
        sb.append(", chapterName=").append(chapterName);
        sb.append(", bookCode=").append(bookCode);
        sb.append(", chapterNumber=").append(chapterNumber);
        sb.append(", chapterContent=").append(chapterContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}