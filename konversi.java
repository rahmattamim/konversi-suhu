import java.util.Scanner;
public class konversi {
    
    static Scanner inputData = new Scanner (System.in);

    //deklerasikan rumus yang ingin di pakai
    //Class Celcius
    public static double c_to_f(double celcius){
        double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
        
    }
    public static double c_to_k(double celcius){
        double kelvin = celcius + 273.15;
        return kelvin;
        
    }
    public static double c_to_r(double celcius){
        double reaumur =  celcius * 4/5;
        return reaumur;
        
    }
    
    //Class Fahrenheit
    public static double f_to_c(double fahrenheit){
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius;
    }
    public static double f_to_k(double fahrenheit){
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        return kelvin;
    }
    public static double f_to_r(double fahrenheit){
        double reaumur = (fahrenheit-32) * 4/9;
        return reaumur;
    }
    
    //Class Kelvin
    public static double k_to_c(double kelvin){
        double celcius = kelvin - 273.15;
        return celcius;
    }
    public static double k_to_f(double kelvin){
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        return fahrenheit;
    }
    public static double k_to_r(double kelvin){
        double reaumur = (kelvin-273) * 4/5 ;
        return reaumur;
    }
    //Class Reaumur
    public static double r_to_c(double reaumur){
        double celcius = reaumur * 1.25;
        return celcius;
    }
    public static double r_to_f(double reaumur){
        double fahrenheit = (reaumur * 2.25) + 32;
        return fahrenheit;
    }
    public static double r_to_k(double reaumur){
        double kelvin = (reaumur * 1.25) + 273.15;
        return kelvin;
    }
    
    // untuk meminta user untuk memasukan suhu yang ingin di konversi
    public static double input(String word){
        System.out.println("Masukkan Nilai " + word +": ");
        return inputData.nextDouble();
    }
    
    
    
    public static void main(String[] args) {
        do{
            System.out.println("=========================");
            System.out.println("      KONVERSI SUHU      ");
            System.out.println("=========================");
            System.out.println("1. Celcius Ke Fahrenheit\n2. Celcius Ke Kelvin\n3. Celcius Ke Reaumur\n4. Fahrenheit Ke Celcius\n5. Fahrenheit Ke Kelvin\n6. Fahrenheit Ke Reaumur\n7. Kelvin Ke Celcius\n8. Kelvin Ke Fahrenheit\n9. Kelvin Ke Reaumur\n10.Reaumur Ke Celcius\n11.Reaumur Ke Fahrenheit\n12.Reaumur Ke Kelvin");
            System.out.println("=========================");
            //Menerima Input dari user
            System.out.println("Pilih Nomor Operasi yang ingin di gunakan : ");

            int pilihan = inputData.nextInt();
            
            double inputSuhu;
            double hasilKonversi;

        
                switch (pilihan) {
                    //Case Celcius
                    case 1:
                    inputSuhu = input("Celcius");
                    hasilKonversi = c_to_f(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Fahrenheit");
                    break;
                    
                    case 2:
                    inputSuhu = input("Celcius");
                    hasilKonversi = c_to_k(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Kelvin");
                    break;

                    case 3:
                    inputSuhu = input("Celcius");
                    hasilKonversi = c_to_r(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Reaumur");
                    break;
                    
                    //Case Fahrenheit
                    case 4:
                    inputSuhu = input("Fahrenhiet");
                    hasilKonversi = f_to_c(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Celcius");
                    break;
                    
                    case 5:
                    inputSuhu = input("Fahrenhiet");
                    hasilKonversi = f_to_k(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Kelvin");
                    break;
                    
                    case 6:
                    inputSuhu = input("Fahrenhiet");
                    hasilKonversi = f_to_r(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Reaumur");
                    break;

                    //Case Kelvin
                    case 7:
                    inputSuhu = input("Kelvin");
                    hasilKonversi = k_to_c(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Celcius");
                    break;
                    case 8:
                    inputSuhu = input("Kelvin");
                    hasilKonversi = k_to_f(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Fahrenheit");
                    break;
                    
                    case 9:
                    inputSuhu = input("Kelvin");
                    hasilKonversi = k_to_r(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Reaumur");
                    break;
                    
                    //Case Reaumur
                    case 10:
                    inputSuhu = input("Reaumur");
                    hasilKonversi = r_to_c(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Celcius");
                    break;
                    
                    case 11:
                    inputSuhu = input("Reaumur");
                    hasilKonversi = r_to_f(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Fahrenheit");
                    break;
                    
                    case 12:
                    inputSuhu = input("Reaumur");
                    hasilKonversi = r_to_k(inputSuhu);
                    System.out.println("Hasil Konversi : "+hasilKonversi+" Kelvin");
                    break;
                    
                    default:
                    System.out.println("Pilihan yang di masukkan tidak ada. Ulangi kembali!");
                    break;
                }

                //untuk mencari operasi konversi lagi yang user mau
                System.out.println("Apakah Anda ingin melanjutkan? (y/n)");
                String isContinue = inputData.next();
                if (isContinue.equals("n")) {
                    System.out.println("Program Berakhir");
                break; 
                }
                
        } while (true);
        inputData.close();

              
    } 


}
