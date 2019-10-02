package figura;

public class Circulo extends Figura implements IPerimetro,IArea,IRodar{
	private Double radio;
	
	public Circulo(Double lado,String color,Double perimetro ,Double area, Double radio) {
		super(lado,color,perimetro ,area);
		this.radio=radio;
	}

	@Override
	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (2*Math.PI*this.radio);
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return (Math.PI*Math.pow(this.radio, 2));
	}

	@Override
	public Double rodar(Double fuerza) {
		
		return (fuerza*100)/40;
	}
}

