/**
 * Practice for initializing and printing contents of two dimensional arrays  
 * 
 * @author Chad Hidalgo  
 * Course: COMP B11 
 * Created: Nov 20, 2014 
 * Source File: TwoDpractice.java
 */
public class TwoDpractice {
	public static void main(String[] args) {
		int [][] twoDArray = new int[8][8];
	
		for (int row=0; row<twoDArray.length;row++) {
			for (int column =0; column<twoDArray.length; column++){
					twoDArray[row][column]= (row + column) %2;
			}
		}
		for (int row=0; row<twoDArray.length;row++) {
			for (int column =0; column<twoDArray.length; column++){
				System.out.print(twoDArray[row][column]);
			}
			System.out.println();
		}
	}
}
