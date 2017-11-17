import java.util.Scanner;

class Mahasiswa {
	String nama, nim, kelas;
    int jml;
    String matkul1, matkul2, matkul3, matkul4, matkul5;
    Scanner scan = new Scanner (System.in);

	void datamhs(){
        System.out.println ("");
        System.out.println ("_______________________________________");
        System.out.println ("Data Mahasiswa");   
        System.out.print ("Nama Mahasiswa\t: ");
        nama = scan.nextLine();
        System.out.print ("NIM\t\t: ");
        nim = scan.nextLine();
        System.out.print ("Kelas\t\t: ");
        kelas = scan.nextLine();
        System.out.println ("_______________________________________");
	}

	void perwalian(){
        System.out.println ("");
        System.out.println ("Rencana Studi");
        System.out.print ("Matkul 1 : ");
        matkul1 = scan.nextLine();
        System.out.print ("Matkul 2 : ");
        matkul2 = scan.nextLine();
        System.out.print ("Matkul 3 : ");
        matkul3 = scan.nextLine();
        System.out.print ("Matkul 4 : ");
        matkul4 = scan.nextLine();
        System.out.print ("Matkul 5 : ");
        matkul5 = scan.nextLine();
	}

    void listmatkul(){
        System.out.println("");
        System.out.println("Matkul 1 : "+matkul1);
        System.out.println("Matkul 2 : "+matkul2);
        System.out.println("Matkul 3 : "+matkul3);
        System.out.println("Matkul 4 : "+matkul4);
        System.out.println("Matkul 5 : "+matkul5);
    }

    void tampil(){
        System.out.println("");
        System.out.println("Nama Mahasiswa : "+ nama);
        System.out.println("NIM \t\t : "+nim);
        System.out.println("Kelas \t\t: "+kelas);
    }
}