package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class homework02{

    public static void main(String[] args){
        //将F盘下面的file.txt文件拷贝到桌面
        String desPathStr = "D:\\aaa"; //目标文件地址
        String srcPathStr = "D:\\aaatest\\test.docx"; //源文件地址
        copyFile(srcPathStr, desPathStr);
    }
    /*
     * 实现文件的拷贝
     * @param srcPathStr
     *          源文件的地址信息
     * @param desPathStr
     *          目标文件的地址信息
     */
    private static void copyFile(String srcPathStr, String desPathStr) {
        //获取源文件的名称
        String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1); //目标文件地址
        System.out.println(newFileName);
        desPathStr = desPathStr + File.separator + newFileName; //源文件地址
        System.out.println(desPathStr);

        try{
            //创建输入输出流对象
            FileInputStream fis = new FileInputStream(srcPathStr);
            FileOutputStream fos = new FileOutputStream(desPathStr);

            //创建搬运工具
            byte datas[] = new byte[1024*8];
            //创建长度
            int len = 0;
            //循环读取数据
            while((len = fis.read(datas))!=-1){
                fos.write(datas,0,len);
            }
            //释放资源
            fis.close();
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}