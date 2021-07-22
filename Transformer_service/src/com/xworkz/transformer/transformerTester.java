package com.xworkz.transformer;

import com.xworkz.transformer.dto.TransformerDTO;
import com.xworkz.transformer.service.TransformerServiceImpl;
import com.xworkz.transformer.service.Transformerservice;

public class transformerTester {

	

	public static void main(String[] args) {

	
	

		TransformerDTO dto = new TransformerDTO("pavitra","Jamakhandi","violent","Sometime","moody","Dependes on mood","Travelling");
		Transformerservice service = new TransformerServiceImpl();
		String save = service.validatedAndSave(dto);
		System.out.println(save);

		System.out.println(" ");

		TransformerDTO dto1 = new TransformerDTO("vaish", "Bagalkot", "Silent", "Eating", "Talking", "sleepy",
				"Singing");
		String save1 = service.validatedAndSave(dto1);
		System.out.println(save1);
}
}
