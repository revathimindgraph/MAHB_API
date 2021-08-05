package com.mahb.viewModels;

public class FlightPlanJson {

	
    public FlightStatusFp Flight ;
    public boolean IsPlanCreated ;
    
    
	public FlightStatusFp getFlight() {
		return Flight;
	}
	public void setFlight(FlightStatusFp flight) {
		Flight = flight;
	}
	public boolean isIsPlanCreated() {
		return IsPlanCreated;
	}
	public void setIsPlanCreated(boolean isPlanCreated) {
		IsPlanCreated = isPlanCreated;
	}
    
    
	
}
