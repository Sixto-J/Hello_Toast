package com.example.Hello_Toast;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button btnEnviar1 = findViewById(R.id.button);

        btnEnviar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // código a ejecutar cuando sea pulsado
                TextView tv1 = findViewById(R.id.textView);
                String text = tv1.getText().toString();
                Toast.makeText(MainActivity.this, "TU PUNTUACION ES "+text, 4).show();


            }
        });

        Button btnEnviar2 = findViewById(R.id.button2);
        btnEnviar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // código a ejecutar cuando sea pulsado
                TextView tv1 = findViewById(R.id.textView);
                String aux_string = tv1.getText().toString();
                int numerodecontador = Integer.parseInt(aux_string);
                //.replaceAll("[\\D]", ""));
                numerodecontador++;
                tv1.setText(String.valueOf(numerodecontador));
            }
        });



    }
}


/*cambiar a RelativeLayout i despres probar ContraintLayout


*/
