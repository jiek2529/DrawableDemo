package com.jiek.drawabledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2, b3, b4;
    ImageView horizontal_iv, vertical_iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1 = (Button) findViewById(R.id.b25);
        b2 = (Button) findViewById(R.id.b50);
        b3 = (Button) findViewById(R.id.b75);
        b4 = (Button) findViewById(R.id.b100);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        horizontal_iv = (ImageView) findViewById(R.id.horizontal_iv);
        vertical_iv = (ImageView) findViewById(R.id.vertical_iv);
    }

    @Override
    public void onClick(View v) {
        try {
            switch (v.getId()) {
                case R.id.b25:
                    progress(25);
                    break;
                case R.id.b50:
                    progress(50);
                    break;
                case R.id.b75:
                    progress(75);
                    break;
                case R.id.b100:
                    progress(100);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void progress(int i) {
        horizontal_iv.setImageLevel(i * 100);
        vertical_iv.setImageLevel(i * 100);
        ((TextView) findViewById(R.id.title_tv)).setText(i+" %");
    }
}
