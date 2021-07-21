package com.workz.datastore.dao;
import java.util.Comparator;

import com.workz.datastore.dto.KitchenItemDTO;


public class KitchenItemNameComparator implements Comparator <KitchenItemDTO>{



	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}



}
