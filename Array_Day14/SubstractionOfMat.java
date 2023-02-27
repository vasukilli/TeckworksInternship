import java.util.Scanner;
public class SubstractionOfMat
  {
    public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("enter row size: ");
      int a=s.nextInt();
      System.out.println("enter column size: ");
      int b=s.nextInt();
      System.out.println("enter row size: ");
      int A=s.nextInt();
      System.out.println("enter column size: ");
      int B=s.nextInt();
       int array1[][]=new int[a][b];
       int array2[][]=new int[A][B];
      System.out.println("enter array1 elements: ");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              array1[i][j]=s.nextInt();
            }
        }
      System.out.println("enter array2 elements: ");
      for(int i=0;i<A;i++)
        {
          for(int j=0;j<B;j++)
            {
              array2[i][j]=s.nextInt();
            }
        }
      displaySubMat(array1,array2,a,b,A,B);
    }

    
    static void displaySubMat(int[][] array1,int[][] array2,int a,int b,int A,int B){
      int c[][]=new int[a][b];
      if(a==A && b==B){
      
      for(int i=0;i<a;i++)
        {
           for(int j=0;j<b;j++)
             {
               c[i][j]=array1[i][j]-array2[i][j];
               
             }
          
        }
        System.out.print(c[i][j]+" ");
       
    }
  }
  }