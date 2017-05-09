package com.example.ltsukien01;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btn_tong2so;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_tong2so(View v)
    {
    	EditText txtsoa=(EditText)
    			findViewById(R.id.editSoa);
    	int a=Integer.parseInt(txtsoa.getText()+"");
    			
    	EditText txtsob=(EditText)
    			findViewById(R.id.editSob);
    	int b=Integer.parseInt(txtsob.getText()+"");
    	TextView txtkq=(TextView) findViewById(R.id.txtkq);
    	txtkq.setText((a+b)+"");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
