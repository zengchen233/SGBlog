package cn.zengchen233.service.impl;

import cn.zengchen233.domain.ResponseResult;
import cn.zengchen233.entity.Article;
import cn.zengchen233.mapper.ArticleMapper;
import cn.zengchen233.service.ArticleService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zengchen
 * @description 针对表【sg_article(文章表)】的数据库操作Service实现
 * @createDate 2023-10-20 15:45:33
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public ResponseResult hotArticleList() {
        // 查询热门文章
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        // 要求正式文章
        queryWrapper.eq(Article::getStatus, 0);
        // 按照浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount); // 升序
        // 最多查出来十条
        Page<Article> page = new Page<>(1, 10);
        page(page, queryWrapper);
        List<Article> list = page.getRecords();
        return ResponseResult.okResult(list);
    }
}




