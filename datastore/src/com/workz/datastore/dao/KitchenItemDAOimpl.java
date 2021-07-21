package com.workz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.workz.datastore.dto.KitchenItemDTO;
import com.xworkz.datastore.comparator.KitchenItemUsedForComparatorDesc;

public class KitchenItemDAOimpl implements KitchenItemDAO {

	private List<KitchenItemDTO> list = new ArrayList<>();
	@Override
	public boolean saveUnique1(KitchenItemDTO dto) {
		System.out.println("Added dto: " + dto);
		return list.add(dto);
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedFor() {
		System.out.println("findAllSortByUsedFor");
		Collections.sort(list, new KitchenItemNameComparator());
		return this.list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedForDesc() {
		System.out.println("findAllSortByUsedForDesc");
		Collections.sort(list, new KitchenItemUsedForComparatorDesc());
		return this.list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByName() {
		System.out.println("findAllSortByName");
		Collections.sort(list, new KitchenItemNameComparator());
		return this.list;
	}


	@Override
	public Collection<KitchenItemDTO> findAllSortByPriceDesc() {
		System.out.println("findAllSortByPriceDesc");
		Collections.sort(list, new KitchenItemPriceDescComparator());
		return this.list;
	}




	}

