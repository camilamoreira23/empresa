package polimorfismo;

public class Plantapermanente extends Empleado {
	private int aniosDeAntiguedad;
	private static double VALOR_HORA = 3000;
	private static double VALOR_ANIO_ANTIGUEDAD = 1000;
	

	public Plantapermanente(int horas_trabajadas, int cant_hijos, boolean casado, int aniosDeAntiguedad) {
	
		super(horas_trabajadas,cant_hijos,casado);
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	
	}
	protected int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}
	

	public double getSalario() {
		double salario = 0;
		salario = (super.horas_trabajadas * VALOR_HORA) + (this.aniosDeAntiguedad * VALOR_ANIO_ANTIGUEDAD);
		return salario + super.getSalarioFamiliar();  
	
		
		
	}
	
	

}
