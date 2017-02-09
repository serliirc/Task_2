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
    private char[] nilai;
    private int i;
    
    public Mahasiswa(){
        this.status = "Tidak LULUS";
        this.i = 0;
        this.nilai = new char [10];
    }
    
    public Mahasiswa (String NIM, String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
        this.status = "Tidak LULUS";
        this.i = 0;
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

    public char getNilai(int i) {
        return nilai[i];
    }
    
    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getI(){
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
   
    public void addNilai (char nilai){
        if (i < 10){
            this.nilai[i] = nilai;
            i++;
        }
    }
    
    public String toString (){
        String mhs = NIM + "," + Nama + "," + status + "=";
        for (int p = 0; p < i; p++){
            mhs = mhs + nilai [p] + ",";
        }
        return mhs;
    }

    public char cekNilai (Mahasiswa mh){
        char x = 0;
        for (char q = 'A' ; x < 'E' ; x++){
            for (int y = 0; y < i; y++){
                if (nilai [y] == x){
                    for (int z = 0; z < mh.i; z++){
                        if (mh.nilai[z] == x){
                            return x;
                        }
                    }
                }
            }
        }
        return x;
        
    }
}

