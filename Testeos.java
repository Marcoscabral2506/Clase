package figura;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class Testeos {
	@Test
	public void esUn() {
		Circulo circulo = new Circulo(0.0, "rojo", 12.0, 15.0, 12.0);
		Circulo pelota = new Circulo(0.0, "rojo", 12.0, 15.0, 12.0);
		Cuadrado cuadrado = new Cuadrado(0.0, "rojo", 12.0, 15.0, 12.0);

		Assert.assertEquals(pelota.getClass(), Circulo.class);

		Boolean implementa = false;

		for (int i = 0; i < pelota.getClass().getInterfaces().length; i++) {
			if (pelota.getClass().getGenericInterfaces()[i].equals(IRodar.class)) {
				implementa = true;
			}
		}

		Assert.assertTrue(implementa);

		Boolean x = false;
		if (pelota.getClass().getSuperclass().equals(Figura.class)) {
			x = true;
		}
		Assert.assertTrue(x);

		// Assert.assertEquals(cuadrado.getClass(), circulo.getClass());
	}

	@Test
	public void cuadrados() {
		ArrayList<Cuadrado> listaCuadrados = new ArrayList();
		Cuadrado cuadrado = new Cuadrado(0.0, "rojo", 12.0, 15.0, 12.0);
		Cuadrado cuadrado2 = new Cuadrado(0.0, "verdelimon", 12.0, 15.0, 12.0);
		Cuadrado cuadrado3 = new Cuadrado(0.0, "rojo", 12.0, 15.0, 12.0);
		Cuadrado cuadrado4 = new Cuadrado(0.0, "verdelimon", 12.0, 15.0, 12.0);
		listaCuadrados.add(cuadrado);
		listaCuadrados.add(cuadrado2);
		listaCuadrados.add(cuadrado3);
		listaCuadrados.add(cuadrado4);
		
		
		Iterator<Cuadrado> it = listaCuadrados.iterator();

		while (it.hasNext()) {
			Cuadrado cuadradito = it.next();
			if (cuadradito.getColor().equals("rojo")) {
				it.remove();
			}

		}
		Boolean existeRojo=false;
		for(Cuadrado cuadradito : listaCuadrados) {
			if (cuadradito.getColor().equals("rojo")) {
				existeRojo=true;
			}
		}
		Assert.assertFalse(existeRojo);
	}

}