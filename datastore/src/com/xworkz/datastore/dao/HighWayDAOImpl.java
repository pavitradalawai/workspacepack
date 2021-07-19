package com.xworkz.datastore.dao;

import com.xworkz.datastore.dao.HighWayDAO;
import com.xworkz.datastore.dto.HighWayDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class HighWayDAOImpl implements HighWayDAO {

	private List<HighWayDTO> list = new ArrayList<HighWayDTO>();

	@Override
	public boolean save(HighWayDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto:" + dto);
		System.out.println("dto was added" + added);
		return added;
	}

	@Override
	public Collection<HighWayDTO> findAll() {

		Iterator<HighWayDTO> find = this.list.iterator();
		while (find.hasNext()) {
			HighWayDTO highwayDTO = find.next();
			System.out.println("findAll:" + highwayDTO);
		}
		return null;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Iterator<HighWayDTO> findAll = (Iterator<HighWayDTO>) this.findAllNumber();

		while (findAll.hasNext()) {
			Iterator<HighWayDTO> findAll1 = null;
			String highwayDTO=null;
			System.out.println("findAllNumber:" + highwayDTO);
		}
		return null;
	}

	@Override
	public int totalItems() {
		int total = list.size();

		return total;

}

@Override
public  Collection<HighWayDTO>findByhighWayType() {

	return null;
}











@Override

public String findByStateName(String name) {
	Iterator<HighWayDTO> StringStateName = this.list.iterator();
	String name1=null;
	Iterator<HighWayDTO> stateByName;
	while (stateByName.hasNext()) {
	HighWayDTO highway=stateByName.next();
	if(highway.getStateName().equals(name)) {
		System.out.println("find by state:"+highway);
		name=highway.getStateName();
	}

	return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	 
}
