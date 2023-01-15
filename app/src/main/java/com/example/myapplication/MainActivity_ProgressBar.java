package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_ProgressBar extends AppCompatActivity {


    private ProgressBar pb;
    private ProgressBar pb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_progressbar);

         pb = findViewById(R.id.pb);
         pb2=findViewById(R.id.pb2);

    }

    public void click(View view) {
        if(pb.getVisibility()==View.GONE){
            pb.setVisibility(View.VISIBLE);
        }
        else{
            pb.setVisibility(View.GONE);
        }
    }

    public void load(View view) {
        int progress = pb2.getProgress();
        progress+=10;
        pb2.setProgress(progress);

    }
}
