package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int n=1;
    for(int i=0;i<arr.length;i++)
    {
      St=ystem.out.print(arr[i]+",");
    }
    for(int j=0;j<n;j++)
    {
      int k,last;
      last=arr[arr.length-1];
      for(k=arr.length-1;k>0;k--)
      {
        arr[k]=arr[k-1];
    }
arr[0]=last;
  }
    System.out.println();
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+",");
    }

}
}
