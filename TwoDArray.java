package com.bl.arraysJava;

public class TwoDArray {

	public static void main(String[] args) {
		int [][] array = {{1,5},{8,5},{10,11},{6,9}};
		for (int i =0; i<4; i++) {
			for (int j=0; j<2;  j++) {
				System.out.println("array element present at " +i+ "and" +j+ " index is " +array[i][j]);
			}
		}

	}

}
