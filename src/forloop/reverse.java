package forloop;

public class reverse 
{
    public static void main(String[] args)
    {
        int num=-1234;
        int original=num;  
        int reverse=0;
        if (num<0)
        {
           num=-num;
        }
       // System.out.println(num);
        if (num>0) 
        {
            for(int i =0;num>0;i++)
            {
                int digit=num%10;      //  1234%10=4
                reverse=(reverse*10)+digit;
                num=num/10;
            }
            if (original<0) {
                reverse=-reverse;
            }
            System.out.println(reverse);
            
        }
    }
    }


