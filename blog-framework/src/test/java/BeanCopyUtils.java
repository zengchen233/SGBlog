import cn.zengchen233.entity.Article;
import cn.zengchen233.entity.vo.HotArticleVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zengchen
 * @title BeanCopyUtils
 * @description
 * @create 2023/10/24
 */
public class BeanCopyUtils {
    @Test
    public void test1() {
        Article article = new Article();
        article.setId(1L);
        article.setTitle("xws");
        HotArticleVo hotArticleVo = cn.zengchen233.utils.BeanCopyUtils.copyBean(article, HotArticleVo.class);
        System.out.println(hotArticleVo);
    }
}
