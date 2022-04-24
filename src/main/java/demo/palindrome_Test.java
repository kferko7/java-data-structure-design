package demo;

public class palindrome_Test {

    public static void main(String[] args) {

        //int num= 454;
        int num= 321;
        int temp= num;

        int rev=0;
        while(num>0);
        {
            int d = num%10;
            rev= rev*10 + d;
            num= num/10;

        }
        if(temp==rev)
        {
            System.out.println(temp+ " is Palindrome");
        }
        else{
            System.out.println(temp+ " is not Palindrome");
        }
    }
}
