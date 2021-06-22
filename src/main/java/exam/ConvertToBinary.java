package exam;
import java.util.*;

public class ConvertToBinary {

  public String toBinary(final int n) {
    
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if(n<0)
    {
      return "Enter positive number."
    }
    else
    {
      char[] bino = new char[32];
      int i=0;
      while(n>0)
      {
        bino[i]=n%2;
        n=n/2;
        i++;
      }
      StringBuffer sb= new StringBuffer(bino);
      sb.reverse();
      return sb;
    }
  }
  public static void main(String s[])
  {
    ConvertToBinary obj = new ConvertToBinary();
    Scanner sc= new Scanner(system.in);
    System.out.println("Enter positive integer: ");
    int n = sc.nextInt();
    String res= obj.toBinary(n);
    System.out.println("Binary No.: "+res);
    
  }
  
}
