public class App {
    public static void main(String[] args) throws Exception {
        int[] a = new int[5];
        
        int n = 0;
        a[0] = 40;
        a[1] = 58;
        a[2] = 41;
        a[3] = 96;
        a[4] = 39;

        int min = a[0];
        for(n = 0; n < a.length; n++){
            if (min <= a[n]){
                // min = min;
            } else{
                min = a[n];
            }
        }

        System.out.println(min);
    }
}
