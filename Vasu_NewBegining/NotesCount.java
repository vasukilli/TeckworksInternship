//12) Write a java program to count total number of notes in given amount.
import java.util.*;
public class NotesCount 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount:");
        int amount = sc.nextInt();
        int[] notes = {2000,500,200,100,50,20,10,5,1};
        int[] notesCount = new int[10];
        for(int i=0 ; i<notes.length;i++){
            if(amount >= notes[i]){
                notesCount[i] = amount/notes[i];
                amount = amount -(notesCount[i]*notes[i]);
            }
        }
        System.out.println("total number of notes:");
        for(int i=0 ; i<=notes.length;i++){
            if(notesCount[i] != 0){
                System.out.println(notes[i] + ":" + notesCount[i]);
            }
        }
    }
    
}
