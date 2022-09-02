package com.java.jsf;

import java.util.Scanner;

public class Sumanth {
	public static void main(String[] args) {
		int rows=8;
		 for (int i = 1; i <= rows; i++) 
	        {
	            String num="";
	              
	            if(i%2 == 0)
	            {
	                  
	                for (int j = 1; j <= rows; j++)
	                {
	                    System.out.print(num);
	                      
	                    num = (num == "0")? "W" : "B";
	                }
	            }
	            else
	            {
	                  
	                for (int j = 1; j <= rows; j++)
	                {
	                    System.out.print(num);
	                      
	                    num = (num == "0")? "W" : "B";
	                }
	            }
	              
	            System.out.println();
	        }
	}
	

}
