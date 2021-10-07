package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    @ResponseBody
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
    public String helloWithQueryParam(@RequestParam String name, Model model){

        String greeting = "Hello, " + name +"!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("{name}")
    public String reqWithPathVariable(@PathVariable String name, Model model){
        String greeting = "Hello, " + name +"!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("form")
    public String form(){
        return "form";
    }

    @GetMapping("names")
    public String names(Model model){
        ArrayList<String> namesArr = new ArrayList<>();
        namesArr.add("Terrel");
        namesArr.add("Nick");
        namesArr.add("Dev");
        model.addAttribute("names", namesArr);

        return "hello-list";
    }
}
