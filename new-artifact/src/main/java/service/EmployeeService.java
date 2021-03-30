package service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import database.Emp_db;
import model.EmpModel;


public class EmployeeService {
	private static  Map<Long, EmpModel> Emp = Emp_db.getDetails();
	public EmployeeService() {
		Emp.put(1l, new EmpModel(1,"rawat","cdg@gmail.com","9123456432","07/12/1999"));
		Emp.put(2l, new EmpModel(2,"varshney","Bly@gmail.com","6547382920","09/12/1999"));
		Emp.put(3l, new EmpModel(3,"rajput","UK@gmail.com","3456788902","12/04/1998"));
		Emp.put(4l, new EmpModel(4,"rawat","patiyal@gmail.com","9876543218","09/11/1997"));
		Emp.put(5l, new EmpModel(5,"singh","pubneet@gmail.com","8956783423","09/09/1999"));
		
		
	}
	public List<EmpModel> getAllemployee(){
		return new ArrayList<EmpModel>(EmpModel.values());//values() is for storing the details of the employees as in a List
	}
	public static EmpModel getDetails(long eid,String ename) {
		EmpModel EmpModel = new EmpModel(); 
		EmpModel.getEid();
		EmpModel.getEname();
		
		return EmpModel.get(eid,ename);
	}
	public static EmpModel addDetails(EmpModel EmpModel) {
		EmpModel.setEid(EmpModel.size() + 1);
		EmpModel.put(EmpModel.getEid(),EmpModel);
		return EmpModel;

	}
	public static EmpModel updateDetails(EmpModel  EmpModel) {
		
		EmpModel.put(EmpModel.getEid(),EmpModel);
		return EmpModel;
		
	}
	public static EmpModel removeDetails(Long eid) {
		return EmpModel.removeDetails(eid);
	}

	

}	