package cn.zengchen233.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.zengchen233.entity.Article;
import cn.zengchen233.service.ArticleService;
import cn.zengchen233.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author zengchen
* @description 针对表【sg_article(文章表)】的数据库操作Service实现
* @createDate 2023-10-20 15:45:33
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




