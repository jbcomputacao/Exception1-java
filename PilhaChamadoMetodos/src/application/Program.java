package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	    method1();

		System.out.println("Encerramento de Prorama");

	}
	public static void method1(){
		System.out.println("*************** METHOD 1 START");
		method2();
		System.out.println("METHOD 1 FIM");
		
	}

	public static void method2() {
		System.out.println("****************** METHOD2 START *************************");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ivalid Position");
			e.printStackTrace();
			sc.next();

		} catch (InputMismatchException e) {
			System.out.println("Input Error");
			// TODO: handle exception
		}
		sc.close();
		System.out.println("************  Method 2 End  ***************");
	}
}
