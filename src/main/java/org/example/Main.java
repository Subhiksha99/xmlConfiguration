package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //create container
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //get bean from container
        Student s1=(Student)context.getBean("stu1");
        System.out.println(s1);
        Student s2=(Student)context.getBean("stu2");
        System.out.println(s2);
        Student s3=(Student)context.getBean("stu3");
        System.out.println(s3);
    }
}