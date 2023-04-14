package HinhHoc;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float r;
        float cv;

        Scanner sc = new Scanner(System.in);

        // Nhập bán kính từ bàn phím
        System.out.print("Nhap ban kinh: ");
        r = sc.nextFloat();

        // Tính chu vi
        cv = 2 * r * PI;

        // In kết quả ra màn hình
        System.out.printf("Chu vi hinh tron co ban kinh %.2f la: %.2f", r, cv);
    }
}
