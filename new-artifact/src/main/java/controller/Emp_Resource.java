package controller;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.EmpModel;
import service.EmployeeService;
@Path("/employee")

public class Emp_Resource {
    EmployeeService ms = new EmployeeService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<EmpModel> getAllemployee() {
		
		return ms.getAllemployee();
		}
    
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public  EmpModel addDetails(EmpModel employee){
		return EmployeeService.addDetails(employee);
	}
	@PUT
	@Path("/{employeeId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public EmpModel updateDetails(@PathParam("employeeId")long eid ,String ename, EmpModel employee) {
		employee.setEid(eid);
		employee.setEname(ename);
		return employee;
	}
	
	@DELETE
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public EmpModel removeDetails(@PathParam("employeeId") long eid) {
		return EmployeeService.removeDetails(eid);
		
	}

	
	@GET
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public EmpModel getDetails(@PathParam("employeeId")long eid, String ename) {
		return EmployeeService.getDetails(eid, ename);
		
		
		
	}
	
}
