package _03_More_Array_Fun;

import javax.swing.JOptionPane;

public class Challenge {
	public static void main(String[] args) {
		
		int[] numbers= new int[4];
		
		for(int i = 0; i< numbers.length; i++) {
		String answer=JOptionPane.showInputDialog("enter a number");
		int result=Integer.parseInt(answer);
		
		numbers[i]=result;
		System.out.println(numbers[i]);
		}
		for(int i=0; i<numbers.length; i++) {
			System.out.println();
		}
	}
}
