package BtAbstract;

import java.util.Scanner;

public class BenhVien {
    public String tenBV;
    public String diaChi; 
    public String giamDoc;

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten BV: ");
        tenBV = sc.nextLine();
        System.out.println("Nhap dia chi BV ");
        diaChi = sc.nextLine();
        System.out.println("Nhap ten giam doc BV");
        giamDoc = sc.nextLine();
      //  sc.close();
    }
    public BenhVien(){
    }
    public BenhVien(String tenBV, String diaChi,String giamDoc){
        this.tenBV=tenBV;
        this.diaChi=diaChi;
        this.giamDoc=giamDoc;
    }
    public String getTenBV() {
        return tenBV;
    }
    public void setTen(String tenBV) {
        this.tenBV = tenBV;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setTuoi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getGiamDoc() {
        return giamDoc;
    }
    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }
    public String toString(){
        return "\nTen: "+tenBV+" Tuoi: "+diaChi+" Giam Doc: "+giamDoc;
    }
}
