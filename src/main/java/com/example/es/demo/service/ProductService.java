package com.example.es.demo.service;

import com.example.es.demo.repository.JdProductRepository;
import com.example.es.demo.search.ProductEntity;
import com.example.es.demo.search.ProductSearchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

/**
 * @author haibin.tang
 * @create 2019-05-10 10:47 AM
 **/
@Slf4j
@Service
public class ProductService {
    @Autowired
    private JdProductRepository productRepository;
    @Autowired
    private ProductSearchRepository searchRepository;

    @Autowired
    private ElasticsearchOperations operations;

    public Iterable<ProductEntity> list(PageRequest pageRequest) {
        return searchRepository.findAll();
    }

    public void sync() {
        operations.deleteIndex(ProductEntity.class);
        boolean index = operations.createIndex(ProductEntity.class);
        productRepository.findAll(new PageRequest(1, 10)).forEach(po -> {
            ProductEntity productEntity = new ProductEntity();
            BeanUtils.copyProperties(po, productEntity);
            searchRepository.save(productEntity);
        });
    }
}
