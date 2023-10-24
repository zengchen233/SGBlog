package cn.zengchen233.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zengchen
 * @title HotArticleVo
 * @description
 * @create 2023/10/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotArticleVo {
    private long id;
    private String title;
    private Long viewCount;
}
