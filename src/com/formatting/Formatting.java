package com.formatting;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk menampilkan bilangan yang telah diubah seperti
	 jarak, format, tanda +/- dan mengambil angka dibelakang titik
 */
public class Formatting {

    public static void main(String[] args) {
	    int i = 3546764;
	    int iMinus = -i;
	    System.out.println("i : "+i);
	    //nilai tetap
	    System.out.printf("%%d : %d%n", i); //3546764

	    //menambahkan jarak 4 spasi
        System.out.printf("%%10d : %10d%n", i); //    3546764

        //menambahkan tanda +
        System.out.printf("%%+10d : %+10d%n", i); //   +3546764

        //menambahkan tanda -
        System.out.printf("%%+10d : %+10d%n", iMinus); //   -3546764

        //menambahkan tanda , untuk memisahkan antar angka
        System.out.printf("%%,10d : %,10d%n", i); //  3,546,764

        //untuk - tidak berpengaruh
        System.out.printf("%%-10d : %-10d%n", i); // 3546764

        double f = 5675482.982;
        System.out.println("f : "+ f);
        //nilai tetap
        System.out.printf("%%f : %f%n", f); //5675482.982000

        //menggambil angka dibelakang titik
        System.out.printf("%%.2f : %.2f%n", f);// 5675482.98

        //memberi jarak
        System.out.printf("%%12.2f : %12.2f%n", f);//   5675482.98

        //menambahkan tanda , untuk memisahkan antar angka
        System.out.printf("%%,12.2f : %,12.2f%n", f); //  5,675,482.98
    }
}
