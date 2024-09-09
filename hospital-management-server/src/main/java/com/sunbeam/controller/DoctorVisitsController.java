package com.sunbeam.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dtos.DoctorDataBackinBean;
import com.sunbeam.dtos.DoctorVisitsDataBackinBean;
import com.sunbeam.dtos.Response;
import com.sunbeam.dtos.PatientDataBacking;
import com.sunbeam.dtos.WardDataBackinBean;
import com.sunbeam.services.DoctorServices;
import com.sunbeam.services.DoctorVisitsServices;
import com.sunbeam.services.PatientServices;
import com.sunbeam.services.WardServices;

@CrossOrigin("*")
@RestController@RolesAllowed("ROLE_DOCTOR")
@RequestMapping("/api/doctorVisit")
public class DoctorVisitsController {
	@Autowired
	DoctorVisitsServices visitServices;



	@PostMapping("/addVisit")
	public ResponseEntity<?> addWard(@RequestBody DoctorVisitsDataBackinBean visitData) {
		int updateCount = visitServices.addVisit(visitData);
		if (updateCount == 1)
			return Response.success("VISIT_ADDED");
		return Response.success("FAILED");
	}

	

}
