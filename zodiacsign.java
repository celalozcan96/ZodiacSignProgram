package ZodiacSignProgram;

import java.util.Scanner;

//Koç Burcu : 21 Mart - 20 Nisan

//Boğa Burcu : 21 Nisan - 21 Mayıs

//İkizler Burcu : 22 Mayıs - 22 Haziran

//Yengeç Burcu : 23 Haziran - 22 Temmuz

//Aslan Burcu : 23 Temmuz - 22 Ağustos

//Başak Burcu : 23 Ağustos - 22 Eylül

//Terazi Burcu : 23 Eylül - 22 Ekim

//Akrep Burcu : 23 Ekim - 21 Kasım

//Yay Burcu : 22 Kasım - 21 Aralık

//Oğlak Burcu : 22 Aralık - 21 Ocak

//Kova Burcu : 22 Ocak - 19 Şubat

//Balık Burcu : 20 Şubat - 20 Mart

//Ödev
//Aynı örneği switch-case kullanmadan yapınız

public class zodiacsign {
    public static void main(String[] args) {

        int month,day;

        Scanner sign = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay :");
        month = sign.nextInt();

        System.out.print("Doğduğunuz Gün :");
        day = sign.nextInt();

        if(month == 1){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    System.out.println("Oğlak Burcusunuz!");

                }else{
                    System.out.println("Kova Burcusunuz!");
                }

            }

        }else if(month == 2){
            if(day >= 1 && day <= 28){
                if(day < 20){
                    System.out.println("Kova Burcusunuz!");

                }else{
                    System.out.println("Balık Burcusunuz!");
                }

            }

        }else if(month == 3){
            if(day >= 1 && day <= 31 ){
                if(day < 21){
                    System.out.println("Balık Burcusunuz!");

                }else{
                    System.out.println("Koç Burcusunuz!");
                }

            }

        }else if(month == 4){
            if(day >= 1 && day <= 30){
                if(day < 21){
                    System.out.println("Koç Burcusunuz!");

                }else{
                    System.out.println("Boğa Burcusunuz!");
                }

            }

        }else if(month == 5){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    System.out.println("Boğa Burcusunuz!");

                }else{
                    System.out.println("İkizler Burcusunuz!");
                }

            }

        }else if(month == 6){
            if(day >= 1 && day <= 30){
                if(day < 23){
                    System.out.println("İkizler Burcusunuz!");

                }else{
                    System.out.println("Yengeç Burcusunuz!");
                }

            }

        }else if(month == 7){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    System.out.println("Yengeç Burcusunuz!");

                }else{
                    System.out.println("Aslan Burcusunuz!");
                }

            }

        }else if(month == 8){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    System.out.println("Aslan Burcusunuz!");

                }else{
                    System.out.println("Başak Burcusunuz!");
                }

            }

        }else if(month == 9){
            if(day >= 1 && day <= 30){
                if(day < 23){
                    System.out.println("Başak Burcusunuz!");

                }else{
                    System.out.println("Terazi Burcusunuz!");
                }

            }

        }else if(month == 10){
            if(day >= 1 && day <= 31){
                if(day < 23){
                    System.out.println("Terazi Burcusunuz!");

                }else{
                    System.out.println("Akrep Burcusunuz!");
                }

            }

        }else if(month == 11){
            if(day >= 1 && day <= 30){
                if(day < 22){
                    System.out.println("Akrep Burcusunuz!");

                }else{
                    System.out.println("Yay Burcusunuz!");
                }

            }

        }else if(month == 12){
            if(day >= 1 && day <= 31){
                if(day < 22){
                    System.out.println("Yay Burcusunuz!");

                }else{
                    System.out.println("Oğlak Burcusunuz!");
                }

            }

        }
        
    }
    
}
