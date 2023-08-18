public class Q2 {

    public static int findLast(int arr[],int target) {
        int low=0,high=arr.length-1;
        int index=-1;

        //applying Binary search
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;          //Storing index of element      
                low=mid+1;          // to check for any other last occurence of target
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,4,4,5,6,6,6,6};
        int target=4;
        int result=findLast(arr,target);
        System.out.println(result);
    }
}
