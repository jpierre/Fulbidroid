package com.example.fulbidroid;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button btnIngresar = (Button)findViewById(R.id.BtnIngresar);
		final EditText txtUsuario = (EditText)findViewById(R.id.TxtUsuario);
		final EditText txtPassword = (EditText)findViewById(R.id.TxtPassword);
		
		btnIngresar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String user = txtUsuario.toString();
				String pass = txtPassword.toString();
				
				//if(user.equals("admin") && pass.equals("admin")){
					Intent intent = new Intent(MenuActivity.this, MenuActivity.class);
					startActivity(intent);
				/*}else{
					Toast.makeText(MainActivity.this, "Usuario o Contraseña incorrecta!",
			                Toast.LENGTH_SHORT).show();
				}*/
				
				
			}
		});
		
		
		
		
		
		
	}

}
