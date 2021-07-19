package com.xworkz.datastore;
import com.xworkz.datastore.dao.HighWayDAO;
import com.xworkz.datastore.dao.HighWayDAOImpl;
import com.xworkz.datastore.dao.constants.HighWayType;
import com.xworkz.datastore.dto.HighWayDTO;

import java.util.Collection;

import com.xworkz.*;
		

public class HighWayTester {





	private static final String NH4 = null;
	private static final HighWayDAO  = null;











	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HighWayDTO dto1=new HighWayDTO(2,303,HighWayType.NH4HIGHWAY,"Mandya",500,true,"TATA");
	HighWayDTO dto2=new HighWayDTO(3,403,HighWayType.STATEHIGHWAY,"HASANA",700,false,"JMC");
	HighWayDTO dto3=new HighWayDTO(4,503,HighWayType.URBANHIGHWAY,"Mysore",800,true,"HCC");
	HighWayDTO dto4=new HighWayDTO(2,303,HighWayType.RURALHIGHWAY,"kerala",900,true,"AFOCNS");
	
	
HighWayDAO dao=new HighWayDAOImpl();
HighWayDTO dto;
dao.save(dto);
dao.save(dto1);
dao.save(dto2);
dao.save(dto3);
dao.save(dto4);
dao.findAll();
dao.findAllNumber();
dao.totalItems();	
	
	}















	


	
Collection<HighWayDTO> findByHighWayType( HighWayType type) {
	return null;
}

}




	
	
	

	

