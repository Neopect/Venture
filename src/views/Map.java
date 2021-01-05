package views;

import java.util.ArrayList;
import java.util.List;

public class Map {

    @SuppressWarnings("rawtypes")
    public static List<List> board = new ArrayList<List>();  

    public void createMap(int x, int y) {
        /**
         * Creates frame for the board list
         */

        for(int u = 0; u <= y; u++) { 
            List<String> row = new ArrayList<String>();
            board.add(row);

            System.out.println(board);
            
        }

        populateMap();
        
    }

    private void populateMap() {
        /**
         * Adds enemys and walls to the board
         */
        System.out.println("x");
    }

    public void displayMap() {
        
        for(int x = 0; x < board.size(); x++) {
            System.out.println(board.get(x));
        }

    }

}