/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Date;

/**
 *
 * @author Cam Ly
 */
public class HoaDonHeader 
{
     String MaHoaDon;
     Date NgayBan;
     String TenKhachHang;

    public HoaDonHeader() 
    {}

    public HoaDonHeader(String MaHoaDon, Date NgayBan, String TenKhachHang) 
    {
        this.MaHoaDon = MaHoaDon;
        this.NgayBan = NgayBan;
        this.TenKhachHang = TenKhachHang;
    }

    public String getMaHoaDon() 
    {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) 
    {
        
        this.MaHoaDon = MaHoaDon;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(Date NgayBan) {
        this.NgayBan = NgayBan;
    }

    
    

    public String getTenKhachHang() 
    {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) 
    {
        this.TenKhachHang = TenKhachHang;
    }

    @Override
    public String toString() {
        return "HoaDonHeader" + "Mã Đơn Hàng:" + MaHoaDon +"\n"
                + "Ngày Bán : " + NgayBan +"\n"
                + "Tên Khách Hàng:" + TenKhachHang  ;
    }
    
   
    
}

