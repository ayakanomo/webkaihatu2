package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo2.domain.Car;


@Controller
@RequestMapping("variable-expression")
public class VariableExpressionController {

    @RequestMapping("")
    public String index(Model model){
        // String javascriptStr = "<script>alert('XSSの危険性あり');<script>"
        
        model.addAttribute("name", "nomoto");

        Car car = new Car(100,"ベンツ",50);

        model.addAttribute("car", car);

        return "variable-expressions";
    }


    
}
