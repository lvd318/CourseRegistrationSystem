/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.*;
import java.util.*;
import org.hibernate.*;

public class StudentCourseDAO {
    public List<StudentCourse> findAll(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createCriteria(StudentCourse.class).list();
        }catch(Exception ex){
            return null;
        }
    }
    
    
    public StudentCourse findStudentCourse(StudentCourseId studentCourseId){
        Transaction trans = null;
        StudentCourse st = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            st = (StudentCourse) session.get(StudentCourse.class,studentCourseId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }
        
        return st;
    }
    
    public boolean deleteStudentCourse(StudentCourse sb){
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
    
    public boolean saveStudentCourse(StudentCourse sb){
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
    
    public boolean updateStudentCourse(StudentCourse sb){
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
