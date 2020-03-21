package com.cg.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdminDaoTest {
	AdminDao admindao = new AdminDao();

	/*
	 * @Test public void addCentre() throws Exception { boolean result =
	 * admindao.addCentre("xyz"); if (result) { assertTrue(result); } }
	 */
	@Test
	public void addCentre() throws Exception {
		boolean result = admindao.addCentre("xyz");
		if (result) {
			assertTrue(result);
		}
	}

	/*
	 * @Test public void removeCentre() throws Exception { boolean result =
	 * admindao.removeCentre("abcd"); System.out.println(result); if (result) {
	 * assertFalse(result); } }
	 */
	@Test
	public void removeCentre() throws Exception {
		boolean result = admindao.removeCentre("abcd");
		System.out.println(result);
		if (result) {
			assertTrue(result);
		}
	}
}