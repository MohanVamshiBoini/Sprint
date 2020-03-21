package com.cg.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class DiagnosticCentre implements Serializable {
	private String centreName = "";
	private String centreId = "";
	private List<Test> listOfTests = new ArrayList<Test>();
	private List<Appointment> appointmentList = new ArrayList<Appointment>();

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public String getCentreId() {
		return centreId;
	}

	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}

	public void setList(List<Test> listOfTests) {
		this.listOfTests = listOfTests;
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return listOfTests;
	}
	
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	
	public String Centre() {
		return "DiagnosticCentre \n centreName " + centreName + "\n centreId " + centreId ;
	}

}
