public class Q3 {

    public static int count1(int arr[]) {
        int target=0;         // to find the last occurence of zero;
        int low=0,high=arr.length-1;
        int index=-1;

        //applying Binary search
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;          //Storing index of zero      
                low=mid+1;          // to check for any other last occurence of zero
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
        }

        return index + 1;           
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1};
        int count=arr.length -count1(arr);              // As  ones=total-zeros; 
        System.out.println("No. of ones are: "+count);
    }
}
