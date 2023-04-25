public class Binary {
    public static void main(String[] args) {
        int m = 43;
        int n = m;
        String s = "";
        while (n!=0){
            if(n%2==1){
                s = "1" + s;
            }else{
                s = "0" + s;
            }
            n= n/2;
        }

        System.out.println(s);
    }
}
