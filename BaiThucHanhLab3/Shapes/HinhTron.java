package Shapes;

import java.util.Scanner;

public class HinhTron {

    private final float PI = 3.14f;
    private float r;
    float cv;
    float dt;

    public float setBanKinh() {
        return r;

    }

    public void setTinhChuVi() {

        return 2 * r * PI;
    }

    public void setTinhDienTich() {
        return r * r * PI;
    }

    public void setInChuVi(String name) {
        System.out.printf("Chu vi hinh tron: ");
        System.out.printf("Dien tinh hinh tron");

    }
}