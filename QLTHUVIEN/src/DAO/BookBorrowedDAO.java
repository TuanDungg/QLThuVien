/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tuan Dung
 */
public class BookBorrowedDAO {
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = ConnectDAO.getSQLServerConnection();
    
      public  static void LoadData(String sql, JTable tb)
    {
        try {            
            pst = conn.prepareCall(sql);
            rs = pst.executeQuery();         
            tb.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
        }
        
    }
       public  static void DeleteBrrowed(String maphieu)
    {
        String sql = "DELETE FROM dbo.PHIEUMUON WHERE MAPHEU='"+maphieu+"'";
           try {
              pst = conn.prepareStatement(sql);
              pst.execute();
              JOptionPane.showMessageDialog(null, "Xóa phiếu mượn thành công!", "Thông báo",1);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa phiếu mượn thất bại!","Thông báo", 1);
        }
    }
}
