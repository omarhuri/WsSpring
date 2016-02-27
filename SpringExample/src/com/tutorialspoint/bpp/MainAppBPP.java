package com.tutorialspoint.bpp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppBPP {
   public static void main(String[] args) {

      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorldBPP obj = (HelloWorldBPP) context.getBean("helloWorldBPP");
      obj.getMessage();
      context.registerShutdownHook();
   }
}



