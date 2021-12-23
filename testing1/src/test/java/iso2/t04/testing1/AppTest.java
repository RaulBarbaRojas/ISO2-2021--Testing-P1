package iso2.t04.testing1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import iso2.t04.testing1.domain.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */


/**
 * We decided to include test cases with and without nulls, to observe the difference in the results when testing.
 */

public class AppTest 
{	
	
	/**
	 * EACH USE COVERAGE
	 */
	
	@Test
	public void eachUseCheckPersonStateWithNulls() {
		assertEquals(Recommendation.checkPersonState(new Person(true, true, true, true, true)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(false, false, false, false, false)), false); //TC2
    	//assertEquals(Recommendation.checkPersonState(new Person(null, null, null, null, null)), false); //TC3
	}
	
	@Test
	public void eachUseCheckPersonStateWithoutNulls() {
		assertEquals(Recommendation.checkPersonState(new Person(true, true, true, true, true)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(false, false, false, false, false)), false); //TC2
	}
	
	
	 /**
     * PAIRWISE COVERAGE
     */
	
    @Test
    public void pairwiseCoverageCheckPersonStateWithNulls() {
    	assertEquals(Recommendation.checkPersonState(new Person(true, true, true, true, true)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(false, false, false, false, true)), false); //TC2
    	//assertEquals(Recommendation.checkPersonState(new Person(true, null, null, null, true)), false); //TC3
    	//assertEquals(Recommendation.checkPersonState(new Person(null, false, true, null, false)), false); //TC4
    	//assertEquals(Recommendation.checkPersonState(new Person(false, true, null, false, false)), false); //TC5
    	//assertEquals(Recommendation.checkPersonState(new Person(true, null, false, true, false)), false); //TC6
    	//assertEquals(Recommendation.checkPersonState(new Person(true, false, null, true, null)), false); //TC7
    	//assertEquals(Recommendation.checkPersonState(new Person(false, null, true, false, null)), false); //TC8
    	//assertEquals(Recommendation.checkPersonState(new Person(null, true, false, null, null)), false); //TC9
    	//assertEquals(Recommendation.checkPersonState(new Person(null, true, false, false, null)), false); //TC10
    	//assertEquals(Recommendation.checkPersonState(new Person(false, true, false, true, null)), false); //TC11
    	//assertEquals(Recommendation.checkPersonState(new Person(true, true, false, false, null)), false); //TC12
    	//assertEquals(Recommendation.checkPersonState(new Person(true, true, false, null, null)), false); //TC13
    	//assertEquals(Recommendation.checkPersonState(new Person(false, true, false, null, null)), false); //TC14
    	//assertEquals(Recommendation.checkPersonState(new Person(null, true, false, true, null)), false); //TC15
    	
    }
    
    @Test
    public void pairwiseCoverageCheckPersonStateWithoutNulls() {
    	assertEquals(Recommendation.checkPersonState(new Person(true, true, true, true, true)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(false, false, false, false, true)), false); //TC2
    	assertEquals(Recommendation.checkPersonState(new Person(false, true, false, true, false)), false); //TC3
    	assertEquals(Recommendation.checkPersonState(new Person(true, false, true, false, false)), false); //TC4
    	assertEquals(Recommendation.checkPersonState(new Person(true, false, false, true, false)), false); //TC5
    	assertEquals(Recommendation.checkPersonState(new Person(false, true, true, false, false)), false); //TC6
    }
    
    
    /**
     * DECISION COVERAGE
     */
    
    @Test
    public void decisionCoverageCheckPersonState() {
    	assertEquals(Recommendation.checkPersonState(new Person(false, true, true, false, false)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(true, false, false, true, true)), true); //TC2
    }

    
    @Test
    public void decisionCoverageCheckStayHome() {
    	assertEquals(Recommendation.checkStayHome(new Weather(-1, 0.14, true, true, true)), true); //TC1
    	assertEquals(Recommendation.checkStayHome(new Weather(-1, 0.14, false, false, false)), false); //TC2
    }
    
    @Test
    public void decisionCoverageCheckSkiing() {
    	assertEquals(Recommendation.checkSkiing(new Weather(-1, 0.14, false, false, false), new Space(false, false)), true); //TC1
    	assertEquals(Recommendation.checkSkiing(new Weather(-1, 0.14, false, false, false), new Space(true, true)), false); //TC2
    }

    @Test
    public void decisionCoverageCheckHiking() {
    	assertEquals(Recommendation.checkHiking(new Weather(0, 0.14, false, false, false), new Space(false, false)), true); //TC1
    	assertEquals(Recommendation.checkHiking(new Weather(0, 0.14, false, false, false), new Space(true, true)), false); //TC2
    }

    @Test
    public void decisionCoverageCheckSightseeing() {
    	assertEquals(Recommendation.checkSightseeing(new Weather(15, 0.6, false, false, false), new Space(false, false)), true); //TC1
    	assertEquals(Recommendation.checkSightseeing(new Weather(15, 0.6, false, false, false), new Space(true, true)), false); //TC2
    }
    
    
    @Test
    public void decisionCoverageCheckBeer() {
    	assertEquals(Recommendation.checkBeer(new Weather(25, 0.14, false, false, false), new Space(false, false)), true); //TC1
    	assertEquals(Recommendation.checkBeer(new Weather(25, 0.14, true, true, true), new Space(true, true)), false); //TC2
    }

    @Test
    public void decisionCoverageCheckWaterActivities() {
    	assertEquals(Recommendation.checkWaterActivities(new Weather(31, 0.14, true, true, true), new Space(false, false)), false); //TC1
    	assertEquals(Recommendation.checkWaterActivities(new Weather(31, 0.14, false, false, false), new Space(true, true)), true); //TC2
    }
    
    @Test
    public void decisionCoverageCheckGetRecommendations() {
    	try {
    		ArrayList<ActivityType> lHiking = new ArrayList<ActivityType>();
    		lHiking.add(ActivityType.HIKING);
    		ArrayList<ActivityType> lSkiing = new ArrayList<ActivityType>();
    		lSkiing.add(ActivityType.SKIING);
    		ArrayList<ActivityType> lBeer = new ArrayList<ActivityType>();
    		lBeer.add(ActivityType.BEER);
    		ArrayList<ActivityType> lSightseeing = new ArrayList<ActivityType>();
    		lSightseeing.add(ActivityType.SIGHTSEEING);
    		ArrayList<ActivityType> lStayhome = new ArrayList<ActivityType>();
    		lStayhome.add(ActivityType.STAY_HOME);
    		ArrayList<ActivityType> lSwimmingPool = new ArrayList<ActivityType>();
    		lSwimmingPool.add(ActivityType.SWIMMING_POOL);
    		lSwimmingPool.add(ActivityType.BEACH);
    		ArrayList<ActivityType> lBeach = new ArrayList<ActivityType>();
    		lBeach.add(ActivityType.BEACH);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(31, 0.14, true, true, true), new Space(false, false)).equals(new ArrayList<ActivityType>()), true);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(0, 0.14, false, false, false), new Space(false, false)).equals(lHiking), true);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(0, 0.14, false, false, false), new Space(true, true)).equals(lHiking), false);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(-1, 0.14, true, true, true), new Space(true, true)).equals(lSkiing), false);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(-1, 0.14, false, false, false), new Space(false, false)).equals(lSkiing), true);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(-1, 0.14, true, true, true), new Space(false, false)).equals(lStayhome), true);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(-1, 0.14, false, false, false), new Space(false, false)).equals(lStayhome), false);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(15, 0.6, false, false, false), new Space(false, false)).equals(lSightseeing), true);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(15, 0.6, false, false, false), new Space(true, true)).equals(lSightseeing), false);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(25, 0.14, false, false, false), new Space(false, false)).equals(lBeer), true);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(25, 0.14, true, true, true), new Space(true, true)).equals(lBeer), false);
    		assertEquals(Recommendation.getRecommendations(new Person(false, true, true, false, false), new Weather(36, 0.14, false, false, false), new Space(true, true)).equals(lBeach), true);
    	}catch(NoActivityException e) {
    		
    	}
    }
    
    /**
     * MODIFIED CONDITION DECISION COVERAGE
     */
    
    @Test
    public void modifiedConditionDecisionCoverageCheckPersonState() {
    	assertEquals(Recommendation.checkPersonState(new Person(false, true, true, false, false)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(true, false, false, true, true)), true); //TC2
    }
    
    
    /*
     * I need to give 5 values and not 4, to create the Weather object, but the 5th value is not relevant
     * at all to test this method: modifiedConditionDecisionCoverageCheckStayHome
     */
    @Test
    public void modifiedConditionDecisionCoverageCheckStayHome() {
    	assertEquals(Recommendation.checkStayHome(new Weather(-10, 0.01, true, true, true)), true);  //TC1
    	assertEquals(Recommendation.checkStayHome(new Weather(-10, 0.01, false, false, true)), false);  //TC2
    	assertEquals(Recommendation.checkStayHome(new Weather(-10, 0.80, true, true, true)), false);  //TC3
    	assertEquals(Recommendation.checkStayHome(new Weather(15, 0.01, true, true, true)), false);  //TC4
    }
}
