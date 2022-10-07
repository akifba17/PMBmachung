package com.example.pmbmachung2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private void tampilkancheckbox(){
        boolean vinsta = MainActivity2.valueinstagram;
        boolean vweb = MainActivity2.valuewebsite;
        boolean vbk = MainActivity2.valuegurubk;
        boolean vedu = MainActivity2.valueedfair;
        boolean vkelas = MainActivity2.valuekelas;
        boolean vortu = MainActivity2.valueortu;
        CheckBox chkbox_instaa =  (CheckBox) findViewById(R.id.chkbox_instaa);
        chkbox_instaa.setChecked(vinsta);
        CheckBox chkbox_web =  (CheckBox) findViewById(R.id.chkbox_web);
        chkbox_web.setChecked(vweb);
        CheckBox chkbox_BK =  (CheckBox) findViewById(R.id.chkbox_BK);
        chkbox_BK.setChecked(vbk);
        CheckBox chkbox_edufair =  (CheckBox) findViewById(R.id.chkbox_edufair);
        chkbox_edufair.setChecked(vedu);
        CheckBox chkbox_presentasi =  (CheckBox) findViewById(R.id.chkbox_presentasi);
        chkbox_presentasi.setChecked(vkelas);
        CheckBox chkbox_ortu =  (CheckBox) findViewById(R.id.chkbox_ortu);
        chkbox_ortu.setChecked(vortu);
    }

    private void tampiltext(){
        String nama = MainActivity3.nama;
        String nohp = MainActivity3.nohp;
        String thnlulus = MainActivity3.thnlulus;
        String email = MainActivity3.email;

        TextView txtnama = (TextView) findViewById(R.id.txtnama);
        TextView txthp = (TextView) findViewById(R.id.txthp);
        TextView txtlulus = (TextView) findViewById(R.id.txtlulus);
        TextView txtemail = (TextView) findViewById(R.id.txtemail);

        txtnama.setText(nama);
        txthp.setText(nohp);
        txtlulus.setText(thnlulus);
        txtemail.setText(email);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tampilkancheckbox();
        tampiltext();
    }
}