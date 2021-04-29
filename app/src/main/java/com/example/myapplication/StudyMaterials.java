package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class StudyMaterials extends Fragment
//    implements View.OnClickListener
{

//    public  AppCompatActivity objectFromOtherClass;

//    ListView listView2;
//
//@Nullable
//    @Override
//public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        objectFromOtherClass = new AppCompatActivity();
//
//        objectFromOtherClass.setContentView(R.layout.study_materials_layout);
//
//
//        listView2=objectFromOtherClass.findViewById(R.id.listView2);
//
//        List<String> url=new ArrayList<>();
//        List<String> title=new ArrayList<>();
//
//        title.add("SMP");
//        title.add("PDS Doubt Sessions");
//        title.add("ET Doubt Sessions");
//        title.add("Examania");
//
//
//        url.add("SMP");
//        url.add("PDS Doubt Sessions");
//        url.add("ET Doubt Sessions");
//        url.add("Examania");
//
//
//
////        studyMaterialsAdapter myAdapter=new studyMaterialsAdapter(this, title, url);
//    studyMaterialsAdapter myAdapter=new studyMaterialsAdapter(objectFromOtherClass, title, url);
//
//        listView2.setAdapter(myAdapter);
//    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.study_materials_layout,container,false);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.button7: {
////                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
////                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
////                    .setAction("Action", null).show();
//
//                Toast myToast = Toast.makeText(this, "I'm a toast!", Toast.LENGTH_LONG);
//                myToast.show();
//                break;
//            }
//
//
//            case R.id.button8:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//            case R.id.button9:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//            case R.id.button10:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//            case R.id.button11:
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//
//        }
//    }
}
