package com.bridgelabzz;

		 interface EvenOddNumber {
		 	void check(int a);
		 }

		 public class EvenOdd {
		 	public static void main(String[] args) {
		 		// Lambda Expression
		 		EvenOddNumber evenOdd = (int a) -> {
		 			if(a%2==0){
		 				System.out.println("Number "+a+" is even.");
		 			}else{
		 				System.out.println("Number "+a+" is odd.");
		 			}
		 		};
		 		
		 		//Check numbers
		 		evenOdd.check(5);
		 		evenOdd.check(8);
	}

}
