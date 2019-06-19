import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * randomaccwssfile
 *
 */
public class Test13 {
    public static void main(String[] args) {

        Student s1= new Student("张三",90.5,45);
        Student s2= new Student("李四",97,49);
        RandomAccessFile rf;
        try {
            rf = new RandomAccessFile("d:"+ File.separator+"mm.txt","rw");
            try {
                //把对象写入文件
                s1.wr(rf);
                s2.wr(rf);
                //进行读取
                //首先把指针指向0
                rf.seek(0);
                for(int i =0;i<(int)rf.length();i=(int)rf.getFilePointer()){
                    Student s  = new Student();
                    s.rd(rf);
                    System.out.println(s.getName()+"\t"+s.getScore()+"\t"+s.getAge());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}

class  Student {

    private String name;
    private double score;
    private int age;

    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    public Student(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    //定义写入的方法
    public void wr(RandomAccessFile f) throws Exception {
        f.writeUTF(name);
        f.writeDouble(score);
        f.writeInt(age);
    }

    //定义读取的方法付
    public void rd(RandomAccessFile f) throws Exception {
        name = f.readUTF();
        score= f.readDouble();
        age = f.readInt();
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", score=" + score + ", age=" + age + '}';
    }
}