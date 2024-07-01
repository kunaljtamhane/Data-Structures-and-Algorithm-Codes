public class LinearSearch{
  public static void main(String[]args){
    int[]arr ={23,45,1,2,8,9,-3,16};
    int target =19;
    int ans = linearSearch(arr,target);
    System.out.println(ans);
  }
  public static int linearSearch(int[]arr, int target){
    if(arr.length==0){
      return -1;
    }
    for(int i=0; i<arr.length;i++){
      int element=arr[i];
      if(element==target){
        return i;
      }
    }
    return -1;
  }
}
