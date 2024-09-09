package com.sunbeam.services;
import java.util.List;
import static com.sunbeam.dtos.MedicineAssignedDataBackinBean.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import static com.sunbeam.dtos.WardDataBackinBean.*;

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
import com.sunbeam.entities.Medicine;
import com.sunbeam.entities.User;

@Service @Transactional
public class MedicineServices {
	@Autowired
	IUserDao userDao;
	@Autowired
	IEmployeeDao employeeDao;
	@Autowired
	IWardDao wardDao;
	@Autowired
	IMedicineDao medicineDao;
	@Autowired
	IMedicineAssignedDao medicineAssingedDao;
	
	public List<MedicineAssignedDataBackinBean> getAllMedicines(){
		List<Medicine> medicine=medicineDao.findAll();
		List<MedicineAssignedDataBackinBean> medicinesTosend=createAllMedicineList(medicine);
		return medicinesTosend;
		
	}

	public int addMedicine(MedicineAssignedDataBackinBean medicineData) {
		return  medicineDao.insertIntoMedicineTable(0, medicineData.getMedicineName(), medicineData.getMedicinePrice());
		
	}

	public void removeMedicine(int medicineId) {
		medicineDao.deleteById(medicineId);
		
	}
	
	
	
	
	

}
