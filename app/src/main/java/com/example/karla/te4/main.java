package com.example.karla.te4;

public class main {



    public static void  main(String [] args){

        char maze [][] =

                {       {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},
                        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};
        Maze m = new Maze(agregueDos(maze));

        while (m.solve()!=false){
            limpiarMatriz(maze);
            m = new Maze(agregueDos(maze));


        }

    }
    public static char[][] agregueDos(char[][] maze){
        int x1 = (int) (Math.random()*8)+1;
        int y1 = (int) (Math.random()*8)+1;
        int x2 = (int) (Math.random()*8)+1;
        int y2 = (int) (Math.random()*8)+1;


        maze[x1][y1] = '#';
        maze[x2][y2] = '#';

        return maze;
    }
    public static char[][] limpiarMatriz(char[][] maze){
        for (int x =0; x< 10; x++){
            for (int y= 0; y<10 ; y++){
                if (maze[x][y]=='*'){
                    maze[x][y]=' ';
                }
            }
        }
        return maze;
    }



}
