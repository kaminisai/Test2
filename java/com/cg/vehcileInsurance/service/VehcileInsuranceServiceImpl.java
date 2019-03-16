package com.cg.vehcileInsurance.service;

import java.time.LocalDateTime;

import com.cg.vehcileInsurance.DAO.IVehcileInsuranceDAO;
import com.cg.vehcileInsurance.DAO.VehcileInsuranceDAOImpl;
import com.cg.vehcileInsurance.beans.VehcileInsurance;

public class VehcileInsuranceServiceImpl implements IVehcileInsuranceService {

	
	    
	
	public VehcileInsurance VechileInsuranceRegistration(VehcileInsurance vehcile) {
		IVehcileInsuranceDAO ivi=new  VehcileInsuranceDAOImpl();
		return vehcile;
	}

	public int InsuranceValidaityCheck() {
		
		IVehcileInsuranceDAO ivi=new  VehcileInsuranceDAOImpl();
			
		return 0;
	}

}
