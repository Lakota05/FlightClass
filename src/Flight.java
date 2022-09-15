
public class Flight {

	
	
	String _airlineName;
	String _flightNumber;
	String _flightOrigin;
	String _flightDestination; 
	
	public Flight (String airlineName, String flightNumber, String flightOrigin, String flightDestination ) {
		
		_airlineName = airlineName;
		_flightNumber = flightNumber;
		_flightOrigin = flightOrigin;
		_flightDestination = flightDestination;
		
		
	}
	
	public String getAirlineName() {
		return _airlineName;
	}	
	
	public String getFlightNumber() {
		return _flightNumber;
	}
	public String getFlightOrigin() {
		return _flightOrigin;
	}
	public String getFlightDestination() {
		return _flightDestination;
	}
	
	
	public void setAirlineName(String airlineName) {_airlineName = airlineName;}
	public void setFlightNumber(String flightNumber) {_flightNumber = flightNumber;}
	public void setFlightOrigin(String flightOrigin) {_flightOrigin = flightOrigin;}
	public void setFlightDestination(String flightDestination) {_flightDestination = flightDestination;}
	
	
	public String toString( ) {
	
	return "                         FLIGHT INFORMATION\n \nAirline: " + getAirlineName() + "\nFlight Number: " + getFlightNumber() + "\nFlight Origin: " + getFlightOrigin() + "\nFlight Origin: " + getFlightDestination() + "\nFlight Destination: ";
	
	}
}
 
















