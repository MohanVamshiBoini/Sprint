package com.cg.service;

import com.cg.dao.CentreFoundException;
import com.cg.dao.CentreNotFoundException;

public interface AdminServicel {

	boolean addCentre(String centreName) throws CentreFoundException;  //Step 7

	boolean removeCentre(String centreName1) throws CentreNotFoundException; //Step17

}
