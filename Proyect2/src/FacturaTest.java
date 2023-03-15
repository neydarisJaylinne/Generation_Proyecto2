import java.util.*;
public class FacturaTest {
	public static Factura factura = new Factura(null, null, 0, 0);
	Scanner lectura = new Scanner (System.in);
	public double sum;
	public void ingresarDatos() {		
		System.out.println("Ingrese numero de factura");
		factura.setNumero(lectura.nextLine());
		System.out.println("Ingrese descripcion para su factura");
		factura.setDescripcion(lectura.nextLine());
		System.out.println("Ingrese cantidad de articulos a comprar");
		factura.setCantComprada(lectura.nextInt());	
		calcularValores();
	}

	public void calcularValores() {
		ArrayList<Double> articulos = new ArrayList<>();
		for(int i=0; i<factura.getCantComprada(); i++) {
			System.out.println("Ingrese valor del articulo: "+ (i+1));
			double artLeido = lectura.nextDouble();
			double total=factura.getTotalFactura(artLeido);
			articulos.add(total);
		}	
		System.out.println("el valor de sus articulos individualmente es: " + articulos);
		sum = articulos.stream().mapToDouble(Double::valueOf).sum();
		System.out.println("Total Factura = "+ sum);
	}
	public static void main(String[] args) {
		
		FacturaTest facturaTest = new FacturaTest();
		facturaTest.ingresarDatos();
		
	}
}
