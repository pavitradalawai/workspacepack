package com.xworkz.datastore.dao;

import com.xworkz.datastore.constants.HighWayType;
import com.xworkz.datastore.dto.HighWayDAOImpl.HighwayDTO;
import com.xworkz.datastore.dto.HighWayDTO;
import java.util.Collection;



public interface HighWayDAO {

	

	


	

		boolean save(HighwayDTO dto);

		int totalItems();

		Collection<HighwayDTO> findAll();

		Collection<Integer> findAllNumber();

		Collection<HighwayDTO> findNumberByStateName(String name);

		boolean exist(HighwayDTO dto3);

		Collection<HighwayDTO> findByStateName(String sname);

		Collection<HighwayDTO> findByHighwayType(HighwayType type);

		boolean isCondition(int num);

		double lengthByNumber(int no);

		HighwayDTO findByMaxLength();
		
		HighwayDTO findByminLength();

	}