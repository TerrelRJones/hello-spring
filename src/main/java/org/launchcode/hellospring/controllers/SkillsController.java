package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" + "\n" +
                "<h2>We have a few skills we would like to learn. Here is the list!" +
                "<ol>" +
                "<li>Javascript</li>" +"<li>Java</li>" +"<li>Python</li>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skills(){
        return "<html>" +
                "<body>" + "<form action=\"form\" method=\"post\">\n" +
                "  <label for=\"fname\">Firstname:</label><br>\n" +
                "  <input type=\"text\" name=\"name\"><br>\n" +
                "  <label>My Favorite Language:</label><br>\n" +
                "  <select name=\"firstChoice\">\n" +
                "  <option value=\"javascript\">Javascript</option>\n" +
                "  <option value=\"java\">Java</option>\n" +
                "  <option value=\"python\">Python</option>\n" +
                "</select><br>\n" +
                "  <label>My Second Favorite Language:</label><br>\n" +
                "  <select name=\"secondChoice\">\n" +
                "  <option value=\"javascript\">Javascript</option>\n" +
                "  <option value=\"java\">Java</option>\n" +
                "  <option value=\"python\">Python</option>\n" +
                "</select><br>\n" +
                "  <label>My Third Favorite Language:</label><br>\n" +
                "  <select name=\"thirdChoice\">\n" +
                "  <option value=\"javascript\">Javascript</option>\n" +
                "  <option value=\"java\">Java</option>\n" +
                "  <option value=\"python\">Python</option>\n" +
                "</select><br>\n" +
                "  <input type=\"submit\">\n" +
                "\n" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String answer(@RequestParam String name, String firstChoice, String secondChoice, String thirdChoice){
        return "<html>" +
                "<body>" + "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";

    }
}
