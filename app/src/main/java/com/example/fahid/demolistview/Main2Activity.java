package com.example.fahid.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
private EditText et1,et2;
    private Button b1;
    DatabaseReference database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1= (EditText) findViewById(R.id.Etv1);
        et2= (EditText) findViewById(R.id.Etv2);
        b1= (Button) findViewById(R.id.btn);
        database= FirebaseDatabase.getInstance().getReference("Info");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });


    }
    private void add(){
        String name=et1.getText().toString().trim();
        String id=et2.getText().toString().trim();
        if (!TextUtils.isEmpty(name)){
            String Id=database.push().getKey();
            Personal p=new Personal(name,id);
            database.child(Id).setValue(p);
            Toast.makeText(this, "added", Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this, "Please insert Your Name", Toast.LENGTH_SHORT).show();
        }
    }


}

