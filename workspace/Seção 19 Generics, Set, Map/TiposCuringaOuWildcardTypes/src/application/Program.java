package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;*/ //error in compilation
		
		@SuppressWarnings("unused")
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		//methods
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Bob", "Alex");
		printList(myStrs);
	}
	
	//methods
	public static void printList(List<?> list) {
		//list.add(3); //error in compilation
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}