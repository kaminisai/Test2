package com.cg.vehcileInsurance.DAO;

import com.cg.vehcileInsurance.beans.VehcileInsurance;

public interface IVehcileInsuranceDAO {
	 VehcileInsurance VechileInsuranceRegistration(VehcileInsurance vehcile);
	 int InsuranceValidaityCheck();
	

}
