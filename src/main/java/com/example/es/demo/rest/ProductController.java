package com.example.es.demo.rest;

import com.example.es.demo.service.ProductService;
import com.haibin.common.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haibin.tang
 * @create 2019-05-10 10:48 AM
 **/
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    public JsonResult list(@RequestParam int page, @RequestParam int limit) {
        return new JsonResult(productService.list(new PageRequest(page, limit)));
    }

    @GetMapping("sync")
    public JsonResult sync() {
        productService.sync();
        return new JsonResult();
    }
}
