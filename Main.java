 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
        
       
      //STEP #1: Describe the current scenario
      System.out.println("You are at the Colombus Circle entrance to Central Park.");
      // STEP #2: Get user command
      command = getCommand("Do you go east (e) or north (n)");
      // STEP #3: Select a path based on the user's command
      if ( command.equals("e") ) {
         // NEXT BRANCH...
         System.out.println("You reach the Carousel.");
      }
      else if ( command.equals("n") ) {
         System.out.println("You see a wedding at Tavern on the Green");
      }
      else {
         System.out.println("GAME OVER! You got lost in the Time Warner center shopping for hours. Press RUN to replay.");
      }


    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
