class Akademik extends Maba {
    void inputreg(){
		System.out.println ("___________________________________________");
		System.out.println ("ISI DATA MAHASISWA BARU");
		System.out.print ("Nama Pendaftar: ");
		nama = scan.nextLine();
		System.out.print ("Alamat Email: ");
		email = scan.nextLine();
		System.out.print ("Alamat : ");
		alamat = scan.nextLine();
		System.out.print ("No. Telp : ");
		telp = scan.nextLine();
		System.out.print ("Jurusan : ");
		jurusan = scan.nextLine();
		System.out.println ("____________________________________________");
	}

    void tampil(){
        System.out.println ("Nama Pendaftar \t: " + nama);
        System.out.println ("Alamat Email \t: " + email);
        System.out.println ("Alamat Rumah \t: " + alamat);
        System.out.println ("No. Telp \t: " + telp);
        System.out.println ("Jurusan \t: " + jurusan);
	}
}