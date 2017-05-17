package com.example.bai_14;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyArrayAdapter extends ArrayAdapter <Employee> {
	Activity context=null;
	ArrayList<Employee>myArray=null;
	int layoutId;
	
	public MyArrayAdapter(Activity context, int layoutId, ArrayList<Employee>arr) {
		// TODO Auto-generated constructor stub
		super(context, layoutId,arr);
		this.context=context;
		this.layoutId= layoutId;
		this.myArray=arr;
	}
	 public View getView (int position, View convertView, ViewGroup parent) {
		 LayoutInflater inflater = context.getLayoutInflater();
		 convertView=inflater.inflate(layoutId, null);
		 final TextView txtdisplay=(TextView) convertView.findViewById(R.id.txtitem);
		 final Employee emp=myArray.get(position);
		 txtdisplay.setText(emp.toString());
		 final ImageView imgitem=(ImageView) convertView.findViewById(R.id.imgitem);
		 if(emp.isGender())
			 imgitem.setImageResource(R.drawable.girlicon);
		 else
			 imgitem.setImageResource(R.drawable.boyicon);
		 return convertView;
	 }
}
