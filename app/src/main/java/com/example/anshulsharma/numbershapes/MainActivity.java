package com.example.anshulsharma.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void shape(View view) {

        class shapes {
            int number;

            public boolean square() {

                double root = Math.sqrt(number);
                if (root == Math.floor(root)) {
                    return true;
                } else
                    return false;
            }


            public boolean triangle() {

                int x = 1;
                int traingularNum = 1;
                while (traingularNum < number) {
                    x++;
                    traingularNum = traingularNum + x;
                }
                if (traingularNum == number) {
                    return true;
                } else
                    return false;
            }

        }
        EditText num = findViewById(R.id.number);
        if (num.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        } else {
            int givenNum = Integer.parseInt(num.getText().toString());
            shapes ansh = new shapes();
            ansh.number = givenNum;
            if(ansh.square() && ansh.triangle()){
                Toast.makeText(this, "Both Triangle and Square shape", Toast.LENGTH_SHORT).show();
            }
            else if (ansh.square())
                Toast.makeText(this, "Square shape", Toast.LENGTH_SHORT).show();
            else if (ansh.triangle()) {
                Toast.makeText(this, "Triangle shape", Toast.LENGTH_SHORT).show();
            } else
                Toast.makeText(this, "No Shape", Toast.LENGTH_SHORT).show();

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
