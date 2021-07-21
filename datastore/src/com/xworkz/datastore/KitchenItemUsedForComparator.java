package com.xworkz.datastore;

import java.util.Comparator;

import com.workz.datastore.dto.KitchenItemDTO;

public class KitchenItemUsedForComparator implements Comparator <KitchenItemDTO> {

	

	

	

	

		@Override
		public int compare(KitchenItemDTO o1, KitchenItemDTO o2) 
		{
			return o1.getUsedFor().compareTo(o2.getUsedFor()); 
		}
}

		