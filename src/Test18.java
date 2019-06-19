public class Test18 {
    class Account{
        double money;
        String passsword;
        int number;
        String name;
        char sex;

        public Account(double money, String passsword, int number, String name, char sex) {
            this.money = money;
            this.passsword = passsword;
            this.number = number;
            this.name = name;
            this.sex = sex;
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
    }

    public static void main(String[] args) {

    }
    }
