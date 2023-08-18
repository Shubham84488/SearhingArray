import java.util.Scanner;

public class Q1{

    public static void findLin(int arr[],int target) {

        int count=0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                count++;
                index=i;
                break;
            }
        }
        if(count==1)System.out.println("Element found at index "+index);
        else{System.out.println("Element not found");}

    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the %d element of array: ",i+1);
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target to find: ");
        int target=sc.nextInt();
        sc.close();
        
        findLin(arr, target);

    }
}