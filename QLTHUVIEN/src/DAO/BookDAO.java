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
public class BookDAO {
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = ConnectDAO.getSQLServerConnection();
    
    public static ArrayList<Book> getListSach(){
        ArrayList<Book> list = new ArrayList<Book>();
        String sql = "SELECT * FROM SACH";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Book s = new Book();
                s.setMaSoSach(rs.getString("MASOSACH"));
                s.setLoaiSach(rs.getString("LOAISACH"));
                s.setTenSach(rs.getString("TENSACH"));                
                s.setTacGia(rs.getString("TACGIA"));
                s.setNXB(rs.getString("NXB"));
                s.setTrangThai(rs.getNString("TRANGTHAI"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return list;
    }
    
    public static  void InsertBook(String masach, String loai, String ten, String tacgia, String nxb, String trangthai )
    {
        String sql = "INSERT INTO SACH(MASOSACH,LOAISACH,TENSACH,TACGIA,NXB,TRANGTHAI) VALUES(?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, masach);
            pst.setString(2, loai);
            pst.setString(3, ten);
            pst.setString(4, tacgia);
            pst.setString(5, nxb);
            pst.setString(6, trangthai);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm sách " +ten+ " thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "mã sách " +masach+ " đã tồn tại", "Thông báo",1);
        }
    }
    
    public static void UpdateBook(String masach, String loai, String ten, String tacgia, String nxb, String trangthai )
    {
        String sql = "UPDATE dbo.SACH SET MASOSACH = N'"+masach+"', LOAISACH = N'"+loai+"', TENSACH = N'"+ten+"', TACGIA = N'"+tacgia+"', NXB = N'"+nxb+"', TRANGTHAI = N'"+trangthai+"' WHERE MASOSACH = '"+masach+"' ";
        try {
              pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Cập nhật sách thành công!", "Thông báo",1);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại!","Thông báo", 1);
        }
        
    }
    
    public  static void DeleteBook(String masach)
    {
        String sql = "DELETE FROM dbo.SACH WHERE MASOSACH='"+masach+"'";
           try {
              pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Xóa sách thành công!", "Thông báo",1);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa sách thất bại!","Thông báo", 1);
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
