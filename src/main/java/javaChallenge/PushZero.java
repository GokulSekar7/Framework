package javaChallenge;

import java.util.Arrays;

public class PushZero {
	//{1,2,0,4,3,0,5,0}
	public static int[] runPushZero(int[] input) {
		Arrays.sort(input);
		int noOfZero =0;
		int arrLen=0;
		for (int i : input) {
			if(i==0) {
				noOfZero++;
			}
			arrLen++;
		}
		int[] output = new int[arrLen];
		System.out.println("zero : " + noOfZero);
		System.out.println("arrLen : " +arrLen);
		for (int i = 0; i < input.length; i++) {
			if(i<noOfZero) {
				output[arrLen-noOfZero+i]=input[i];
			}else {
				output[i-noOfZero]=input[i];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,0,4,3,0,5,0,7,0,9,8};
		int[] runPushZero = runPushZero(input);
		for (int i : runPushZero) {
			System.out.print(i+" ");
		}
	}

}
