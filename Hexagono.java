package figura;

public class Hexagono extends Figura implements IPerimetro,IArea,IRodar{
	private Double ladoUno;
	private Double ladoDos;
	private Double ladoTres;
	private Double ladoCuatro;
	private Double ladoCinco;
	private Double ladoSeis;
	private Double apotema;
	
	public Hexagono(Double lado,String color,Double perimetro ,Double area, Double ladoUno,
			 Double ladoDos, Double ladoTres, Double ladoCuatro, Double ladoCinco, Double ladoSeis,Double apotema) {
		super(lado,color,perimetro ,area);
		this.ladoUno=ladoUno;
		this.ladoDos=ladoDos;
		this.ladoTres=ladoTres;
		this.ladoCuatro=ladoCuatro;
		this.ladoCinco=ladoCinco;
		this.ladoSeis=ladoSeis;
		this.apotema=apotema;
	}

	@Override
	public Double calcularPerimetro() {
		super.perimetro=ladoUno+ladoDos+ladoTres+ladoCuatro+ladoCinco+ladoSeis;
		return super.perimetro;
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return (apotema*super.perimetro)/2;
	}

	@Override
	public Double rodar(Double fuerza) {
		
		return (fuerza*100)/80;
	}
}
