package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OurActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our);

        listView=findViewById(R.id.listView);

        List<String> description=new ArrayList<>();
        List<String> title=new ArrayList<>();
        List<Integer> image=new ArrayList<>();

        title.add("SMP");
        title.add("PDS Doubt Sessions");
        title.add("ET Doubt Sessions");
        title.add("Examania");

        description.add("Our traditional Mentor-Mentee you very well know and love!");
        description.add("You know this too!");
        description.add("All the same but the subject changed to ET :'(");
        description.add("Get fandas on dassi and depC with a panel full of Machau people");


        image.add(R.drawable.smp);
        image.add(R.drawable.pds);
        image.add(R.drawable.et);
        image.add(R.drawable.examania);

        MyAdapter myAdapter=new MyAdapter(this, title, image, description);

        listView.setAdapter(myAdapter);
    }



//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_our);
//    }



    public void openMainTabbedActivity(View view) {

        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}