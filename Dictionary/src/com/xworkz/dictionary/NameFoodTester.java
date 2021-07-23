package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameFoodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> nameFood = new HashMap<String, String>();

		nameFood.put("Pavitra", "Gobi");
		nameFood.put("Vaish", "Panipuri");
		nameFood.put("mridula", "Fish");
		nameFood.put("Sachin", "Egg");
		nameFood.put("Sunil", "Chicken");
		nameFood.put("Ranjtha", "Rice");

		 
			
			System.out.println(nameFood.size());
			System.out.println("*****");
			System.out.println(nameFood.containsKey("Vaish"));
			System.out.println("***8");
			System.out.println(nameFood.containsValue("Panipuri"));
			System.out.println("XXxxx");

			Set<String> keyset = nameFood.keySet();
			Collection<String> values = nameFood.values();

			System.out.println("Food printing");
			Iterator<String> itrValue = values.iterator();
			while (itrValue.hasNext()) {
				String str = itrValue.next();
				System.out.println(str);
			}
			System.out.println("*****");
			System.out.println("Name printing");
			Iterator<String> itrvalue = keyset.iterator();
			while (itrvalue.hasNext()) {
				String stringvalue = itrvalue.next();
				System.out.println(stringvalue);
			}
			System.out.println("*****");
			System.out.println("Name & Food printing");
			Iterator<String> itr = keyset.iterator();
			while (itr.hasNext()) {
				String string = itr.next();
				String value = nameFood.get(string);
				System.out.println(string + " " + value);
			}
			System.out.println("XXXX");
			nameFood.remove("pavitra");
			System.out.println(nameFood.size());
		}

	}
	