package ar.com.androidfrontendcxf.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView txtViewApellido = null;
	TextView txtViewNombre = null;
	Button btnSaludar = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtViewApellido = (TextView) findViewById(R.id.txtApellido);
		txtViewNombre = (TextView) findViewById(R.id.txtNombre);
		btnSaludar = (Button) findViewById(R.id.btnSaludar);
		
		btnSaludar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Se crea el Intent
				Intent intent = new Intent(MainActivity.this,HolaMundoActivity.class);
				
				//Creamos la informacion a pasar entre actividades
				Bundle bundle = new Bundle();
				bundle.putString("APELLIDO", txtViewApellido.getText().toString());
				bundle.putString("NOMBRE", txtViewNombre.getText().toString());
				
				Toast.makeText(getApplicationContext(),txtViewApellido.getText().toString() , Toast.LENGTH_LONG).show();
				Toast.makeText(getApplicationContext(),txtViewNombre.getText().toString() , Toast.LENGTH_LONG).show();
				
				//Se añade nformacion al Intent
				intent.putExtras(bundle);
				
				//Iniciamos una nueva actividad
				startActivity(intent);
				
			}
		});
		
		
	}
	


}
