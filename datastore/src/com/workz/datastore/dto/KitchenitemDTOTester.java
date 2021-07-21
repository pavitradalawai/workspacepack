package com.workz.datastore.dto;

import java.util.Collection;

import com.workz.datastore.dao.KitchenItemDAO;
import com.workz.datastore.dao.KitchenItemDAOimpl;

public class KitchenitemDTOTester {

	public static void main(String[] args) {
		KitchenItemDTO dto1 = new KitchenItemDTO("Spoon", 200, "Eating", "copper");
		KitchenItemDTO dto2 = new KitchenItemDTO("Cooker", 1000, "Cooking", "Steel");
		KitchenItemDTO dto3 = new KitchenItemDTO("Mixie", 750, "Grinding", "Stainless steel");
		
		KitchenItemDAO dao = new KitchenItemDAOimpl();
		
		dao.saveUnique1(dto3);
		dao.saveUnique1(dto2);
		dao.saveUnique1(dto1);
		
		Collection<KitchenItemDTO> collection1 = dao.findAllSortByUsedFor();
		for (KitchenItemDTO kitchenItem : collection1) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByUsedFor());
		Collection<KitchenItemDTO> collection2 = dao.findAllSortByUsedForDesc();
		for (KitchenItemDTO kitchenItem : collection2) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByUsedForDesc());
		Collection<KitchenItemDTO> collection3 = dao.findAllSortByName();
		for (KitchenItemDTO kitchenItem : collection3) {
			System.out.println(kitchenItem);
		}
//		System.out.println(dao.findAllSortByName());
		Collection<KitchenItemDTO> collection4 = dao.findAllSortByPriceDesc();
		for (KitchenItemDTO kitchenItem : collection4) {
			System.out.println(kitchenItem);
		}
	}
}
//		System.out.println(dao.findAllSortByPriceDesc());
 		
	
