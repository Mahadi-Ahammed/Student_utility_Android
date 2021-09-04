package com.example.mainscreen;

//package com.example.demofirebasetorecycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class adddata extends AppCompatActivity
{
    EditText title, subname, subcode, topics, due, purl;
    Button  btnAdd, btn_viewNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);

        title=(EditText)findViewById(R.id.etTitle);
        subname=(EditText)findViewById(R.id.etSubName);
        subcode=(EditText)findViewById(R.id.etSubCode);
        topics=(EditText)findViewById(R.id.etTopics);
        due=(EditText)findViewById(R.id.etDue);
        purl=(EditText)findViewById(R.id.add_purl);



        btnAdd=(Button)findViewById(R.id.btn_Add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processinsert();
            }
        });
    }

    private void processinsert()
    {
        Map<String,Object> map=new HashMap<>();
        map.put("title",title.getText().toString());
        map.put("subname",subname.getText().toString());
        map.put("subcode",subcode.getText().toString());
        map.put("topics",topics.getText().toString());
        map.put("due",due.getText().toString());
        map.put("purl",purl.getText().toString());
        FirebaseDatabase.getInstance().getReference().child("students").push()
                .setValue(map)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        title.setText("");
                        subname.setText("");
                        subcode.setText("");
                        topics.setText("");
                        due.setText("");
                        purl.setText("");
                        Toast.makeText(getApplicationContext(),"Inserted Successfully",Toast.LENGTH_LONG).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e)
                    {
                        Toast.makeText(getApplicationContext(),"Could not insert",Toast.LENGTH_LONG).show();
                    }
                });
        btn_viewNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}