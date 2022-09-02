package com.java.jsf;

public class ChessProblems {
	public static void main(String[] args) {
		int row =8,col =8;
//		int chess[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j/2==0) {
					System.out.print("b");
				}else {
					System.out.print("W");
				}
			}
			System.out.println();
		}
	}

}
