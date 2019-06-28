
public class Aulas {
	private boolean estado;
	private int[][] sillas;
	private int CAPACIDAD_MAXIMA = 50;

	public Aulas(int filas, int columnas) {
		this.estado = true;
		this.sillas = new int[filas][columnas];
		for (int i = 0; i < sillas.length; i++) {
			for (int j = 0; i < sillas[i].length; j++) {
				sillas[i][j] = 0;
			}
		}
	}

	public boolean saberEstado(int fila, int columna) {
		for (int i = 0; i < sillas.length; i++) {
			for (int j = 0; i < sillas[i].length; j++) {
				if (sillas[fila][columna] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public String buscarEspacio() {
		int[] espacio = new int[5];
		for (int i = 0; i < sillas.length; i++) {
			for (int j = 0; i < sillas[i].length; j++) {
				if (sillas[i][j] == 0) {

					return i + "-" + j;

				}
			}

		}
		return "";

	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int[][] getSillas() {
		return sillas;
	}

	public void setSillas(int[][] sillas) {
		this.sillas = sillas;
	}

	public int getCAPACIDAD_MAXIMA() {
		return CAPACIDAD_MAXIMA;
	}

	public void setCAPACIDAD_MAXIMA(int cAPACIDAD_MAXIMA) {
		CAPACIDAD_MAXIMA = cAPACIDAD_MAXIMA;
	}

}
