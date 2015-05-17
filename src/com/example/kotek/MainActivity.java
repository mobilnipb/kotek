package com.example.kotek;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	 // Obiekt m przeniesion jako zmienna globalna w ramach klasy MainActivity  
		private MediaPlayer m;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		m = new MediaPlayer();
		AssetFileDescriptor descriptor;
		try {
			descriptor = getAssets().openFd("meow.mp3");
			m.setDataSource(descriptor.getFileDescriptor(),
					descriptor.getStartOffset(), descriptor.getLength());
			descriptor.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

		
	//klikniecie
	public void klikniecie (View v)
	{ 
		Log.w("kotek", "do loga");
		//Toast.makeText(getApplicationContext(), "kliknales mnie", Toast.LENGTH_SHORT).show();
		if (m != null) // dodano if do określenie czy jest już stworzony obiekt m   
		{
		
			try {
				if (m.isPlaying()) {
					m.stop();
					Log.w("kotek", "do loga zapis o zatrzymaniu miałczenia");
					Toast.makeText(getApplicationContext(), "Zatrzymanie miałczenia",
							Toast.LENGTH_SHORT).show();
				}
				else
				{
				
				m.prepare();
				// m.setVolume(1f, 1f);
				m.setLooping(true);				
				m.start();
				Log.w("kotek", "do loga zapis o uruchomieniu miałczenia");
				Toast.makeText(getApplicationContext(), "Uruchomienie miałczenia",
						Toast.LENGTH_SHORT).show();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	
	}
}
