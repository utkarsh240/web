import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the elements of the list");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("The list before sorting is");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("The list after sorting is");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
