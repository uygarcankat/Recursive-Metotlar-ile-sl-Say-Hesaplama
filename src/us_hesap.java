import java.util.Scanner;

public class us_hesap {

    static int ust_hesap (int taban,int ust)

    {

        if (ust==0 ){

            return 1;
        }

       int result =ust_hesap(taban,ust-1) * taban;

            return result;
    }


    public static void main(String[] args) {

        int taban = 0 , ust = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Taban değeri giriniz :");
        taban= input.nextInt();
        System.out.println("Lütfen Ust değeri giriniz :");
        ust= input.nextInt();

        ust_hesap(taban,ust);

        System.out.println(ust_hesap(taban,ust));

    }
}
