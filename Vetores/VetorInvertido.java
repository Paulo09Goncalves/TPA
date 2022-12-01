package Vetores;
import java.util.*;
public class VetorInvertido {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		final int TAM=10;
		int A[], B[], i, N=9;
		A = new int [TAM];
		B = new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+".o valor");
			A[i] = in.nextInt();
			B[N] = A[i];
			N--;
		}
		for (i=0; i<TAM; i++) {
			if (i==0){
				System.out.print("[ "+B[i]+", ");
			}else if (i==9){
				System.out.println(B[i]+" ]");
			}else {
			System.out.print(B[i]+", ");
			}
		}
	}
}
