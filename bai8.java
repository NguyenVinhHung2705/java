package thuchanh;

import java.util.Scanner;

public class bai8 {
// Nguyễn Vĩnh Hưng 23CT1
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		double so_hang1, so_hang2;
		do {
			System.out.println("số 1 : Cộng");
			System.out.println("số 2 : Trừ");
			System.out.println("số 3 : Nhân");
			System.out.println("số 4 : Chia");
			System.out.println("Kí tự khác : Thoát chương trình");
			System.out.print("Mời nhập 1 kí tự:");
			x = s.nextInt();
			switch(x) {
				case 1:
					System.out.print("Nhập số hạng 1: ");
					so_hang1 = s.nextFloat();
					System.out.print("Nhập số hạng 2: ");
					so_hang2 = s.nextFloat();
					System.out.printf("%f + %f = %f\n", so_hang1, so_hang2, so_hang1 + so_hang2);
					break;
				case 2:
					System.out.print("Nhập số hạng 1: ");
					so_hang1 = s.nextFloat();
					System.out.print("Nhập số hạng 2: ");
					so_hang2 = s.nextFloat();
					System.out.printf("%f - %f = %f\n", so_hang1, so_hang2, so_hang1 - so_hang2);
					break;
				case 3:
					System.out.print("Nhập số hạng 1: ");
					so_hang1 = s.nextFloat();
					System.out.print("Nhập số hạng 2: ");
					so_hang2 = s.nextFloat();
					System.out.printf("%f * %f = %f\n", so_hang1, so_hang2, so_hang1 * so_hang2);
					break;
				case 4:
					System.out.print("Nhập số hạng 1: ");
					so_hang1 = s.nextFloat();
					do {
						System.out.println("Nhập số hạng 2 khác 0: ");
						so_hang2 = s.nextFloat();
					}while(so_hang2 == 0);
					System.out.printf("%f / %f = %f\n", so_hang1, so_hang2, so_hang1 / so_hang2);
					break;
				default:
					System.out.println("Chương trình đã kết thúc");
					return;
			}
		}while(x == 1 || x == 2 || x == 3 || x == 4);
	}
	

}
