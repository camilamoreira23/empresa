package polimorfismo;

public class Plantatemporaria extends Empleado{
	private static double VALOR_HORA = 2000;
	
	public Plantatemporaria(int horas_trabajadas, int cant_hijos, boolean casado){
		super(horas_trabajadas, cant_hijos, casado);

	
	}
	
	@Override 
	public double getSalario() {
	return (super.horas_trabajadas * Plantatemporaria.VALOR_HORA)+ this.getSalarioFamiliar();
		
	}
	
	
		
}
