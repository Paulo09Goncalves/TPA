package classicos;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		System.out.println("digite um numero inteiro, para saber se é primo ou não:");
		num = in.nextInt();
		if(num % num == 1  && num % 1 == num ){
			System.out.println("número é primo");
		}else {
			System.out.println("número não é primo");
		}
		}

 }

