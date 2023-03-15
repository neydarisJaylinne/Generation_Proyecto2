

public class Factura {
	
	public String numero;
	public String descripcion;
	public int cantComprada;
	public double precioArticulo;
	public Factura(String numero, String descripcion, int cantComprada, double precioArticulo) {
		super();
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantComprada = cantComprada;
		this.precioArticulo = precioArticulo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantComprada() {
		return cantComprada;
	}
	public void setCantComprada(int cantComprada) {
		this.cantComprada = cantComprada;
	}
	public double getPrecioArticulo() {
		return precioArticulo;
	}
	public void setPrecioArticulo(double precioArticulo) {
		this.precioArticulo = precioArticulo;
	}
	
	public double getTotalFactura(double precio) {
		if (precio< 0) {
			setPrecioArticulo(0.0);
		}else {
			setPrecioArticulo(precio);
		}	
		return precioArticulo;		
	}

}
