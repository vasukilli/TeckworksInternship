/*You have been assigned the task of creating a program that implements a stack using an array in java. 

The program should include error handling to handle any exceptions that may arise during the execution.  

You need to test the program with various inputs and ensure that it works as expected. 

The program should accept the following commands from the user: 

1. push <value>: Add an element to the top of the stack 

2. pop: Remove the element at the top of the stack 

3. peek: Display the element at the top of the stack 

4. display: Display all the elements in the stack 

5. exit: Terminate the program 

For push and pop commands, the program should display the stack after the operation, along with any error messages if the stack is full or empty. 

For peek and display commands, the program should display the element(s) or the entire stack, along with any error messages if the stack is empty. 

The program should terminate gracefully when the user enters the exit command. */
class StackData
  {
    int num1,num2,num3,num4,num5;
    
    public StackData(int num1 , int num2 , int num3 , int num4 , int num5)
    {
     this.num1 = num1;
      this.num2 = num2;
      this.num3 = num3;
      this.num4 = num4;
      this.num5 = num5;
    }

	public int getNum1() {
		return num1;
	}


	public int getNum2() {
		return num2;
	}

	

	public int getNum3() {
		return num3;
	}


	public int getNum4() {
		return num4;
	}

	

	public int getNum5() {
		return num5;
	}
    public String toString(){
      return num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5;
    }

  }