import java.util.*;
public class _1_R4_Pattern.Java {
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int star=1;
        int row=1;
        while(row<=n){
            //star
            int i=1;
            while(i<=star){
                System.out.print("*");
                i++;
            }
            //next row
            System.out.println();
            row++;
            star++;
        }

    }
}
