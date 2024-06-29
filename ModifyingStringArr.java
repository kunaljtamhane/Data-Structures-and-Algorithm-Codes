public class ModifyingStringArr{
  public static void main(String[]args){
    String[] str = new String[4];
    Scanner in = new Scanner(System.in);
    for(int i=0; i<str.length; i++){
      str[i]=in.next();
    }
    System.out.println(Arrays.toString(str));
    str[1]="Java";
    System.out.println(Arrays.toString(str));
  }
}
