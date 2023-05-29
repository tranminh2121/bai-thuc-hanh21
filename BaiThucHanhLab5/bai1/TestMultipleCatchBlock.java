package BaiThucHanhLab5.bai1;

public class TestMultipleCatchBlock {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task is completed");
        } catch (Exception e) {
            Symtem.out.println("common task completed");
        }
        System.out.println("rest of the code...");
    }
}
