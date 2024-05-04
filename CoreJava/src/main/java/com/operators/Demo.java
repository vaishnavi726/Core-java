package com.operators;

public class Demo {
	public static void main(String[] args) {
		
		int n =150;
		
	    a: for(int i =1; i<=n;){
	       
	        do{
	            if(i%10== 0){
	              i++;
	               continue;
	   
	            } 
	            else if(i>100){
	                break a ;
	            }System.out.println(i);
	            i++;
	        }
	        while(i<=n);
	   } 
	
}

		
	}
	


