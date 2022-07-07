package com.designpatterns.structural.proxy;

import java.util.Objects;

public class DatabaseExecutorProxy implements IDatabaseExecutor {

    private boolean isAdmin = false;
    private DatabaseExecutorImpl dbExecutor;

    public DatabaseExecutorProxy(String name, String passwd) {
        if (Objects.equals(name, "Admin") && Objects.equals(passwd, "Admin@123")) {
            isAdmin = true;
            dbExecutor = new DatabaseExecutorImpl();
        } else if (Objects.equals(name, "NonAdmin") && Objects.equals(passwd, "NonAdmin@123")) {
            isAdmin = false;
            dbExecutor = new DatabaseExecutorImpl();
        }
    }

    @Override
    public void executeDatabase(String query) throws Exception {
        if (isAdmin) {
            dbExecutor.executeDatabase(query);
        } else {
            if (query.equals("DELETE")) {
                throw new Exception("DELETE not allowed for non-admin user");
            } else if (dbExecutor != null) {
                dbExecutor.executeDatabase(query);
            } else {
                throw new Exception("Login first to execute database query");
            }
        }
    }
}
