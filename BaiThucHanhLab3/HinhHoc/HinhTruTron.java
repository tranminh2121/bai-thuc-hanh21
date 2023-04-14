package HinhHoc;

import java.util.Scanner;

public class HinhTruTron {
    final float PI = 3.14f;
    float r;
    float chieuCao;
    float chuVi;
    float dienTich;
    float theTich;

    public void nhapChieuCao() {
        System.out.print("Nhap chieu cao: ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }

    public void nhapBanKinh() {
        System.out.print("Nhap ban kinh: ");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * r * PI;
    }

    public void tinhDienTich() {
        dienTich = r * r * PI;
    }

    public void theTich() {
        theTich = dienTich * chieuCao;
    }

    public void inThongTin() {
        System.out.printf("Chu vi hinh tru tron la: %.2f\n", chuVi);
        System.out.printf("Dien tich hinh tru tron la: %.2f\n", dienTich);
        System.out.printf("The tich hinh tru tron la: %.2f\n", theTich);
    }

    public static void main(String[] args) {
        HinhTruTron hinhTruTron = new HinhTruTron();
        hinhTruTron.nhapChieuCao();
        hinhTruTron.nhapBanKinh();
        hinhTruTron.tinhChuVi();
        hinhTruTron.tinhDienTich();
        hinhTruTron.theTich();
        hinhTruTron.inThongTin();
    }
}
