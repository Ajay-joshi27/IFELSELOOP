package NumberBasedLogic;

public class perfectnumber {
       
    public static void main(String[] args) {
     int number=11;
       int count=0;
       for(int i=1;i<number;i++){
       if(number% i ==0){ 
        count++;
       }}
       if(count==2){
        System.out.print("it is prime");
       }
            
        }

    }


