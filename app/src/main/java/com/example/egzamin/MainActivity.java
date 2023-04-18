package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;


    /*
    ******************************************************************
    nazwa funkcji: onCreate
    argumenty: savedInstanceState - zapisany stan instancji
    typ zwracany: brak
    informacje: funkcja zawiera listenery dla buttonow do polubienia oraz do usuniecia polubienia
    autor: Piotr Galka
    ******************************************************************
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button likeButton = (Button) findViewById(R.id.buttonLike);
        Button deleteButton =  (Button) findViewById(R.id.buttonDelete);

        TextView resultText = (TextView) findViewById(R.id.textResult);

        likeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                counter += 1;
                resultText.setText(counter + " polubien");
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if(counter == 0) {
                    return ;
                }

                counter -= 1;
                resultText.setText(counter + " polubien");
            }
        });
    }
}