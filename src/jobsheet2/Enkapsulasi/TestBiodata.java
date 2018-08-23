/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2.Enkapsulasi;

/**
 *
 * @author MPC
 */
public class TestBiodata {
     public static void main(String args[]){
        BiodataKeluarga biodata = new BiodataKeluarga();
        biodata.setnamaAyah("Mashuri");
        biodata.setnamaIbu("Lulut Karyawati");
        biodata.setnamaSendiri("Cahya Tri Amirtha Agsania");
        biodata.setnamaSaudara("Cahya Ika Ningsih,Cahya Dwi Putrisari,Cahya Fouren Sevi Launa");
        biodata.setalamat("Ds.Prambonwetan Kec.Rengel.Kab.Tuban");
        biodata.sethobi("Mendengarkan Musik");
        biodata.setcitacita("Pegawai Negeri Sipil");
        biodata.setumur(16);
        System.out.println(" Nama Ayah    : " + biodata.getnamaAyah());
        System.out.println(" Nama Ibu     : " + biodata.getnamaIbu());
        System.out.println(" Nama Sendiri : " + biodata.getnamaSendiri());
        System.out.println(" Nama Saudara : " + biodata.getnamaSaudara());               
        System.out.println(" Alamat       : " + biodata.getalamat());
        System.out.println(" Hobi         : " + biodata.gethobi());
        System.out.println(" Cita-cita    : " + biodata.getcitacita());
        System.out.println(" Umur         : " + biodata.getumur());
                         
                           
                           
                           
       
     }
}
