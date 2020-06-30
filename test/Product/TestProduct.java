package Product;

import cn.easybuy.dao.product.ProductMapper;
import cn.easybuy.entity.product.Category;
import cn.easybuy.entity.product.Product;
import cn.easybuy.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {

    Logger log = Logger.getLogger(TestProduct.class);
    @Test
    public void getCategoryByType(){
        SqlSession sqlSession = null;
        List<Category> categories = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            categories = sqlSession.getMapper(ProductMapper.class).getCategoryByType(2,3);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        for(Category category :categories){
            log.debug(category.getName());
        }
    }

    @Test
    public void getCategoryAndProductById(){
        SqlSession sqlSession = null;
        List<Product> products = new ArrayList<>();
        try{
            sqlSession = MyBatisUtil.createSqlSession();
            products = sqlSession.getMapper(ProductMapper.class).getCategoryAndProductById(2);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        for (Product product : products){
            log.debug(product.getName());
        }
    }
}
