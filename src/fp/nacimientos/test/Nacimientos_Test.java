package fp.nacimientos.test;

import java.time.LocalDate;
import fp.nacimientos.Nacimientos;
import fp.nacimientos.TipoCentro;

public class Nacimientos_Test {

	public static void main(String[] args) {
		
		//Prueba de excepciones usando try{...}catch(){...}
		
//		try {
//			Nacimientos nacimiento1 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", "Jaén", LocalDate.of(2023, 10, 22), 0, 1, 0d, 3.53, 0d, 0.51, false);		
//		}catch (Exception e){
//			System.out.println("Se ha detectado una excepción ->"+e);	//Fecha mal puesta
//		}
//		try {
//			Nacimientos nacimiento2 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", "Jaén", LocalDate.of(2018, 10, 22), 0, -1, 0d, 3.53, 0d, 0.51, false);		
//		}catch (Exception e){
//			System.out.println("Se ha detectado una excepción ->"+e);	//Nacimientos negativos
//		}
//		try {
//			Nacimientos nacimiento3 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", "Jaén", LocalDate.of(2018, 10, 22), 0, 1, 0d, -3.53, 0d, 0.51, false);		
//		}catch (Exception e){
//			System.out.println("Se ha detectado una excepción ->"+e);	//Promedio de peso negativo
//		}
//		try {
//			Nacimientos nacimiento4 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", "Jaén", LocalDate.of(2018, 10, 22), 0, 1, 0d, 3.53, 0d, -0.51, false);		
//		}catch (Exception e){
//			System.out.println("Se ha detectado una excepción ->"+e);	//promedio de estatura negativo
//		}
		
		
		//Usando el constructor con todas las propiedades
			Nacimientos nacimiento5 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", "Jaén", LocalDate.of(2001, 10, 22), 0, 1, 0d, 3.53, 0d, 0.51, false);
		
		//Usando el constructor sin provincias
			Nacimientos nacimiento6 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", LocalDate.of(2001, 10, 22), 0, 1, 0d, 3.53, 0d, 0.51, false);
		
		//Usando el constructor sin pesos ni estaturas
			Nacimientos nacimiento7 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", "Jaén", LocalDate.of(2001, 10, 22), 0, 1, false);
		
		//Usando el constructor sin provincias, pesos ni estaturas
			Nacimientos nacimiento8 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", LocalDate.of(2001, 10, 22), 0, 1, true);
			
			Nacimientos nacimiento9 = new Nacimientos("Hospital Alto Guadalquivir",TipoCentro.COMARCAL, "Andújar", LocalDate.of(2001, 10, 22), 0, 1, false);
		
		
		//Prueba de getters y setters
			
			System.out.println(nacimiento5.getNombre());	
			System.out.println(nacimiento5.getTipoDeCentro());
			System.out.println(nacimiento5.getMunicipio());
			System.out.println(nacimiento5.getProvincia());
			System.out.println(nacimiento5.getFechaDeNacimiento());
			System.out.println(nacimiento5.getH());
			nacimiento5.setH(5);
			System.out.println(nacimiento5.getM());
			nacimiento5.setM(5);
			System.out.println(nacimiento5.getPromedioPesoH());
			nacimiento5.setPromedioPesoH(5d);
			System.out.println(nacimiento5.getPromedioPesoM());
			nacimiento5.setPromedioPesoM(5d);
			System.out.println(nacimiento5.getPromedioEstaturaH());
			nacimiento5.setPromedioEstaturaH(5d);
			System.out.println(nacimiento5.getPromedioEstaturaM());
			nacimiento5.setPromedioEstaturaM(5d);
			System.out.println(nacimiento5.getHelipuerto());
		
		System.out.println(nacimiento6.getNacimientosTotales());	//Prueba de propiedades derivadas
		
		System.out.println(nacimiento7.getPromedioEstatura());		//Prueba de propiedad derivada
		
		System.out.println(nacimiento8.getPromedioPeso());			//Prueba de propiedad derivada
		
		System.out.println(nacimiento5);							//prueba de método toString
		
		System.out.println(nacimiento5.equals(nacimiento6));		//Prueba de método equals
		
		System.out.println(nacimiento8.compareTo(nacimiento9));		//Prueba del método compareTo 

	}

}
