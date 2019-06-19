package homework;



public class java基础作业1 {

    public static void main(String[] args) {
        try {
            Account one = new Account(182.5,"12asddd",12345,"张三",'男');
        }catch (MyException e){
            System.out.println("错误原因:"+e.getMessage());
            e.printStackTrace();
        }

    }

}
    class MyException extends Exception{
        public MyException(String message) {
            super(message);
        }
    }


class Account{

    private double money;
    private String passsword;
    private int number;
    private String name;
    private char sex;

    public Account(double money, String passsword, int number, String name, char sex) throws MyException {
        this.money = money;
        this.passsword = passsword;
        this.number = number;
        this.name = name;
        this.sex = sex;

        if (this.passsword.length()<=3||this.passsword.length()>=6){
            throw new MyException("密码长度不对");
        }
        if(weishu(this.number)!=5){
            throw new MyException("账户号码不对");
        }
        if(this.name.length()>5){
            throw new MyException("名字不对");
        }
        if(this.sex!='男'&&this.sex!='女'){
            throw new MyException("性别不对");
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "money=" + money + ", passsword='" + passsword + '\'' + ", number=" + number + ", name='" + name + '\'' + ", sex=" + sex;
    }

    public static int weishu(int x){
        int i =0;
        while (x>0){
            x=x/10;
            i++;
        }
        return i;
    }
}