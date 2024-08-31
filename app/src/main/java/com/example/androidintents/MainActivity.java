package com.example.androidintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // button eka id eken adura ganima
        Button btn1 = findViewById(R.id.btn1);

        // button eka click karama wena de
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Api dan inna thena => getApplicationContext()
                // Apita yanna ona thena => Activity2.class
                Intent i = new Intent(getApplicationContext(), Activity2.class);
                // start activity kiyana method ekata, inetent eka pass karanawa
                // ethakota eya thama deweni screen ekata yana wade karala denne
                startActivity(i);
            }
        });
    }
}