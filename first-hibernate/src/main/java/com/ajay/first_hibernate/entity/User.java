package com.ajay.first_hibernate.entity;

public class User {

		String userName;
		String password;
		String name;
		String email;
		String city;
		
		public User(){
			
		}

		@Override
		public String toString() {
			return " [userName=" + userName + ", password=" + password + ", name=" + name + ", email=" + email
					+ "]";
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

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public User(String userName, String password, String name, String email, String city) {
			super();
			this.userName = userName;
			this.password = password;
			this.name = name;
			this.email = email;
			this.city = city;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	

}
