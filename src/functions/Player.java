package functions;

import java.util.ArrayList;
import java.util.List;

import views.Map;

interface starters {
    public void initiz();
}

public class Player { //Use interface later on

    

    public static List<Integer> heroLoc = new ArrayList<Integer>();

    public void initiz() {
        System.out.println("Working");
        heroLoc.add(Map.heroLoc.get(0));
        heroLoc.add(Map.heroLoc.get(1));
        heroLoc.add(Map.heroLoc.get(2));
        heroLoc.add(Map.heroLoc.get(3));
    }

    public void move(String command) {

        Map map = new Map();
        int xOld = heroLoc.get(0);
        int yOld = heroLoc.get(1);
        int x = heroLoc.get(0);
        int y = heroLoc.get(1);
        System.out.println(x  +" sss "+ y);
        switch(command) {
            case "up":
                System.out.println("up");
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
        System.out.println(x  +" sss "+ y);
        System.out.println(xOld  +" sss "+ yOld);
        heroLoc.set(0, x);
        heroLoc.set(1, y);
        heroLoc.set(2, map.calcPos(x, y)[0]);
        heroLoc.set(3, map.calcPos(x, y)[1]);

        System.out.println(heroLoc.get(2) + " " + heroLoc.get(3));

        map.moveChar(xOld, yOld, x, y, 1);


    }

    public void attack() {

    }
}
