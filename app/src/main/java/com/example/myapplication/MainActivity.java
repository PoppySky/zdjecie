package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView obrazek;
    SeekBar przezroczysty, czerwony, zielony, niebieski;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obrazek = findViewById(R.id.imageView);
        przezroczysty = findViewById(R.id.seekBar1);
        czerwony = findViewById(R.id.seekBar2);
        zielony = findViewById(R.id.seekBar3);
        niebieski = findViewById(R.id.seekBar4);

        przezroczysty.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                obrazek.setColorFilter((Color.argb(przezroczysty.getProgress(), czerwony.getProgress(), zielony.getProgress(), niebieski.getProgress())));
            }
        });
        czerwony.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                obrazek.setColorFilter((Color.argb(przezroczysty.getProgress(), czerwony.getProgress(), zielony.getProgress(), niebieski.getProgress())));
            }
        });
        zielony.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                obrazek.setColorFilter((Color.argb(przezroczysty.getProgress(), czerwony.getProgress(), zielony.getProgress(), niebieski.getProgress())));
            }
        });
        niebieski.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                obrazek.setColorFilter((Color.argb(przezroczysty.getProgress(), czerwony.getProgress(), zielony.getProgress(), niebieski.getProgress())));
            }
        });
    }

    public void lewo(View view) {
        obrazek.setRotation(obrazek.getRotation()-90);
    }

    public void prawo(View view) {
        obrazek.setRotation(obrazek.getRotation()+90);
    }
}