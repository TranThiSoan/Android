package com.example.bai_tap_11;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText editTen, editCMND, editBosung;
	CheckBox chkdocbao, chkdocsach, chkdoccode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTen=(EditText) findViewById(R.id.editHoten);
        editCMND=(EditText) findViewById(R.id.editCMND);
        editBosung=(EditText) findViewById(R.id.editBosung);
        chkdocbao=(CheckBox) findViewById(R.id.chkdocbao);
        chkdocsach=(CheckBox) findViewById(R.id.chkdocsach);
        chkdoccode=(CheckBox) findViewById(R.id.chkdoccoding);
        Button btn=(Button) findViewById(R.id.btnguitt);
        btn.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View arh0){
        		doShowInformation();
        	}
        });
}

    public void doShowInformation()
    {
    	String ten=editTen.getText()+"";
    	ten=ten.trim();
    	if(ten.length()<3)
    	{
    		editTen.requestFocus();
    		editTen.selectAll();
    		Toast.makeText(this, "Tên phải >= 3 ký tự", Toast.LENGTH_LONG).show();
    		return;
    	}
    	
    	//Kiểm tra CMND hợp lệ
    	String cmnd=editCMND.getText()+"";
    	cmnd=cmnd.trim();
    	if(cmnd.length()!=9)
    	{
    		editCMND.requestFocus();
    		editCMND.selectAll();
    		Toast.makeText(this, "CMND phải đúng 9 ký tự", Toast.LENGTH_LONG).show();
    		return;
    	}
    	//Kiểm tra bằng cấp
    	String bang="";
    	RadioGroup group=(RadioGroup) findViewById(R.id.radioGroup1);
    	int id=group.getCheckedRadioButtonId();
    	if(id==-1)
    	{
    	Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_LONG).show();
    	return;
    	}
    	RadioButton rad=(RadioButton) findViewById(id);
    	bang=rad.getText()+"";
    	//Kiểm tra sở thích
    	String sothich="";
    	if(chkdocbao.isChecked())
    	sothich+=chkdocbao.getText()+"\n";
    	if(chkdocsach.isChecked())
    	sothich+=chkdocsach.getText()+"\n";
    	if(chkdoccode.isChecked())
    	sothich+=chkdoccode.getText()+"\n";
    	String bosung=editBosung.getText()+"";
    	
    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
    	builder.setTitle("Thông tin cá nhân");
    	builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int which) {
    		// TODO Auto-generated method stub
    		dialog.cancel();
    		}
    		});
    	//tạo nội dung
    	String msg=ten+"\n";
    	msg+= cmnd+"\n";
    	msg+=bang+"\n";
    	msg+=sothich;
    	msg+="—————————–\n";
    	msg+="Thông tin bổ sung:\n";
    	msg+=bosung+ "\n";
    	msg+="—————————–";
    	builder.setMessage(msg);//thiết lập nội dung
    	builder.create().show();//hiển thị Dialog
    	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
