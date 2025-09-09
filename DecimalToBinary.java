public class DecimalToBinary {
    public static void decimalToBinary(int n)
    {
        String str="";
        while(n>0)
        {
            int mod=n%2;
            n=n/2;
            str=mod+str;

        }
        System.out.println(str);

    }
    public static void main(String[] args) {
        decimalToBinary(13);
    }
    
}
