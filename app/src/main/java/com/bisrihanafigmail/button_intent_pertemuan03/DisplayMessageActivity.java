package com.bisrihanafigmail.button_intent_pertemuan03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //mengambil intent paket
        Intent intent=getIntent();

        //mengambil pesn yang telah ditandai sebagai EXTRA_MESSAGE
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView text=(TextView)findViewById(R.id.textView);

        //meng-set komponen view dengan isi message.
        text.setText(message);

    }
}
