package com.kodewala.spring_bean_xml_proj2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("\\resources\\applicationContext.xml");
        Student student = (Student) applicationContext.getBean("stud");
        Teacher teacher = (Teacher) applicationContext.getBean("tech");
        
        System.out.println(student.getName()+" | "+student.getName()+" | "+student.getAge()+" | ");
        System.out.println(teacher.getTeacherName());
    }
}
