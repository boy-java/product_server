package com.bear.controller;

import com.bear.ProductService;
import com.bear.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Author XiaoXiong.Li
 * @Date 23:37 2020/5/19
 */
@RestController
public class ProductController {
    @Resource
    public ProductService productService;

    @GetMapping("findAll")
    public List<Product> findAll(){
        return productService.all();
    }

    @GetMapping("findById")
    public Product findById(String id){
        return productService.findById(id);
    }
}
