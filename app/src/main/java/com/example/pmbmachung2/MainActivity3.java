package com.example.pmbmachung2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity3 extends AppCompatActivity {
    String[] programstudi = {"Sistem Informasi","Teknik Industri","Teknik Informatika","Desain Komunikasi Viual","Farmasi"};
    Spinner progstud;
    public static String nama,nohp,thnlulus,email;
    private void kirimstring(){
        EditText namaa = (EditText) findViewById(R.id.editTextTextPersonName13);
        EditText hpp = (EditText) findViewById(R.id.editTextTextPersonName14);
        EditText emaill = (EditText) findViewById(R.id.editTextTextPersonName15);
        EditText lulus = (EditText) findViewById(R.id.editTextTextPersonName16);
        nama = namaa.getText().toString();
        nohp = hpp.getText().toString();
        thnlulus = emaill.getText().toString();
        email = lulus.getText().toString();



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
//        progstud = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, programstudi);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        progstud.setAdapter(adapter);
//        progstud.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//        String selection = "Sistem Informasi";
//        int spinposisi = adapter.getPosition(selection);
//        progstud.setSelection(spinposisi);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);

    }

    public void pindahmainact(View view) {
        kirimstring();
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    public void pindahmainact2(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    public void strata1(View view) {
        LinearLayout strat1 = (LinearLayout) findViewById(R.id.layerstrata1);
        LinearLayout strat2 = (LinearLayout) findViewById(R.id.layerstrata2);

        strat1.setVisibility(View.VISIBLE);
        strat2.setVisibility(View.GONE);

    }

    public void strata2(View view) {
        LinearLayout strat2 = (LinearLayout) findViewById(R.id.layerstrata2);
        LinearLayout strat1 = (LinearLayout) findViewById(R.id.layerstrata1);
        strat1.setVisibility(View.GONE);
        strat2.setVisibility(View.VISIBLE);
    }
}