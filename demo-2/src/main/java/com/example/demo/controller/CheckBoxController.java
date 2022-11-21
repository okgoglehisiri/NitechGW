package com.example.demo.controller;
 
import java.util.LinkedHashMap;
import java.util.Map;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
import com.example.demo.model.food;
 
@Controller
public class CheckBoxController {
 
  @GetMapping("/")
  public String helloWorldCheckBox(Model model,food food) {
    model.addAttribute("foodCheckBox",getCheckBoxfood());
    model.addAttribute("food",food);
    return "index";
  }
   
  private Map<String ,String> getCheckBoxfood(){
     
    Map<String, String> checkBoxfood = new LinkedHashMap<String , String>();
     
    checkBoxfood.put("にんじん", "にんじん");
    checkBoxfood.put("じゃがいも", "じゃがいも");
    checkBoxfood.put("鶏もも肉", "鶏もも肉");
    return checkBoxfood;
  }
   
  @PostMapping("/saveCheckBox")
  public String saveCheckBox(Model model,food food) {
    model.addAttribute("food",food.getSelectfoods());
    return "result";
  }
}