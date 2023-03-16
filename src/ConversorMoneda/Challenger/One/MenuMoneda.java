package ConversorMoneda.Challenger.One;

public class MenuMoneda {

	private Moneda moneda;
	
	public MenuMoneda() {
		this.moneda = new Moneda();
	}
	
	public double PesoADolar(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAEuro(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoALibrasEsterlinas(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getLibrasEsterlinas();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double dePesoAWonSurcoreano(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getWonSurcoreano();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	public double dePesoAYenJapones(double peso) throws Errores {
		validar(peso);
		try {
			return peso / moneda.getYenJapones();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deDolarAPeso(double dolar) throws Errores {
		validar(dolar);
		try {
			return dolar * moneda.getDolar();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deEuroAPeso(double euro) throws Errores {
		validar(euro);
		try {
			return euro * moneda.getEuro();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deLibrasEsterlinasAPeso(double libras) throws Errores {
		validar(libras);
		try {
			return libras * moneda.getLibrasEsterlinas();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double deWonSurcoreanoAPeso(double won) throws Errores {
		validar(won);
		try {
			return won * moneda.getWonSurcoreano();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}

	public double deYenJaponesAPeso(double yen) throws Errores {
		validar(yen);
		try {
			return yen * moneda.getYenJapones();
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	private void validar(double moneda) throws Errores {
		if (moneda <= 0) {
			throw new Errores("Debe ingresar un valor mayor a 0");
		}
	}
}