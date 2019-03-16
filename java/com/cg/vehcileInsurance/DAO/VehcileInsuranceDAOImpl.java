package com.cg.vehcileInsurance.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cg.vehcileInsurance.beans.VehcileInsurance;

public class VehcileInsuranceDAOImpl implements IVehcileInsuranceDAO{


	Random random=new Random();
	int vehcileNo=12345;
	
	Map<Integer,VehcileInsurance> vehcileEntry;
	private int insurancePeriod;
	
	//registering for vehcile insurance
	public VehcileInsurance VechileInsuranceRegistration(VehcileInsurance vehcile) {
		vehcileEntry=new HashMap<Integer, VehcileInsurance>();
		
		String vehciletype=vehcile.getVehcileType();
		int Insuranceperiod=vehcile.getInsurancePeriod();
		long aadharCard=vehcile.getAadharCard();
		long mobileNo=vehcile.getMobileNo();
	//	vehcile.setVehcileNo(random.nextInt(9999999));
	//	vehcile.setVehcileNo(vehcileNo);
		for(Map.Entry m: vehcileEntry.entrySet()) {
			vehcile=vehcileEntry.put(vehcileNo,new VehcileInsurance(vehcileNo,Insuranceperiod,aadharCard,mobileNo));
		}
		
			vehcileNo++;
		return vehcile;
	}

	// validity check for the vehcile
	public int InsuranceValidaityCheck() {
		
			if(insurancePeriod>365)
			{
				try {
					
				
				throw new InsurancePeriodExtends();
				
			}catch(InsurancePeriodExtends e) {
			e.printStackTrace();
			}
		
		return 0;
	}
			return insurancePeriod;
			
			
		
	}
}

	

