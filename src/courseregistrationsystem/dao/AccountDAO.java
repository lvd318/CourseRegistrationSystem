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
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createCriteria(Account.class).list();
        }catch(Exception ex){
            return null;
        }
    }
     
    public Account findAccount(String username){
        Transaction trans = null;
        Account acc = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            acc = (Account) session.get(Account.class,username);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }
        
        return acc;
    }
    
    public boolean saveAccount(Account acc){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.save(acc);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
    
    public boolean updateAccount(Account acc){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.update(acc);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
    
    public boolean deleteAccount(Account acc){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            session.delete(acc);
            
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
    
    
}
