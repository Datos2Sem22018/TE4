package com.example.karla.te4;

public class Maze {
    public int counter = 0;
    public char[][] maze;

    public Maze(char[][] maze) {
        this.maze = maze;
        maze[8][8]='F';

    }



    // Get the start location (x,y) and try to solve the maze
    public boolean solve() {
        int x=1, y=1;
        if (step(x,y)) {
            maze[x][y] = 'I';
            System.out.println(this);
            System.out.println("Total calls: " + this.counter);
            return true;
        }else{
            System.out.println("No se pudo encontrar la salida");
            return false;
        }

    }

    // Backtracking method
    public boolean step (int x, int y) {

        counter++;

        System.out.println(this.toString());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /** Accept case - we found the exit **/
        if (maze[x][y] == 'F') {
            return true;
        }

        /** Reject case - we hit a wall or our path **/
        if (maze[x][y] == '#' || maze[x][y] == '*') {
            return false;
        }

        /** Backtracking Step **/

        // Mark this location as part of our path
        maze[x][y] = '*';
        boolean result;

        // Try to go Right
        System.out.println("Mirando a la derecha");
        result = step(x, y+1);
        if (result) {  return true;}

        // Try to go Up
        System.out.println("Mirando a arriba");
        result = step(x-1, y);
        if (result) { return true;}

        // Try to go Down
        System.out.println("Mirando a abajo");
        result = step(x+1, y);
        if (result) { return true;}

        // Try to go Left
        System.out.println("Mirando a la izquierda");
        result = step(x, y-1);
        if (result) { return true;}



        /** Deadend - this location can't be part of the solution **/

        // Unmark this location
        System.out.println("Devolviendose");
        maze[x][y] = ' ';

        // Go back
        return false;
    }

    public String toString() {
        String output = "";
        for (int x=0; x<10; x++) {
            for (int y=0; y<10; y++) {
                output += maze[x][y] + " ";
            }
            output += "\n";
        }
        return output;
    }
}
