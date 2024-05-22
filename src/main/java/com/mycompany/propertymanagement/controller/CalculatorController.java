package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.model.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {
//    http://localhost:8000/api/v1/calculator/add?num1=6.7&num2=1.3
    @GetMapping("/add")
    public Double add(@RequestParam("num1")Double num1, @RequestParam("num2") Double num2){
        return num1 + num2;
    }
    @GetMapping("/sub/{num1}/{num2}") // using path Variable
    public Double sub(@PathVariable("num1") Double num1,@PathVariable("num2") Double num2){
       Double result = null;
       if(num1 > num2){
           result = num1 - num2;
       }
       else {
           result = num2 - num1;
       }
       return result;
    }
    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result =  null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @PostMapping("/sub")
    public ResponseEntity<Double> sub(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getNum4() - calculatorDTO.getNum3() - calculatorDTO.getNum2() - calculatorDTO.getNum1();
        return new ResponseEntity<Double>(result, HttpStatus.CREATED);
    }

}
