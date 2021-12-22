package iso2.t04.testing1.domain;

public class Weather {

	private int temperature;
	private double relative_humidity;
	private boolean snowing;
	private boolean raining;
	private boolean cloudy;

	public Weather(int temperature, double relative_humidity, boolean snowing, boolean raining, boolean cloudy) {
		super();
		this.temperature = temperature;
		this.relative_humidity = relative_humidity;
		this.snowing = snowing;
		this.raining = raining;
		this.cloudy = cloudy;
	}

	public int getTemperature() {
		return this.temperature;
	}

	/**
	 * 
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public double getRelative_humidity() {
		return this.relative_humidity;
	}

	/**
	 * 
	 * @param relative_humidity
	 */
	public void setRelative_humidity(double relative_humidity) {
		this.relative_humidity = relative_humidity;
	}

	public boolean getSnowing() {
		return this.snowing;
	}

	/**
	 * 
	 * @param snowing
	 */
	public void setSnowing(boolean snowing) {
		this.snowing = snowing;
	}

	public boolean getRaining() {
		return this.raining;
	}

	/**
	 * 
	 * @param raining
	 */
	public void setRaining(boolean raining) {
		this.raining = raining;
	}

	public boolean getCloudy() {
		return this.cloudy;
	}

	/**
	 * 
	 * @param cloudy
	 */
	public void setCloudy(boolean cloudy) {
		this.cloudy = cloudy;
	}

}