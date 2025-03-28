package thuchanh;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		boolean isPrime;
		int i;
		do {
			System.out.println("Nhập vào một số: ");
			x = s.nextInt();
			isPrime = true;
			
			for(i = 2;i*i<=x;i++) {
				if(x % i == 0) {
					isPrime = false;
					break;
				}
			}
			
		}while(x < 2 || i * i <= x);
		System.out.println(x + " là một số nguyên tố");
		s.close();
	}

}
