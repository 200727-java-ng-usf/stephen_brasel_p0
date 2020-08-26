package com.revature.revabank;


import com.revature.revabank.repos.UserRepository;
import com.revature.revabank.screens.LoginScreen;
import com.revature.revabank.screens.RegisterScreen;
import com.revature.revabank.services.UserService;
import com.revature.revabank.util.AppState;

/**
 * The Revabank program provides banking functionality in the form of:
 * 		Deposits
 * 		Withdrawals
 * 		Multiple Accounts
 * 		Checking Accounts
 * 		Saving Accounts
 * 		Persistent Data stored with Amazon RDS
 *
 * @author	Stephen
 * @version	1.0
 * @since 	2020-08-26
 */
public class AppDriver {
	public static AppState app = new AppState();

	public static void main(String[] args) {
		while(app.isAppRunning()){
			app.getRouter().navigate("/home");
		}
//		UserRepository userRepo = new UserRepository();
//		UserService userService = new UserService(userRepo);
//
//		RegisterScreen registerScreen = new RegisterScreen(userService);
//		registerScreen.render();
//
//		LoginScreen loginScreen = new LoginScreen(userService);
//		loginScreen.render();
	}

}
