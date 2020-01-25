/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import com.mongodb.*;
import java.net.UnknownHostException;
/**
 *
 * @author Abhishek
 */
public class Connect {
    public DBCollection connectAccount()
        { 
        try
            {
            MongoClient m1 = new MongoClient("localhost",27017);    //Connect To Server
            DB db1 = m1.getDB("Database");                               //Connect To Database
            DBCollection dbc = db1.getCollection("Account");   //Connect To Collection
            return dbc;
        }
        catch(Exception e)
            {
             System.out.println("Exception Caught!!");
             return null;
            }
        }
    
    public DBCollection connectRegion()
        { 
        try
            {
            MongoClient m1 = new MongoClient("localhost",27017);    //Connect To Server
            DB db1 = m1.getDB("Database");                               //Connect To Database
            DBCollection dbc = db1.getCollection("Region");   //Connect To Collection
            return dbc;
        }
        catch(Exception e)
            {
             System.out.println("Exception Caught!!");
             return null;
            }
        }
    
    public DBCollection connectStreet(String selected)
        { 
        try
            {
            MongoClient m1 = new MongoClient("localhost",27017);    //Connect To Server
            DB db1 = m1.getDB("Database");                               //Connect To Database
            DBCollection dbc = db1.getCollection(selected);   //Connect To Collection
            return dbc;
        }
        catch(Exception e)
            {
             System.out.println("Exception Caught!!");
             return null;
            }
        }
    
    public DBCollection connectDriver()
        { 
        try
            {
            MongoClient m1 = new MongoClient("localhost",27017);    //Connect To Server
            DB db1 = m1.getDB("Database");                               //Connect To Database
            DBCollection dbc = db1.getCollection("Driver");   //Connect To Collection
            return dbc;
        }
        catch(Exception e)
            {
             System.out.println("Exception Caught!!");
             return null;
            }
        }
    
    public DBCollection connectRent()
        { 
        try
            {
            MongoClient m1 = new MongoClient("localhost",27017);    //Connect To Server
            DB db1 = m1.getDB("Database");                               //Connect To Database
            DBCollection dbc = db1.getCollection("Rent");   //Connect To Collection
            return dbc;
        }
        catch(Exception e)
            {
             System.out.println("Exception Caught!!");
             return null;
            }
        }
    
    public DBCollection connectPool()
        { 
        try
            {
            MongoClient m1 = new MongoClient("localhost",27017);    //Connect To Server
            DB db1 = m1.getDB("Database");                               //Connect To Database
            DBCollection dbc = db1.getCollection("Pool");   //Connect To Collection
            return dbc;
        }
        catch(Exception e)
            {
             System.out.println("Exception Caught!!");
             return null;
            }
        }
    
}
