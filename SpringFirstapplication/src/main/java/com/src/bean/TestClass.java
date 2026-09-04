package com.src.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {


			//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Employee e = (Employee) context.getBean("emp2");
			
			System.out.println(e);
	}

}
