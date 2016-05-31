package cl.kibernum.db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


public class MySQLHelper {

    private final String server = "52.1.139.148";
    private final String database = "test_kb";
    private final String user = "admin";
    private final String password = "admin2016*";

    public MySQLHelper(){}


    public MysqlDataSource getDataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser(user);
        dataSource.setDatabaseName(database);
        dataSource.setPassword(password);
        dataSource.setServerName(server);
        return dataSource;
    }

}
