package com.lypgod.test.ThinkingInJava.Ch6_AccessControl.Practice8;

class Connection {

}

public class ConnectionManager {
    static Connection[] connections;

    static {
        connections = new Connection[] {new Connection(), new Connection(), new Connection()};
    }

    static Connection getConnection() {
        Connection connection = null;
        for (Connection c:connections) {
            if (c != null) {
                connection = c;
                c = null;
                break;
            }
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
        System.out.println(ConnectionManager.getConnection());
    }
}
