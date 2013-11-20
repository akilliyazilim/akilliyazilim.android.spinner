package com.example.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	String [] androidVersion;
    Spinner spinnerAndroidVersion;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		androidVersion=getResources().getStringArray(R.array.spinner_veriler);
        spinnerAndroidVersion=(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,androidVersion);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAndroidVersion.setAdapter(arrayAdapter);
 
        spinnerAndroidVersion.setOnItemSelectedListener(new OnItemSelectedListener() {
 
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                    int arg2, long arg3) {
                // TODO Auto-generated method stub
                String selectedAndroid=arg0.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), selectedAndroid, Toast.LENGTH_LONG).show();
            }
 
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
 
            }
        });
	}

}
