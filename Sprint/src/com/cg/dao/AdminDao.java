package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.cg.entity.DiagnosticCentre;
import com.cg.entity.Test;

public class AdminDao implements AdminDaol {
	static String s1 = "";
	static Random rand = new Random();
	static int rand_int = rand.nextInt(1000);
	static String rand_num = Integer.toString(rand_int);
	static DiagnosticCentre centre = new DiagnosticCentre();
	Test test = new Test();
	static HashMap<String, String> centreDetails = new HashMap<String, String>();

	public boolean addCentre(String centreName) throws CentreFoundException {
		if (centreDetails.containsKey(centreName)) {
			return false;
		} else {
			centre.setCentreName(centreName);
			centre.setCentreId(rand_num);
			test.setTestName("blood group");
			test.setTestId(rand_num);
			test.setTestName("blood pressure");
			test.setTestId(rand_num);
			test.setTestName("blood sugar");
			test.setTestId(rand_num);
			List<Test> list = new ArrayList<Test>();
			list.add(test);
			centre.setList(list);
			centreDetails.put(centreName, centre.Centre());
			return true;
		}
	}

	public boolean removeCentre(String centreName) throws CentreNotFoundException { // Step 20
		 if(centreDetails.containsKey(centreName)) {
			centreDetails.remove(centreName, centre.Centre());
			System.out.println(centreDetails.get(centreName));
			return true;
		}
		 else {
				return false;
			}
	}
}
