package com.cg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.cg.dao.CentreFoundException;
import com.cg.dao.CentreNotFoundException;
import com.cg.service.AdminService;
import com.cg.service.AdminServicel;

public class MainUi {
	@SuppressWarnings("rawtypes")
	static AdminServicel adminService = new AdminService();

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		String loginId = "";
		String pwd = "";
		String centreName = "";
		Scanner s = new Scanner(System.in);
		int a = 0;
		boolean b = false;
		while (true) {
			System.out.println("Enter Login Id");// Admin Login
			loginId = s.next();
			System.out.println("Enter pwd");
			pwd = s.next();
			if ((loginId.equals("vk18") && pwd.equals("vk18")) || (loginId.equals("manutd") && pwd.equals("manutd123"))
					|| (loginId.equals("cricket") && pwd.equals("virat"))) {
				b = true;
			} else {
				System.out.println("Enter Valid login details");
			}
			while (b) { // Options For Admin
				try {
					System.out.println("1.Add Diagnostic Centre"); // To add new center into availability
					System.out.println("2.Remove Diagnostic Centre");// To remove center from availability
					System.out.println("3.Exit"); // To exit out of menu
					a = s.nextInt();
					if (a == 1 || a == 2 || a == 3) {
						switch (a) {
						case 1:
							while (true) {
								System.out.println("Enter Diagnostic Centre name which is not present in list");
								try {
									centreName = s.next();
									boolean result = adminService.addCentre(centreName);
									if (result) {
										System.out.println("Successfully added the Diagnostic Centre");
										break;
									}
								} catch (InputMismatchException e) {
									System.out.println("MisMatch");
								} catch (CentreFoundException e) {
									System.out.println("Enter Diagnostic Centre Name which is not present");
								}
							}
							break;
						case 2:
							while (true) {
								System.out.println("Enter Diagnostic centre name");
								Scanner sc = new Scanner(System.in);
								try {
									String centreName1 = sc.next();
									boolean result1 = adminService.removeCentre(centreName1);
									if (result1) {
										System.out.println("Successfully removed the Diagnostic Centre");
										break;
									}
								} catch (InputMismatchException e) {
									System.out.println("MisMatch");
								} catch (CentreNotFoundException e) {
									System.out.println("Enter Diagnostic Centre Name which is present");
								}
							}
							break;
						case 3:
							System.out.println("Logged Out");
							System.exit(0);
							break;

						}
					} else
						System.out.println("Enter valid option");
				} catch (InputMismatchException e) {
					System.out.println("Enter only integer");
					break;
				}
			}

		}
	}
}
