package com.aniket.SpringBootDemo.repo;

import com.aniket.SpringBootDemo.model.Laptop;
import com.aniket.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);


//		Alien a1 = context.getBean(Alien.class);
//		System.out.println(a1.getAge());
//		a1.code();
	}

}
