package com.example.flowz.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenWeb(View view) {
        Intent openWebPage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yahoo.com"));
        startActivity(openWebPage);

    }

    public void OpenEmail(View view) {
        Intent OpenEmail = new Intent(Intent.ACTION_SEND);
//        OpenEmail.setData(Uri.parse("mailto: imex4greatness@gmail.com"));
//        OpenEmail.setType("text/plain");
        OpenEmail.setDataAndType(Uri.parse("imex4greatness@gmail.com"),"text/plain");
        startActivity(OpenEmail);
    }
}
