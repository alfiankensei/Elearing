import java.util.Scanner;
class Tes{
	//String nip
    int hasil;
    Scanner scan = new Scanner(System.in);
	void inputhasil(){
        System.out.println ("");
		System.out.println ("Masukan Hasil Tes :");
        hasil = scan.nextInt();	
	}

    void hasiltes(){
        if(hasil >= 70){
            System.out.println ("Lulus");
        }else{
            System.out.println ("Tidak Lulus");
        }
    }
    
}