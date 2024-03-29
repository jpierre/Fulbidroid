package com.example.fulbidroid;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button btnIngresar = (Button)findViewById(R.id.BtnIngresar);
		final Button btnRegistro = (Button)findViewById(R.id.BtnRegistro);
		
		final EditText txtUsuario = (EditText)findViewById(R.id.TxtUsuario);
		final EditText txtPassword = (EditText)findViewById(R.id.TxtPassword);
		
		btnIngresar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, MenuActivity.class);
					startActivity(intent);
				
			}
		});
		
		btnRegistro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, RegistroActivity.class);
					startActivity(intent);
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
