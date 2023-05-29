package BaiThucHanhLab5.bai1;

public class Hello {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
            System.out.print("torng khoi try");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
