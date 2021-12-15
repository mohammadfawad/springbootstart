package com.springBootFramework.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springBootFramework.springboot.Service.Service;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void testService() {
		Service serviceBean = (Service) context.getBean(Service.class);
		serviceBean.save();
	}

}
