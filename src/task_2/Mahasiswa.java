/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Serlii R. Crusita
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String status;
    private char [] nilai;
    private int q;
    
    public Mahasiswa(){
        this.status = "Tidak LULUS";
        this.q = 0;
        this.nilai = new char [10];
    }
    
    public Mahasiswa (String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
        this.status = "Tidak LULUS";
        this.q = 0;
        this.nilai = new char [10];
    }
    
    public String getNIM(){
        return NIM;
    }
    
   public void setNIM (String NIM){
       this.NIM = NIM;
   } 

    public String getNama() {
        return Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public char[] getNilai(int q) {
        char n = this.nilai[q];
        return nilai;
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getQ(){
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
   
    public void addNilai (char nilai){
        if (q < 10){
            this.nilai[q] = nilai;
            q++;
        }
    }
    
    public String toString (){
        String mhs = NIM + "," + Nama + "," + status + "=";
        for (int r = 0; r < q; r++){
            mhs = mhs + nilai [r] + ",";
        }
        return mhs;
    }

    public char cekNilai (Mahasiswa mh){
        char p = 0;
        for (char x = 'A' ; x < 'E' ; x++){
            for (int y = 0; y < q; y++){
                if (nilai [y] == x){
                    for (int z = 0; z < mh.q; z++){
                        if (mh.nilai[z] == x){
                            return x;
                        }
                    }
                }
            }
        }
        return p;
        
    }
}

