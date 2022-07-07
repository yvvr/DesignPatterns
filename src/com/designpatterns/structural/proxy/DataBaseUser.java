package com.designpatterns.structural.proxy;

public class DataBaseUser {

    public static void main(String[] args) throws Exception {

        IDatabaseExecutor nonUser = new DatabaseExecutorProxy("NonAdmin", "Admin@123");
        nonUser.executeDatabase("READ");

        IDatabaseExecutor nonAdmin = new DatabaseExecutorProxy("NonAdmin", "NonAdmin@123");
        nonAdmin.executeDatabase("DELETE");

        IDatabaseExecutor admin = new DatabaseExecutorProxy("Admin", "Admin@123");
        admin.executeDatabase("DELETE");
    }
}
