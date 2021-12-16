package iso2.t04.testing1.domain;

import java.util.ArrayList;

public class Recommendation {

	private Weather weather;
	private Space space;
	private Person person;

	/**
	 * 
	 * @param p
	 */
	private boolean checkPersonState(Person p) {
		// TODO - implement Recommendation.checkPersonState
		boolean result = true;
		if (!p.getIsHealthy() || p.getHas_symptoms() || p.getHad_contact() || !p.getPassed_covid()
				|| !p.getHas_vaccination_card()) {
			return false;
		}
		return result;

	}

	/**
	 * 
	 * @param w
	 */
	private boolean checkStayHome(Weather w) {
		// TODO - implement Recommendation.checkStayHome
		boolean result = false;
		if (w.getTemperature() < 0 && w.getRelative_humidity() < 0.15 && (w.getRaining() || w.getSnowing())) {
			result = true;
		}
		return result;

	}

	/**
	 * 
	 * @param w
	 * @param s
	 */
	private boolean checkSkiing(Weather w, Space s) {
		// TODO - implement Recommendation.checkSkiing
		boolean result = false;
		if (w.getTemperature() < 0 && w.getRelative_humidity() < 0.15 && !w.getRaining() && !w.getSnowing()
				&& !s.getIs_capacity_exceeded()) {
			result = true;
		}
		return result;

	}

	/**
	 * 
	 * @param w
	 * @param s
	 */
	private boolean checkHiking(Weather w, Space s) {
		// TODO - implement Recommendation.checkHiking
		boolean result = false;

		if (w.getTemperature() >= 0 && w.getTemperature() < 15 && !w.getRaining() && !s.getIs_capacity_exceeded()) {
			result = true;
		}
		return result;

	}

	/**
	 * 
	 * @param w
	 * @param s
	 */
	private boolean checkSightseeing(Weather w, Space s) {
		// TODO - implement Recommendation.checkSightseeing
		boolean result = false;
		if (w.getTemperature() >= 15 && w.getTemperature() < 25 && !w.getRaining() && !w.getCloudy()
				&& w.getRelative_humidity() <= 0.6 && !s.getHas_confinement_restrictions()) {
			result = true;
		}
		return result;

	}

	/**
	 * 
	 * @param w
	 * @param s
	 */
	private boolean checkBeer(Weather w, Space s) {
		// TODO - implement Recommendation.checkBeer
		boolean result = false;
		if (w.getTemperature() >= 25 && w.getTemperature() < 35 && !s.getIs_capacity_exceeded() && !w.getRaining()) {
			result = true;
		}
		return result;

	}

	/**
	 * 
	 * @param w
	 * @param s
	 */
	private boolean checkWaterActivities(Weather w, Space s) {
		// TODO - implement Recommendation.checkWaterActivities
		boolean result = false;
		if (w.getTemperature() > 30 && !w.getRaining()) {
			result = true;
		}
		return result;

	}

	/**
	 * 
	 * @param p
	 * @param w
	 * @param s
	 * @throws NoActivityException
	 */
	public ArrayList<ActivityType> getRecommendations(Person p, Weather w, Space s) throws NoActivityException {
		// TODO - implement Recommendation.getRecommendations
		ArrayList<ActivityType> result = new ArrayList<ActivityType>();
		if (checkPersonState(p)) {
			throw new NoActivityException();
		}
		if (checkStayHome(w)) {
			result.add(ActivityType.STAY_HOME);
		}
		if (checkSkiing(w, s)) {
			result.add(ActivityType.SKIING);
		}
		if (checkHiking(w, s)) {
			result.add(ActivityType.HIKING);
		}
		if (checkSightseeing(w, s)) {
			result.add(ActivityType.SIGHTSEEING);
		}
		if (checkBeer(w, s)) {
			result.add(ActivityType.BEER);
		}
		if (checkWaterActivities(w, s)) {
			result.add(ActivityType.BEACH);
			if (!s.getIs_capacity_exceeded()) {
				result.add(ActivityType.SWIMMING_POOL);
			}
		}
		return result;

	}

}