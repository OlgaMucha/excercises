package Persistency;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractDAO {
    protected DBAccess dBaccess;
    protected PreparedStatement preparedStatement;

    public AbstractDAO(DBAccess dBaccess) {
        this.dBaccess = dBaccess;
    }

    protected PreparedStatement getStatement(String sql) throws SQLException {
        return dBaccess.getConnection().prepareStatement(sql);
    }

    protected void executeManipulateStatement() throws SQLException {
        preparedStatement.executeUpdate();
    }

    protected ResultSet executeSelectStatement() throws SQLException {
        return preparedStatement.executeQuery();
    }

    protected void setupPreparedStatementWithKey(String sql) throws SQLException {
        preparedStatement = dBaccess.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }

    protected int executeInsertStatementWithKey() throws SQLException {
        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        int gegenereerdeSleutel = 0;
        while (resultSet.next()) {
            gegenereerdeSleutel = resultSet.getInt(1);
        }
        return gegenereerdeSleutel;
    }

    protected void setupPreparedStatement(String sql) throws SQLException {
        preparedStatement = dBaccess.getConnection().prepareStatement(sql);
    }
}
