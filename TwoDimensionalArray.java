package com.bl.arraysJava;
import java.util.Scanner;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] array = new int [5][2];
		System.out.println("Enter the array elements: ");
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<2; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<2; j++) {
				System.out.println("" +array[i][j]);
			}
			System.out.println("");
		sc.close();}
	}

}
