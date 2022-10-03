package polimorfismo;

public class Gerente extends Plantapermanente{
	private static double VALOR_HORA = 4000;
	private static double VALOR_ANIO_ANTIGUEDAD = 1500;
	
	
	public Gerente(int horas_trabajadas, int cant_hijos, boolean casado, int aniosDeAntiguedad) {
		super(horas_trabajadas, cant_hijos, casado, aniosDeAntiguedad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSalario() {
		double salario=0;
		salario = (super.horas_trabajadas * Gerente.VALOR_HORA) + ( this.getAniosDeAntiguedad()* Gerente.VALOR_ANIO_ANTIGUEDAD);
		return salario + super.getSalarioFamiliar(); 
	
		
	}
	
	
	
		
	
	
	
}
