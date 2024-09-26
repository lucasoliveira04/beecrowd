package org.beecrowd

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
		int linhas = leitor.nextInt();
		int fim = leitor.nextInt();
		for (int i = 1; i <= fim; i++) {
			System.out.print(i);
			if (i % linhas == 0){
              System.out.println("");  
            } 
			else{
              System.out.print(" ");  
            } 
		}
    }
}
