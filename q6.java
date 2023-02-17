import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sumLeftDiagonal = 0;
        int sumRightDiagonal = 0;

        System.out.println("Enter 3x3 matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumLeftDiagonal += matrix[i][j];
                }
                if (i + j == 2) {
                    sumRightDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of left diagonal: " + sumLeftDiagonal);
        System.out.println("Sum of right diagonal: " + sumRightDiagonal);
    }
}
