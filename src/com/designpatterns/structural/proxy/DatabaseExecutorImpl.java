package com.designpatterns.structural.proxy;

public class DatabaseExecutorImpl implements IDatabaseExecutor {

    @Override
    public void executeDatabase(String query) throws Exception {
        // Executes actual query in database.
        System.out.println("Executing Query: " + query);
    }
}
