package Vetores;
import java.util.*;
public class VetorQuadrado {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		final int TAM=10;
		int A[], B[], i;
		A = new int [TAM];
		B = new int [TAM];
		for (i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" o. número");
			A[i] = in.nextInt();
			B[i] = A[i]*A[i];
			System.out.println(b[i]);
		}
	}
}
