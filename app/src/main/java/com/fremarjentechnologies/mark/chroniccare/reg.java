package com.fremarjentechnologies.mark.chroniccare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class reg extends AppCompatActivity {

    RadioGroup mRadiogroup;
    RadioButton mRadioButton;
    TextView mTextView;
    Button mButton;
    Spinner mSpinner;
    Spinner mSpinner1;
    Spinner mSpinner2;
    Spinner mSpinD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        //spinner days
        mSpinner =(Spinner)findViewById(R.id.spinner1) ;
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(reg.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.data1));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner.setAdapter(myAdapter);
// spinner for months
        mSpinner1 =(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<>(reg.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.month));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner1.setAdapter(myAdapter1);
        //spinner year
        mSpinner2 =(Spinner)findViewById(R.id.spinner3) ;

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<>(reg.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.year));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinner2.setAdapter(myAdapter2);

// spinner for Deseases
        mSpinD =(Spinner)findViewById(R.id.sDes) ;
        ArrayAdapter<String> myAdapterD = new ArrayAdapter<>(reg.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.dese));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinD.setAdapter(myAdapterD);

        //radio btn
        mRadiogroup= findViewById(R.id.rd);
        mTextView = findViewById(R.id.rest);
        mButton = findViewById(R.id.rregbtn);
mButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        int radioId = mRadiogroup.getCheckedRadioButtonId();
        mRadioButton = findViewById(radioId);

        mTextView.setText("Your choice is: "+ mRadioButton.getText());


    }
});

    }

    public void checkButton(View v){

        int radioId = mRadiogroup.getCheckedRadioButtonId();
        mRadioButton = findViewById(radioId);
        Toast.makeText(this, "just: "+ mRadioButton.getText(),Toast.LENGTH_SHORT).show();


    }


}
