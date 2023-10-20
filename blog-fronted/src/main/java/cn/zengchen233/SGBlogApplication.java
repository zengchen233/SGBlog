package cn.zengchen233;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zengchen
 * @title SGBlogApplication
 * @description
 * @create 2023/10/20
 */
@SpringBootApplication
@MapperScan("cn.zengchen233.mapper")
public class SGBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(SGBlogApplication.class, args);
    }
}
