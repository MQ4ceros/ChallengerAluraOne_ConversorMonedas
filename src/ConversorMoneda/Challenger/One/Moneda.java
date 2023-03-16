package ConversorMoneda.Challenger.One;

public class Moneda {

	private double dolar = 197.86;
	private double euro = 209.68;
	private double libraEsterlina = 236.46;
	private double wonSurcoreano = 0.15;
	private double yenJapones = 1.45;
	
	public Moneda() {
		super();
	}
	
	public Moneda(double dolar, double euro, double libras, double won, double yen) {
		this.dolar = dolar;
		this.euro = euro;
		this.libraEsterlina = libras;
		this.wonSurcoreano = won;
		this.yenJapones = yen;
	}
	
	public double getDolar() {
		return dolar;
	}
	
	public double getEuro() {
		return euro;
	}
		
	public double getLibrasEsterlinas() {
		return libraEsterlina;
	}
		
	public double getWonSurcoreano() {
		return wonSurcoreano;
	}
	
	public double getYenJapones() {
		return yenJapones;
	}
}