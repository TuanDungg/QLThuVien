/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Tuan Dung
 */
public class BookBorrowed {
    private String MaPhieu;
    private String MaNV;
    private String MaDG;
    private String MaSach;
    private Date NgayMuon;
    private Date NgayTra;
    public String getMaPhieu() {
		return MaPhieu;
		}
    public void setMaPhieu(String maPhieu) {
		MaPhieu = maPhieu;
		}
	public String getMaNV() {
		return MaNV;
		}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getMaDG() {
		return MaDG;
		}
	public void setMaDG(String maDG) {
		MaDG = maDG;
		}
	public String getMaSach() {
	    return MaSach;
        }
	public void setMaSach(String maSach) {
		MaSach = maSach;
		}
	public Date getNgayMuon() {
		return NgayMuon;
		}
	public void setNgayMuon(Date ngayMuon) {
		NgayMuon = ngayMuon;
		}
	public Date getNgayTra() {
		return NgayTra;
		}
	public void setNgayTra(Date ngayTra) {
		NgayTra = ngayTra;
		}
    public BookBorrowed(String maPhieu, String maNV, String maDG, String maSach, Date ngayMuon, Date ngayTra) {

		MaPhieu = maPhieu;
		MaNV = maNV;
		MaDG = maDG;
		MaSach = maSach;
		NgayMuon = ngayMuon;
		NgayTra = ngayTra;
	}	                
}
