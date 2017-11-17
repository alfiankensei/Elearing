import java.util.Scanner;

class Maba {
	int noreg;
	String nama, email, alamat, telp, jurusan;
    Scanner scan = new Scanner (System.in);

	void registrasi(){
		System.out.print ("Masukan Nomor Registrasi : ");
		noreg = scan.nextInt();	
	}

	void inputreg(){
		System.out.print ("Nama : ");
		nama = scan.nextLine();
		System.out.print ("Email : ");
		email = scan.nextLine();
		System.out.print ("Address : ");
		alamat = scan.nextLine();
		System.out.print ("Phone : ");
		telp = scan.nextLine();
		System.out.print ("Jurusan : ");
		jurusan = scan.nextLine();
	}

	void tampil(){
		System.out.println ("No. Registrasi : " + noreg);
	}
	
}