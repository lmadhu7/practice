package com.madhu.practice.String;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {

		String x = "srikanth"; 
        String y = "madhu"; 
  
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter username:"); 
        String uuid = s.next(); 
        System.out.println(uuid);
        System.out.print("Enter password:"); 
        String upwd = s.next(); 
        System.out.println(upwd);
        

        System.out.println(uuid.equals(x));
        System.out.println(upwd.equals(y));
        
        
	}

}
