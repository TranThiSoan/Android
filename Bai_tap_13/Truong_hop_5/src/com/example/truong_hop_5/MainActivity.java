package com.example.truong_hop_5;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView selection;
	 String arr[]={"Intel","SamSung",
	 "Nokia","Simen","AMD",
	 "KIC","ECD"};
	 ArrayAdapter<String >adapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //Thiết lập Data Source cho Adapter
        adapter=new ArrayAdapter<String>
        (this,
        android.R.layout.simple_list_item_1,
        arr);
        //Gán Adapter vào ListView
        //Nhớ là phải đặt id cho ListView theo đúng quy tắc
        setListAdapter(adapter);
        
        selection=(TextView) findViewById(R.id.selection);
        }
        
        private void setListAdapter(ArrayAdapter<String> adapter2) {
		// TODO Auto-generated method stub
		
	}

		protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String txt="postion = "+position +"; value ="+arr[position];
        selection.setText(txt);
        }

  }

