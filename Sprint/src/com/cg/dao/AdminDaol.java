package com.cg.dao;

public interface AdminDaol {

	boolean addCentre(String centreName) throws CentreFoundException; // Step 9

	boolean removeCentre(String centreName1) throws CentreNotFoundException; // Step 19

}
