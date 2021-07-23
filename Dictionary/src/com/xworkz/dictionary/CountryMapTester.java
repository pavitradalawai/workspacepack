package com.xworkz.dictionary;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class CountryMapTester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

Map<String,Long> countryAndPopulationMap=new HashMap<String,Long>();
countryAndPopulationMap.put("India", (long) 13840);
countryAndPopulationMap.put("China", (long) 14390);





System.out.println(countryAndPopulationMap.size());
System.out.println("xxxx");
System.out.println(countryAndPopulationMap.containsKey("India"));
System.out.println("xxxxx");
System.out.println(countryAndPopulationMap.containsValue(13840l));
System.out.println("xxxxx");

Set<String> keyset = countryAndPopulationMap.keySet();
Collection<Long> values = countryAndPopulationMap.values();

System.out.println("Population printing In Crores");
Iterator<Long> itrValue = values.iterator();
while (itrValue.hasNext()) {
	Long longs = itrValue.next();
	System.out.println(longs);
}
System.out.println("xxxxx");
System.out.println("Country printing");
Iterator<String> itrvalue = keyset.iterator();
while (itrvalue.hasNext()) {
	String stringvalue = itrvalue.next();
	System.out.println(stringvalue);
}
System.out.println("xxxxx");
System.out.println("Country-Population printing");
Iterator<String> itr = keyset.iterator();
while (itr.hasNext()) {
	String string = itr.next();
	Long value = countryAndPopulationMap.get(string);
	System.out.println(string + " " + value);
}
System.out.println("****");
countryAndPopulationMap.remove("India");
System.out.println(countryAndPopulationMap.size());
}

}