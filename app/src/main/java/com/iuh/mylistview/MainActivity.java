package com.iuh.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvClothes;
    private CustomClothesAdapter adt;
    private ArrayList<Clothes> arrayList = new ArrayList<Clothes>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvClothes = findViewById(R.id.lvClothes);
        arrayList.add(new Clothes("Friend", "50$", R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Clothes("Android Developer", "100$", R.drawable.android_mobile_app_developer));
        arrayList.add(new Clothes("Google", "150$", R.drawable.download));
        arrayList.add(new Clothes("Computer Science", "200$", R.drawable.computer));
        arrayList.add(new Clothes("CODE", "250$", R.drawable.code));

        adt = new CustomClothesAdapter(this, R.layout.item_listview, arrayList);

        lvClothes.setAdapter(adt);
    }
}