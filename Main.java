import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();

        System.out.println("Enter the " + size + " elements");

        int[] Ar = new int[size];

        int sum=0;

        for(int i=0;i<Ar.length;i++){
            Ar[i]=sc.nextInt();
        }
        for(int i=0;i<Ar.length;i++){
            sum=sum+Ar[i];
        }
        System.out.println("sum: " + sum);
    }
}