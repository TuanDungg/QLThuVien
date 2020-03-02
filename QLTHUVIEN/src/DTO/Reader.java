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
public class Reader {
    private String MaDocGia;
    private String TenDocGia;
    private String Email;
    private String SoDienThoai;

    public Reader() {
        this.MaDocGia= "";
        this.Email = "";
        this.MaDocGia="";
        this.TenDocGia= "";//To change body of generated methods, choose Tools | Templates.
    }
    public void setMaDocGia(String MaDocGia){
       this.MaDocGia = MaDocGia ;
    }
    public String getMaDocGia(){
        return this.MaDocGia;
    }
    public String getTenDocGia() {
		return this.TenDocGia;
	}
    public void setTenDocGia(String tenDocGia) {
		this.TenDocGia = tenDocGia;
	}
    public String getEmail() {
		return this.Email;
	}
    public void setEmail(String email) {
		this.Email = email;
	}
    public String getSoDienThoai() {
		return this.SoDienThoai;
	}
    public void setSoDienThoai(String soDienThoai) {
		this.SoDienThoai = soDienThoai;
	}
    public Reader(String maDocGia, String tenDocGia, String email,String soDienThoai) {
		
		MaDocGia = maDocGia;
		TenDocGia = tenDocGia;
		Email = email;	
		SoDienThoai = soDienThoai;
	}
}
