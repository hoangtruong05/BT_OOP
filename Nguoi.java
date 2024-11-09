package BtAbstract;

public abstract class Nguoi {
    protected String ten;
    protected int tuoi;
    protected char gioiTinh;
    
    public abstract void inputData();
    public Nguoi(){
        super();
    }
    public Nguoi(String ten, int tuoi, char gioiTinh){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public char getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String tosString(){
        return " Ten: "+ten+" Tuoi: "+tuoi+" Gioi tinh: "+gioiTinh;
    }


}
