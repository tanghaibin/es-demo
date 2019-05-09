package com.example.es.demo.service;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.indices.template.GetTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author haibin.tang
 * @create 2019-04-14 10:38 PM
 **/
@Slf4j
@Service
public class TestService {

    public static void main(String[] args) throws IOException {
        JestClientFactory jestClientFactory = new JestClientFactory();
        JestClient client = jestClientFactory.getObject();
//        String jsonString = client.execute(new CreateIndex.Builder("first-index").build()).getJsonString();
//        log.info(jsonString);


        String jsonString1 = client.execute( new GetTemplate.Builder("first-index").build()).getJsonString();
        log.info(jsonString1);
    }
}
