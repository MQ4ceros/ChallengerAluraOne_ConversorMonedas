package ConversorMoneda.Challenger.One;

public class MenuTemperatura {
	
	public double CelsiusAFahrenheit(double temp) {
		try {
			return temp * (9 / 5) + 32;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double CelsiusAKelvin(double temp) {
		try {
			return temp + 273.15;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double FahrenheitACelsius(double temp) {
		try {
			return (temp - 32) * (5 / 9);
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double FahrenheitAKelvin(double temp) {
		try {
			return (temp + 459.67) * (5 / 9);
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double KelvinACelsius(double temp) {
		try {
			return temp - 273.15;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
	public double KelvinAFahrenheit(double temp) {
		try {
			return 1.8 * (temp - 273) + 32;
		} catch (Exception e) {
			e.getStackTrace();
			return 0.0;
		}
	}
	
}
