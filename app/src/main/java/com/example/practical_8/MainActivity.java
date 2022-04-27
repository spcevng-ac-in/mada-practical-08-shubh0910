package com.example.practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    public String[] s = {"Unjha","Mehsana","Ahmedabad","Surat","Palanpur"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Spinner ss=findViewById(R.id.s);
    ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_spinner_item,s);
    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    ss.setAdapter(aa);

    }

public void checkButton(View v) {
    boolean flag = false;
    TextView tv1 = findViewById(R.id.tv1);

    EditText mno = findViewById(R.id.mno);
    String s = mno.getText().toString();
    if (s.length() != 10) {
        tv1.setText("Enter Correct Mobile no");
        flag=true;
    } else
        tv1.setText("");
    EditText email = findViewById(R.id.email);
   String s1 = email.getText().toString();

   Spinner sp=findViewById(R.id.s);
   String location =sp.getSelectedItem().toString();


    RadioGroup rg = findViewById(R.id.rg);
    int id ;
    id = rg.getCheckedRadioButtonId();
    RadioButton rb=findViewById(id);
    if(id==0){
        flag=true;
    }
    String rgs=rb.getText().toString();
    CheckBox cb1 = findViewById(R.id.cb1);
    CheckBox cb2 = findViewById(R.id.cb2);
    CheckBox cb3 = findViewById(R.id.cb3);
    CheckBox cb4 = findViewById(R.id.cb4);
    String[] arr;
    arr = new String[4];
    arr[0]="1";
    arr[1]="1";
    arr[2]="1";
    arr[3]="1";

    if (cb1.isChecked()) {
        arr[0] = "c";
    }else{
        arr[0]="1";
    }

    if (cb2.isChecked()) {
        arr[1] = "c++";
    }else{
        arr[1]="1";
    }
    if (cb3.isChecked()) {
        arr[2] = "JAVA";
    }else{
        arr[2]="1";
    }
    if (cb4.isChecked()) {
        arr[3] = ".NET";
    }else{
        arr[3]="1";
    }

    if(!flag){
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("mno",s);
        intent.putExtra("gender",rgs);
        intent.putExtra("email",s1);
        intent.putExtra("cba",arr);
        intent.putExtra("location",location);
        startActivity(intent);
    }
}
public void tbUpdate(View v){
    ToggleButton tb =findViewById(R.id.tb);
    if(tb.isChecked()){
        Button b=findViewById(R.id.sub);
        b.setEnabled(true);
    }
    else{
        Button b=findViewById(R.id.sub);
        b.setEnabled(false);
    }
}
}