package com.example.kotek;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

		
	//klikniecie
	public void klikniecie (View v)
	{ 
		Log.w("kotek", "do loga");
		Toast.makeText(getApplicationContext(), "kliknales mnie", Toast.LENGTH_SHORT).show();
		//medi
		//MediaPlayer mp
	}
}
