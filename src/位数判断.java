public class 位数判断 {
    public static int  weishu(int x){
        int i =0;
        while (x>0){
            x=x/10;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(weishu(100));
    }
}
