/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package islingtonsummerclass2022c4;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 *
 * @author rayandongol
 */
public class DatabaseConnectivity 
{
    public static java.sql.Connection connectDB() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        java.sql.Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/IslingtonCollegeC4","root","");
        return con;
    }
}
