package com.amrit.primepastel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by prabesh subedi on 02/02/2017.
 */

public class FormActivity extends AppCompatActivity {
    Button mForder;
    EditText ename,eemail,ephone,eaddress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.form_activity);
        mForder=(Button)findViewById(R.id.form_order);
        ename=(EditText)findViewById(R.id.form_your_full_name);
        eemail=(EditText)findViewById(R.id.form_e_your_email_address);
        ephone=(EditText)findViewById(R.id.form_e_your_phone);
        eaddress=(EditText)findViewById(R.id.form_Address);
        mForder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ename.getText().length() < 1 || eemail.getText().length() < 1|| ephone.getText().length() < 1|| eaddress.getText().length() < 1) {
                    Toast.makeText(FormActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();

                }


//JSON will only know the string so we need to make it string so that we can pass it // no UI can be used so all  the things
                //that we do must be string
                //The line below emailAddress is defined as string which takes the mEmailEditText xml to it due to which we may pass into json
                else {
                    Toast.makeText(FormActivity.this, "successfully ordered", Toast.LENGTH_SHORT).show();


                }



            }
        });
    }
}
