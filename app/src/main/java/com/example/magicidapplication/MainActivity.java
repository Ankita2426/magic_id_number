package com.example.magicidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = findViewById(R.id.etID);
        btn = findViewById(R.id.btn);
        tv= findViewById(R.id.tv);

        btn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idNumber = etID.getText().toString().trim();

                String dob= idNumber.substring(0,6);

                int gender = Integer.parseInt(Character.toString(idNumber.charAt(6)));

                String sGender;

                if(gender<5)
                    sGender = "Female";
                else
                    sGender = "Male";

                int Nationality = Integer.parseInt(Character.toString(idNumber.charAt(10)));

                String sNationality;

                if(Nationality == 0)
                    sNationality = "SA Citizen";
                else
                    sNationality = "Permanent Resident";

                String Text = getString(R.string.dob)+ dob + "\n"+
                        getString(R.string.gender) + sGender + "\n" +
                        getString(R.string.nationality) + sNationality;

                tv.setText(Text);
            }
        }));
    }
}