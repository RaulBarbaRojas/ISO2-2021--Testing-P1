package iso2.t04.testing1.domain;

public class Space {

	private boolean is_capacity_exceeded;
	private boolean has_confinement_restrictions;

	public boolean getIs_capacity_exceeded() {
		return this.is_capacity_exceeded;
	}

	/**
	 * 
	 * @param is_capacity_exceeded
	 */
	public void setIs_capacity_exceeded(boolean is_capacity_exceeded) {
		this.is_capacity_exceeded = is_capacity_exceeded;
	}

	public boolean getHas_confinement_restrictions() {
		return this.has_confinement_restrictions;
	}

	/**
	 * 
	 * @param has_confinement_restrictions
	 */
	public void setHas_confinement_restrictions(boolean has_confinement_restrictions) {
		this.has_confinement_restrictions = has_confinement_restrictions;
	}

}