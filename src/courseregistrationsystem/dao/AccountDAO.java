/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.Account;
import java.util.*;
import org.hibernate.*;

public class AccountDAO {
     public List<Account> findAll(){
         Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            return session.createCriteria(Account.class).list();
        }catch(Exception ex){
            return null;
        }finally{
            session.close();
        }
    }
     
    public Account findAccount(String username){
        Transaction trans = null;
        Account acc = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            
            trans = session.beginTransaction();
   
            acc = (Account) session.get(Account.class,username);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }finally{
            session.close();
        }
        
        return acc;
    }
    
    public boolean saveAccount(Account acc){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            
            trans = session.beginTransaction();
            session.save(acc);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean updateAccount(Account acc){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(acc);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean deleteAccount(Account acc){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            
            session.delete(acc);
            
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
    public Account checkLogin(String username, String password){
        
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();

            Account acc = (Account)session.get(Account.class, username);

            if(acc != null && acc.getPassword().equals(password)){
                return acc;
            }
        }catch(Exception e){   
        }finally{
            session.close();
        }
        return null;
    }
    
}
