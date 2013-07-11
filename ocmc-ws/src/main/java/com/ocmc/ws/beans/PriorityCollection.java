package com.ocmc.ws.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PriorityCollectionType", namespace="com.ocmc.ws.beans")
@XmlRootElement(name="PriorityCollection")
public class PriorityCollection {
	private List<PriorityBean> priorities;
	
	public PriorityCollection(){
	}
	
	public PriorityCollection(List<PriorityBean> priorities){
		this.priorities = priorities;
	}
	
	@XmlElementWrapper(name="priorities")
	@XmlElement(name="priority")
	public List getPriorities(){
		return this.priorities;
	}

}
