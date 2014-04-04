package com.bgxt.datatimepickerdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	private Button btnId1,btnId2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnId1=(Button)findViewById(R.id.btnId1);
		btnId2=(Button)findViewById(R.id.btnId2);
		
		btnId1.setOnClickListener(this);
		btnId2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent=null;
		switch (v.getId()) {
		case R.id.btnId1:
			intent=new Intent(MainActivity.this, ScrollViewDemoActivity.class);
			startActivity(intent);
			break;
		case R.id.btnId2:
			intent=new Intent(MainActivity.this, HorizontalScrollDemoActivity.class);
			startActivity(intent);
			break;
		}
	}

}
