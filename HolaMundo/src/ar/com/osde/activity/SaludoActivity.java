package ar.com.osde.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends Activity {
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        
        //Se localiza el control
        TextView textSaludo = (TextView) findViewById(R.id.TxtSaludo);
        
        //Recuperamos la informacion pasada en el Intent
        Bundle bundle = this.getIntent().getExtras();
        
        //Construimos el mensaje a mostrar
        textSaludo.setText("Hola "+bundle.getString("NOMBRE"));
       }


}
