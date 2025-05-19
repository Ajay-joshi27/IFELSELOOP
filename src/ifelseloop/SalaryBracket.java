public class SalaryBracket {
public static void main(String[] args) {
    int sal=500000;
    if (sal>=0 && sal<=300000) {
        System.out.println("entry level");
}
 else if(sal>=300001 && sal<=600000)
  {
        System.out.println("mid-carrer");
    }
    else if(sal>=600001 && sal<=1000000) 
    {
        System.out.println("senior");
    }
    else if(sal>=1000001 ) 
    {
        System.out.println("Executive");
    }
}
}
