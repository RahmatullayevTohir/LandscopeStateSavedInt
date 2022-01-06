package com.example.landscopestate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etMain;
    TextView tvSecond;
    Button button;

    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        if (savedInstanceState!=null){
            count = savedInstanceState.getInt("count");
        }else {
        }
    }

    private void initViews() {
        etMain = findViewById(R.id.et_main);
        tvSecond = findViewById(R.id.tv_second);
        button = findViewById(R.id.btn_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCount();
            }
        });
    }
    private void getCount(){
        ++count;
        tvSecond.setText(String.valueOf(count));
        etMain.setText(String.valueOf(count));
//        Toast.makeText(this,String.valueOf(count),Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count);
    }
}