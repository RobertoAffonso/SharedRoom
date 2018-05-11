package com.sharedroom.model.DataAccessObject;

import com.sharedroom.Util.DatabaseConnection;

/**
 * @author Roberto Affonso, created on 5/11/18
 **/

public class mainDAO {
    //Mudar para singleton
    private DatabaseConnection connection;

    public DatabaseConnection getConnection() {
        return connection;
    }
}
