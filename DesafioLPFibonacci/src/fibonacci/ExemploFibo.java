package fibonacci;

import java.util.Scanner;

public class ExemploFibo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++){
			long f = fib(i);
			System.out.println("fib(" + i + ") = " + f);
		}
			
	}
	
	public static long fib(int n) {
		if (n <= 2) return 1;
		long dobrar = 1;
		long dobrar2 = 1;
		long fnew = 1;
		for (int i = 3; i <= n; i++) {
			fnew = dobrar + dobrar2;
			dobrar2 = dobrar;
			dobrar = fnew;
		}
		
		return fnew;
	}
	
}
