package thuchanh;

import java.util.Scanner;
// Nguyễn Vĩnh Hưng 23CT1
public class bai3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		do {
			System.out.println("Nhập vào một số:");
			x = s.nextInt();
		} while(x <= 1000);
		int count = 0, sum = 0;
		System.out.print("Số " + x + " ");
		while(x > 0) {
			if(x % 10 == 5) {
				++count;
			}
			sum += x % 10;
			x/=10;
		}
		
		System.out.println("có "+ count+ " số 5 và có tổng là: " + sum);
	}
}
