package functions;

import java.util.ArrayList;
import java.util.List;

import views.Map;

interface starters {
    public void initiz();
}

public class Player { //Use interface later on

    

    public static List<Integer> heroLoc = new ArrayList<Integer>();


    public void move(String command) {

        Map map = new Map();
        int xOld = heroLoc.get(0);
        int yOld = heroLoc.get(1);
        int x = heroLoc.get(0);
        int y = heroLoc.get(1);
        
        switch(command) {
            case "up":
            
                y--;
            break;

            case "down":
                y++;
            break;

            case "left":
                x--;
            break;

            case "right":
                x++;
            break;

            default:
            System.out.println("Invalid command");
            break;
        }

        // Create checker if out of bound
        if(x < 0 || x > Map.board.get(0).size()-1 || y < 0 || y > Map.board.size()-1) {
            System.out.println("Invalid move");
        } else {
            heroLoc.set(0, x);
            heroLoc.set(1, y);
            heroLoc.set(2, map.calcPos(x, y)[0]);
            heroLoc.set(3, map.calcPos(x, y)[1]);

            map.moveChar(xOld, yOld, x, y, 1);
        }

        


    }

    public void attack() {

    }
}
