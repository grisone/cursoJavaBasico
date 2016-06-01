package cl.kibernum.db;

import java.sql.*;

/**
 * Created by Kibernum on 31/05/2016.
 */
public class Test {
    //id, name, gender, age , passowrd
    private final String DELETE_QUERY = "delete from Persona where id = ?";
    private final String SELECT_QUERY = "select id, name, gender, age, password from Persona";
    private final String SELECT_QUERY_BY_ID = SELECT_QUERY + " where id = ?";
    private final String UPDATE_QUERY = "update Persona set name = ? , gender = ?, age = ? where id = ?";

    private MySQLHelper mySQLHelper;
    private Connection conn;

    private MySQLHelper gethelper(){
        if(null == mySQLHelper){
            mySQLHelper = new MySQLHelper();
        }
        return  mySQLHelper;
    }

    private Connection getConexion() throws SQLException{
        if(null == conn)
         conn = gethelper().getDataSource().getConnection();

        return conn;
    }
    private void closeConexion() throws SQLException{
        if(null != conn)
            conn.close();

        conn = null;
    }

    public void update(int id, String name, String gender, int age) throws SQLException{
        PreparedStatement preparedStatement = getConexion().prepareStatement(UPDATE_QUERY);
        preparedStatement.setInt( 4, id );
        preparedStatement.setString( 1, name);
        preparedStatement.setString( 2,   gender );
        preparedStatement.setInt( 3, age );

        preparedStatement.execute();

        closeConexion();
    }


    public void update() throws SQLException{
        PreparedStatement preparedStatement = getConexion().prepareStatement(DELETE_QUERY);
        preparedStatement.setInt( 1, 2 );
        preparedStatement.execute();

        closeConexion();
    }


    public void select() throws SQLException{
        Statement statement = getConexion().createStatement();
        ResultSet rs =  statement.executeQuery(SELECT_QUERY);
        while (rs.next()){
            int id = rs.getInt("id");
            System.out.println("Select by All :" + id);
        }
        statement.close();
        closeConexion();
    }

    public void select(int id) throws SQLException{
        PreparedStatement preparedStatement = getConexion().prepareStatement(SELECT_QUERY_BY_ID);
        preparedStatement.setInt( 1, id );

        ResultSet rs =  preparedStatement.executeQuery();

        while (rs.next()){
            int _id = rs.getInt("id");
            System.out.println("Select by one :" + _id);
        }
        preparedStatement.close();
        closeConexion();
    }

    public static void main(String args[]){
        Test test = new Test();

        try {
            test.select();
        }catch (SQLException e){
            System.out.println("De hocico por : "+ e.getMessage());
        }



    }
}
