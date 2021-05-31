package com.cg.bts.entities;

public class User {
	private long userId;
	private String password;
	private String role;
 
    public User() {
 
    }
 
    public User(Long userId, String password, String role) {
        this.userId = userId;
        this.password = password;
        this.role = role;
    }
 
    public Long getUserId() {
        return userId;
    }
 
    public void setUserId(Long userId) {
        this.userId = userId;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getRole() {
        return role;
    }
 
    public void setRole(String role) {
        this.role = role;
    }
 
    @Override
    public String toString() {
        return this.userId + "/" + this.password;
    }
 
}



/*package com.cg.bugtracking.bean;

public class User {
	
	private long userId;
	private String password;
	private String role;

}*/