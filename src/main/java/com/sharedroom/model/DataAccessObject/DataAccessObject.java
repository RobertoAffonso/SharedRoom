package com.sharedroom.model.DataAccessObject;

import com.sharedroom.model.Espaco.EspacoVO;
import com.sun.beans.decoder.ValueObject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Roberto Affonso, created on 5/11/18
 **/

public interface DataAccessObject {
    String generateSelectAllSql();
    String generateInsertSql();
    String generateUpdateSql();
    String generateDeleteSql();
    List<EspacoVO> dbLoadAll() throws SQLException;
    EspacoVO dbLoad() throws SQLException;
    void dbInsert(EspacoVO espaco) throws SQLException;
    void dbDelete(EspacoVO espaco) throws SQLException;
    void dbUpdate(EspacoVO espaco) throws SQLException;
    EspacoVO rsToObject(ResultSet rs) throws SQLException;
    void Validate(Connection conn, ValueObject object) throws SQLException;
}
