/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinsolusione.spring.core;

/**
 *
 * @author vckev
 */
public class Database {
    private static Database database;
    
    private Database() {
        
    }
    
    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }
    
}
