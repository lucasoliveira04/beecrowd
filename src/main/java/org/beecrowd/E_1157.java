package org.beecrowd

public class Main {
 
    public static void main(String[] args) throws IOException {
 
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
  
      for (int i = 1; i <= n; i++){
        if (n % i == 0){
          System.out.println(i);
        }
      }
 
    }
 
}
