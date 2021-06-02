/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.Course;
import java.util.*;
import org.hibernate.*;

public class CourseDAO {
    public List<Course> findAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            return session.createCriteria(Course.class).list();
        }catch(Exception ex){
            return null;
        }finally{
            session.close();
        }
    }
    
    public List<Course> findAllByCourseId(String subjectId){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            String hql = "from Course where subjectId like :subjectId";
            Query query = session.createQuery(hql);
            query.setParameter("subjectId", subjectId);
            
            return query.list();
        }catch(Exception ex){
            return null;
        }finally{
            session.close();
        }
    }
    
    public Course findCourse(int courseId){
        Transaction trans = null;
        Course st = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            
            st = (Course) session.get(Course.class,courseId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }finally{
            session.close();
        }
        
        return st;
    }
    
    public boolean deleteCourse(Course sb){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            
            session.delete(sb);
            
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
       
    }
    
    public boolean saveCourse(Course sb){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(sb);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }finally{
            session.close();
        }
    }
    
    public boolean updateCourse(Course sb){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(sb);
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
