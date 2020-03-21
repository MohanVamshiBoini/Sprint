package com.cg.service;

import com.cg.dao.AdminDao;
import com.cg.dao.AdminDaol;
import com.cg.dao.CentreFoundException;
import com.cg.dao.CentreNotFoundException;;

public class AdminService<tests> implements AdminServicel {
	public boolean addCentre(String centreName) throws CentreFoundException {
		AdminDaol admindao = new AdminDao();
		boolean result = admindao.addCentre(centreName);
		return result;
	}
	public boolean removeCentre(String centreName) throws CentreNotFoundException{
		AdminDaol admindao = new AdminDao();
		boolean result = admindao.removeCentre(centreName);
		return result;
	}
	

}