package model;

import java.util.Collection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmpModel {
	private int eid;
	private String ename,email;
	private String mobnum;
	private String dob;
	public void setEid(long eid) {
		// TODO Auto-generated method stub
		
	}
	


public EmpModel(int eid, String ename, String email, String mobnum , String dob) {
	this.eid = eid;
	this.ename = ename;
	this.email = email;
	this.mobnum = mobnum;
	this.dob = dob;
}



public static EmpModel removeDetails(Long eid) {
	// TODO Auto-generated method stub
	return null;
}



public void put(int eid, EmpModel empModel) {
	// TODO Auto-generated method stub
	
}



public int size() {
	// TODO Auto-generated method stub
	return 0;
}



public EmpModel get(long eid,String ename) {
	// TODO Auto-generated method stub
	return null;
}



public static Collection<? extends EmpModel> values() {
	// TODO Auto-generated method stub
	return null;
}

}

