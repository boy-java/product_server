package com.bear;

import com.bear.entity.Product;
import java.util.List;

/**
 * @Author XiaoXiong.Li
 * @Date 23:25 2020/5/19 
 */
public interface ProductService {
    List<Product> all();
    
    Product findById(String id);
}
