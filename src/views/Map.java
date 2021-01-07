package views;

import java.util.ArrayList;
import java.util.List;

import functions.Player;
import functions.App;


public class Map {

    
    public static List<List<String>> board = new ArrayList<List<String>>();
    public static List<Integer> heroLoc = new ArrayList<Integer>();
    public static List<Integer> finish = new ArrayList<Integer>();
    public static List<Integer> boardSize = new ArrayList<Integer>();


    public void createMap(int x, int y) {
        /**
         * Creates frame for the board list
         */

         boardSize.add(x);
         boardSize.add(y);

        for(int u = 0; u < y; u++) { 
            List<String> row = new ArrayList<String>();
            board.add(row);

            for(int l = 0; l < x; l++) {
                row.add("□");
            }

        }

        populateMap();
        
    }

    private void populateMap() {
        /**
         * Adds basics features to the board
         */
        //System.out.println("x");

        int[] bl = {0,board.size()-1};
        int[] tr = {board.get(0).size()-1,0};
        //System.out.println(bl[1] + "////" + bl[0]);

        //Place Hero and goal
        board.get(bl[1]).set(bl[0], "⛋");
        board.get(tr[1]).set(tr[0], "⧮");

        Player.heroLoc.add(0);
        Player.heroLoc.add(board.size()-1);
        Player.heroLoc.add(calcPos(0, board.size()-1)[0]);
        Player.heroLoc.add(calcPos(0, board.size()-1)[1]);

        finish.add(board.size()-1);
        finish.add(0);
        finish.add(calcPos(board.size()-1, 0)[0]);
        finish.add(calcPos(board.size()-1, 0)[1]);
        
        //System.out.println(Player.heroLoc.get(0)+ "  " + Player.heroLoc.get(1));

    }

    public void displayMap() {
        
        for(int x = 0; x < board.size(); x++) {
            System.out.println(board.get(x));
        }

    }
    
    public int[] calcPos(int x, int y) {
        /**
         * Gets the cordinated graph position and calculates where that is within the list
         * (Current version follows (0,0) -> (+,-) )
         * Ex. (1,-4) = get(4).set(1)
         */

        int[] finPos =  {Math.abs(y), x};
        return finPos;
    }

    public void moveChar(int xOld, int yOld, int x, int y, int type) {
        /**
         * Move a charecter from one place to another using position to adjust map indexes
         * 1 = Hero | 2 = Enemy 
         */
        String icon = null;
        if(type == 1) {
            icon = "⛋";
        } else if (type == 2) {
            icon = "⧆";
        } else if (type == 3) {
            icon = "■";
        }

        int[] oldP = calcPos(xOld, yOld);
        int[] newP = calcPos(x, y);

        if(newP[1] == Map.board.get(0).size()-1 && newP[0] == 0 && type == 1) {
            App.gameActive = false;
        }

        try {
            Map.board.get(oldP[0]).set(oldP[1], "□");
            Map.board.get(newP[0]).set(newP[1], icon);
        } catch (Exception e) {
            System.out.println("Out of range");
            e.printStackTrace();
        }

    }

}


/**
 * 
 */