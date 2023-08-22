package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class index {


	public static void main(String[] args) {
		SpringApplication.run(index.class, args);
	}

//	@RestController
//	public class HelloController {
//
//		@RequestMapping("/hello")
//		public String hello() {
//			return "Hello, world";
//		}
//	}
}
//package com.example.demo;
//
//		import org.springframework.stereotype.Controller;
//		import org.springframework.web.bind.annotation.RequestMapping;
//		import org.springframework.web.bind.annotation.ResponseBody;
//		import org.springframework.web.bind.annotation.RestController;
//		import org.springframework.web.servlet.ModelAndView;
//

//@RestController
//public class MyRestController {
//    @RequestMapping("/")
//    public ModelAndView welcome() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index.html");
//        return modelAndView;
//    }
//}