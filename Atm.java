import java.util.Scanner;

public class ATMSEDERHANA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String language, card, option;
        int balance = 2000000;// Misalkan saldo awal 2000000

        System.out.println("Selamat datang di ATM");
        System.out.println("Masukkan kartu atm anda (Tekan enter untuk lanjut)");
        System.out.println();
        card = input.nextLine();

        if (card.equals("valid"));
        System.out.println("Pilih Bahasa : isi dengan (Indonesia atau English)");
        language = input.nextLine();

        String bindo = "Indonesia";
        String bing = "English";

            if ((language.equals(bindo)) || language.equals(bing)){
                int attemts = 3;
                while (attemts > 0) {
            System.out.println("Masukkan PIN anda");
            int pin = input.nextInt();
            input.nextLine();// Membersihkan newline
            
            // Verifikasi PIN
            if (verifyPIN(pin)) {
                System.out.println("PIN benar, Anda dapat melanjutkan.");
                break;
            } else {
                System.out.println("PIN salah. Coba lagi.");
                attemts--;
                if (attemts == 0) {
                    System.out.println("Kartu Atm diblokir.");
                    return;
                }
            }
        }
        boolean lanjutTrx = true;
        while (lanjutTrx) {
            System.out.println("Menu utama:");
            System.out.println("1. Tarik tunai");
            System.out.println("2. Transfer");
            System.out.println("3. Cek saldo.");
            System.out.println("4. Keluar.");
            option = input.nextLine();
            // PENARIKAN
            switch (option) {
                case "1":
                System.out.println("Masukkan jumlah uang yang ingin ditarik");
                System.out.println("1. 50.000");
                System.out.println("2. 100.000");
                System.out.println("3. 500.000");
                System.out.println("4. 1.000.000");
                String tarik = input.nextLine();
                switch (tarik) {
                    case "1":   // Penarikan uang 50.000
                    try {
                       
                        int tarikan = 50000;
                        int sisaSaldo = balance - tarikan;
                        if (balance < tarikan) {
                            System.out.println("saldo anda tidak mencukupi");
                            lanjutTrx = false;
                        }
                        else{
                             System.out.println("Tunggu sedang dalam proses...");
                        Thread.sleep(3000);
                        System.out.println("Silahkan ambil uang anda");
                        Thread.sleep(2000);
                             System.out.println("Sisa Saldo Anda : " + "Rp."+ sisaSaldo);
                        System.out.println("Apakah ingin melanjutkan transaksi ? ");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        String trx = input.nextLine();
                        switch (trx) {
                            case "1":
                            System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                            int konfirPin = input.nextInt();
                            if (!verifyPIN(konfirPin)) {
                                System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                                lanjutTrx = false;

                            }
                            else{
                                input.nextLine();
                                lanjutTrx = true;
                                balance = sisaSaldo;
                                break;
                            }
                            break ;
                            case "2":
                            System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                            lanjutTrx = false;
                            break;
                            default:
                            break;
                        }
                        break;
                        }
                       
                        
                    } catch (Exception e) {
                    }
                    break;
                    // Penarikan uang 100.000
                    case "2":
                    try {
                        int tarikan = 100000;
                        int sisaSaldo = balance - tarikan;
                        if (balance < tarikan) {
                            System.out.println("saldo anda tidak mencukupi");
                            lanjutTrx = false;
                        }
                        else{
                             System.out.println("Tunggu sedang dalam proses...");
                        Thread.sleep(3000);
                        System.out.println("Silahkan ambil uang anda");
                        Thread.sleep(2000);
                            System.out.println("Sisa Saldo Anda : " + "Rp."+ sisaSaldo);
                        System.out.println("Apakah ingin melanjutkan transaksi ? ");
                        System.out.println("1. Ya");
                        System.out.println("2. Tidak");
                        String trx = input.nextLine();
                        switch (trx) {
                            case "1":
                            System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                            int konfirPin = input.nextInt();
                            if (!verifyPIN(konfirPin)) {
                                System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                                lanjutTrx = false;

                            }
                            else{
                            input.nextLine();    
                            lanjutTrx = true;
                            balance = sisaSaldo;
                            break ;
                        }
                        break;
                        case "2":
                        System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                        lanjutTrx = false;
                        default:
                        break;
                    }
                        }
                        
                    
                } catch (Exception e) {
                }
                break;
                // Penarikan uang 500.000
                case "3" :
                try {
                    int tarikan = 500000;
                    int sisaSaldo = balance - tarikan;
                    if (balance < tarikan) {
                        System.out.println("saldo anda tidak mencukupi");
                    }
                    else{
                         System.out.println("Tunggu sedang dalam proses...");
                    Thread.sleep(3000);
                    System.out.println("Silahkan ambil uang anda");
                    Thread.sleep(2000);
                        System.out.println("Sisa Saldo Anda : " + "Rp."+  sisaSaldo);
                    System.out.println("Apakah ingin melanjutkan transaksi ? ");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    String trx = input.nextLine();
                    switch (trx) {
                        case "1":
                        System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                        int konfirPin = input.nextInt();
                        if (!verifyPIN(konfirPin)) {
                            System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                            lanjutTrx = false;
                        }
                        else{
                            input.nextLine();
                            lanjutTrx = true;
                            balance = sisaSaldo;
                            break ;
                        }
                        break;
                        case "2":
                        System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                        lanjutTrx = false;
                        default:
                        break;
                    }
                    }
                    
                    
                } catch (Exception e) {
                }
                break;
                // Penarikan uang 1.000.000
                case "4" : 
                try {
                    
                    int tarikan = 1000000;
                    int sisaSaldo = balance - tarikan;
                    if (balance < tarikan) {
                        System.out.println("saldo anda tidak mencukupi");
                        lanjutTrx = false;
                    }
                    else{
                        System.out.println("Tunggu sedang dalam proses...");
                    Thread.sleep(3000);
                    System.out.println("Silahkan ambil uang anda");
                    Thread.sleep(2000);
                        System.out.println("Sisa Saldo Anda : " + "Rp."+  sisaSaldo);
                    System.out.println("Apakah ingin melanjutkan transaksi ? ");
                    System.out.println("1. Ya");
                    System.out.println("2. Tidak");
                    String trx = input.nextLine();
                    switch (trx) {
                        case "1":
                        System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                        int konfirPin = input.nextInt();
                        if (!verifyPIN(konfirPin)) {
                            System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                            lanjutTrx = false;

                        }
                        else{
                            input.nextLine();
                            lanjutTrx = true;
                            balance = sisaSaldo;
                            break ;
                        }
                        break;
                        case "2":
                        System.out.println("Terima Kasih telah menggunakan layanan kami :) ");
                        lanjutTrx = false;
                        default:
                        break;
                    }
                    
                    }
                    
                } catch (Exception e) {
                }
                break;
                default:
                break;
            }
            break;
            // Logika untuk transfer uang
            case "2":
            System.out.println("Masukkan nomor rekening tujuan : ");
            int rekTujuan = input.nextInt();
            input.nextLine();
            System.out.println("Apakah No Rek tujuan sudah benar ? ");
            System.out.println("1. YA");
            System.out.println("2. Tidak");
            String tf = input.nextLine();
            switch (tf) {
                case "1":  //transfer uang 50.000
                try {
                    System.out.println("Masukkan Jumlah yang ingin di transfer");
                    System.out.println("1. 50.000");
                    System.out.println("2. 100.000");
                    System.out.println("3. 500.000");
                    System.out.println("4. 1.000.000");
                    String doTf = input.nextLine();
                    switch (doTf) {
                        case "1":
                            try {
                                int transfer = 50000;
                            int sisaSaldoTransfer = balance - transfer;
                            System.out.println("Tunggu sedang proses Transfer...");
                            Thread.sleep(3000);
                            if (balance<transfer) {
                                System.out.println("saldo anda tidak mencukupi");
                                lanjutTrx = false;
                            }
                            else{
                                 System.out.println("Transfer berhasil dikirim ke nomor rekening " + rekTujuan + " sisa saldo anda " + "Rp."+ sisaSaldoTransfer);
                            System.out.println("Apakah ingin melanjutkan transaksi ? ");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            String trx = input.nextLine();
                             switch (trx) {
                        case "1":
                        System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                        int konfirPin = input.nextInt();
                        if (!verifyPIN(konfirPin)) {
                            System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                            lanjutTrx = false;

                        }
                        else{
                            input.nextLine();
                            lanjutTrx = true;
                            balance = sisaSaldoTransfer;
                            break ;
                        }
                        break;
                        case "2":
                        System.out.println("Terima Kasih  telah menggunakan layanan kami :)");
                        lanjutTrx = false;
                        default:
                        break;
                            }
                           
                    }
                            } catch (Exception e) {
                                
                            }
                            
                            break;
                        case "2" : // transfer 100.000
                        try {
                            int transfer = 100000;
                            int sisaSaldoTransfer = balance - transfer;
                            System.out.println("Tunggu sedang proses Transfer...");
                            Thread.sleep(3000);
                            if (balance < transfer) {
                                System.out.println("saldo anda tidak mencukupi");
                                lanjutTrx = false;
                            }
                            else{
                                 System.out.println("Transfer berhasil dikirim ke nomor rekening " + rekTujuan + " sisa saldo anda " + "Rp."+ sisaSaldoTransfer);
                            System.out.println("Apakah ingin melanjutkan transaksi ? ");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            String trx = input.nextLine();
                             switch (trx) {
                                case "1":
                                System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                                int konfirPin = input.nextInt();
                                if (!verifyPIN(konfirPin)) {
                                    System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                                    lanjutTrx = false;

                                }
                                else{
                                    input.nextLine();
                                    lanjutTrx = true;
                                    balance = sisaSaldoTransfer;
                                    break ;
                                }
                                break;
                                case "2":
                                System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                                lanjutTrx = false;
                                default:
                                break;
                            }
                            }
                           
                        } catch (Exception e) {
                            
                        }
                        break;
                        case "3" : //transfer 500.000
                        try {
                            int transfer = 500000;
                            int sisaSaldoTransfer = balance - transfer;
                            System.out.println("Tunggu sedang proses Transfer...");
                            Thread.sleep(3000);
                            if (balance < transfer) {
                                System.out.println("saldo anda tidak mencukupi");
                                lanjutTrx = false;
                            }
                            else{
                                System.out.println("Transfer berhasil dikirim ke nomor rekening " + rekTujuan + " sisa saldo anda " + "Rp."+ sisaSaldoTransfer);
                            System.out.println("Apakah ingin melanjutkan transaksi ? ");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            String trx = input.nextLine();
                             switch (trx) {
                                case "1":
                                System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                                int konfirPin = input.nextInt();
                                if (!verifyPIN(konfirPin)) {
                                    System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                                    lanjutTrx = false;

                                }
                                else{
                                    input.nextLine();
                                    lanjutTrx = true;
                                    balance = sisaSaldoTransfer;
                                    break ;
                                }
                                break;
                                case "2":
                                System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                                lanjutTrx = false;
                                default:
                                break;
                            }
                            }
                            
                        } catch (Exception e) {
                        }
                        break;
                        case "4":  //transfer 1.000.000
                        try {
                            int transfer = 1000000;
                            int sisaSaldoTransfer = balance - transfer;
                            System.out.println("Tunggu sedang proses Transfer...");
                            Thread.sleep(3000);
                            if (balance < transfer) {
                                System.out.println("saldo anda tidak mencukupi");
                            }
                            else{
                                System.out.println("Transfer berhasil dikirim ke nomor rekening " + rekTujuan + " sisa saldo anda " + "Rp."+ sisaSaldoTransfer);
                            System.out.println("Apakah ingin melanjutkan transaksi ? ");
                            System.out.println("1. Ya");
                            System.out.println("2. Tidak");
                            String trx = input.nextLine();
                             switch (trx) {
                                case "1":
                                System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                                int konfirPin = input.nextInt();
                                if (!verifyPIN(konfirPin)) {
                                    System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                                    lanjutTrx = false;
                                }
                                else{
                                    input.nextLine();
                                    lanjutTrx = true;
                                    balance = sisaSaldoTransfer;
                                    break ;
                                }
                                break;
                                case "2":
                                System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                                lanjutTrx = false;
                                default:
                                break;
                            }
                            }
                            
                        } catch (Exception e) {
                        }
                        default:
                            break;
                    }
                } 
                catch (Exception e) {
                }
                
                default:
                break;
            }
            // Logika untuk CEK SALDO
            break;
            case "3":
            try {
                System.out.println("Saldo anda " + "Rp."+ balance);
                 System.out.println("Apakah ingin melanjutkan transaksi ? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                String trx = input.nextLine();
                     switch (trx) {
                           case "1":
                             System.out.println("untuk melanjutkan transaksi silahkan masukkan pin anda terlebih dahulu : ");
                                int konfirPin = input.nextInt();
                                input.nextLine();

                                if (!verifyPIN(konfirPin)) {
                                    System.out.println("Pin Salah Transaksi gagal dilanjutkan ");
                                    lanjutTrx = false;
                                }
                                else{
                                    lanjutTrx = true;
                                }
                                break;
                                case "2":
                                System.out.println("Terima Kasih telah menggunakan layanan kami :)");
                                lanjutTrx = false;
                                break;
                                default:
                                break;
                            }

            } catch (Exception e) {
            }
            break;
            // JIKA PILIHAN KELUAR
            case "4":
            System.out.println("Terima kasih telah menggunakan layanan kami.");
            return;
            default:
            break;
        }
    }
    
}


}

//Fungsi untuk verifikasi PIN
public static  boolean verifyPIN (int enteredPIN) {
    int savedPIN =1234; //Misalkan PIN yang tersimpan adalah 1234
    return enteredPIN == savedPIN;
}
}