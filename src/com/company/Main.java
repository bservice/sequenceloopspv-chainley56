package com.company;

public class Main {

    public static void main(String[] args) {
	
int num = 0;




	int count = 1;


	 for (int i = 1; i<101; i++){


		 num = i;


		 while(num != 1){


			 if(num%2 == 0){


				 num = num / 2;


			 }


			 else{


				 num = num * 3 + 1;


			 }


			 count++;


		 }


		 System.out.println(i + "-" + count);


		 count = 1;


	 }


    }
}
