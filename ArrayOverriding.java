package com.bl.arraysJava;
import java.util.Scanner;
public class ArrayOverriding {

		public static void main(String[] args) {
			int array[] = new int[8];
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter elements in array:");

			for(int i=0; i<array.length; i++) {
				array[i] = sc.nextInt();
			}
			array[0]=56;
			array[3]=865;
			array[2]=5;
			//above value will override the input values of array
			for(int i=0; i<array.length; i++) {
				System.out.println("element at index"+i+ "is" +array[i]);
			sc.close();
			}
		}

}
