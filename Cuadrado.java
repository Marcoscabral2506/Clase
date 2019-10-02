package figura;

public class Cuadrado extends Figura implements IPerimetro,IArea{
	private Double lados;
	public Cuadrado(Double lado,String color,Double perimetro ,Double area,Double lados) {
		super(lado,color,perimetro ,area);
		this.lados=lados;
	}

	public Double getLados() {
		return lados;
	}

	public void setLados(Double lados) {
		this.lados = lados;
	}

	@Override
	public Double calcularPerimetro() {
		return this.lados*this.lado;
	}

	@Override
	public Double calcularArea() {
		return this.lados*this.lados;
	}
}
