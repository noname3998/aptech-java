package day3;

public class Ex2 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("bang cuu chuong " + i);
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
