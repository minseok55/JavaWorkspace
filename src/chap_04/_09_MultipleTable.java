package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4

        for (int i = 2; i <= 9; i++) { // i 가 9보다 작거나 같을 때 까지 반복 (2단부터 9단까지)
//            int j = 1;
//            System.out.println(i + " x " + j + " = " + (i * j));
//            j++;
            for (int j = 1; j < 10; j++) { // i * 1 ~ 9 까지의 숫자 반복 10보다 작을 때 까지
                System.out.println(i + " * " + j + " = " + (i * j)); // 2 * 1 = 2
            }
            System.out.println();
        }
    }
}
