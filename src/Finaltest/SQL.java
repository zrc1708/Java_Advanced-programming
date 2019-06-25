package Finaltest;

import java.sql.*;

public class SQL {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        //一开始必须填一个已经存在的数据库
        String url = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8";
        Connection conn = DriverManager.getConnection(url, "root", "19990722");
        Statement stat = conn.createStatement();

        //创建数据库school
        stat.executeUpdate("create database school");

        //打开创建的数据库
        stat.close();
        conn.close();
        url = "jdbc:mysql://localhost:3306/school?useUnicode=true&characterEncoding=utf-8";
        conn = DriverManager.getConnection(url, "root", "19990722");
        stat = conn.createStatement();

        //创建表user
        stat.executeUpdate("create table user(id int, name varchar(80))default charset=utf8");

        //添加数据
        stat.executeUpdate("insert into user values(1, '张三')");
        stat.executeUpdate("insert into user values(2, '李四')");

        //查询数据
        ResultSet result = stat.executeQuery("select * from user");
        while (result.next())
        {
            System.out.println(result.getInt("id") + " " + result.getString("name"));
        }

        //关闭数据库
        result.close();
        stat.close();
        conn.close();
    }
}
