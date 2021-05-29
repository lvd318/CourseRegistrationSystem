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
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createCriteria(Course.class).list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public List<Course> findAllByCourseId(String subjectId){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Course where subjectId like :subjectId";
            Query query = session.createQuery(hql);
            query.setParameter("subjectId", subjectId);
            
            return query.list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public Course findCourse(int courseId){
        Transaction trans = null;
        Course st = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            st = (Course) session.get(Course.class,courseId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }
        
        return st;
    }
    
    public boolean deleteCourse(Course sb){
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
    
    public boolean saveCourse(Course sb){
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
    
    public boolean updateCourse(Course sb){
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
