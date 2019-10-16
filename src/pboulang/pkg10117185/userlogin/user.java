/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.userlogin;

/**
 *
 * @author user
 * NAMA     : Andhyka Widariyanto
 * KELAS    : PBO_Ulang
 * NIM      : 10117185
 */
public class user {
    private final String username = "Andhyka Widariyanto";
    private final String password = "SayaMasihBelomPaham";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return(username.equals(parUserName) && password.equals(parPassword));

    }

    private void hasilLogin(boolean status, String parUserName){
        System.out.println("");
        
        if (status){
            System.out.println("*****HALLO " +parUserName+ "*****");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else 
            System.out.println("Ooops, Username atau Password anda salah");
    }

    public void pengecekkanLogin(String parUserName, String parPassword){
        statusAkun = cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);

    }
}
