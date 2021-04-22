package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

public class ProfileActivity extends AppCompatActivity {
    private Hero hero= new Hero();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        TextView nameTxt = findViewById(R.id.nameTextView);
        ImageView hero_image= findViewById(R.id.iv_hero);

        String username = "Username not set";

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int index= extras.getInt("index");
            hero= HeroDataSource.getDataIndex(index);
        }
        nameTxt.setText(hero.getDetail());
        hero_image.setImageResource(hero.getPhoto());

    }


}