package com;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, };  
        int sum = 0,avg=0;   
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i]; 
        }  
        avg=sum/16;
      
        System.out.println("Sum of all the elements of an array: " + sum); 
        System.out.println("Average of all numbers:" +avg);
        //System.out.println("Smallest value from the array:" +arr);
	}

}
