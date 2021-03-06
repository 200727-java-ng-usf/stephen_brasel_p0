package com.revature.revabank.screens;

import java.io.IOException;
import java.util.ArrayList;

import static com.revature.revabank.AppDriver.app;

public class DashboardScreen extends Screen{
	private String[] options = {
			 "Accounts"
			,"View Profile"
			,"Logout"
	};

	public DashboardScreen(){
		super("DashboardScreen", "/dashboard");
//		System.out.println("[LOG] - Instantiating " + this.getClass().getName());

	}

	/**
	 * Renders the login screen menu to the console.
	 */
	@Override
	public void render(){
		String prompt;

		while(app.isSessionValid()){
			System.out.println("Welcome to your Dashboard!");
			for (int i = 1; i <= options.length; i++) {
				System.out.println(i + ") " + options[i-1]);
			}
			try {
				System.out.print("> ");
				prompt = app.getConsole().readLine().trim();

				switch (prompt) {
					case "1":
						app.getRouter().navigate("/accounts");
						break;
					case "2":
						app.getRouter().navigate("/profile");
						break;
					case "3":
						app.invalidateCurrentSession();
						break;
					default:
//						System.out.println("[LOG] - Invalid Selection!");
						break;
				}
			} catch (IOException e) {
				System.out.println("An exception occurred. Please try again.");
//				e.printStackTrace();
			}
		}
	}
}
