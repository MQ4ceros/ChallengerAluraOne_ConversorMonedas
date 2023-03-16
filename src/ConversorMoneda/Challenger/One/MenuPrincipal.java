package ConversorMoneda.Challenger.One;

import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MenuPrincipal {

	private ImageIcon icono = new ImageIcon("logo.png");
	private MenuMoneda moneda;
	private MenuTemperatura temperatura;

	public MenuPrincipal() {
		this.moneda = new MenuMoneda();
		this.temperatura = new MenuTemperatura();
	}
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void menuSelecionConversor() throws Errores {

		boolean flagMenu = false;

		String[] menu = { 
				"Conversor de monedas", 
				"Conversor de temperatura",
				};
		
		while (flagMenu == false) {
			String opcionMenu = (String) JOptionPane.showInputDialog(null, "Seleccione el conversor",
					"CONVERSOR ALURA", JOptionPane.DEFAULT_OPTION, icono, menu, menu[0]);		
	
			if (opcionMenu == null) {
				JOptionPane.showMessageDialog(null, "Gracias por su visita");
				break;
			} else {
				switch (opcionMenu) {
					case "Conversor de monedas":
						menuConversorMoneda();
						break;
					case "Conversor de temperatura":
						menuConversorTemperatura();
						break;
				}
			}
			
			int respuesta = JOptionPane.showInternalConfirmDialog(null, "¿Quiere continuar operando el programa?", 
					"Conversor", JOptionPane.YES_NO_OPTION);
			if (respuesta == 1 || respuesta == -1) {
				JOptionPane.showMessageDialog(null, "Gracias por su visita");
				flagMenu = true;
			}
		} 
	}

	public void menuConversorMoneda() throws Errores {

		String[] conversoresDeMonedas = { 
				"Peso a Dolar", 
				"Peso a Euro", 
				"Peso a Libras Esterlinas",
				"Peso a Won Surcoreano", 
				"Peso a Yen Japonés", 
				"Dolar a Peso", 
				"Euro a Peso",
				"Libras Esterlinas a Peso", 
				"Won Surcoreano a Peso", 
				"Yen Japonés a Peso" 
				};

		String respuestaMoneda = (String) JOptionPane.showInputDialog(null,
				"Seleccione el cambio de divisas", "Conversor Alura", JOptionPane.DEFAULT_OPTION, icono,
				conversoresDeMonedas, conversoresDeMonedas[0]);

		if (respuestaMoneda == null) {
			menuSelecionConversor();
		}
		
		double valor = ingresoDeDato();
		
		switch (respuestaMoneda) {
			case "Peso a Dolar":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.PesoADolar(valor)) + " dólares.");
				break;
			case "Peso a Euro":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.dePesoAEuro(valor)) + " euros.");
				break;
			case "Peso a Libras Esterlinas":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.dePesoALibrasEsterlinas(valor)) + " libras esterlinas.");
				break;
			case "Peso a Won Surcoreano":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.dePesoAWonSurcoreano(valor)) + " wones.");
				break;
			case "Peso a Yen Japonés":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.dePesoAYenJapones(valor)) + " yenes.");
				break;
			case "Dolar a Peso":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.deDolarAPeso(valor)) + " pesos.");
				break;
			case "Euro a Peso":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.deEuroAPeso(valor)) + " pesos.");
				break;
			case "Libras Esterlinas a Peso":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.deLibrasEsterlinasAPeso(valor)) + " pesos.");
				break;
			case "Won Surcoreano a Peso":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.deWonSurcoreanoAPeso(valor)) + " pesos.");
				break;
			case "Yen Japonés a Peso":
				JOptionPane.showMessageDialog(null,
					"$" + valor + " equivalen a $" + df.format(moneda.deYenJaponesAPeso(valor)) + " pesos.");
				break;
		}
	}
	
	public void menuConversorTemperatura() throws Errores {
		
		String[] conversoresTemperatura = { 
				"Celsius a Fahrenheit", 
				"Celsius a Kelvin", 
				"Fahrenheit a Celsius",
				"Fahrenheit a Kelvin", 
				"Kelvin a Celsius", 
				"Kelvin a Fahrenheit" 
				};
		
		String respuestaTemperatura = (String) JOptionPane.showInputDialog(null,
				"Seleccione el conversor de temperatura", "Conversor Alura",
				JOptionPane.DEFAULT_OPTION, icono, conversoresTemperatura, conversoresTemperatura[0]);

		//agrege else para que no me pida ingresar valor cuando vuelvo del menu temperatura al menu principal
		if (respuestaTemperatura == null) {
			menuSelecionConversor();
		}else { 
		
		double valor = ingresoDeDato();
		
		switch (respuestaTemperatura) {
			case "De Celsius a Fahrenheit":
				JOptionPane.showMessageDialog(null, valor + "°C equivalen a "
					+ df.format(temperatura.CelsiusAFahrenheit(valor)) + "°F.");			
				break;
			case "De Celsius a Kelvin":
				double celsiusKelvin = ingresoDeDato();
				JOptionPane.showMessageDialog(null, valor + "°C equivalen a "
					+ df.format(temperatura.CelsiusAKelvin(valor)) + "°K.");	
				break;
			case "De Fahrenheit a Celsius":
				JOptionPane.showMessageDialog(null, valor + "°F equivalen a "
					+ df.format(temperatura.FahrenheitACelsius(valor)) + "°C.");	
				break;
			case "De Fahrenheit a Kelvin":
				JOptionPane.showMessageDialog(null, valor + "°F equivalen a "
					+ df.format(temperatura.FahrenheitAKelvin(valor)) + "°K.");	
				break;
			case "De Kelvin a Celsius":
				JOptionPane.showMessageDialog(null, valor + "°K equivalen a "
					+ df.format(temperatura.KelvinACelsius(valor)) + "°C.");	
				break;
			case "De Kelvin a Fahrenheit":
				JOptionPane.showMessageDialog(null, valor + "°K equivalen a "
					+ df.format(temperatura.KelvinAFahrenheit(valor)) + "°F.");	
				break;
		}}
	}
	
	public double ingresoDeDato() throws Errores {
		
		boolean flag = false;
		
		String cadena = "";
		
		while (flag == false) {
			
			cadena = (String) JOptionPane.showInputDialog(null, "Ingrese el valor");
			
			if (cadena == null || cadena.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debe ingresar un valor para continuar.");
			} else {
				flag = true;
			}
		}
		return convertirADouble(cadena);
	}
	
	public double convertirADouble(String numero) throws Errores {
		try {
			if (numero == null || numero.isEmpty()) {
				throw new Errores("Debe ingresar un valor");
			}
			
			double decimal = Double.parseDouble(numero);

			return decimal;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
}