import java.io.*;

public class Test17 {
    //数据流 结合字节流
    public static void main(String[] args) {
        String path = "d:"+ File.separator+"kk.txt";
        try {
            OutputStream out  = new FileOutputStream(path);
            //将字节流进行
            DataOutputStream dos = new DataOutputStream(out);
            String names[] = {"衬衣","手套","袜子"};//名称
            float f[] =  {34.5f,56.7f,67.5f};//价格
            int num[] = {2,3,4};//数量
            for(int i=0;i<names.length;i++){
                try {
                    dos.writeChars(names[i]);//写入名字
                    dos.writeChars("\t");//写入分割符
                    dos.writeFloat(f[i]);
                    dos.writeChars("\t");
                    dos.writeInt(num[i]);
                    dos.writeChars("\t");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        //读取内容
        try {
            InputStream in = new FileInputStream(path);
            DataInputStream din= new DataInputStream(in);
            //接受名称
            String name =null;
            //接收价格
            float price = 0.0f;
            //接收数量
            int num = 0;
            //接收字符串
            char temp[]= null;
            //自定义字符变量
            char c='0';
            int len=0;
            try {
                while (true){
                    //读到内存
                    temp = new char[200];
                    len = 0;
                    while ((c=din.readChar())!='\t'){
                        temp[len]=c;//先接收内容
                        len++;
                    }
                    //将字符数组变为字符串
                    name = new String(temp,0,len);
                    //读取价格
                    price  = din.readFloat();
                    //分割
                    din.readChar();
                    //读取数量
                    num = din.readInt();
                    //读取分割符
                    din.readChar();
                    System.out.printf("===名称:%s，价格:%s，数量:%s===\n",name,price,num);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
