package com.xworkz.datastore.dao;

import com.xworkz.datastore.dao.constants.HighWayType;
import com.xworkz.datastore.dto.HighWayDTO;
import java.util.Collection;



public interface HighWayDAO {


	boolean save(HighWayDTO dto);
	Collection<HighWayDTO>findAll();
	Collection<Integer>findAllNumber();
	int totalItems();
	Collection<HighWayDTO>findByHighWayType(String nh4);
	Collection<HighWayDTO>findByStateNam(String sname);
	Collection<Integer>findNumberByStateName(String sname );
	boolean exist(HighWayDTO dto);
	boolean isCondition(int number);
	double findLengthByNumber(int no);
	HighWayDTO findByMaxLength();
	HighWayDTO findByMinLength();
	Collection<HighWayDTO> findByhighWayType();
	String findByStateName(String name);
	}


