package com.example.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")             // localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")         // localhost:8080/api/getMethod
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")                                            // // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){
        String password = "1111";

        System.out.println("id : " + id);
        System.out.println("password : " + pwd);

        return id+pwd;
    }

    //localhost:8080/api/multiParameter?account=abc&email=study@gmail.com&page=10
    public String getMultiParameter(@RequestParam String account,
                                    @RequestParam String email,
                                    @RequestParam int page){
        return account+email+page;
    }


}
