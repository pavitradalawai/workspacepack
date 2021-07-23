package com.xworkz.dictionary;
import java.util.Collection;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class AadharMapTester {



	

		public static void main(String[] args) {

			Map<Long, Long> adharMobile = new HashMap<Long, Long>();

			adharMobile.put(364849573948l, 7975157812l);
			adharMobile.put(523589647852l, 9645586984l);
			adharMobile.put(424385895423l, 8995463541l);
			adharMobile.put(324367888423l, 7895463541l);
			adharMobile.put(274367895423l, 9895463541l);
			adharMobile.put(684367895423l, 9789546354l);

			System.out.println(adharMobile.size());
			System.out.println("xxxxxx");
			System.out.println(adharMobile.containsKey(364849573948l));
			System.out.println("xxxxx");
			System.out.println(adharMobile.containsValue(7975157812l));
			System.out.println("xxxxxx");

			Set<Long> keyset = adharMobile.keySet();
			Collection<Long> values = adharMobile.values();
			System.out.println("MobileNumber printing");
			Iterator<Long> itrValue = values.iterator();
			while (itrValue.hasNext()) {
				long mobile = itrValue.next();
				System.out.println(mobile);
			}
			System.out.println("****");
			System.out.println("Adhar Number printing");
			Iterator<Long> itrvalue = keyset.iterator();
			while (itrvalue.hasNext()) {
				Long adhar = itrvalue.next();
				System.out.println(adhar);
			}
			System.out.println("XXXx");
			System.out.println("AdharNumber-MobileNumber printing");
			Iterator<Long> itr = keyset.iterator();
			while (itr.hasNext()) {
				Long string = itr.next();
				Long value = adharMobile.get(string);
				System.out.println(string + " " + value);
			}
			System.out.println("XXXx");
			adharMobile.remove(684367895423l);
			System.out.println(adharMobile.size());

		}

	}