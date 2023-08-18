public class Q4 {

    public static int binSrh(int arr[],int target,boolean searchFirst) {
        int low=0,high=arr.length-1;
        int index=-1;

        //applying Binary search
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                index=mid;          //Storing index of element      
                
                if(searchFirst){
                    high=mid-1;     //For first occurence
                }
                else{
                    low=mid+1;      //For last occurence
                }
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
        int arr[]={2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target=6;

        //For first occurence
        int first=binSrh(arr, target, true);
        //For second occurence
        int last=binSrh(arr, target, false);

        int count=last-first+1;
        if (first != -1) {
            System.out.println("Element " + target + " occurs " + count + " times");
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}
