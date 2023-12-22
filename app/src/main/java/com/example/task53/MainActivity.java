package com.example.task53;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int counterClick = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
    }

    public void clicked(View view) {
        counterClick +=1;
        tv.setTextColor(Color.YELLOW);
        if (counterClick != 6)
            tv.setText("This is a click number:" + counterClick);
        else {
            tv.setText("Enough to click. Go to new start!");
            counterClick = 0;
        }
    }
}