package com.xworkz.datastore;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOIMPl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOTester {

	public static void main(String[] args) {

		TempleDTO dto = new TempleDTO("Laxmi temple", 30, "Laxmi nagar", 20, "Bonda", 4, true, "Laxmi", true);
		TempleDTO dto1 = new TempleDTO("Basavanna temple", 50, "Jamakhandi", 400, "CurdRice", 6, true, "Basavanna",
				false);
		TempleDTO dto2 = new TempleDTO("Datthatrya", 40, "Bagalkot", 50, "CurdRice", 10, false, "Datta", false);
		TempleDTO dto3 = new TempleDTO("Raghavendra temple", 100, "Manthralya", 300, "Rice", 20, false, "Raghavendra",
				true);
		TempleDTO dto4 = new TempleDTO("Sai temple", 50, "Kunchanur", 10, "Laddu", 4, true, "Sai baba", false);

		TempleDAO dao = new TempleDAOIMPl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.totalItems();
		dao.findFirstItem();
		dao.findLastItem();

		TempleDTO dtoDelete = new TempleDTO("Laxmi temple", 30, "Laxmi nagar", 20, "Bonda", 4, true, "Laxmi", true);
		dao.delete(dtoDelete);

		TempleDTO findbyName = dao.findBYName("Sai temple");
		System.out.println("findbyName:" + findbyName);

		TempleDTO findbyLocation = dao.findByLocation("Kunchanur");
		System.out.println("find by Location: " + findbyLocation);

		TempleDTO findbyLocationAndName = dao.findByLocationAndName("Sai temple", "kunchanur");
		System.out.println("find by LocationAndName: " + findbyLocationAndName);
		
        
		dao.findAll();
		dao.findAllTempleByEntryFeeGreaterThan(200.00d);
		dao.findAllTempleByNoOFPoojarisGreaterThan(20);
	}
}
