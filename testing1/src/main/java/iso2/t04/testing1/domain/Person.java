package iso2.t04.testing1.domain;

public class Person {

	private boolean isHealthy;
	private boolean has_symptoms;
	private boolean had_contact;
	private boolean passed_covid;
	private boolean has_vaccination_card;

	
	
	public Person(boolean isHealthy, boolean has_symptoms, boolean had_contact, boolean passed_covid,
			boolean has_vaccination_card) {
		super();
		this.isHealthy = isHealthy;
		this.has_symptoms = has_symptoms;
		this.had_contact = had_contact;
		this.passed_covid = passed_covid;
		this.has_vaccination_card = has_vaccination_card;
	}

	public boolean getIsHealthy() {
		return this.isHealthy;
	}

	/**
	 * 
	 * @param isHealthy
	 */
	public void setIsHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}

	public boolean getHas_symptoms() {
		return this.has_symptoms;
	}

	/**
	 * 
	 * @param has_symptoms
	 */
	public void setHas_symptoms(boolean has_symptoms) {
		this.has_symptoms = has_symptoms;
	}

	public boolean getHad_contact() {
		return this.had_contact;
	}

	/**
	 * 
	 * @param had_contact
	 */
	public void setHad_contact(boolean had_contact) {
		this.had_contact = had_contact;
	}

	public boolean getPassed_covid() {
		return this.passed_covid;
	}

	/**
	 * 
	 * @param passed_covid
	 */
	public void setPassed_covid(boolean passed_covid) {
		this.passed_covid = passed_covid;
	}

	public boolean getHas_vaccination_card() {
		return this.has_vaccination_card;
	}

	/**
	 * 
	 * @param has_vaccination_card
	 */
	public void setHas_vaccination_card(boolean has_vaccination_card) {
		this.has_vaccination_card = has_vaccination_card;
	}

}