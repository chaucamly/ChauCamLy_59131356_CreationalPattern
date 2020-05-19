/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Cam Ly
 */
public class CTHD 
{
    String SanPham;
    int SoLuong;
    double DonGia;
    double ChietKhau; 

    public CTHD() 
    {}

    public CTHD(String SanPham, int SoLuong, double DonGia, double ChietKhau) 
    {
        this.SanPham = SanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }

    public String getSanPham() 
    {
        return SanPham;
    }

    public void setTenSanPham(String SanPham) 
    {
        this.SanPham = SanPham;
    }

    public int getSoLuong() 
    {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong)
    {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() 
    {
        return DonGia;
    }

    public void setDonGia(double DonGia)
    {
        this.DonGia = DonGia;
    }

    public double getChietKhau() 
    {
        return ChietKhau;
    }

    public void setChietKhau(double ChietKhau) 
    {
        this.ChietKhau = ChietKhau;
    }

    
    @Override
    public String toString() 
    {
        return  "Chi tiết hóa đơn :" + "sản phẩm: " + SanPham +"\n"
                +"Số lượng: " + SoLuong + "\n"
                +"Đơn giá:" +  DonGia + "\n"
                +"Chiết khấu:" + ChietKhau;  
  
}
}
