package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class tuitionfeeCalculator extends AppCompatActivity {
    TextView DisP;
    EditText crefee;
    EditText Tc;
    EditText Rc;
    EditText Wav;
    EditText RegFee;
    EditText Ofee;
    Button FeeCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuitionfee_calculator);
        DisP= (TextView) findViewById(R.id.feeRes);
        FeeCal= (Button) findViewById(R.id.feeCount);
        crefee= (EditText) findViewById(R.id.crFee);
        Tc= (EditText) findViewById(R.id.creNum);
        Rc= (EditText) findViewById(R.id.creOth);
        Wav= (EditText) findViewById(R.id.wavTk);
        RegFee= (EditText) findViewById(R.id.regFee);
        Ofee= (EditText) findViewById(R.id.othFee);

        FeeCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double CrFee,ToCre,ReCre,waiver,regFees,OthFees,cal_tot;
                CrFee = Double.parseDouble(crefee.getText().toString());
                ToCre = Double.parseDouble(Tc.getText().toString());
                ReCre= Double.parseDouble(Rc.getText().toString());
                waiver=Double.parseDouble(Wav.getText().toString());
                regFees= Double.parseDouble(RegFee.getText().toString());
                OthFees = Double.parseDouble(Ofee.getText().toString());

                cal_tot= CrFee*(waiver/100.00);
                cal_tot= (cal_tot*ToCre)+regFees+OthFees+(ReCre*CrFee);

                DisP.setText(new DecimalFormat("##.###").format(cal_tot));

            }
        });
    }
}