package com.example.modul2_kel31;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AboutAdapter aboutAdapter;
    private List<Member> memberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        recyclerView = findViewById(R.id.recycler_view_about);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize list of members
        memberList = new ArrayList<>();
        memberList.add(new Member("NICOLAUS EVAN WIDYATNA", "21120122140140", R.drawable.nicolaus));
        memberList.add(new Member("NAJLA FAIRUZ AZZAHRA", "21120122140110", R.drawable.najla));
        memberList.add(new Member("TANGGUH CHAIRUNNISA", "21120122140103", R.drawable.tangguh));
        memberList.add(new Member("FLAVIANUS PUTRATAMA", "21120122140105", R.drawable.flavianus));

        aboutAdapter = new AboutAdapter(memberList, this);
        recyclerView.setAdapter(aboutAdapter);
    }
}