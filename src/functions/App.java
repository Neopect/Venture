package functions;

import java.io.File;
import java.util.Scanner;

import functions.FileSystem;
import functions.Player;
import functions.Settings;
import views.Display;
import views.Map;

//import java.awt.Robot;
//import java.awt.event.KeyEvent;

public class App {

    public static Boolean gameActive = null;
    Player player = new Player();
    Display display = new Display();
    Map map = new Map();

    public static void main(String[] args) throws Exception {
        /*
        System.out.println("Hello, World!");
        System.out.print("hello");
        System.out.println("\r worldss");
        System.out.print("Working");
        System.out.println("\b\b\b\b");*/
        //Runtime.getRuntime().exec("clear");
        //new ProcessBuilder("terminal", "/c", "clear").inheritIO().start().waitFor();
       //Robot robot = new Robot();
       //robot.keyPress(KeyEvent.VK_2);
       System.out.println("■");
       //[◼]
       gameActive = true;

       App app = new App();
       //app.testing();
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
