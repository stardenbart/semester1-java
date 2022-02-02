import java.util.Scanner;
public class UjianTengahSemesterDraft {
    public static void main(String[] args) {
        boolean islanjut = true;
        int positif = 0;
        int negatif = 0;
        int jumlah = 0;
        double summary = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");

        while(islanjut){
            int nilai = input.nextInt();
            if(nilai == 0) {
                if (jumlah == 0){
                    System.out.println("No numbers entered except 0.");
            }
                islanjut = false;
            }if(nilai > 0){
                summary += nilai;
                positif++;
                jumlah++;
            }else{
                summary += nilai;
                negatif++;
                jumlah++;
            }
        }
        System.out.println("The number of positives is " + positif);
        System.out.println("The number of negatives is " + negatif);
        System.out.println("The total is " + summary);
        System.out.println("The avarage is " + (summary/jumlah));

        input.close();
    }
}
