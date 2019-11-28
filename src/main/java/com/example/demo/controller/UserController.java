package com.example.demo.controller;


import com.example.demo.service.ConsumeService;
import com.example.demo.service.UserService;
import com.example.demo.vo.ConsumeVo;
import com.example.demo.vo.ResponseView;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhao
 */

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private ConsumeService consumeService;

    @RequestMapping("/geek")
    public String home() {
        return "redirect:http://geek.163.com";
    }
    @RequestMapping("/great/user")
    public String greet(
            @RequestParam String name){
        return "hello," + name;
    }

    @RequestMapping("/getAllUser")
    public ResponseView getAllUser(){

        ResponseView responseView = new ResponseView();

        ArrayList userList = userService.getAllUserList();

        responseView.setResult(userList);
        responseView.setMessage("ok");
        responseView.setCode(0);

        return responseView;
    }
    @ResponseBody
    @RequestMapping(value = "/getStudentConsumer" ,method = RequestMethod.POST)
    public ResponseView getStudentConsumer(@RequestBody ConsumeVo consumeVo){
        ResponseView responseView = new ResponseView();

//        Integer consume = consumeService.addMorningAndLunch(consumeVo);
//        responseView.setResult(consume);
        responseView.setResult(consumeVo);
        return responseView;
    }



    @PostMapping("/user/info")
    public ResponseView userInfo(
            @RequestParam(value="name") String name ,
            @RequestParam(value="age" ,required = false) Integer age ){
        ResponseView responseView = new ResponseView();

        if(name==null||age==null){
            responseView.setCode(-1);
            return responseView;
        }

        Map<String,Object> user = new HashMap<>();
        user.put("name", name);
        user.put("age", age);
        user.put("time", new Date());

        responseView.setResult(user);
        responseView.setMessage("ok");
        responseView.setCode(0);

        return responseView;

    }


}
