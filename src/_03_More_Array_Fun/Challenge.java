package _03_More_Array_Fun;

import javax.swing.JOptionPane;

public class Challenge {
	public static void main(String[] args) {
		String arraySize = JOptionPane.showInputDialog("How many numbers do you want your array to have?");
		int array = Integer.parseInt(arraySize); 
		
		int[] numbers= new int[array];
		
		for(int i = 0; i< numbers.length; i++) {
		String answer=JOptionPane.showInputDialog("enter a number");
		int result=Integer.parseInt(answer);
		
		numbers[i]=result;
		System.out.println(numbers[i]);
		}
		int result2= 0;
		for(int i=0; i<numbers.length; i++) {
			result2= numbers[i]+result2;
		}
		System.out.println(result2/array);
	}
}
