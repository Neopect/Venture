import java.awt.Robot;
import java.awt.event.KeyEvent;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("hello");
        System.out.println("\r worldss");
        System.out.print("Working");
        System.out.println("\b\b\b\b");
        //Runtime.getRuntime().exec("clear");
        //new ProcessBuilder("terminal", "/c", "clear").inheritIO().start().waitFor();
       Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_2);
    }
}
