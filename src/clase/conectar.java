package clase;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
   
    private static Connection conn;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/licorera";

    public conectar() {
        conn=null;
        try{
            Class.forName(driver);
            conn= (Connection) DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("la conexion se establecion bien con la db");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar con la db" + e);
        }
    }
    //este metodo nos retorna la conexion
    public Connection getConnection(){
    return conn;
    }
    
    //metodo para desconctar
    public void desconectar(){
    conn = null;
    if(conn==null){
        System.out.println("se desconecto de la DB");
    }
    }
}
