package Vetores;
import java.util.*;
public class MediaVetores {
	public static void main (String[]args) {
		Scanner in= new Scanner (System.in);
		final int TAM=10;
		int A[],NM=0, M, i;
		A = new int [TAM];
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+".o número");
			a[i] = in.nextInt();
			NM = NM + A[i];
		}
		for (i=0; i<TAM; i++) {
			if (i==0){
				System.out.print("[ "+A[i]+", ");
			}else if (i==9){
				System.out.println(A[i]+" ]");
			}else {
			System.out.print(A[i]+", ");
			}
		}
		M = NM/TAM;
		System.out.println("A média é "+M);
	}

}
