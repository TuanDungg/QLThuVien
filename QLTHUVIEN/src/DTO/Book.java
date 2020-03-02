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
public class Book {
   private String MaSoSach;
   private String LoaiSach;
   private String TenSach;
   private String TacGia;
   private String NXB;
   private String TrangThai;

    public Book() {
        this.MaSoSach="";
       this.LoaiSach="";
       this.TenSach="";
       this.NXB="";
       this.TacGia="";
       this.TrangThai="";
    }
   
   public Book(String maSoSach, String loaiSach, String tenSach, String tacGia, String nXB, String trangThai) {
		super();
		MaSoSach = maSoSach;
		LoaiSach = loaiSach;
		TenSach = tenSach;
		TacGia = tacGia;
		NXB = nXB;
		TrangThai = trangThai;
	}
	
   public String getMaSoSach() {
		return MaSoSach;
	}
	public void setMaSoSach(String maSoSach) {
		MaSoSach = maSoSach;
	}
	public String getLoaiSach() {
		return LoaiSach;
	}
	public void setLoaiSach(String loaiSach) {
		LoaiSach = loaiSach;
	}
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	public String getTacGia() {
		return TacGia;
	}
	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
}
