package cn.zengchen233.service.impl;

import cn.zengchen233.constants.SystemConstants;
import cn.zengchen233.domain.ResponseResult;
import cn.zengchen233.entity.Article;
import cn.zengchen233.service.ArticleService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.zengchen233.entity.Category;
import cn.zengchen233.service.CategoryService;
import cn.zengchen233.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
* @author zengchen
* @description 针对表【sg_category(分类表)】的数据库操作Service实现
* @createDate 2023-10-24 19:26:45
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService{

    @Autowired
    private ArticleService articleService;
    @Override
    public ResponseResult getCategoryList() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //查询文章表,状态为已发布的文章
        queryWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        List<Article> articleList = articleService.list(queryWrapper);
        //获取文章的分类id，并且去重
        Set<Long> categoryIds = articleList.stream()
                .map(article -> article.getCategoryId())
                .collect(Collectors.toSet());
        return null;
    }
}




