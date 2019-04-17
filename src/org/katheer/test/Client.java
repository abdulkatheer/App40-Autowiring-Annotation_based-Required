package org.katheer.test;

import org.katheer.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Use of @Required annotation
        It will force us to inject the property.
        It will show some error during code inspection
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
    }
}
