package today_28_04_2025;
import java.util.Scanner;
public class SinhVien 
{
	
	public static int soluong;
	String hoten, maSV;
	double diemLT, diemTH, diemTB;
	boolean kq;
	public SinhVien()
	{
		soluong++;
	}
	public void nhapTT()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		hoten = s.nextLine();
		System.out.println("Nhập điểm lý thuyết: ");
		diemLT = s.nextDouble();
		System.out.println("Nhập điểm thực hành: ");
		diemTH = s.nextDouble();
		diemTB = (diemLT + diemTH)/2;
		kq = (diemTB >= 4);
	}
	public void inTT()
	{
		System.out.println("Tên: " + hoten);
		System.out.println("Mã sinh viên: " + maSV);
		System.out.println("Điểm lý thuyết: " + diemLT);
		System.out.println("Điểm thực hành: " + diemTH);
		System.out.println("Điểm trung bình: " + diemTB);
		System.out.println("Kết quả: " + kq);
	}
	public static SinhVien[] timkiem(SinhVien sv[],String name)
	{
		int size = 0;
		for(int i = 0;i<soluong;i++)
		{
			if(sv[i].hoten.equalsIgnoreCase(name)) ++size;
		}
		SinhVien tmp[] = new SinhVien[size];
		if(size == 0) return tmp;
		int j = 0;
		for(int i = 0;i<soluong;i++)
		{
			if(sv[i].hoten.equalsIgnoreCase(name)) tmp[j++] = sv[i];
		}
		
		return tmp;
	}
	
	public static SinhVien[] timkiem1(SinhVien sv[],double dtb)
	{
		int size = 0;
		for(int i = 0;i<soluong;i++)
		{
			if(dtb <= sv[i].diemTB) size++;
		}
		SinhVien tmp[] = new SinhVien[size];
		if(size == 0) return tmp;
		int j = 0;
		for(int i = 0;i<soluong;i++)
		{
			if(dtb <= sv[i].diemTB) tmp[j++] = sv[i];
		}
		return tmp;
	}
	
	public static SinhVien[] timkiem2(SinhVien sv[],double dtb)
	{
		int size = 0;
		for(int i = 0;i<soluong;i++)
		{
			if(dtb > sv[i].diemTB) size++;
		}
		SinhVien tmp[] = new SinhVien[size];
		if(size == 0) return tmp;
		int j = 0;
		for(int i = 0;i<soluong;i++)
		{
			if(dtb > sv[i].diemTB) tmp[j++] = sv[i];
		}
		return tmp;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SinhVien MangSinhVien[] = new SinhVien[10];
		for(int i = 0;i<3;i++)
		{
			System.out.println("Nhập sinh viên thứ "  + (i + 1) + ": ");
			MangSinhVien[i] = new SinhVien();
			MangSinhVien[i].nhapTT();
		}
		
		for(int i = 0;i<3;i++)
		{
			System.out.println("Thông tin của sinh viên thứ: " + (i + 1) + ": ");
			MangSinhVien[i].inTT();
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập tên cần tìm kiếm: ");
		String name = s.nextLine();
		SinhVien x[] = timkiem(MangSinhVien, name);
		if(x.length == 0) System.out.println("Không tìm thấy " + name);
		else {
			for(int i = 0;i<x.length;i++)
			{
				x[i].inTT();
			}
		}
		System.out.println("Tìm kiếm >=, mời nhập điểm trung bình: ");
		double dtb = s.nextDouble();
		SinhVien dtb1[] = timkiem1(MangSinhVien,dtb);
		if(dtb1.length == 0) System.out.println("Không tìm thấy ai có điêm trung bình >= " + dtb);
		else
		{
			for(int i = 0;i<dtb1.length;i++)
			{
				dtb1[i].inTT();
			}
		}
		System.out.println("Tìm kiếm <, mời nhập điểm trung bình: ");
		dtb = s.nextDouble();
		SinhVien dtb2[] = timkiem2(MangSinhVien,dtb);
		if(dtb2.length == 0) System.out.println("Không tìm thấy ai có điểm trung bình < " + dtb);
		else
		{
			for(int i = 0;i<dtb2.length;i++)
			{
				dtb2[i].inTT();
			}
		}
		
	}

}
