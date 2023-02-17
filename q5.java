import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void q5(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("The list is: " + list);
        System.out.println("The number of occurance of each element in the list is: ");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            System.out.println(list.get(i) + " -> " + count);
        }
        sc.close();
    }
}
