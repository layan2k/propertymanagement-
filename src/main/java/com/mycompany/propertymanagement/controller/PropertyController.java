package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.model.PropertyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.mycompany.propertymanagement.service.propertyService;

@RestController
@RequestMapping("/api/v1/")
public class PropertyController {

    @Autowired
    private  propertyService propertyService;

//    localhost:8000/api/v1/properties/hello
    @GetMapping("/hello")
    public String  sayHello() {
       return "Hello, World";
    }

    @PostMapping("/properties")
    public PropertyDTO saveProperty (@RequestBody PropertyDTO propertyDTO) {
          propertyService.saveProperty(propertyDTO);
        System.out.println(propertyDTO);
        return propertyDTO;
    }

}
