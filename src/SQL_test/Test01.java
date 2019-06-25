package SQL_test;

import java.sql.*;

public class Test01 {

    // 需要的驱动类，url，数据库的用户名和密码
    private static final String DBDRVIER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=UTF-8";
    private static final String DBNAME = "root";
    private static final String DBPWD = "19990722";


    static PreparedStatement  ps = null;


    // 定义一个连接数据库的方法
    static Connection con=null;
    public static Connection  getCon() {
        // 加载驱动类
        try {
            Class.forName(DBDRVIER);
            //连接数据库
            con=DriverManager.getConnection(DBURL, DBNAME, DBPWD);
            System.out.println(con);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;

    }

    static Statement st  ;
    public static void add(String name,String pwd){
        try {
             st = getCon().createStatement();
             String sql = "insert into student(name,pwd)values('"+name+"','"+pwd+"')";
             int s=st.executeUpdate(sql);
            System.out.println(s);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //更新方法
    public static void update(){
        try {
            st = getCon().createStatement();
            String sql = "update student set pwd = 'zhangsan' where name = '张三'";
            int s=st.executeUpdate(sql);
            System.out.println(s);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //删除
    public static  void delete(String name){
        try {
            st = getCon().createStatement();
            String sql = "delete from student where name='"+name+"'";
            int s=st.executeUpdate(sql);
            System.out.println(s);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void find(){
        try {
            st = getCon().createStatement();
            String sql = "select * from student;";
            ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                System.out.print("用户名:"+rs.getString(1)+"\t");
                System.out.println("\t密码:"+rs.getString(2));
            }
//            int s=st.executeUpdate(sql);
//            System.out.println(s);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        getCon();
//        add("张三","niconico");
//        add("李四","lisi");
//        add("王五","wangwu");
//        delete("李四");
        find();

    }
}


