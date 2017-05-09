package com.example.activity_is_listener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	Button btnTinhBMI;
    EditText editTen, editChieuCao, editCanNang, editBMI, editChanDoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTinhBMI = (Button)findViewById(R.id.btntinhBMI);
        btnTinhBMI.setOnClickListener((OnClickListener) this);
        editTen = (EditText)findViewById(R.id.editten);
        editChieuCao = (EditText)findViewById(R.id.editChieuCao);
        editCanNang = (EditText)findViewById(R.id.editCanNang);
        editBMI = (EditText)findViewById(R.id.editBMI);
        editChanDoan = (EditText)findViewById(R.id.editChanDoan);
    }
    public void onClick(View arg0){
		double H = Double.parseDouble(editChieuCao.getText()+"");
		double W = Double.parseDouble(editCanNang.getText()+"");
        double BMI = W/Math.pow(H, 2);
        String chandoan="";
        if (BMI < 18)
            chandoan="Bạn gầy";
        else if (BMI <= 24.9)
            chandoan="Bạn bình thường";
        else if (BMI <= 29.9)
            chandoan="Bạn béo phì dộ 1";
        else if (BMI <= 34.9)
            chandoan="Bạn béo phì dộ 2";
        else
            chandoan="Bạn béo phì độ 3";
        editBMI.setText(String.format("%.1f", BMI)+"");
        editChanDoan.setText(chandoan);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    
    
}
