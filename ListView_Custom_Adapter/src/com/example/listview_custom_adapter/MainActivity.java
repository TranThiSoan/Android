package com.example.listview_custom_adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lv;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lvSinhVien);
        
        ArrayList <SinhVien> mangSinhVien = new ArrayList<SinhVien>();
        mangSinhVien.add(new SinhVien("Nguyen Van Teo", 1997));
        mangSinhVien.add(new SinhVien("Nguyen Van Tun", 1996));
        mangSinhVien.add(new SinhVien("Nguyen Van Tim", 1995));
        mangSinhVien.add(new SinhVien("Nguyen Van Ti", 1994));
        mangSinhVien.add(new SinhVien("Nguyen Van Teo", 1993));
        mangSinhVien.add(new SinhVien("Nguyen Van Teo", 1994));
        
        ListAdapter adapter = new ListAdapter (
        		MainActivity.this,
        		R.layout.dong_sinh_vien,
        		mangSinhVien       		
        );
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
