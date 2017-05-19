package com.example.listview_custom_adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<SinhVien>{
	
	public ListAdapter(Context context, int textViewResourceId) {
		
		super(context, textViewResourceId);
	}
	
	public ListAdapter(Context context, int resource, List<SinhVien> items){
		super(context, resource, items);
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
		View v = convertView;
		if ( v == null) {
			LayoutInflater vi;
			vi = LayoutInflater.from(getContext());
			v = vi.inflate(R.layout.dong_sinh_vien,null);
		}
		SinhVien p = getItem(position);
		
		if(p!=null) {
			//anh xa + gan gia tri
			TextView tt1 = (TextView) v.findViewById(R.id.txtHoTen);
			tt1.setText(p.HoTen);
			TextView tt2 = (TextView) v.findViewById(R.id.txtNamSinh);
			tt1.setText(String.valueOf(p.NamSinh));
			
		}
		return v;
	}
}
