package com.example.practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i=getIntent();
        String mno= i.getStringExtra("mno");
        String email=i.getStringExtra("email");
        String gender=i.getStringExtra("gender");
        String location=i.getStringExtra("location");
        String []l;
        l=i.getStringArrayExtra("cba");
        TextView m=findViewById(R.id.mno);
        m.setText(mno);
        TextView e=findViewById(R.id.email);
        e.setText(email);
        TextView ll=findViewById(R.id.location);
        ll.setText(location);
        TextView g=findViewById(R.id.gender);
        g.setText(gender);
        TextView lc=findViewById(R.id.language);
        String lan="";
        for(int it=0;it<4;it++){
            if(!l[it].equals("1")){
               lan = lan.concat(l[it]+"\n");
            }
        }
        lc.setText(lan);
    }
}