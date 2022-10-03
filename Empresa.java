package polimorfismo;


public class Empresa {
	private String CUIT;
	private String razonSocial;
	private Empleado[] empleados;
	private int cantEmpleados = 0;
	
	public Empresa(String cUIT, String razonSocial, int ce) {
		CUIT = cUIT;
		this.razonSocial = razonSocial;
		this.empleados = new Empleado[ce];
		
	}
	
	public void agregarEmpleado(Empleado e) {
		if(cantEmpleados < empleados.length) {
			empleados[cantEmpleados] = e;
			cantEmpleados ++;
		}
		else System.err.println("No hay mas vacantes");
	}
	
	public double getMontoTotal() {
		double montoTotal = 0;
		for (Empleado cadaEmpleado : empleados) {
			montoTotal += cadaEmpleado.getSalario();
			System.out.println(cadaEmpleado.getSalario());
		}
		return montoTotal;
	}
	
	public static void main(String[] args) {
		Empresa acme = new Empresa("12-34567890-4", "Acme", 4);
		
		Empleado tito = new Plantatemporaria(80, 0, true);
		Empleado julia = new Plantapermanente(80, 2, true, 6);
		Empleado pablo = new Plantapermanente(160, 0, false, 4);
		Empleado ana = new Gerente(160, 1, true, 10);
		acme.agregarEmpleado(ana);
		acme.agregarEmpleado(pablo);
		acme.agregarEmpleado(julia);
		acme.agregarEmpleado(tito);
		
		System.out.println(acme.getMontoTotal());
	
	}

}