import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int length=String.valueOf(n).length();
        int arm=0;
        int temp=n;
        while(n!=0){
            
            int l=n%10;
            arm += Math.pow(l, length);
            n /= 10;
        }
            if(temp==arm){
            System.out.print("armstrong");
        }
        else{
            System.out.print("not armstrong");
        }    

    }
}