/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tuan Dung
 */
public class CheckLogin {
    public static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static String testConnect()
    {
        try {
            conn = ConnectDAO.getSQLServerConnection();
            return "Kết nối cơ sở dữ liệu thành công!";
        } catch (Exception e) {
            return "Kết nối cơ sở dữ liệu thất bại!";
        }
    }
    
    public static ResultSet cLog(String user, String pass) throws SQLException
    {
        String sql = "SELECT * FROM TAIKHOAN WHERE TENTK = ? and MATKHAU = ?";
        try {
        pst = conn.prepareStatement(sql);
        pst.setString(1, user);
        pst.setString(2, pass);
        return pst.executeQuery();
        }
        catch(Exception e)
        {
            return rs = null;
        }
    }
}
