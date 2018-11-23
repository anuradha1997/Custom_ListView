package com.example.anuradha.custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l1;
    String text[]={"alpha","beta","gamma","donot","GengerBread","oreo","foryo"};

Integer image[]={R.drawable.pandafinecircle1,R.drawable.tulsidas,R.drawable.logo,R.drawable.facebook,R.drawable.cafe,R.drawable.fg,R.drawable.premchandra};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1= (ListView) findViewById(R.id.lv1);
        CustomAdapter adapter=new CustomAdapter(this,text,image);
        l1.setAdapter(adapter );
    }
}
