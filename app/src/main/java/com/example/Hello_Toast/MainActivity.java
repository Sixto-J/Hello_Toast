package com.example.Hello_Toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R.id.button2);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // código a ejecutar cuando sea pulsado
                TextView tv1 = (TextView)findViewById(R.id.textView);
                int numerodecontador = Integer.parseInt((findViewById(R.id.textView)).toString().replaceAll("[\\D]", ""));
                numerodecontador++;
                tv1.setText(String.valueOf(numerodecontador));
            }
        });


    }
}


/*cambiar a RelativeLayout i despres probar ContraintLayout


*/
