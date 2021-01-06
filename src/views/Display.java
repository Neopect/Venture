package views;

public class Display {
    /**
     * To control all output related content and organzie the output
     */

     public void loadFrame() {
         System.out.println(feedback(""));

     }

     private String feedback(String event) {
         String statement = null;
         if(event.equals("move")) {
            statement = "Nice move, what's next?";
         }else if(event.equals("goal")) {
            statement = "Good job, you win!";
         } else if(event.equals("attack")) {
             statement = "Strong move, what's next?";
         } else {
             statement = "I don't know what just happened?";
         }


         return statement;

     }

     void Input() {

     }
     
    
}

/*
 Layout:
 
 - Feedback
 - Display
 - Input
 */
