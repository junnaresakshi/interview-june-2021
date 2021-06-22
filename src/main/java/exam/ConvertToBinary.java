package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    if(n<0)
    {
      return "Enter Positive number."
    }
    else
    {
      char[] bino=new char[32];
      int i=0;
      while(n>0)
      {
        bino[i]=n%2;
        n=n/2;
        i++;
      }
      StringBuffer sb=new StringBuffer(bino);
      sb.reverse();
      return sb;
    }
  }
}
