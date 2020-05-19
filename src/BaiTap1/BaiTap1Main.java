/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;




/**
 *
 * @author Cam Ly
 */
public class BaiTap1Main 
{
    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException 
    {
        HoaDonHeader HDH = new HoaDonHeader
      ("HD001", new SimpleDateFormat("dd/mm/yyyy").parse("19/05/2020"),"Châu Cẩm Ly");
        CTHD CTHD1 = new CTHD("Bánh Gạo One One",2,20000,0.2);
        CTHD CTHD2 = new CTHD("Bánh Cosy",2,50000,0.5);
        CTHD CTHD3 = new CTHD("Kẹo Chocolate",2,90000,0.7);
        CTHD CTHD4 = new CTHD("Kẹo Singum",2,10000,0.5);
        CTHD CTHD5 = new CTHD ("Bánh Snacks",10,7000,0.1);
        HoaDon  HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(CTHD1)
            .addCTHD(CTHD2)
            .addCTHD(CTHD3)
            .addCTHD(CTHD4)
            .addCTHD(CTHD5)
            .build();
                
        System.out.println(HD.toString());
    }
    }
    