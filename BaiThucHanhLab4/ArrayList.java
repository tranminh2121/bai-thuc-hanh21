import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    // Khai báo một đối tượng `ArrayList` của kiểu số nguyên (`Integer`).
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        // Sử dụng `Scanner` để lấy kích thước mảng từ người dùng và thêm các phần tử
        // vào `ArrayList`.

        System.out.print("Nhap kich thuoc cua mang: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrlist.add(number);
        }

        System.out.print("Phan tu trong mang la: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        System.out.println("");
        arrlist.sort((o1, o2) -> o1 - o2);
        System.out.print("Sap xep tang dan: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }
        // Sắp xếp các phần tử trong `ArrayList` theo thứ tự tăng dần bằng cách sử dụng
        // phương thức `sort()`.
        // In ra các phần tử sau khi đã được sắp xếp theo thứ tự tăng dần.
        System.out.println("");
        arrlist.sort((o1, o2) -> o2 - o1);
        System.out.print("Sap xep giam dan: ");
        for (Integer integer : arrlist) {
            System.out.print(integer + "\t");
        }

        System.out.println("");
        System.out.print("Phan tu lon nhat cua mang la: " + arrlist.get(0));

        System.out.println("");
        System.out.print("Phan tu nho nhat cua mang la: " + arrlist.get(n - 1));
    }
    // Sử dụng phương thức `get()` của `ArrayList` để tìm phần tử lớn nhất và nhỏ
    // nhất trong danh sách.
}
