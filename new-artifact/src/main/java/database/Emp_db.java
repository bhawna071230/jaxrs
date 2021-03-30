package database;


import java.util.HashMap;
import java.util.Map;

import model.EmpModel;

public class Emp_db{
	private static Map<Long, EmpModel> Emp = new HashMap<Long, EmpModel>();
	
	public static Map<Long, EmpModel> getDetails() {
		return Emp;
	}

}
