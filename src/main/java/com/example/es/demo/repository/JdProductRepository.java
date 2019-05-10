package com.example.es.demo.repository;

import com.example.es.demo.po.JdProductPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 京东商品信息持久化
 *
 * @author haibin.tang
 * @create 2018-06-14 下午6:54
 **/
@Repository
public interface JdProductRepository extends JpaRepository<JdProductPo, String> {
}
