import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter 3 number: ");
        for(int i=0;i<numbers.length;i++){
           
            numbers[i]=sc.nextInt();

        }
        System.out.println("these numbers are:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    
}
