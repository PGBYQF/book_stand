package com.book.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 章节内容表
 * </p>
 *
 * @author jobob
 * @since 2020-12-17
 */
@Data
@Setter
@Getter
@ApiModel(value="BookChapter对象", description="章节内容表")
public class BookChapter implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识编号")
    private String chapterCode;

    @ApiModelProperty(value = "章节名")
    private String chapterName;

    @ApiModelProperty(value = "书编号")
    private String bookCode;

    @ApiModelProperty(value = "章节内容")
    private String chapterContent;

    @ApiModelProperty(value = "章节字数")
    private Integer chapterNumber;


}
