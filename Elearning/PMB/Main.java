import java.util.Scanner;

public class Main {
	public static void main (String[] args){
        int menu,loop;
		Maba maba = new Maba();
        Tes tes = new Tes();
		Akademik akad = new Akademik();
		Keuangan uang = new Keuangan();
        Scanner scan = new Scanner (System.in);
        loop = 1;
        while(loop==1){
            System.out.println("");
            System.out.println("Menu :");
            System.out.println("1. Registrasi");
            System.out.println("2. Input Peserta");
            System.out.println("3. Lihat Data Peserta");
            System.out.println("4. Cek Pembayaran");
            System.out.println("5. Input Hasil Tes");
            System.out.println("6. Hasil");
            System.out.println("7. Exit");
            System.out.println("");
            System.out.println("Pilih Menu : ");
            menu = scan.nextInt();
            
            if (menu==1){
                maba.registrasi();
            }else if(menu==2){
                System.out.println("No. Registrasi : " + maba.noreg);
                akad.inputreg();
                uang.ispaid();
            }else if(menu==3){
                System.out.println ("");
                System.out.println ("Data Diri Pendaftar");
                System.out.println ("No. Registrasi \t: " + maba.noreg);
                akad.tampil();
            }else if(menu==4){
                System.out.println ("");
                System.out.println ("Status Pembayaran");
                uang.paid();
            }else if(menu==5){
                tes.inputhasil();
            }else if(menu==6){
                tes.hasiltes();
            }else if(menu==7){
                loop = 0;
            }
        }
        
		}
}