package com.xworkz.datastore;

import com.xworkz.datastore.dao.RiverDAO;
import com.xworkz.datastore.dao.RiverDAOImpl;
import com.xworkz.datastore.dto.RiverDTO;

public class RiverDAOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);
		RiverDTO dto1 = new RiverDTO("Sharavati", "Ambutirtha", 128, 1, true);
//DAO--- C RUD
		RiverDAO dao = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);

		System.out.println(dao.totalItems());
		RiverDTO KaveriUpdate = new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);
		dao.update(KaveriUpdate);
		System.out.println("total Items" + dao.totalItems());
		RiverDTO dtoToDelete = new RiverDTO("Sharavati", "Talakaveri", 805, 4, true);
		dao.delete(dtoToDelete);
		System.out.println("total Items" + dao.totalItems());
	}

}
