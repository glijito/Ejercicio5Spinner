package com.example.prpas.ejercicio5spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner pastenPvto = (Spinner) findViewById(R.id.xsp);
        pastenPvto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, pastenPvto.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
            }
//supondre que esta bien vergas :v
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
