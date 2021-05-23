/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.Subject;
import java.util.*;
import org.hibernate.*;

public class SubjectDAO {
    public List<Subject> findAll(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createCriteria(Subject.class).list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public List<Subject> findAllBySubjectId(String subjectId){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Subject where subjectId like :subjectId";
            Query query = session.createQuery(hql);
            query.setParameter("subjectId", subjectId);
            
            return query.list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public Subject findSubject(String subjectId){
        Transaction trans = null;
        Subject st = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            st = (Subject) session.get(Subject.class,subjectId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }
        
        return st;
    }
    
    public boolean deleteSubject(Subject sb){
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
    
    public boolean saveSubject(Subject sb){
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
    
    public boolean updateSubject(Subject sb){
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
