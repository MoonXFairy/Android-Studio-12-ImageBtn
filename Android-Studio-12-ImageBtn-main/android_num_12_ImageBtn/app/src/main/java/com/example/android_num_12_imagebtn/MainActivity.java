package com.example.android_num_12_imagebtn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = (ImageView)findViewById(R.id.img_btn);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.mipmap.img_b);
            }
        });
    }
}