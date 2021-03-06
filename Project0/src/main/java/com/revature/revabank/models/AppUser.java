package com.revature.revabank.models;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class AppUser {
	//region Fields
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private transient String password;
	private String email;
	private Role role;
	private Set<Account> accounts;
	//endregion

	//region Constructors
	public AppUser(){
		super();
		accounts = new HashSet<>();
	}

	public AppUser(String firstName, String lastName, String userName, String password, String email) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public AppUser(String firstName, String lastName, String userName, String password, String email, Set<Account> accounts) {
		this(firstName, lastName, userName, password, email);
		this.role = Role.PATRON;
	}
	public AppUser(String firstName, String lastName, String userName, String password, String email, Role role) {
		this(firstName, lastName, userName, password, email);
		this.role = role;
	}
	public AppUser(int id, String firstName, String lastName, String userName, String password, String email, Role role, Set<Account> accounts) {
		this(firstName, lastName, userName, password, email, role);
		this.id = id;
		this.accounts = accounts;
	}

	public AppUser(AppUser user){
		this(user.id, user.firstName, user.lastName, user.userName, user.password, user.email, user.role, user.accounts);
	}
	//endregion

	//region Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getString() {
		return password;
	}

	public void setString(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	//endregion

	//region Methods

	/**
	 * provides the .toString of this AppUser if accounts is set to True,
	 * otherwise provides all of the information in .toString except for the
	 * accounts.
	 * @param accounts
	 * @return
	 */
	public String toString(boolean accounts) {
		if(accounts) return toString();
		return "AppUser{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", userName='" + userName + '\'' +
				", email='" + email + '\'' +
				", role=" + role +
				'}';
	}
	//endregion

	//region OverRidden Methods

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AppUser appUser = (AppUser) o;
		return id == appUser.id &&
				Objects.equals(firstName, appUser.firstName) &&
				Objects.equals(lastName, appUser.lastName) &&
				Objects.equals(userName, appUser.userName) &&
				Objects.equals(password, appUser.password) &&
				Objects.equals(email, appUser.email) &&
				role == appUser.role &&
				Objects.equals(accounts, appUser.accounts);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, userName, password, email, role, accounts);
	}

	@Override
	public String toString() {
		return "AppUser{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", userName='" + userName + '\'' +
				", email='" + email + '\'' +
				", role=" + role +
				", accounts=" + accounts +
				'}';
	}

	//endregion
}
