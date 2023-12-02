package com.example.hp.onlinenewsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HP on 26-08-2022.
 */
public class Authentication_page extends AppCompatActivity
{   EditText edit_mno;
    Button btn_next;
    String str_mno = "6360775210";
    String str_user_mno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentication_page);
        edit_mno = (EditText)findViewById(R.id.et);
        btn_next = (Button)findViewById(R.id.btn);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_user_mno = edit_mno.getText().toString();
               // Toast.makeText(Authentication_page.this, "Number is valid"+str_user_mno, Toast.LENGTH_SHORT).show();
                if (str_user_mno.isEmpty())
                {
                    Toast.makeText(Authentication_page.this, "Enter number", Toast.LENGTH_SHORT).show();
                }
                else if(str_user_mno.equals(str_mno)){
                    Intent i = new Intent(getApplication(),Home_page.class);
                    startActivity(i);
                    Toast.makeText(Authentication_page.this, "Authentication is Successfull", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else {
                    Toast.makeText(Authentication_page.this, "Invalid mobile number", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}
