package com.example.coffehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Noti extends AppCompatActivity {
    ImageView img_close;
    LinearLayout noti;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noti);
        ImageView img_close=(ImageView) findViewById(R.id.close_noti);
        LinearLayout noti=(LinearLayout) findViewById(R.id.noti_detail);
        context = this;
        img_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_dialog_noti);
                dialog.show();
            }
        });
    }
}