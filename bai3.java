package thuchanh;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		do {
			System.out.println("Nhập vào một số:");
			x = s.nextInt();
		} while(x <= 1000);
		int count = 0, sum = 0;
		while(x > 0) {
			++count;
			sum += x % 10;
			x/=10;
		}
		if(count == 5) {
			System.out.println("Số có 5 chữ số");
		}else {
			System.out.println("Số bạn nhập vào có ít hơn hoặc nhiều hơn 5 chữ số");
		}
		System.out.println("Tổng của số bạn vừa nhập là: " + sum);
		s.close();
	}
}
