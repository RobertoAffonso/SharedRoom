package com.sharedroom.model.Espaco.DAO;

import com.sharedroom.model.DataAccessObject.DataAccessObject;
import com.sharedroom.model.DataAccessObject.mainDAO;
import com.sharedroom.model.Espaco.EspacoVO;
import com.sun.beans.decoder.ValueObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Roberto Affonso, created on 5/11/18
 **/

public class EspacoDAO extends mainDAO
implements DataAccessObject {
    public static final String TABLE_NAME = "tb_espaco";
    public static final String TB_IDT_ESPACO = "idt_espaco";
    public static final String TB_COL_AREA_ESPACO = "area_espaco";
    public static final String TB_COL_CEP_ESPACO = "cep_espaco";
    public static final String TB_COL_HOSPEDES_ESPACOS = "qtd_hospedes_espaco";
    public static final String TB_COL_END_ESPACO = "end_espaco";

    @Override
    public String generateSelectAllSql(){
        StringBuilder sb = new StringBuilder("SELECT * FROM " + TABLE_NAME);
        return sb.toString();
    }

    @Override
    public List<EspacoVO> dbLoadAll() throws SQLException {
        try(Connection conn = (Connection) super.getConnection()){

        }
        catch(SQLException ex){

        }
        return null;
    }

    @Override
    public EspacoVO dbLoad() throws SQLException {
        try(PreparedStatement ps = null; ResultSet rs = null){

        }
        catch(SQLException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public String generateInsertSql() {
        StringBuilder sb = new StringBuilder("INSERT INTO " + TABLE_NAME );
        sb.append("(")
            .append(TB_COL_AREA_ESPACO).append(", ")
            .append(TB_COL_CEP_ESPACO).append(", ")
            .append(TB_COL_HOSPEDES_ESPACOS).append(", ")
            .append(TB_COL_END_ESPACO).append(", ")
            .append(TB_IDT_ESPACO).append(") ")
            .append("VALUES (?, ?, ?, ?, ?)");

        return sb.toString();
    }

    @Override
    public void dbInsert(EspacoVO espaco) throws SQLException {
        try{

        }
        catch(SQLException ex){

        }
    }

    @Override
    public String generateUpdateSql() {
        StringBuilder sb = new StringBuilder("UPDATE " + TABLE_NAME + " ")
                .append("SET ")
                .append(TB_COL_AREA_ESPACO).append("= ?, ")
                .append(TB_COL_CEP_ESPACO).append("= ?, ")
                .append(TB_COL_HOSPEDES_ESPACOS).append("= ?, ")
                .append(TB_COL_END_ESPACO).append("= ? ")
                .append("WHERE ")
                .append(TB_IDT_ESPACO).append(" = ?");
        return sb.toString();
    }

    @Override
    public void dbUpdate(EspacoVO espaco) throws SQLException {
        try(PreparedStatement ps = null){
            String sql = generateUpdateSql();
            ps = super.getConnection().connect().prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(SQLException ex){
            ex.printStackTrace();
            throw ex;
        }

    }

    @Override
    public String generateDeleteSql() {
        StringBuilder sb = new StringBuilder("DELETE FROM " + TABLE_NAME + " ");
                sb.append(TB_IDT_ESPACO).append(" = ?");
        return sb.toString();
    }

    @Override
    public void dbDelete(EspacoVO espaco) throws SQLException {

    }

    @Override
    public EspacoVO rsToObject(ResultSet rs) throws SQLException {
        return null;
    }

    @Override
    public void Validate(Connection conn, ValueObject object) throws SQLException {

    }

}
