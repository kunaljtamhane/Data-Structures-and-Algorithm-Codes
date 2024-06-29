public class ArrayPassingFunction{
  public static void main(String[] main){
    int[] arr = {3,4,5,12};
    System.out.println(Arrays.toString(arr));
    change(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void change(int[]arr){
    arr[0]=99;
  }
}
