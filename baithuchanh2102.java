import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so nguyen: ");
        System.out.print("nhap vao so tu ban phim: ");
        String c = sc.next();
        char s[] = c.toCharArray();
        int t = 0;
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            t = t + Character.getNumericValue(s[i]);
        }
        System.out.print("Nhap vao nam sinh: ");
        int ns = sc.nextInt();
        int tuoi = 2023 - ns;
        switch (tuoi) {
            case 10:
                System.out.print("hoc tieu hoc");
        }
    }
}
