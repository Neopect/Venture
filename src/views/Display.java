package views;

public class Display {
    /**
     * To control all output related content and organzie the output
     */

    Map map = new Map();

     public void loadFrame(String event) {
         
         System.out.println(feedback(event));
         map.displayMap();

     }

     private String feedback(String event) {
         String statement = null;
         if(event.equals("left") || event.equals("right") || event.equals("up") || event.equals("down")) {
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
