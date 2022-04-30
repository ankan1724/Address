package com.springcore.test.Address;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	Employee emp=(Employee) context.getBean("emp");
    	System.out.println(emp);
    }
}
