package org.fanatic.test;

import org.fanatic.service.CustomerServiceImpl;
import org.fanatic.service.customerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
	
	public static void main (String args[])
	{
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spconfig.xml");
//		Resource res = new ClassPathResource("spconfig.xml");
//		BeanFactory factory = new XmlBeanFactory(res);
		customerService service =(CustomerServiceImpl)applicationContext.getBean("customerService");
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		System.out.println(service.findAll().get(1).getFirstName());
		System.out.println(service.findAll().get(1).getLastName());
		
		
	}

}
