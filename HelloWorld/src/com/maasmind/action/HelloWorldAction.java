package com.maasmind.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
   private String name;
   private String greet;
      
   public String getName() {
	  System.out.println("getName Method"); 
      return name;
   }

   public void setName(String name) {
	  System.out.println("setName Method");
      this.name = name+"mind";
   }
   
   public String getGreet() {
	   System.out.println("getGreet Method"); 
	      return greet;
	   }

   public void setGreet(String greet) {
	   	System.out.println("setGreet Method");
	    this.greet = greet;
   }   
   

 }
