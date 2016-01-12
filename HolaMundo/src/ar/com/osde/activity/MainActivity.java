package ar.com.osde.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Obtenemos las referencias de los controles desde el activity_main.xml
		final TextView textViewNombre = (TextView) findViewById(R.id.TxtNombre);
		final Button buttonSaludar = (Button) findViewById(R.id.BtnSaludar);
		
		buttonSaludar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Se crea el Intent
				Intent intent = new Intent(MainActivity.this,SaludoActivity.class);
				
				//Creamos la informacion a pasar entre actividades
				Bundle bundle = new Bundle();
				bundle.putString("NOMBRE", textViewNombre.getText().toString());
				
				//Se añade nformacion al Intent
				intent.putExtras(bundle);
				
				//Iniciamos una nueva actividad
				startActivity(intent);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
