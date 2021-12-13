package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
//@ComponentScan({"com.example.demo"})
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


    @GetMapping("/demo")
//	public String getCustomGreeting(@PathVariable String name) { //valid if above and this parm same
    public String getHello() {
        return "Hello Sarita" ;
    }

    @GetMapping("/demo/{firstName}/{lastName}")
//	public String getCustomGreeting(@PathVariable String name) { //valid if above and this parm same
    public String getHello(@PathVariable("firstName") String fName, @PathVariable("lastName") String lName) {
        return "Hello " + fName + " " + lName;
    }


}
