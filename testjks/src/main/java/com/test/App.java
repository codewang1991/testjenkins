package com.test;

import javax.xml.ws.RespectBinding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{
	@GetMapping(value="/testjks")
	public String test(){
		return "测试测试。。。。。";
	}
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
