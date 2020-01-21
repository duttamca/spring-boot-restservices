package com.sanjiv.rest.webservice.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String sayHello() {
        return "Hello World!!!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean sayHelloBean() {
        return new HelloWorldBean( "Hello World!!!");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean sayHelloBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format( "Hello World!!! %s", name));
    }
}
