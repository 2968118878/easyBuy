package cn.easybuy.dao.product;

import cn.easybuy.entity.product.Category;
import cn.easybuy.entity.product.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    /**
     * 根据Type查询分类
     */
    public List<Category> getCategoryByType(@Param("type") int type,@Param("parentId") int parentId);

    /**
     * 根据id查询类型下的商品列表
     * @param id
     */
    public List<Product> getCategoryAndProductById(@Param("id") int id);
}
