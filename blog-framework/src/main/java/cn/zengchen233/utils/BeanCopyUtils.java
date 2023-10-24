package cn.zengchen233.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zengchen
 * @title BeanCopyUtils
 * @description
 * @create 2023/10/24
 */
public class BeanCopyUtils {
    private BeanCopyUtils() {

    }

    public static <V> V copyBean(Object source, Class<V> inClass) {
        // 创建目标对象
        V result = null;
        try {
            result = inClass.newInstance();
            // 实现属性拷贝
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 返回结果
        return result;
    }

    public static <O, V> List<V> copyBeanList(List<O> list, Class<V> inClass) {
        return list.stream().map(o -> copyBean(o, inClass)).collect(Collectors.toList());
    }
}
