package vector1;

public class Vector {
	
	private int num;
	private int maior;
	private int segmaior;
	
	public Vector() {
		
	}

	public Vector(int num, int maior, int segmaior) {
		//super();
		this.num = num;
		this.maior = maior;
		this.segmaior = segmaior;
	}

	public int getNum() {
		return num;
	}

	public int getMaior() {
		return maior;
	}

	public int getSegmaior() {
		return segmaior;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setMaior(int maior) {
		this.maior = maior;
	}

	public void setSegmaior(int segmaior) {
		this.segmaior = segmaior;
	}
	

}
