package com.bear;

import com.bear.entity.Product;
import com.bear.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Author XiaoXiong.Li
 * @Date 23:28 2020/5/19
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    public ProductMapper mapper;

    @Override
    public List<Product> all() {
        return mapper.all();
    }

    @Override
    public Product findById(String id) {
        return mapper.findById(id);
    }
}
