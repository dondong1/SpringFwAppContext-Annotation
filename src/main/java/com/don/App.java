package com.don;

import com.don.entity.Phone;
import com.don.entity.Student;
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.test();

        System.out.println(student);

        ApplicationContext newContext = new ClassPathXmlApplicationContext("bean.xml");
        Phone phone = (Phone) applicationContext.getBean("phone");
        phone.test();
    }
}
