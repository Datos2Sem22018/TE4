package com.example.karla.te4;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    static String lab;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main.main(new String[]{});
        TextView txtMaze = findViewById(R.id.maze);
        txtMaze.setText(lab);

    }

    public static void txtMazeSetText(String maze){
        lab = maze;
    }


}


