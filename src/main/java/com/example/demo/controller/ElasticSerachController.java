package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.vo.ConsumeVo;
import com.example.demo.vo.ResponseView;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ElasticSerachController {

    @Autowired
    private PersonRepository repo;

    @ResponseBody
    @RequestMapping(value = "/es/api/name/get" ,method = RequestMethod.GET)
    public ResponseView getEsName(@RequestParam String remark){
        ResponseView responseView = new ResponseView();

        // QueryBuilders 提供了很多静态方法，可以实现大部分查询条件的封装
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("remark", remark);
//        log.info("【queryBuilder】= {}", queryBuilder.toString());

        ArrayList<Person> personArrayList = new ArrayList<>();
        repo.search(queryBuilder).forEach(person -> personArrayList.add(person));

        responseView.setResult(JSON.toJSON(personArrayList));
        return responseView;
    }

}
