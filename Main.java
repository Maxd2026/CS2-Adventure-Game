 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
        
       
      //STEP #1: Describe the current scenario
      System.out.println("You are at an airport on a mysterious island");
      // STEP #2: Get user command
      command = getCommand("Do you go east and get in the car waiting for you (c) or stay in the airport and leave the island (n)");
      // STEP #3: Select a path based on the user's command
      if ( command.equals("c") ) {
         // NEXT BRANCH...
         System.out.println("You get in the car and drive to a mansion");

         System.out.println("You arrive at mansion.");
         command = getCommand("You can enter the mansion (e) or walk around and explore (w)");

         if ( command.equals ("e") ) {

            System.out.println("You enter the mansion and explore." );

            command = getCommand("Open the creepy door (o) or go upstairs (u)");

            if ( command.equals ("o") ) {
               System.out.println("You see former president Bill Clinton and Steve Cohen eating lunch");
            }
            else if ( command.equals ("u") ) {
               System.out.println("Donald Trump is waiting for you at the top of the stairs with a creepy grin.");
            }

         }
         else if ( command.equals ("w") ) {
            System.out.println("You see a man fishing by the water");

            command = getCommand("Fish with the man (f)");

            if ( command.equals ("f") ) {
               System.out.println("You fish with the man and he warns you about the dangers of the island ");
            }
            else  {
               System.out.println("The man pushes you into the water. GAME OVER. Press RUN to replay");
            }
            
         }

         // NEXT BRANCH
        



      }
      else if ( command.equals("n") ) {
         System.out.println("You get on a plane back to NY");
      }
      else {
         System.out.println("GAME OVER! your plane crashes. Press RUN to replay.");
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
       return command;
    } // END OF METHOD
 } // END OF CLASS
