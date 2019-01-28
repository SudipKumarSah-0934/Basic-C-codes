package javaCollection;

import java.util.Arrays;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("no.of element to add\n");
		int size = sc.nextInt();
		String myArray[] = new String[size];
		System.out.println("Enter elements\n");
		for(int i=0; i<size; i++) {
			myArray[i] = sc.next();
		}
		System.out.println("Full name:"+Arrays.toString(myArray));
		int i=0;
		if(myArray.length==0) {
			System.out.println("empty");
		}else {
			System.out.println("non-empty");
		}
	}
}
