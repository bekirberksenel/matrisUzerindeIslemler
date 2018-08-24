import java.util.*;
public class Soru1 {
	public static void diziOlustur(char n[][]){
		for(int i = 0; i<n.length; i++){
			for(int j = 0; j<n[0].length; j++){
				Random r = new Random();
				int a = Math.abs(r.nextInt())%(1-0+1)+0;
				char ch = ' ';
				if(a == 1){
					ch = ' ';
				}
				else if(a == 0){
					ch = '*';
				}
			n[i][j] = ch ;
			}
		}
	}

	public static int kontrolEt(char n[][]){
		int count = 0;
		for(int i = 0; i<n.length; i++){
			for(int j = 0; j<n[0].length; j++){
				if(n[i][j]=='*' && (i-1)>=0 && (i-1)<n.length && j-1>=0 && (j-1)<n.length && (j+1)>=0 && (j+1)<n.length && (i+1)>=0 && (i+1)<n.length){
					if(n[i-1][j-1] == '*' && n[i-1][j+1] == '*' && n[i+1][j-1] == '*' && n[i+1][j+1]=='*' && n[i-1][j] == ' ' && n[i+1][j] == ' ' && n[i][j-1] == ' ' && n[i][j+1] == ' '){
						count++;		
					}	
					
				}
			}
		}
	return count;
	}

	public static void diziYaz(char n[][]){
		for(int i = 0; i<n.length; i++){
			for(int j = 0; j<n[0].length; j++){
				System.out.print(n[i][j]);
			}
		System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int k = klavye.nextInt();
		char[][] dizi = new char[k][k];
		diziOlustur(dizi);
		int n = kontrolEt(dizi);
		System.out.println("Belirtilen sekil toplam " + n + "defa gecmektedir.");
		diziYaz(dizi);
	}
}
