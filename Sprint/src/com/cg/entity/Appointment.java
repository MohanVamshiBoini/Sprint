package com.cg.entity;

import java.math.BigInteger;
import java.time.format.DateTimeFormatter;

public class Appointment {
private String userId;
private BigInteger appointmentid;
private Test test;
private DateTimeFormatter datetime;
private boolean approved;
private DiagnosticCentre centre;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public BigInteger getAppointmentid() {
	return appointmentid;
}
public void setAppointmentid(BigInteger appointmentid) {
	this.appointmentid = appointmentid;
}
public Test getTest() {
	return test;
}
public void setTest(Test test) {
	this.test = test;
}
public DateTimeFormatter getDatetime() {
	return datetime;
}
public void setDatetime(DateTimeFormatter datetime) {
	this.datetime = datetime;
}
public boolean isApproved() {
	return approved;
}
public void setApproved(boolean approved) {
	this.approved = approved;
}
public DiagnosticCentre getCentre() {
	return centre;
}
public void setCentre(DiagnosticCentre centre) {
	this.centre = centre;
}
}
