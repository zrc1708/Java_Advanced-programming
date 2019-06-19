
class MyException extends Exception{    //创建自定义异常，继承exception类
    public MyException(String ErrorMessage){   //构造方法
        super(ErrorMessage);                   //父类构造方法
    }

}

public class 自定义异常处理 {

  static  int avg(int number1,int number2)throws MyException{
      if(number1>110){
          throw new MyException("发生了错误");
      }

      if(number1<0||number2<0){
          throw  new MyException("不可使用负数");
      }
      if(number1>100||number2>100){
          throw  new MyException("数值过大");
      }
      return (number1+number2)/2;
  }

    public static void main(String[] args) {
        try {
            int result = avg(150,10);
            System.out.println(result);
        }catch (MyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
