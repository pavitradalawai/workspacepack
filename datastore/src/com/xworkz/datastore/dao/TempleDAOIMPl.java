package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOIMPl implements TempleDAO {

	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto: " + dto);
		System.out.println("dto was added " + added);
		return added;

	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed " + dto);
			return this.list.remove(dto);

		}
		System.out.println("temple not exist,cannot remove");
		return false;

	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override

	public TempleDTO findFirstItem() {
		TempleDTO firstItem = list.get(0);
		System.out.println("firstItem:" + firstItem);

		return firstItem;
	}

	@Override
	public TempleDTO findLastItem() {

		TempleDTO lastItem = list.get(list.size() - 1);
		System.out.println("lastItem:" + lastItem);

		return lastItem;

	}

	@Override
	public TempleDTO findBYName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				dto = templeDTO;
				break;
			}
		}

		return dto;
	}

	@Override
	public TempleDTO findByLocation(String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(location)) {
				dto = templeDTO;
				break;
			}
		}

		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> byLocationAndName = this.list.iterator();
		while (byLocationAndName.hasNext()) {
			TempleDTO templeDTO = byLocationAndName.next();
			if (templeDTO.getLocation().equals(location) && (templeDTO.getName().equals(name))) {
				dto = templeDTO;
				break;
			}
		}

		return dto;
	}

	@Override
	public Collection<TempleDTO> findAll() {
		Iterator<TempleDTO> find = this.list.iterator();
		while (find.hasNext()) {
			TempleDTO templeDTO = find.next();
			System.out.println("findAll:" + templeDTO);

		}

		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Iterator<TempleDTO> ByEntryFeeGreaterThan = this.list.iterator();
		while (ByEntryFeeGreaterThan.hasNext()) {
			TempleDTO templeDTO = ByEntryFeeGreaterThan.next();
			System.out.println("findAllTempleByEntryFeeGreaterThan:" + templeDTO);

		}

		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOFPoojarisGreaterThan(int no) {
		
		
			
			
		
		
		Iterator<TempleDTO> ByNoOFPoojarisGreaterThan = this.list.iterator();
		while (ByNoOFPoojarisGreaterThan.hasNext()) {
			TempleDTO templeDTO = ByNoOFPoojarisGreaterThan.next();
			System.out.println("findAllTempleByNoOfPoojariesGreatrThan:"+templeDTO);
		}
		return null;
	}


	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char character) {
char c=character;
String s= Character.toString(c);
Collection<TempleDTO>tempCollection=new ArrayList<TempleDTO>();
Iterator<TempleDTO>templeByLocation=this.list.iterator();

while(templeByLocation.hasNext()){
	TempleDTO temp=templeByLocation.next();
	if(temp.getLocation().startsWith(s)) {
	System.out.println("temple by location starts with :"+temp);
	tempCollection.add(temp);
}
}
return tempCollection;
	}


@Override
public String findLocationByName(String name) {
	Iterator<TempleDTO>locationByName=this.list.iterator();
	while(locationByName.hasNext()) {
		TempleDTO temple = locationByName.next();
		if(temple.getName().equals(name)) {
			System.out.println("find by location :"+ temple);
		}
	}
	
	return null;
}
@Override

public Collection<String>findAllLocation(){
	Iterator<TempleDTO>allocation=this.list.iterator();
	Collection<String>tempCollection=new ArrayList<String>();
	while(allocation.hasNext()) {
		TempleDTO temple= allocation.next();
		System.out.println("findall location:"+temple.getLocation());
		tempCollection.add(temple.getLocation());
	}
	return tempCollection;
}
	
	
	
	
	
	
	
	

		
	
}
