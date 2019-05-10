package com.example.es.demo.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author haibin.tang
 * @create 2019-05-10 1:42 PM
 **/
public interface ProductSearchRepository extends ElasticsearchRepository<ProductEntity, String> {
}
