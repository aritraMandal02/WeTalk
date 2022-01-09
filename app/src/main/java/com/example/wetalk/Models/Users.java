package com.example.wetalk.Models;

public class Users {

    String profilePic, userName, eMail, password, userId, lastMessage;

    public Users(String profilePic, String userName, String eMail, String password, String userId, String lastMessage) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    public Users(){}

    // sign up constructor
    public Users(String userName, String eMail, String password) {
        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
