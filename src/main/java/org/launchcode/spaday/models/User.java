package org.launchcode.spaday.models;

public class User {

//    private static int id;
//    private static int nextId = 1;
    private static String username;

    private static String email;

    private static String password;

    public User(String username, String email, String password) {
        //this.id = nextId;
        this.username = username;
        this.email = email;
        this.password = password;

        //nextId++;
    }

//    public static int getNextId() {
//        return nextId;
//    }
//
//    public static void setNextId(int nextId) {
//        User.nextId = nextId;
//    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }
}
