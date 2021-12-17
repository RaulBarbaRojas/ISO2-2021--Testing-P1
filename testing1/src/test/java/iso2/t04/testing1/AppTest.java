package iso2.t04.testing1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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

    
    /**
     * MODIFIED CONDITION DECISION COVERAGE
     */
    
    @Test
    public void modifiedConditionDecisionCoverage() {
    	assertEquals(Recommendation.checkPersonState(new Person(false, true, true, false, false)), false); //TC1
    	assertEquals(Recommendation.checkPersonState(new Person(true, false, false, true, true)), true); //TC2
    }
}
