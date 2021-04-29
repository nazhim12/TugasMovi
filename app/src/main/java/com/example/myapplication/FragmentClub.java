package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentClub extends Fragment {

    private RecyclerView recyclerView;
    private List<Hero> heroes;
    private ListHeroAdapter.RecyclerViewClickListener listener;

    private void setOnclickListener() {
        listener = new ListHeroAdapter.RecyclerViewClickListener(){
            @Override
            public void onClick(View v,int position){
                Intent intent = new Intent(getContext(),ProfileActivity.class);
                intent.putExtra("index", position);
                startActivity(intent);
            }
        };
    }

    public static FragmentClub newInstance() {
        FragmentClub fragment = new FragmentClub();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_club, container, false);

        setOnclickListener();
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_hero);
        recyclerView.setHasFixedSize(true);

        heroes = new ArrayList<>();
        heroes.addAll(HeroDataSource.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListHeroAdapter adapter = new ListHeroAdapter(heroes, listener);
        recyclerView.setAdapter(adapter);

        return view;
    }
}