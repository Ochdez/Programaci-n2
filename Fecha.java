package Escuela;

public class Fecha {
	
	private int dia, mes, a�o;
	boolean valida=false, bisiesto;
	String NombreMes;
	private int diasMes; 
	
	public Fecha(int unDia, int unMes, int unA�o){
			
		dia = unDia;
		mes = unMes;
		a�o = unA�o;
		
		
		switch(mes) {
		case 1: if(dia >= 1 && dia <= 31 && a�o>0) valida = true; NombreMes = "enero"; diasMes=31; break; 
		case 2: if(dia >= 1 && dia <= 29 && a�o>0) {
				valida = true; 
				NombreMes = "febrero";				

				if(a�o%4==0 && a�o%100 != 0 || a�o%400 == 0) {
					bisiesto=true;
					diasMes=29;
				}else {
					bisiesto = false;
				}
				
				if(dia==29 && bisiesto==false) 
				valida= false;
				diasMes=28;
				
				break;
				
		}
		case 3: if(dia >= 1 && dia <= 31 && a�o>0) valida = true; NombreMes = "marzo"; diasMes=31; break; 
		case 4: if(dia >= 1 && dia <= 30 && a�o>0) valida = true; NombreMes = "abril"; diasMes=30; break; 
		case 5: if(dia >= 1 && dia <= 30 && a�o>0) valida = true; NombreMes = "mayo"; diasMes=30; break; 
		case 6: if(dia >= 1 && dia <= 30 && a�o>0) valida = true; NombreMes = "junio"; diasMes=30; break; 
		case 7: if(dia >= 1 && dia <= 31 && a�o>0) valida = true; NombreMes = "julio"; diasMes=31; break; 
		case 8: if(dia >= 1 && dia <= 31 && a�o>0) valida = true; NombreMes = "agosto"; diasMes=31; break; 
		case 9: if(dia >= 1 && dia <= 30 && a�o>0) valida = true; NombreMes = "septiembre"; diasMes=30; break; 
		case 10: if(dia >= 1 && dia <= 31 && a�o>0) valida = true; NombreMes = "octubre"; diasMes=31; break; 
		case 11: if(dia >= 1 && dia <= 30 && a�o>0) valida = true; NombreMes = "noviembre"; diasMes=30; break; 
		case 12: if(dia >= 1 && dia <= 31 && a�o>0) valida = true; NombreMes = "diciembre"; diasMes=31; break; 
		}
		
		
	}
	
	public String formato() {
		String aux = "";
		if(!valida) aux = aux + "Fecha no valida";
		if(valida) aux = aux + dia + " de " + NombreMes + " de " + a�o;
		
		return aux;
	}
	
	public String toString() {
		return formato();
	}
	
	public int dia() {
		return dia;
	}
	
	public int mes() {
		return mes;
	}
	
	public int a�o() {
		return a�o;
	}
	
	public int diasdelMes() {
		return diasMes;
	}

}
