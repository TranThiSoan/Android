package com.example.listenerinvariable;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private Button btnFar, btnCel, btnClear;
    private EditText txtFar, txtCel;
    private OnClickListener myVarListener = new OnClickListener(){
        public void onClick(View arg0){

            if (arg0 == btnFar)
            {
                try {
                    double F = Double.parseDouble(txtFar.getText() + "");
                    double out = (F - 32) * (5.0 / 9);
                    txtCel.setText(String.format("%.1f", out) + "");
                }
                catch (Exception e)
                {
                    txtFar.setText("Chưa nhập độ F");
                }
            }
            else if (arg0 == btnCel) {
                try {
                    double C = Double.parseDouble(txtCel.getText() + "");
                    double out = C * (9.0 / 5) + 32;
                    txtFar.setText(String.format("%.1f", out) + "");
                } catch (Exception e) {
                    txtCel.setText("Chưa nhập độ F");
                }
            }
            else if (arg0 == btnClear)
            {
                txtCel.setText("");
                txtFar.setText("");
                txtFar.requestFocus();
            }
        }
    };
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFar = (Button)findViewById(R.id.btnFar);
        btnCel = (Button)findViewById(R.id.btnCel);
        btnClear = (Button)findViewById(R.id.btnClear);
        txtFar = (EditText)findViewById(R.id.txtFar);
        txtCel = (EditText)findViewById(R.id.txtCel);
        btnFar.setOnClickListener(myVarListener);
        btnCel.setOnClickListener(myVarListener);
        btnClear.setOnClickListener(myVarListener);;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
