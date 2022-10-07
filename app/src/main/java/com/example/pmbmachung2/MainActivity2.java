package com.example.pmbmachung2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {
    public static Boolean valueinstagram,valuewebsite,valuegurubk,valueedfair,valuekelas,valueortu;
    private void kirimvaluechkbox(){
        CheckBox checkbox_insta = (CheckBox) findViewById(R.id.chkbox_insta);
        valueinstagram = checkbox_insta.isChecked();

        CheckBox chkbox_web = (CheckBox) findViewById(R.id.chkbox_web);
        valuewebsite = chkbox_web.isChecked();

        CheckBox chkbox_BK = (CheckBox) findViewById(R.id.chkbox_BK);
        valuegurubk = chkbox_BK.isChecked();

        CheckBox chkbox_edufair = (CheckBox) findViewById(R.id.chkbox_edufair);
        valueedfair = chkbox_edufair.isChecked();

        CheckBox chkbox_presentasi = (CheckBox) findViewById(R.id.chkbox_presentasi);
        valuekelas = chkbox_presentasi.isChecked();

        CheckBox chkbox_ortu = (CheckBox) findViewById(R.id.chkbox_ortu);
        valueortu = chkbox_ortu.isChecked();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void pindahmainact3(View view) {

        kirimvaluechkbox();
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }
}