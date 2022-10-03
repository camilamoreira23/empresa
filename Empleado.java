package polimorfismo;

public abstract class Empleado {
	protected double horas_trabajadas;
	private int cant_hijos;
	private boolean casado;

	private static double VALOR_HIJO=2000;
	private static double VALOR_CONYUJE=1000;
		

public Empleado(int horas_trabajadas, int cant_hijos, boolean casado) {
		super();
		this.horas_trabajadas = horas_trabajadas;
		this.cant_hijos = cant_hijos;
		this.casado = casado;
	}

public abstract double getSalario();

public double getSalarioFamiliar() {
	double salarioFamiliar;
	if (this.casado) {
		salarioFamiliar = (this.cant_hijos * VALOR_HIJO) + VALOR_CONYUJE;
	}
	else {
		salarioFamiliar=(this.cant_hijos * VALOR_HIJO);
	}
	
	return salarioFamiliar; 
	}	
}