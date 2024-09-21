import java.util.*;

public class TestStackArray{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      StackArray stack;
      int choice = 0;
      
      System.out.print("Enter stack size: ");
      stack = new StackArray(scan.nextInt());
      do{
         System.out.println("--Stack Array Menu-- ");
         System.out.println("1.) Push an Item. ");
         System.out.println("2.) Pop ");
         System.out.println("3.) Peek ");
         System.out.println("4.) Display Stack ");
         System.out.println("5.) Exit program ");
         
         System.out.print("Select a choice: ");
         choice = scan.nextInt();
         scan.nextLine();//eats whitespace
         switch(choice){
            case 1:
               String val = "";
               System.out.print("Enter an Item/s: ");
               val = scan.nextLine();
               
               if(stack.push(val)){
                  System.out.println("Successfully added an item/s ");
                  }
               else{
                  System.out.println("Item/s is full.");
               }
               break;
            case 2:
               if(stack.pop()){
                  System.out.print("Successfully Popped.");
               }
               else{
                  System.out.print("Stack is empty");
               }
               break;
               
           case 3:
               if(stack.peek() != null){
                  System.out.println(stack.peek());
               }
               else{
                  System.out.println("Stack is empty");
               }
               break;
           case 4:
               stack.display();
              break;
           case 5:
               System.out.print("Thankyu!");
           break;         
           default:
               System.out.println("Invalid, Your choice is beyond the choices");   
         }
      } while(choice != 5);
                   
   }
}