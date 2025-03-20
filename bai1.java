package thuchanh;

public class bai1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 5;i<=100;i+=5) {
			if(i == 50 || i == 55) continue;
			sum += i;
		}
		System.out.println("Tổng các số chia hết cho 5 trong khoảng [0,100] trừ 50, 55 là: " + sum);

	}

}
