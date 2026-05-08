import java.util.Scanner;
public class smallestNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        System.out.println("Enter the size of the array:");
         int size = sc.nextInt();

         System.out.println("Enter" + size + " elements");

         int[] Ar = new int[size];

         int min=Ar[0];

         for(int i=0;i<Ar.length;i++){
            Ar[i]=sc.nextInt();
            if(Ar[i]<min){
                min=Ar[i];
            }
         }
         System.out.println("the minimum number:" + min );

    }
    
}
