package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, lastname;
        int age;
	Scanner sc = new Scanner(System.in);

	System.out.println("Please enter your first name: ");
	name = sc.next();
	System.out.println("Please enter your last name: ");
	lastname = sc.next();
	System.out.println("Please enter your age: ");
	age = sc.nextInt();

	System.out.println("Hello" + " " + name + " " + lastname);
    }
}
