package com.cg.vehcileInsurance.service;

import com.cg.vehcileInsurance.beans.VehcileInsurance;

public interface IVehcileInsuranceService {

	public VehcileInsurance VechileInsuranceRegistration(VehcileInsurance vehcile);
	public int InsuranceValidaityCheck();
		
	}

