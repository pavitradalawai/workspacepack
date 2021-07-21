package com.xworkz.datastore;

import java.util.Collection;

import com.xworkz.datastore.constants.HighWayType;
import com.xworkz.datastore.dao.HighWayDAO;
import com.xworkz.datastore.dao.HighwayType;
import com.xworkz.datastore.dto.HighWayDTO;
import com.xworkz.datastore.dto.dao.HighwayDAO;
import com.xworkz.datastore.dto.HighWayDAOImpl;
import com.xworkz.datastore.dto.HighWayDAOImpl.HighwayDTO;

public class highwayDAOTester {

	public static void main(String[] args) {

	

		HighwayDTO dto1 = new HighwayDTO("NH63", 63, HighwayType.NATIONALHIGHWAY, "Andhra", 929.00d, true, "jmc2");

		HighwayDTO dto2 = new HighwayDTO("SH4", 4, HighwayType.STATEHIGHWAY, "Karnataka,Tamilnadu", 1665.00d, true,
				"jmc3");
		HighwayDTO dto3 = new HighwayDTO("NH48", 48, HighwayType.NATIONALHIGHWAY, "Karnataka", 720.00d, true, "jmc1");

		HighwayDAO dao = new HighwayDAO();
		((HighWayDAO) dao).save(dto1);
		((HighWayDAO) dao).save(dto2);
		((HighWayDAO) dao).save(dto3);

		System.out.println("totalItems : " + ((HighWayDAO) dao).totalItems());

		Collection<HighwayDTO> all = dao.findAll();
		for (HighwayDTO highway : all) {
			System.out.println("FindAll : " + highway);
		}

		Collection<Integer> findnumber = ((HighWayDAO) dao).findAllNumber();
		for (Integer in : findnumber) {
			System.out.println("find all number : " + in);
		}

		Collection<HighwayDTO> numberbystatename = ((HighWayDAO) dao).findNumberByStateName("Karnataka");
		for (HighwayDTO highway : numberbystatename) {
			System.out.println(highway);
		}

		Collection<HighwayDTO> bystatename = ((HighWayDAO) dao).findByStateName("Andhra");
		for (HighwayDTO dt : bystatename) {
			System.out.println(dt);
		}

		boolean contain = ((HighWayDAO) dao).exist(dto2);
		System.out.println("found : " + contain);

		Collection<HighwayDTO> highwaytype = ((HighWayDAO) dao).findByHighwayType(HighwayType.STATEHIGHWAY);
		for (HighwayDTO way : highwaytype) {
			System.out.println(way);
		}

		boolean condition = ((HighWayDAO) dao).isCondition(63);
		System.out.println("Highway condition : " + condition);

		double len = dao.lengthByNumber(48);
		System.out.println("findbylength : " + len);

		HighwayDTO maxleng = dao.findByMaxLength();
		System.out.println("max length : " + maxleng);

		HighwayDTO minleng = ((HighWayDAO) dao).findByminLength();
		System.out.println("min length : " + minleng);

	}

}