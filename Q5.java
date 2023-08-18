import java.util.Scanner;

public class Q5 {

    public static boolean perfectSquare(int num) {
        int low=0,high=num;

        while(low<=high){
            int mid=low+(high-low)/2;
            int value=mid*mid;
            if(value==num){
                return true;
            }
            else if(value>num){
                high=mid-1;
            }
            else if(value<num){
                low=mid+1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        sc.close();

        System.out.println( perfectSquare(num));

    }
}
