package com;

public class SplitMethod {

	public static void main(String[] args) {
		String txt= ("23  +  45  -  (  343  /  12  ) ");
		String[] w=txt.split("\\s");
		System.out.println("The output should be:");
		
			for(String w1:w){  
				System.out.println(w1);
			}
		
	}

}
