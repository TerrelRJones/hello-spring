package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodBye(){
        return "Goodbye, Spring!";
    }

    // QueryParam localhost:8080/hello?name=Terrel
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "v1")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("{name}")
    @ResponseBody
    public String reqWithPathVariable(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                    "<body>" +
                         "<form action='v1' method='post'>" +
                            "<input placeholder=\"search\" name='name' />" +
                             "<button>" +
                              "search" +
                                "</button>" +
                         "</form>"+
                    "</body>" +
                "</html>";
    }
}
