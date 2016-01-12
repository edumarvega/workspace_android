package struts2file.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import struts2file.example.Practica;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Propietario
 *
 */
public class JsonDataAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String saludoString;
	private List<String> saludosList;
	private Map<String, String> saludosMap;
	private Practica practica;
	private List<String> programas;
	private List<String> programasResult;
	
	public String execute() {
		
		//Anda extendiendo o no del ActioSupport
		//por cada variable declarada generar sus getters and setters
		//Hacer reflesh del proyecto un clean proyect y un clean del server y run
		//con lo anterior deberia mostrarse el o los objetos json
		
		this.setSaludoString("hola json!");
		
		this.saludosList = new ArrayList<String>();
		this.saludosList.add("saludo 1");
		this.saludosList.add("saludo 2");
		this.saludosList.add("saludo 3");
		this.saludosList.add("saludo 4");
		this.saludosList.add("saludo 5");
		
		this.saludosMap = new HashMap<String, String>();
		this.saludosMap.put("saludo1", "saludo1");
		this.saludosMap.put("saludo2", "saludo2");
		this.saludosMap.put("saludo3", "saludo3");
		this.saludosMap.put("saludo4", "saludo4");
		this.saludosMap.put("saludo5", "saludo5");
		
//		Gson gson1 = new Gson();
//		String json1 = gson1.toJson(saludoString);
//		System.out.println(json1);
//		
//		Gson gson2 = new Gson();
//		String json2 = gson2.toJson(saludosList);
//		System.out.println(json2);
				
		practica = new Practica();
		practica.setCodigo(10);
		practica.setDescripcion("ESTIMULACION AUDITIVA");
		
		String term = ServletActionContext.getRequest().getParameter("term");
		
		programasResult = new ArrayList<String>();
		
		programas = new ArrayList<String>();
		programas.add("Java");
		programas.add("Java Script");
		programas.add("Json");
		programas.add("Pascal");
		programas.add("Phyton");
		programas.add("C");
		programas.add("C++");
		programas.add("C#");
		programas.add("Delphi");
		programas.add("Abap");
		programas.add(".Net");
		programas.add("Visual Basic");
		programas.add("Prototype");
		programas.add("Ajax");
		programas.add("Android");
		
		for(String value : programas){
			if(value.contains(term)){
				programasResult.add(value);
			}
		}
		
		return SUCCESS;

	}


	public String getSaludoString() {
		return saludoString;
	}


	public void setSaludoString(String saludoString) {
		this.saludoString = saludoString;
	}


	public List<String> getSaludosList() {
		return saludosList;
	}


	public void setSaludosList(List<String> saludosList) {
		this.saludosList = saludosList;
	}


	public Map<String, String> getSaludosMap() {
		return saludosMap;
	}


	public void setSaludosMap(Map<String, String> saludosMap) {
		this.saludosMap = saludosMap;
	}


	public Practica getPractica() {
		return practica;
	}


	public void setPractica(Practica practica) {
		this.practica = practica;
	}


	public List<String> getProgramas() {
		return programas;
	}


	public void setProgramas(List<String> programas) {
		this.programas = programas;
	}


	public List<String> getProgramasResult() {
		return programasResult;
	}


	public void setProgramasResult(List<String> programasResult) {
		this.programasResult = programasResult;
	}
	
	
	
	
}
