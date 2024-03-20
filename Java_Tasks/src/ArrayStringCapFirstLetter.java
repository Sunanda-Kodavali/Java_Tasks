public class ArrayStringCapFirstLetter {
    public static void main(String[] args) {
        String[] arr = {"paris", "london", "madrid" };
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ");
    }
}
