import java.util.HashMap;
import java.util.Map;


public class MapTester {
	
	public static void main(String[] args){
		
		Flight fly1 = new Flight("AA5623");
		Crew crew1 = new Crew("Alperen",0);
		Crew crew2 = new Crew("�zmen",1);
		
//		Map<Flight, Crew> map = new HashMap<Flight, Crew>();
//		map.put(fly1, crew1);
		
		Map crewMap = new HashMap();
		crewMap.put(0, crew1);
		crewMap.put(2, crew2);
		
		
		Map<String, Map> flight = new HashMap<String,Map>();
		flight.put(fly1.getFlightNo(), crewMap);
		
		System.out.println(flight.get("AA5623"));
		
	}

}