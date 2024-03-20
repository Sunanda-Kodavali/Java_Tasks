public class repeatPlus {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            for (int j = 1; j <= i; j++) System.out.print("+"+" ");
            System.out.println();
            i++;
        }
    }
}
