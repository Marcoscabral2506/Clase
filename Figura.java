package figura;

public abstract class Figura implements IPerimetro,IArea{
	protected Double lado;
	protected String color;
	protected Double perimetro;
	protected Double area;
	
	public Figura(Double lado, String color, Double perimetro, Double area) {
		this.lado=lado;
		this.color=color;
		this.perimetro=perimetro;
		this.area=area;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(Double perimetro) {
		this.perimetro = perimetro;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
	
	
}
