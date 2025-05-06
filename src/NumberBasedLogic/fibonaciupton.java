package NumberBasedLogic;
//. Print Fibonacci series up to N terms
//0 1 1 2 3 5 8 13
public class fibonaciupton {
    public static void main(String[] args) {
       int n=10;
       int[] arr =new int[n];
arr[0]=0;
arr[1]=1;
       for (int i = 2; i < n; i++) {
             arr[i]=arr[i-1]+ arr[i-2];
       
       }
       for (int i =n-1; i>=0; i--) {
        System.out.println(arr[i]+" ");
        
       }
    }

}
