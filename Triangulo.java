package figura;

public class Triangulo extends Figura implements IPerimetro,IArea {
	private Double ladoUno;
	private Double ladoDos;
	private Double ladoTres;
	private Double base;
	private Double altura;
	public Triangulo(Double lado,String color,Double perimetro ,Double area, Double ladoUno,Double ladoDos,Double ladoTres, Double base,Double altura) {
		super(lado,color,perimetro ,area);
		this.ladoUno=ladoUno;
		this.ladoDos=ladoDos;
		this.ladoTres=ladoTres;
		this.base=base;
		this.altura=altura;
	}

	@Override
	public Double calcularPerimetro() {
		return (this.ladoUno+this.ladoDos+this.ladoTres);
	}

	@Override
	public Double calcularArea() {
		
		return (this.base*this.altura)/2;
	}
}
