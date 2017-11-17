class Keuangan{
	//String nip
    boolean bayar = false;
	void ispaid(){
		System.out.println ("Melakukan Pembayaran");
        bayar = true;
	}

    void paid(){
        if(bayar == true){
            System.out.println ("Sudah Membayar");
        }else{
            System.out.println ("Belum Membayar");
        }
    }
    
}