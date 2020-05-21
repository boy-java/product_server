package com.bear.mapper;

import com.bear.entity.Product;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @Author XiaoXiong.Li
 * @Date 23:19 2020/5/19 
 */
public interface ProductMapper {

    @Select("SELECT * FROM product")
    List<Product> all();

    @Select("SELECT * FROM product WHERE id = #{id}")
    Product findByid(String id);
}
