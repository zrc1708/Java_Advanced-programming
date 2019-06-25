package Login;

import java.sql.*;

public class SQL {
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
            con= DriverManager.getConnection(DBURL, DBNAME, DBPWD);
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
            String sql = "insert into student(name,pwd)values(?,?)";
            ps = getCon().prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,pwd);
            int s = ps.executeUpdate();
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
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public boolean findname(String name,String pwd){
        try {
            String sql = "select * from student where name = ? and pwd = ?";
            ps = getCon().prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,pwd);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

//    public String registered(String name,String pwd){
//        try {
//            String sql = "select * from user where name = ? ";
//            ps = getCon().prepareStatement(sql);
//            ps.setString(1,name);
//            ResultSet rs =ps.executeQuery();
//            if(rs.next()){
//                return "用户已存在";
//            }else{
//                String add = "insert into user(name,pwd)values(?,?)";
//                ps = getCon().prepareStatement(add);
//                ps.setString(1,name);
//                ps.setString(2,pwd);
//                ps.executeUpdate();
//                return "注册成功";
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        return  "";
//    }

}
