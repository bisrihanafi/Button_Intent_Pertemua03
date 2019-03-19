package com.bisrihanafigmail.button_intent_pertemuan03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.bisrihanafigmail.butto_pertemuan3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        //Membuat sebuah intent yang menuju aktivity DisplayMessageActiviti dari activity ini
        Intent intent = new Intent ( this , DisplayMessageActivity.class);

        //Menginisialisasi objek yang diambil dari komponen editext view
        EditText editText = (EditText) findViewById(R.id.editText);

        //mengambil nilai value dari objek edittext
        String message = editText.getText().toString();

        //memuat/membuat paket extra message kedalam intent
        intent = intent.putExtra(EXTRA_MESSAGE, message);

        //memanggil aktivity yang telah ter set didalam intent
        startActivity(intent);
    }
}
