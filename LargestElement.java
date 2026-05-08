import java.util.Scanner;
public class LargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter" + size + " elements");

        int[] Ar = new int[size];

        int max=Ar[0];

        for(int i=0;i<Ar.length;i++){
            Ar[i]=sc.nextInt();
            if(Ar[i]>max){
                max=Ar[i];
            }
        }
        System.out.println("the largest number is: " + max);
    }
}