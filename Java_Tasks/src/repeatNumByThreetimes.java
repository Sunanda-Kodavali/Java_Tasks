import java.util.Scanner;

public class repeatNumByThreetimes {
    public static void main(String[] args) {
        /*int i=1;
        while(i<=4){
            for (int j = 0; j < 3; j++) System.out.print(i+" ");
            i++;
        }*/
        for (int x = 1; x <= 4; x++) System.out.print(String.valueOf(x).repeat(3).replace(""," "));
    }
}
