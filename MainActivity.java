package com.example.nilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText ednama, ednim, edtugas, edhadir, eduts, eduas, edakhir, edhuruf ;
    Button bthitung ;
    Double vtugas, vhadir, vuts, vuas, vakhir ;
    String vhuruf ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednama = (EditText) findViewById(R.id.ednama);
        ednim = (EditText) findViewById(R.id.ednim);
        edtugas = (EditText) findViewById(R.id.edtugas);
        edhadir = (EditText) findViewById(R.id.edhadir);
        eduts = (EditText) findViewById(R.id.eduts);
        eduas = (EditText) findViewById(R.id.eduas);
        edakhir = (EditText) findViewById(R.id.edakhir);
        edhuruf = (EditText) findViewById(R.id.edhuruf);
        bthitung = (Button) findViewById(R.id.bthitung);
    }

    public void hitung(View view){
        vtugas = Double.parseDouble(edtugas.getText().toString());
        vhadir = Double.parseDouble(edhadir.getText().toString());
        vuts = Double.parseDouble(eduts.getText().toString());
        vuas = Double.parseDouble(eduas.getText().toString());

        // rumus perhitungan nilai akhir
        vakhir = (0.15 * vhadir) + (0.25 * vtugas) + (0.25 * vuts) + (0.35 * vuas);

        // kondisi penentuan nilai akhir
        if (vakhir >=80 && vakhir <=100){
            vhuruf="A";
        }
        else if (vakhir >=75 && vakhir <80){
            vhuruf="B+";
        }
        else if (vakhir >=65 && vakhir <75){
            vhuruf="B";
        }
        else if (vakhir >=60 && vakhir <65){
            vhuruf="C+";
        }
        else if (vakhir >=55 && vakhir <60){
            vhuruf="C";
        }
        else if (vakhir >=50 && vakhir <55){
            vhuruf="D+";
        }
        else if(vakhir >=45 && vakhir <50){
            vhuruf="D";
        }
        else{
            vhuruf="E";
        }
        edakhir.setText(""+vakhir);
        edhuruf.setText(""+vhuruf);
    }
}