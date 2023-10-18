package javaChallenge;

import java.util.Iterator;

public class RightRotation {
	// int[] input ={1,2,3,4,5};   int rotation= 2;
	public static int[] runRightRotation(int[] input, int rotation) {
		// declare int lenght to find length of the array
		int length=0;
		//iterate the array to find the length of the array 
		for (int i : input) {
			length++;
		}
		
		//declare int[] output to store the result
		int[] output =new int[length];
		
		//declare int count for output index
		int count=0;
		//iteration starts from lenght - rotation and ends with rotation
		// 1st iterate from rotation to end of the array
		for(int i=length-rotation; i<length; i++) {
//			System.out.println(input[i]);
			output[count]=input[i];
			count++;
		}
		//2nd iterate from beginning till rotation.
		for(int i= 0; i<=rotation; i++) {
//			System.out.println(input[i]);
			output[count]=input[i];
			count++;
		}
		
		return output;
	}

	public static void main(String[] args) {
		int[] input= {1,2,3,4,5};
		int[] runRightRotation = runRightRotation(input, 2);
		System.out.print("{");
		for (int i = 0; i < runRightRotation.length; i++) {
			if (runRightRotation.length-1 ==i) {
				System.out.print(runRightRotation[i]);
			}else {
				System.out.print(runRightRotation[i]+",");
			}
		}
		System.out.print("}");
	}
	
}
