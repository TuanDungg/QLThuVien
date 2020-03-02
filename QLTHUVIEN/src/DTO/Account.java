/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Tuan Dung
 */
public class Account {
     private String TaiKhoan;
     private String MatKhau;
     private String MaNV;
        public Account(String taiKhoan, String matKhau, String manv) {
		
		TaiKhoan = taiKhoan;
		MatKhau = matKhau;
		MaNV = manv;
	}
	public String getTaiKhoan() {
		return TaiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		TaiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String manv) {
		MaNV = manv;
	}
}
