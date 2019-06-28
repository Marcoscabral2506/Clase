
public class Andres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aulas aulas = new Aulas(5, 5);

		String x = aulas.buscarEspacio();
		if(x!=""){
			String[] espacios = x.split("-");
			System.out.println(espacios[0]);
		}
		
		
	}

}
