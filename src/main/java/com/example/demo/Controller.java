package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

@Autowired
private CalculatorService mathApplication;

@RequestMapping(method= RequestMethod.PUT,value="/add/{input1}/{input2}")
 public double add(@PathVariable  double input1, @PathVariable  double input2){
 return mathApplication.add(input1,input1);}

 @RequestMapping(method = RequestMethod.PUT,value ="/subtract/{input1}/{input2}")
 public double subtract(@PathVariable double input1, @PathVariable double input2) {
  return mathApplication.subtract(input1, input2);
 }

 @RequestMapping(method=RequestMethod.PUT,value = "/multiply/{input1}/{input2}")
 public double multiply(@PathVariable double input1, @PathVariable double input2){
  return mathApplication.multiply(input1,input2);
 }

 @RequestMapping(method=RequestMethod.PUT,value ="/divide/{input1}/{input2}")
 public double divide(@PathVariable double input1, @PathVariable double input2){
  return mathApplication.divide(input1,input2);
 }

}

