/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.*;
import java.util.*;
import org.hibernate.*;

public class SemesterDAO {
    public List<Semester> findAll(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createCriteria(Semester.class).list();
        }catch(Exception ex){
            return null;
        }
    }
    
    
    public Semester findSemester(SemesterId semesterId){
        Transaction trans = null;
        Semester st = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            st = (Semester) session.get(Semester.class,semesterId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }
        
        return st;
    }
    
    public boolean deleteSemester(Semester sb){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            session.delete(sb);
            
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
       
    }
    
    public boolean saveSemester(Semester sb){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.save(sb);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
    
    public boolean updateSemester(Semester sb){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.update(sb);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
}
