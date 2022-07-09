package program;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EncapsulationTesting1 {

	public static void main(String[] args) {


		EncapsulationTesting e = new EncapsulationTesting();

		e.setId(10);
		e.setName("Niranjana");

		EncapsulationTesting e1 = new EncapsulationTesting();

		e1.setId(20);
		e1.setName("Renu");

		EncapsulationTesting e2 = new EncapsulationTesting();

		e2.setId(30);
		e2.setName("Jayaraman");

		EncapsulationTesting e3 = new EncapsulationTesting();

		e3.setId(40);
		e3.setName("Jayabal");

		EncapsulationTesting e4 = new EncapsulationTesting();

		e4.setId(50);
		e4.setName("Hari");

		System.out.println("User Defined List : ");
		List<EncapsulationTesting> li = new LinkedList<>();
		li.add(e);
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getId());
			System.out.println(li.get(i).getName());
			
		}
		
		
		System.out.println("\n\nUser Defined Map :  \n\n ");
		
		Map<String, EncapsulationTesting> m = new HashMap<String, EncapsulationTesting>();
		
		m.put("First", e);
		m.put("Second", e1);
		m.put("Third", e2);
		m.put("Fourth", e3);
		m.put("Fifth", e4);
		
		Set<Entry<String, EncapsulationTesting>> s = m.entrySet();
		
		for (Entry<String, EncapsulationTesting> entry : s) {
			
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());			
			
		
			
		}
		
	
	

	}

}
