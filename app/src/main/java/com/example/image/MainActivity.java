package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.iV);

    }

    public void go(View view) {
        Button bat;
        bat= (Button)findViewById(R.id.button);
        int ran = random.nextInt(3);
        bat.setText(""+(ran+1));
        if (ran == 0){
            imageView1.setImageResource(R.drawable.v1);

        }
        else if (ran == 1){
            imageView1.setImageResource(R.drawable.v2);


        }
        else{
            imageView1.setImageResource(R.drawable.v3);

        }
    }
}