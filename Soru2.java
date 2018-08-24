import java.util.*;
public class Soru2 {
	public static void diziOlustur(int[][] n){
		for(int i = 0; i<n.length; i++){
			for(int j = 0; j<n[0].length; j++){
				Random r = new Random();
				int a = Math.abs(r.nextInt())%(50-20+1)+20;	
				n[i][j] = a ;
			}
		}	
	}	

	public static void diziYaz(int n[][]){
		for(int i = 0; i<n.length; i++){
			for(int j = 0; j<n[0].length; j++){
				System.out.print(n[i][j]+ " ");
			}
		System.out.println();
		}

	}

	public static int[][] matrisTersi(int[][] matris){
		int[][] ters = new int[matris[0].length][matris.length];
		for(int i = 0; i<matris.length; i++){
			for(int j = 0; j<matris[0].length; j++){
				ters[j][i] = matris[i][j];
			}
		}
	return ters;	
	}

	public static int kucukElemanBul(int[][] n , int k){
		int[] siraDizisi = new int[n.length * n[0].length];
		int l = 0;	
		for(int i = 0; i<n.length; i++){ 
			for(int j = 0; j<n[0].length; j++){ 
				siraDizisi[l] = n[i][j];
				l++;
			}
		}
			
		int temp;   
		for (int i=1; i<siraDizisi.length; i++){
			for(int j=0; j<siraDizisi.length-i; j++){
				if (siraDizisi[j] > siraDizisi[j+1]){
					temp = siraDizisi[j];
					siraDizisi[j] = siraDizisi[j+1];
					siraDizisi[j+1] = temp;
				}
			}
   		}


	return siraDizisi[k] ;
	}

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int k = klavye.nextInt();
		int[][] dizi = new int[k][k];
		diziOlustur(dizi);
		System.out.println("Orijinal Matris");
		diziYaz(dizi);
		int[][] tersDizi = matrisTersi(dizi);
		System.out.println("Matrisin Tersi");
		diziYaz(tersDizi);
		k = klavye.nextInt();
		int n = kucukElemanBul(dizi,k);
		System.out.println("Bu matrisin " + k + " . en kucuk elemani = " + n);		

	}
}
