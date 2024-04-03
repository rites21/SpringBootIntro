package com.example.springbootintro.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String sayHello(@RequestParam("name") String name){
        System.out.println("Reached inside sayHello of HelloController");
        return "Hello, Good Morning "+name;
    }
    @GetMapping("/bye")
    public String sayBye(){
        System.out.println("Reached inside sayHello of HelloController");
        return "Class is done, Nice day";
    }

    @PostMapping("/create/something")
    public Integer postExample(@RequestBody Employee employee) {
        return employee.getSalary();
    }
}
