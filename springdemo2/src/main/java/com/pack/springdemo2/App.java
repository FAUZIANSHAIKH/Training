package com.pack.springdemo2;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Resource resource = new ClassPathResource("Beans.xml");
       BeanFactory factory = new XmlBeanFactory(resource);
       Scanner sc=new Scanner(System.in);
       System.out.println("-----------");
       System.out.println(" 1. MAN ");
       System.out.println(" 2. WOMAN ");
       System.out.println("-----------");
       System.out.print("Enter Choice : ");
       String op=sc.next();
       
       Human human = (Human)factory.getBean(op);
       System.out.println(human);
    }
}
