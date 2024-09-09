package com.sunbeam;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.sunbeam.daos.IEmployeeDao;
import com.sunbeam.daos.IPatientDao;
import com.sunbeam.daos.IUserDao;
import com.sunbeam.dtos.PatientDataBacking;
import com.sunbeam.services.DoctorServices;

@SpringBootApplication()
public class HospitalManagementServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementServerApplication.class, args);
	}

	@Autowired
	IUserDao userDao;
	@Autowired
	IEmployeeDao employeeDao;
	@Autowired
	IPatientDao patientDao;
	@Autowired
	DoctorServices dService;
	

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");

		System.out.println("===========================inside main function : welcome to hospital management app====================================");
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");
		System.out.println("==========================================================================================================");
//	Employee employee = employeeDao.getById(1);
//	System.out.println(employee.getUser());
//	System.out.println(employee);
		
//		dService.updatePatientDetails(new PatientDataBacking(1000));
		

	}

}
