package com.example.es.demo.search;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

/**
 * @author haibin.tang
 * @create 2019-05-10 11:40 AM
 **/
@Data
@Document(indexName = "jd-product-index", shards = 1, replicas = 0, refreshInterval = "-1")
@NoArgsConstructor
public class ProductEntity {

    /**
     * 商品编号
     */
    @Id
    private String sku;

    /**
     * 价格
     */
    private String price;

    /**
     * 图片
     */
    private String img;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 店铺名称
     */
    private String shopName;

    @Field(format = DateFormat.basic_date_time)
    private Date createDate;

    @Field(format = DateFormat.basic_date_time)
    private Date updateDate;
}
