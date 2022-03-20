package fp.nacimientos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nacimientos implements Comparable<Nacimientos>{
	
	//Atributos    //Definen las propiedades de la clase

	private String nombre;						//Consultable
	private TipoCentro tipoDeCentro;            //Consultable
	private String municipio;				    //Consultable
	private String provincia;			        //Consultable
	private LocalDate fechaDeNcimiento;         //Consultable
	private Integer m;                          //Consultable y modificable
	private Integer h;                          //Consultable y modificable
	private Double promedioPesoH;               //Consultable y modificable
	private Double promedioPesoM;               //Consultable y modificable
	private Double promedioEstaturaH;           //Consultable y modificable
	private Double promedioEstaturaM;           //Consultable y modificable
	private Boolean helipuerto;                 //Consultable

	//Constructores
	
		//Pueden faltar pesos, estaturas y provincias / solo pesos y estaturas /
		// solo provincia / ninguna propiedad
	
			//Constructor 1  Con todas las propiedades
	
	public Nacimientos(String nombre, TipoCentro tipoDeCentro, String municipio, String provincia,LocalDate fechaDeNcimiento, Integer h, Integer m, Double promedioPesoH, Double promedioPesoM,Double promedioEstaturaH, Double promedioEstaturaM, Boolean helipuerto) {
		this.nombre = nombre;
		this.tipoDeCentro = tipoDeCentro;
		this.municipio = municipio;
		this.provincia = provincia;
		this.fechaDeNcimiento = fechaDeNcimiento;
		this.h = h;
		this.m = m;
		this.promedioPesoH = promedioPesoH;
		this.promedioPesoM = promedioPesoM;
		this.promedioEstaturaH = promedioEstaturaH;
		this.promedioEstaturaM = promedioEstaturaM;
		this.helipuerto = helipuerto;
		restricciones();	//Comprobacion de las restricciones para comprobar que el objeto se cree sin fallos
	}
	
			//Constructor 2 Sin provincia
	
	public Nacimientos(String nombre, TipoCentro tipoDeCentro, String municipio,LocalDate fechaDeNcimiento, Integer h, Integer m, Double promedioPesoH, Double promedioPesoM,Double promedioEstaturaH, Double promedioEstaturaM, Boolean helipuerto) {
		this.nombre = nombre;
		this.tipoDeCentro = tipoDeCentro;
		this.municipio = municipio;
		this.provincia = null;
		this.fechaDeNcimiento = fechaDeNcimiento;
		this.h = h;
		this.m = m;
		this.promedioPesoH = promedioPesoH;
		this.promedioPesoM = promedioPesoM;
		this.promedioEstaturaH = promedioEstaturaH;
		this.promedioEstaturaM = promedioEstaturaM;
		this.helipuerto = helipuerto;
		restricciones();	//Comprobacion de las restricciones para comprobar que el objeto se cree sin fallos
	}
	
	
			//Constructor 3 sin pesos y estaturas
	
	public Nacimientos(String nombre, TipoCentro tipoDeCentro, String municipio, String provincia,LocalDate fechaDeNcimiento, Integer h, Integer m,Boolean helipuerto) {
		this.nombre = nombre;
		this.tipoDeCentro = tipoDeCentro;
		this.municipio = municipio;
		this.provincia = provincia;
		this.fechaDeNcimiento = fechaDeNcimiento;
		this.h = h;
		this.m = m;
		this.promedioPesoH = 3d;
		this.promedioPesoM = 3d;
		this.promedioEstaturaH = 50d;
		this.promedioEstaturaM = 50d;
		this.helipuerto = helipuerto;
		restricciones();	//Comprobacion de las restricciones para comprobar que el objeto se cree sin fallos
	}
	
			//Constructor 4 sin provincias, sin estaturas y pesos
	
	public Nacimientos(String nombre, TipoCentro tipoDeCentro, String municipio,LocalDate fechaDeNcimiento, Integer h, Integer m,Boolean helipuerto) {
		this.nombre = nombre;
		this.tipoDeCentro = tipoDeCentro;
		this.municipio = municipio;
		this.provincia = null;
		this.fechaDeNcimiento = fechaDeNcimiento;
		this.h = h;
		this.m = m;
		this.promedioPesoH = 3d;
		this.promedioPesoM = 3d;
		this.promedioEstaturaH = 50d;
		this.promedioEstaturaM = 50d;
		this.helipuerto = helipuerto;
		restricciones();	//Comprobacion de las restricciones para comprobar que el objeto se cree sin fallos
	}
	
	
	//Métodos
	
		//Getters & setters
	
	public String getNombre() {
		return this.nombre;
	}

	public TipoCentro getTipoDeCentro() {
		return this.tipoDeCentro;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNcimiento;
	}

	public Integer getH() {
		return this.h;
	}
	
	public void setH(Integer h) {
		this.h=h;
	}

	public Integer getM() {
		return this.m;
	}
	
	public void setM(Integer m) {
		this.m=m;
	}

	public Double getPromedioPesoH() {
		return this.promedioPesoH;
	}
	
	public void setPromedioPesoH(Double a) {
		this.promedioPesoH=a;
	}

	public Double getPromedioPesoM() {
		return this.promedioPesoM;
	}
	
	public void setPromedioPesoM(Double a) {
		this.promedioPesoM=a;
	}

	public Double getPromedioEstaturaH() {
		return this.promedioEstaturaH;
	}
	
	public void setPromedioEstaturaH(Double a) {
		this.promedioEstaturaH=a;
	}

	public Double getPromedioEstaturaM() {
		return this.promedioEstaturaM;
	}
	
	public void setPromedioEstaturaM(Double a) {
		this.promedioEstaturaM=a;
	}
	
	public Boolean getHelipuerto() {
		return this.helipuerto;
	}
	
		//Propiedades derivadas
	
	public Integer getNacimientosTotales() {
		return this.h+this.m;		//Suma de los nacimientos para calcular los nacimientos totales.
	}
	
	public Double getPromedioPeso() {
		return (this.getPromedioPesoH()+this.getPromedioPesoM())/2;		//Hace la media del peso de hombres y mujeres para dar la media de todos los nacimientos.
	}
	
	public Double getPromedioEstatura() {
		return (this.getPromedioEstaturaH()+this.getPromedioEstaturaM())/2;		//Hace la media de las etaturas de los hombres y mujeres para dar la media de todos los nacimientos.
	}

	
	//toString		//Representación como cadena
	
	public String toString() {
			return "Nacimiento ["+this.nombre+", "+this.municipio+", "+this.provincia+" -> "+
					this.fechaDeNcimiento.format(DateTimeFormatter.ofPattern("d-M-yyyy"))+
					"  Nacimientos: "+this.getNacimientosTotales()+"   "+this.h+" Hombres   "
					+this.m+" Mujeres]";
	}
	
	//equals		//Criterio de igualdad.
						//Un objeto es igual a otro si sus propiedades menos los promedios son iguales
	
	public boolean equals(Object o) {
		boolean res=false;
		if (o instanceof Nacimientos) {
			Nacimientos e=(Nacimientos)o;
			res=this.getNombre().equals(e.getNombre()) && 
				this.getTipoDeCentro().equals(e.getTipoDeCentro()) && 
				this.getMunicipio().equals(e.getMunicipio()) && 
				this.getFechaDeNacimiento().equals(e.getFechaDeNacimiento()) &&
				this.getH().equals(e.getH()) && 
				this.getM().equals(e.getM()) &&
				this.getHelipuerto().equals(e.getHelipuerto());
		}
		return res;
	}
	
	//compareTo		//Oreden natural.
	
	public int compareTo(Nacimientos o) {
		
		int res=this.getNombre().compareTo(o.getNombre());
		if(res==0) {
			res=this.getTipoDeCentro().compareTo(o.getTipoDeCentro());
			if(res==0) {
				res=this.getMunicipio().compareTo(o.getMunicipio());
				if(res==0) {
					res=this.getFechaDeNacimiento().compareTo(o.getFechaDeNacimiento());
					if(res==0) {
						res=this.getH().compareTo(o.getH());
						if(res==0) {
							res=this.getM().compareTo(o.getM());
							if(res==0) {
								res=this.getHelipuerto().compareTo(o.getHelipuerto());
							}
						}
					}
				}
			}
		}
		return res;
	}
	
	//restricciones		//Restricciones sin usar las clase Checkers
	
	public void restricciones() {
		if(this.getFechaDeNacimiento().isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha no puede ser superior la actual");
		}
		if(this.getPromedioPesoH()<0 || this.getPromedioPesoM()<0) {
			throw new IllegalArgumentException("El promedio de peso no puede ser negativo");
		}
		if(this.getPromedioEstaturaH()<0 || this.getPromedioEstaturaM()<0) {
			throw new IllegalArgumentException("La estatura no puede ser negativa");
		}
		if(this.getH()<0 || this.getM()<0) {
			throw new IllegalArgumentException("No puede haber nacimientos negativos");
		}
	}
	
}