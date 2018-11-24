package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	Random r =new Random();
	
	public static void main(String[] args) {
		String[] books = {"To Kill a Mockingbird","Dictionary", "War and Peace", "The Hate U Give"};
		printArray(books);
		backwards(books);
		everyOther(books);
	}

	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printArray(String[] books) {
	//	String[] books = new String[4];
		for(int i=0; i< books.length; i++) {
			System.out.println(books[i]);
		}
	} 
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void backwards(String[] books) {
		for(int i=books.length-1; i>=0 ; i--) {
			System.out.println(books[i]);
	}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOther(String[] books) {
		for(int i=0; i<books.length ; i+=2) {
			System.out.println(books[i]);
	}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	//public static void randomOrder(String[] books) {
	//	for(int i=0; i<books.length ; i++) {
	//		System.out.println(books[i]);
	//}
//	}
	
}
