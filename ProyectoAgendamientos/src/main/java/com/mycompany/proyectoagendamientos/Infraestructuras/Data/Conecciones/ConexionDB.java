/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoagendamientos.Infraestructuras.Data.Conecciones;

import java.sql.Connection;

/**
 *
 * @author lab217-25
 */
public class ConexionDB {
    private String UserDB;
    private String PasswordDB;
    private String Database;
    private String HostDB;
    private String portDB;
    private String url;
    
    public Connection Conexion; 
    public ConexionDB(String userDB,
                      String passwordDB,
                      String database,
                      String hostDB,
                      String portDB) {
        this.UserDB=userDB;
        this.PasswordDB=passwordDB;
        this.Database=database;
        this.HostDB=hostDB;
        this.portDB=portDB;
        this url= "jdbc:postgresql://"+this.HostDB+":"+this.portDB;
        
        public void ConectarDB(){
            Class.forName("org.postgresql.Driver");
            Conexion = DriverManager.getConnection(this.url,this.UserDB,this.PasswordDB);
            Logger.getLogger(ConexionDB.class.getName()).log(level.SEVERE,null,ex);
        }
            
    
}
    
}
