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
		int sum = 0;
		System.out.print("Số " + x + " ");
		boolean flag = false;
		while(x > 0) {
			if(x % 10 == 5) {
				flag = true;
			}
			sum += x % 10;
			x/=10;
		}
		if(flag) {
			System.out.println("có chứa số 5 và có tổng là: " + sum);
		}else {
			System.out.println("không chứa số 5 và có tổng là: " + sum);
		}
		
	}
}
