package hw7;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму на счету: ");
        int N = scanner.nextInt();
        int days = calcDaysWithdraw(N);
        System.out.println("Дней для полного снятия денег: " + days);
    }

    public static int calcDaysWithdraw(int N) {
        int days = 0;
        while (N > 0) {
            int withdrawalAmount = largestDivisor(N);
            N -= withdrawalAmount;
            days++;
        }
        return days;
    }

    public static int largestDivisor(int N) {
        for (int i = N / 2; i >= 1; i--) {
            if (N % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
