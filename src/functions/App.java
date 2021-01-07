package functions;


import java.util.Scanner;

import views.Display;
import views.Map;

//import java.awt.Robot;
//import java.awt.event.KeyEvent;

public class App {

    public static Boolean gameActive = null;
    Player player = new Player();
    Display display = new Display();
    Map map = new Map();

    public static void main(String[] args) {
        
       System.out.println("Starting program");
       
       gameActive = true;

       App app = new App();
       app.getInput();

       
    }


    void getInput() {
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        String in;
        String response = "Please enter your command";

        while(gameActive == true) {
            System.out.println(response);
            System.out.print("> ");
            in = sc.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n");
            System.out.println("You answered "+ in );

            if(in.equals("left") || in.equals("right") || in.equals("up") || in.equals("down")) {
                player.move(in);
            } else if(in.equals("attack")) {

            } else if (in.equals("start")) {
                System.out.println("Please enter X length");
                int xin = Integer.parseInt(sc.nextLine());
                System.out.println("Please enter Y length");
                int yin = Integer.parseInt(sc.nextLine());

                map.createMap(xin, yin);
            } else if(in.equals("quit")) {
                break;
            }
            response = "Please enter your next command";
            display.loadFrame(in);

        }
        sc.close();
        System.out.println("You win! Good job");

        

    }

    void testing() {
        Map map = new Map();
       map.createMap(10, 6);
       //System.out.println(Map.board);       
       map.displayMap();

       Settings set = new Settings();
       set.loadtest();

       //FileSystem fs = new FileSystem();
       //fs.createFS();

       int[] e = map.calcPos(1, -4);
       System.out.println(e[0]);
       System.out.println(e[1]);

       Player p = new Player();
       //p.initiz();
       p.move("right");
       p.move("up");
    }
}
