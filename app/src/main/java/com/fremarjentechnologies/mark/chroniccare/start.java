package com.fremarjentechnologies.mark.chroniccare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {
    private Button mButtonReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        mButtonReg =(Button)findViewById(R.id.sRegbtn);
        mButtonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenRegPage();
            }
        });

    }


    public void OpenRegPage(){

        Intent regIntent = new Intent(this,reg.class);
        startActivity(regIntent);

        //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
    }


}
