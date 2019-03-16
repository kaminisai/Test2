package com.cg.vehcileInsurance.beans;


//input varialbes of user
public class VehcileInsurance {
private int vehcileNo,insurancePeriod;
private long aadharCard,mobileNo;
private String vehcileType;
public VehcileInsurance(int vehcileNo2, int insuranceperiod2, long aadharCard2, long mobileNo2) {
	this.vehcileNo=vehcileNo;
	this.insurancePeriod=insurancePeriod;
	this.aadharCard=aadharCard;
	this.mobileNo=mobileNo;
}

//setting and getting the values
public VehcileInsurance() {
	// TODO Auto-generated constructor stub
}
public int getVehcileNo() {
	return vehcileNo;
}
public void setVehcileNo(int vehcileNo) {
	this.vehcileNo = vehcileNo;
}
public int getInsurancePeriod() {
	return insurancePeriod;
}
public void setInsurancePeriod(int insurancePeriod) {
	this.insurancePeriod = insurancePeriod;
}
public long getAadharCard() {
	return aadharCard;
}
public void setAadharCard(long aadharCard) {
	this.aadharCard = aadharCard;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getVehcileType() {
	return vehcileType;
}
public void setVehcileType(String vehcileType) {
	this.vehcileType = vehcileType;
}

}
