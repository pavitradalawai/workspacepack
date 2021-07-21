package com.workz.datastore.dao;

import java.util.Collection;

import com.workz.datastore.dto.KitchenItemDTO;



public interface KitchenItemDAO {
	
	Collection<KitchenItemDTO> findAllSortByUsedFor();
	Collection<KitchenItemDTO> findAllSortByUsedForDesc();
	Collection<KitchenItemDTO> findAllSortByName();
	
	boolean saveUnique1(KitchenItemDTO dto);
	Collection<KitchenItemDTO> findAllSortByPriceDesc();





}
