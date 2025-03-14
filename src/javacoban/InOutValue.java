package javacoban;

import java.util.Scanner;

public class InOutValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Your name : ");
		String name = sc.nextLine();
		System.out.println("Your age : ");
		int age = sc.nextInt();
		System.out.println("=> My name is " + name + ". I'm " + age + " years old.");
	}

}
