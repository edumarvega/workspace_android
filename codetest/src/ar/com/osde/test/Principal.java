package ar.com.osde.test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		Campania campania1 = new Campania("campaña1", "SS28498633");
		Campania campania2 = new Campania("campaña2", "SS28498633");
		Campania campania3 = new Campania("campaña3", "SS23498633");
		Campania campania4 = new Campania("campaña4", "SS24498633");
		
		List<Campania> lista1 = new ArrayList<Campania>();
		List<Campania> lista2 = new ArrayList<Campania>();
		List<Campania> listaTmp = new ArrayList<Campania>();
		
		lista1.add(campania1);
		lista1.add(campania2);
		
		lista2.add(campania1);
		lista2.add(campania2);
		lista2.add(campania3);
		lista2.add(campania4);
		
		String nombreCampaniaTmp=null;
		String nombreCampaniaMsgFormat = null;
		for(Campania objeto1 :lista1){
			Iterator<Campania> iterator2 = lista2.iterator();
			if(iterator2.hasNext()){
				Campania objeto2 = iterator2.next();
				if(objeto2.getUsuarioCreador().equals(objeto1.getUsuarioCreador())){
					if(!objeto2.getNombreCampania().contains(objeto2.getUsuarioCreador())){
						nombreCampaniaTmp = objeto2.getNombreCampania()+"("+objeto2.getUsuarioCreador()+")"+","+objeto1.getNombreCampania()+"("+objeto1.getUsuarioCreador()+")";
						nombreCampaniaMsgFormat = MessageFormat.format("{0}({1}),{2}({3})", objeto2.getNombreCampania(),objeto2.getUsuarioCreador(),objeto1.getNombreCampania(),objeto1.getUsuarioCreador());
					}
					else{
						nombreCampaniaTmp = objeto2.getNombreCampania()+","+objeto1.getNombreCampania()+"("+objeto1.getUsuarioCreador()+")";
						nombreCampaniaMsgFormat = MessageFormat.format("{0},{1}({2})", objeto2.getNombreCampania(),objeto1.getNombreCampania(),objeto1.getUsuarioCreador());
					}
					
					//objeto2.setNombreCampania(nombreCampaniaTmp);
					objeto2.setNombreCampania(nombreCampaniaMsgFormat);
					listaTmp.add(objeto2);
				}
			}
		}
		
		for(Campania objPrint :listaTmp ){
			System.out.println(objPrint.getNombreCampania());
		}
	}

}
