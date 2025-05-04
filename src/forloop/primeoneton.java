package forloop;

public class primeoneton {
    public static void main(String[] args) {
        int num=100;
       int count=0;
        for (int i =2; i<num; i++) {
            int dvcount=0;
            for (int j =1; j <=i; j++) {
                if (i%j==0) {
                    dvcount++;
                }
            
            }
            if (dvcount==2) {
                System.out.println(i);
                count++;
            }
        }
      System.out.println(count);
    }
}
