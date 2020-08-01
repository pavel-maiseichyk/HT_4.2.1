package com.example.ht_421;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.AlgorithmParameterGenerator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Drawable> images = new ArrayList<>();
    private ItemsDataAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        listView = findViewById(R.id.listView);

        fillImages();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateRandomItemData();
            }
        });

        adapter = new ItemsDataAdapter(this, null);
        listView.setAdapter(adapter);

    }

    private void fillImages() {
        images.add(ContextCompat.getDrawable(MainActivity.this, android.R.drawable.ic_dialog_alert));
        images.add(ContextCompat.getDrawable(MainActivity.this, android.R.drawable.ic_delete));
        images.add(ContextCompat.getDrawable(MainActivity.this, android.R.drawable.ic_btn_speak_now));
        images.add(ContextCompat.getDrawable(MainActivity.this, android.R.drawable.ic_dialog_email));
        images.add(ContextCompat.getDrawable(MainActivity.this, android.R.drawable.ic_lock_idle_alarm));
    }

    private void generateRandomItemData() {
        Random random = new Random();
        adapter.addItem(new ItemData(
                images.get(random.nextInt(images.size())),
                "Hello There " + adapter.getCount(),
                "General Kenobi",
                random.nextBoolean()));
    }
}