package cn.zengchen233.controller;

import cn.zengchen233.domain.ResponseResult;
import cn.zengchen233.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengchen
 * @title ArticleController
 * @description
 * @create 2023/10/20
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {
        // 查询热门文章，封装成ResponseResult返回
        return articleService.hotArticleList();
    }
}
