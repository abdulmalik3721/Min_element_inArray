import java.util.Scanner;

public class IntVarArgs {

    static void add(int... nums) {

        int sum = 0;

        for(int n : nums) {
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers?");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter numbers:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        add(arr);
    }
}