package com.bear.controller;

import com.bear.ProductService;
import com.bear.entity.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
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

//    @Value("${server.port}")
//    public String port;
    @Resource
    public ProductService productService;

    @GetMapping("findAll")
    public List<Product> findAll(){
        return productService.all();
    }

    @GetMapping("findOne")
    public Product findOne(String id){
        Product byId = productService.findById(id);
        Product product = new Product();
        BeanUtils.copyProperties(byId,product);
//        product.setName(byId.getName()+" use port "+port);
        return product;
    }
}
