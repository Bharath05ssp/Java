import java.util.*;
class Frequency{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;arr[i++]=s.nextInt());
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int freq[]=new int[max+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<=max;i++){
            if(freq[i]>0)
                System.out.println(i+" "+freq[i]);
        }
        s.close();                                          
    }
}
