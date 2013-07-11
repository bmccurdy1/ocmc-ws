package com.ocmc.ws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ocmc.ws.beans.PriorityBean;
import com.ocmc.ws.beans.PriorityCollection;

@WebService(targetNamespace="com.ocmc.ws.services")
public interface PriorityService {
	@WebMethod(operationName="AddPriority")
	@WebResult(name="id")
	Long add(@WebParam(name="priority")PriorityBean priority);
	
	@WebMethod(operationName="UpdatePriority")
	void update(@WebParam(name="priority")PriorityBean priority);
	
	@WebMethod(operationName="GetPriority")
	@WebResult(name="priority")
	PriorityBean get(@WebParam(name="id")Long id);
	
	@WebMethod(operationName="GetAllPriorities")
	PriorityCollection getAll();

}
