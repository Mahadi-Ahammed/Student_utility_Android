package com.example.mainscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class cgpaCounter extends AppCompatActivity {

    Button btncount;
    TextView fres;
    EditText gpa1;
    EditText gpa2;
    EditText gpa3;
    EditText gpa4;
    EditText gpa5;
    EditText gpa6;
    EditText gpa7;
    EditText gpa8;
    EditText cre1;
    EditText cre2;
    EditText cre3;
    EditText cre4;
    EditText cre5;
    EditText cre6;
    EditText cre7;
    EditText cre8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_counter);
        btncount = (Button) findViewById(R.id.btnCount);
        fres = (TextView) findViewById(R.id.Res);
        gpa1 = (EditText) findViewById(R.id.gpa1);
        gpa2 = (EditText) findViewById(R.id.gpa2);
        gpa3 = (EditText) findViewById(R.id.gpa3);
        gpa4 = (EditText) findViewById(R.id.gpa4);
        gpa5 = (EditText) findViewById(R.id.gpa5);
        gpa6 = (EditText) findViewById(R.id.gpa6);
        gpa7 = (EditText) findViewById(R.id.gpa7);
        gpa8 = (EditText) findViewById(R.id.gpa8);
        cre1 = (EditText) findViewById(R.id.credit1);
        cre2 = (EditText) findViewById(R.id.credit2);
        cre3 = (EditText) findViewById(R.id.credit3);
        cre4 = (EditText) findViewById(R.id.credit4);
        cre5 = (EditText) findViewById(R.id.credit5);
        cre6 = (EditText) findViewById(R.id.credit6);
        cre7 = (EditText) findViewById(R.id.credit7);
        cre8 = (EditText) findViewById(R.id.credit8);
        // end of allocation
        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] gpalst = {"A+","A","A-","B+","B","B-","C+","C","D","F"};
                double[] gpanum = {4.0,3.75,3.50,3.25,3.0,2.75,2.50,2.25,2.0,0.0};

                String[] ingpa = {gpa1.getText().toString(),gpa2.getText().toString(),gpa3.getText().toString(),gpa4.getText().toString(),gpa5.getText().toString(),gpa6.getText().toString(),gpa7.getText().toString(),gpa8.getText().toString()};
                String[] incre = {cre1.getText().toString(),cre2.getText().toString(),cre3.getText().toString(),cre4.getText().toString(),cre5.getText().toString(),cre6.getText().toString(),cre7.getText().toString(),cre8.getText().toString()};
                //calculation
                double allgpa=0.0, allcr=0.0,gpa=0;
                for (int x=0;x<=8;x++){
                    if (ingpa[x].isEmpty())
                    {
                        break;
                    }
                    for (int xx=0;xx<10;xx++)
                    {
                        if (ingpa[x].equalsIgnoreCase(gpalst[xx]))
                        {
                            allgpa = allgpa+ (Double.parseDouble(incre[x]) * gpanum[xx]);
                            allcr= allcr + Double.parseDouble(incre[x]);
                        }
                    }
                }
                if (allgpa==0){
                    fres.setText("gpa value is 0");
                    return;
                }
                gpa = allgpa / allcr;
                //String viewDis = Double.toString(gpa);
                fres.setText(new DecimalFormat("##.###").format(gpa));
            }
        });



    }
}