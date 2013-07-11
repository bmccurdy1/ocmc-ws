package com.ocmc.ws.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ocmc.ws.dao.IDao;
import com.ocmc.ws.beans.PriorityBean;
import com.ocmc.ws.beans.PriorityCollection;

@WebService(endpointInterface="com.ocmc.ws.services.PriorityService",
		targetNamespace="com.ocmc.ws.services",
		serviceName="PriorityService")
public class PriorityServiceImpl implements PriorityService {
	private IDao<PriorityBean> priorityDao;

	@Override
	@WebMethod(operationName = "AddPriority")
	@WebResult(name = "id")
	public Long add(@WebParam(name = "priority")PriorityBean priority) {
		return priorityDao.save(priority);
	}

	@Override
	@WebMethod(operationName = "UpdatePriority")
	public void update(@WebParam(name = "priority") PriorityBean priority) {
		priorityDao.update(priority);

	}

	@Override
	@WebMethod(operationName = "GetPriority")
	@WebResult(name = "priority")
	public PriorityBean get(@WebParam(name = "id") Long id) {
		return priorityDao.get(id);
	}

	@Override
	@WebMethod(operationName = "GetAllPriorities")
	public PriorityCollection getAll() {
		return new PriorityCollection(priorityDao.getAll());
	}
	
	@WebMethod(exclude = true)
	public void setPriorityDao(IDao<PriorityBean> priorityDao){
		this.priorityDao = priorityDao;
	}

}
