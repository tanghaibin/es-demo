package com.example.es.demo.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 京东商品信息
 * @author haibin.tang
 * @create 2018-06-14 下午6:53
 **/
@Entity
@Table(name = "JD_PRODUCT")
@Data
public class JdProductPo {

    /**
     * 商品编号
     */
    @Id
    private String sku;

    /**
     * 价格
     */
    @Column(length = 10)
    private String price;

    /**
     * 图片
     */
    @Column(length = 100)
    private String img;

    /**
     * 商品名称
     */
    @Column(length = 200)
    private String productName;

    /**
     * 店铺名称
     */
    @Column(length = 80)
    private String shopName;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
