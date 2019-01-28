package javaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class ListLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> studentsofBSSE10batch = new ArrayList<String>();
		///add

		studentsofBSSE10batch.add("Sudip Kumar Sah");
		studentsofBSSE10batch.add("Md Mehedi Hassan");
		studentsofBSSE10batch.add("Muntakim Hye Rashik");
		studentsofBSSE10batch.add("Fahim Ahmed");
		System.out.print("Fullname:"+studentsofBSSE10batch+"\n");
		//add at index

		studentsofBSSE10batch.add(2, "Rezowan");
		System.out.print("NewFullname:"+studentsofBSSE10batch+"\n");
		//checking availability of string in list

		Boolean res=studentsofBSSE10batch.contains("Fahim Ahmed");
		if(res==true) {
			System.out.println("string found\n");
		}else {
			System.out.println("string not found\n");
		}
		//returns string at specific index

		String str1=studentsofBSSE10batch.get(2);
		System.out.println(str1);
		//returns whether list is empty or not 

		Boolean res1=studentsofBSSE10batch.isEmpty();
		if(res1==false) {
			System.out.println("arraylist has string");
		}else {
			System.out.println("arraylist is empty");
		}
		//remove the string at specific and returns removed string 

		System.out.println("no. of string:"+studentsofBSSE10batch.size());
		String Str2=studentsofBSSE10batch.remove(3);
		System.out.println(Str2);
		//set the element at index i.e. replace the first one 

		studentsofBSSE10batch.set(3, "set");
		System.out.println(studentsofBSSE10batch+"\n");
		//iterator

		ListIterator<String>it = studentsofBSSE10batch.listIterator();
		System.out.println("forward direction");
		while(it.hasNext()) {
			System.out.println(it.next()+"\n");
		}

		System.out.println("backward direction");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
