package com.example.exam;

public class HangHoa {

    private String ma;
    private String ten;
    private String gia;

    public HangHoa(String ma, String ten, String gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    public HangHoa() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
