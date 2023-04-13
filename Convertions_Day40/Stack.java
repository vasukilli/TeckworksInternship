import java.util.Stack;

class StackusingPredefined {
  public static void main(String[] args) {

  
    Stack<Integer> s1= new Stack<>();
    s1.push(100);
    s1.push(200);
    s1.push(300);
    System.out.println("Stack: " + s1);

    s1.pop();
    s1.peek();
    s1.search(200);
    System.out.println("Stack after pop: " + s1);
    }
}