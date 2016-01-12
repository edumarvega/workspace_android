package struts2file.example;

import org.json.simple.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class FileOsde extends  ActionSupport{

	private static final long serialVersionUID = -8825873249034062992L;
	
	 public String execute(){
		 JSONObject jSONObject = new JSONObject();
		 
		 String nombre = "Pepe";
		 jSONObject.put("nombre", nombre);
		 String resultado = jSONObject.toJSONString();
		return SUCCESS; 
	 }
	 
}
