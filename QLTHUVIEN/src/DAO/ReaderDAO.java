/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.*;
import DTO.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import DAO.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Tuan Dung
 */
import net.proteanit.sql.DbUtils;
public class ReaderDAO {
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = ConnectDAO.getSQLServerConnection();
    
    public static ArrayList<Reader> getListSach(){
        ArrayList<Reader> list = new ArrayList<Reader>();
        String sql = "SELECT * FROM DOCGIA";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Reader s = new Reader();
                s.setMaDocGia(rs.getString("MADOCGIA"));
                s.setTenDocGia(rs.getString("TENDOCGIA"));
                s.setEmail(rs.getString("EMAIL"));                
                s.setSoDienThoai(rs.getString("SODIENTHOAI"));             
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return list;
    }
    
    public static  void InsertReader(String madocgia, String tendocgia, String email, String sdt)
    {
        String sql = "INSERT INTO DOCGIA(MADOCGIA,TENDOCGIA,EMAIL,SODIENTHOAI) VALUES(?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, madocgia);
            pst.setString(2, tendocgia);
            pst.setString(3, email);
            pst.setString(4, sdt);           
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm độc giả " +tendocgia+ " thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã độc giả " +madocgia+ " đã tồn tại", "Thông báo",1);
        }
    }
    
    public static void UpdateReader(String madocgia, String tendocgia, String email, String sdt)
    {
        String sql = "UPDATE dbo.DOCGIA SET MADOCGIA = N'"+madocgia+"', TENDOCGIA = N'"+tendocgia+"', EMAIL = N'"+email+"', SODIENTHOAI = N'"+sdt+"' WHERE MADOCGIA = '"+madocgia+"' ";
        try {
              pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Cập nhật độc giả thành công!", "Thông báo",1);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại!","Thông báo", 1);
        }
        
    }
    
    public  static void DeleteReader(String madocgia)
    {
        String sql = "DELETE FROM dbo.DOCGIA WHERE MADOCGIA='"+madocgia+"'";
           try {
              pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Xóa độc giả thành công!", "Thông báo",1);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa độc giả thất bại!","Thông báo", 1);
        }
    }    
    
    public  static void LoadData(String sql, JTable tb)
    {
        try {            
            pst = conn.prepareCall(sql);
            rs = pst.executeQuery();         
            tb.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
        
    }
}
