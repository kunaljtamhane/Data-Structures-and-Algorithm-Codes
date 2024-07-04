public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = orderagnosticsBS(arr, target);
        System.out.println(ans);
    }

    //Creating a Order agnostic funciton to check whether array is sorted in ascending or descending.
    static int orderagnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc= arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end =mid-1;
                }else if(target>arr[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }else if (target<arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
