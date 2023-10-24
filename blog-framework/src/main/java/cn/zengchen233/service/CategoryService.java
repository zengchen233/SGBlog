package cn.zengchen233.service;

import cn.zengchen233.domain.ResponseResult;
import cn.zengchen233.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author zengchen
* @description 针对表【sg_category(分类表)】的数据库操作Service
* @createDate 2023-10-24 19:26:45
*/
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
