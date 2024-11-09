package BtAbstract;

import java.util.Scanner;

public class BenhNhan extends Nguoi{
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;

    public BenhNhan(){
            super();
    }
    public BenhNhan(String ten, int tuoi, char gioiTinh,
    String tienSu, String chanDoan, BenhVien benhVien){
        super(ten, tuoi, gioiTinh);
        this.tienSu=tienSu;
        this.chanDoan=chanDoan;
        this.benhVien=benhVien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setBenhVien(BenhVien benhVien) {
         this.benhVien = benhVien;
    }
    @Override

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Nhap Tien Su: ");
        tienSu = sc.nextLine();
        System.out.println("Nhap chan doan: ");
        chanDoan = sc.nextLine();
        System.out.println("\nNhap Thong tin Benh Vien");
        benhVien = new BenhVien();
        benhVien.inputData();
     //   sc.close();
    }
    @Override
    public String toString(){
        return "Ten: "+ten+" Tuoi: "+tuoi+" Gioi tinh: "+gioiTinh+" Tien su: "+tienSu+
        " Chan Doan: "+chanDoan+"\nThong tin Benh Vien: "+benhVien.toString();
    
    }

    

}
