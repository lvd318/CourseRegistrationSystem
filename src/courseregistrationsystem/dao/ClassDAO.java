/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.Class;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dinhp
 */
public class ClassDAO {
    public List<Class> findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            return session.createCriteria(Class.class).list();
        }catch(Exception ex){
            return null;
        }finally{
            session.close();
        }
    }
    
    public Class findClass(String classId){
        Transaction trans = null;
        Class st = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            
            st = (Class) session.get(Class.class,classId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }finally{
            session.close();
        }
        
        return st;
    }
    
    public boolean deleteClass(Class cs){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            
            session.delete(cs);
            
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
       
    }
    
    public boolean saveClass(Class cs){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(cs);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean updateClass(Class cs){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(cs);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
    }
}
