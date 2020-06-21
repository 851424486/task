import java.math.BigDecimal;

public class Fibonacci {
    public static void main(String[] args){
        for(int i=1;i<=200;i++){
            System.out.println("Fibonacci.of("+i+")="+Fibonacci.of(i).toString());
        }
    }

    public static BigDecimal of(int input){
        BigDecimal first=new BigDecimal(1);
        BigDecimal second=new BigDecimal(1);
        if(input==1){
            return new BigDecimal(1);
        }else if(input==2){
            return new BigDecimal(1);
        }else{
            for(int i=0;i<input-2;i++){
                BigDecimal third=first.add(second);
                first=second;
                second=third;
            }
            return second;
        }
    }

}
