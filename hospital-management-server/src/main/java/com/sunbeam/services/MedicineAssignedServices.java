package com.sunbeam.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import static com.sunbeam.dtos.WardDataBackinBean.*;

import com.sunbeam.custom_exception.NoSuchMedicineExistsException;
import com.sunbeam.daos.IDoctorDao;
import com.sunbeam.daos.IEmployeeDao;
import com.sunbeam.daos.IMedicineAssignedDao;
import com.sunbeam.daos.IMedicineDao;
import com.sunbeam.daos.IUserDao;
import com.sunbeam.daos.IWardDao;
import com.sunbeam.dtos.DoctorDataBackinBean;
import com.sunbeam.dtos.MedicineAssignedDataBackinBean;
import com.sunbeam.dtos.WardDataBackinBean;
import com.sunbeam.entities.Ward;
import com.sunbeam.entities.User;

@Service @Transactional
public class MedicineAssignedServices {
	@Autowired
	IUserDao userDao;
	@Autowired
	IEmployeeDao employeeDao;
	@Autowired
	IWardDao wardDao;
	@Autowired
	IMedicineAssignedDao medicineAssingedDao;
	@Autowired
	IMedicineDao medicineDao;
	
	public void addMedicineToPatient(MedicineAssignedDataBackinBean medicineData) throws NoSuchMedicineExistsException {
		
			medicineAssingedDao.addIntoMedicineAssigned(medicineData.getPatId(), medicineData.getMedicineId(), medicineData.getMedicinePrescription(), medicineData.getMedicineQty());
		
		
		
	}
	
	public void removeMedicineOfPatient(int medicineAssignId) {
		medicineAssingedDao.deleteById(medicineAssignId);
	}
	
	
	
	

}
