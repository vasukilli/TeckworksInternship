import java.uti.Scanner;
public class ArrayOperations
  {
    public static void main(String[] args)
    {
      System.out.println("enter different option num  to do array_operations ");
      System.out.println("1.ist of operations on array.\n");
      System.out.println("2.Insert an element in first index.\n");
      System.out.println("3.Insert an element in last index.\n");
      System.out.println("4. Insert an element in specifie index.\n");
     System.out.println("5.Remove element from first index.\n");
      System.out.println("6. Remove element from last index\n");
      System.out.println("7. Remove element from specified index\n");
      System.out.println("8.  Remove user eneted element\n");
      System.out.println("9. Display all in ASC/DESC order.\n");
      System.out.println("10.Display array.\n");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size of array :");
      int s = sc.nextInt();
      int array[] = new int[s];
      System.out.println("enter option :");
      int option = sc.nextInt();

      switch(option){
        case 1 :insertElementAtFirst(array, s);
                break;
        case 2 :insertElementAtLast(array,s);
                break;
        case 3 :insertElementAtSpecified(array,s);
                break;
        case 4 :removeElementAtFirst(array,s);
                break;
        case 5 :removeElementAtLast(array,s);
                break;
        case 6 :removeElementAtSpecified(array,s);
                break;
        case 7 :removeUserElement(array,s);
                break;
        case 8 :displayAsceOrDec(array,s);
                break;
        case 9 :removeUserElementSpeci(array,s);
                break;
        case 10 :displayArray(array,s);
                break; 
          
          }
      
      
    }
    static void insertElementAtFirst(int array[], int s){
      System.out.println("enter element at first");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter element :");
      int el = sc.nextInt();
      for(int i = 0;i<s;i++){
        array[i]=el;
      }
      
    }
     static void insertElementAtLast(int array[], int s){
       System.out.println("enter an element at last");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter element :");
       int el = sc.nextInt();
       for(int i=0;i<s;i++){
         array[s-1]=el;
       }
      
    }
     static void insertElementAtSpecified(int array[], int s){
        System.out.println("enter an element at specified index");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter element :");
       int el = sc.nextInt();
       System.out.println("enter index :");
       int ind = sc.nextInt();
       
      
    }
     static void removeElementAtFirst(int array[], int s){
      
    }
     static void removeElementAtLast(int array[], int s){
      
    }
     static void removeElementAtSpecified(int array[], int s){
      
    }
     static void removeUserElement(int array[], int s){
      
    }
     static void displayAsceOrDec(int array[], int s){
      
    }
     static void displayArray(int array[], int s){
      
    }
     static void removeUserElementSpeci(int array[], int s){
      
    }
    
  }