public class RoundedNO {
    //Program to Round a Number to n Decimal Places/////Input....1.34678----OutPut.....1.35

    public static void main(String[] args) {

        float n =  1.34678f;

        int temp  = (int)(n * 1000);// 1346
        int r = temp % 10;/// 1346 % 10...
        if(r >=5)
        {
            temp = (temp / 10) + 1;//1346/10 === 134 +1
        }
        n = temp / 100.0f;// === 135 / 100.0 ===== 1.35

        System.out.println("Result...."+n);
        // 1.35

    }

}


