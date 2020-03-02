/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Tuan Dung
 */
public class Employees {
        public String MaNV;
        public String HoTenNV;   
        public Date NgaySinh;     
        public String SoDienThoai;
        public String Email;
        Employees(String maNV, String hoTenNV, Date ngaySinh, 
			String soDienThoai, String email ) {
		
		MaNV = maNV;
		HoTenNV = hoTenNV;
		NgaySinh = ngaySinh;
		SoDienThoai = soDienThoai;
		Email = email;
	}

    public Employees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	
	public String getHoTenNV() {
		return HoTenNV;
	}
	public void setHoTenNV(String hoTenNV) {
		HoTenNV = hoTenNV;
	}
	
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
