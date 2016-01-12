package ar.com.androidfrontendcxf.activity;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class HolaMundoActivity extends Activity {
	
	private static final String NAMESPACE="http://service.holamundo.android.com.ar/";
	private static final String URL="http://10.0.2.2:8080/cxfandroid/HolaMundo";
	private static final String METHOD_NAME="saludar";
	private static final String SOAP_ACTION="{http://service.holamundo.android.com.ar/}saludar";
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		Bundle bundle = this.getIntent().getExtras();
		String apellido = (String)bundle.get("APELLIDO");
		String nombre = (String) bundle.get("NOMBRE");
				
		//Llamada al servicio
		SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
		request.addProperty("apellido", apellido);
		request.addProperty("nombre", nombre);

		//Se agrega el request al envelope con version 1.1
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(request);
		
		HttpTransportSE transport = new HttpTransportSE(URL);
		transport.debug=true;
		try{
			transport.call(SOAP_ACTION, envelope);
			SoapPrimitive responseXml = (SoapPrimitive) envelope.getResponse();
			String resultado = responseXml.toString();
			Toast.makeText(getApplicationContext(),resultado , Toast.LENGTH_LONG).show();
		}catch(Exception e){
			Toast.makeText(getApplicationContext(),e.getMessage() , Toast.LENGTH_LONG).show();
		}
	}

}
