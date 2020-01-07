package org.numbers.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Numbers1 
{
	
	public static void main(String[] args)
	{   // Declare two strings 
        String a = "Hellow"; 
        String b = "World"; 
          
        // Print String before swapping 
        System.out.println("Strings before swap: a = " +  
                                       a + " and b = "+b); 
          
      a = a+b;
      b= b.substring(0,a.length()-b.length());
      a= a.substring(b.length());
       System.out.println("a = "+a);
       System.out.println("b = "+b);
			}
			
		
		}
		

