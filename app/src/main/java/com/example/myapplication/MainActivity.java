package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Hero> heroes = new ArrayList<>();
    private ListHeroAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnclickListener();
        recyclerView = findViewById(R.id.rv_hero);
        recyclerView.setHasFixedSize(true);
        heroes.addAll(HeroDataSource.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter adapter = new ListHeroAdapter(heroes, listener);
        recyclerView.setAdapter(adapter);

    }

    private void setOnclickListener() {
        listener = new ListHeroAdapter.RecyclerViewClickListener(){
            @Override
            public void onClick(View v,int position){
                Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                intent.putExtra("index", position);
                startActivity(intent);
            }
        };
    }
}