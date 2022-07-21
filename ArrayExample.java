package com.bl.arraysJava;
import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		int array[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter elements in array:");

		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0; i<array.length; i++) {
			System.out.println("element at index"+i+ "is" +array[i]);
		sc.close();
		}
	}

}
