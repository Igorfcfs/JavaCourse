package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import entities.Circle; //-----|
//import entities.Rectangle;// ----- problem 1
//import entities.Shape;// ------|

public class Program {

	public static void main(String[] args) {
		
		//problem 1
		/*List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		System.out.println("Total area: " + totalArea(myCircles));*/
		
		//problem 2 get/put - covariância
		/*List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		@SuppressWarnings("unused")
		Number x = list.get(0);
		//list.add(20); //error in compilation*/
		
		//problem 2 get/put - contravariância
		/*List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		//Number x = myNums.get(0);*/ //error in compilation
		
		//problem 2 (princípios get/put)
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
	
	//problem 1
	/*public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}*/
	
	//problem 2 (princípios get/put)
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	//problem 2
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
