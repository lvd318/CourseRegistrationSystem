
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.Student;
import java.util.*;
import org.hibernate.*;

public class StudentDAO {
    public List<Student> findAll(){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createCriteria(Student.class).list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public List<Student> findAllByClassId(String classId){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Student where classId like :classId";
            Query query = session.createQuery(hql);
            query.setParameter("classId", classId);
            
            return query.list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public Student findStudent(String studentId){
        Transaction trans = null;
        Student st = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            st = (Student) session.get(Student.class,studentId);
            
            trans.commit();
        }catch(Exception e){
            trans.rollback();
        }
        
        return st;
    }
    
    public boolean deleteStudent(Student st){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            
            session.delete(st);
            
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
       
    }
    
    public boolean saveStudent(Student st){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.save(st);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
    
    public boolean updateStudent(Student st){
        Transaction trans = null;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.update(st);
            trans.commit();
            return true;
        }catch(Exception e){
            trans.rollback();
            return false;
        }
    }
    
    public Student checkLogin(String studentId, String password){
        
        Transaction trans = null;
        
        try{
        Session session = HibernateUtil.getSessionFactory().openSession();
        trans = session.beginTransaction();
        
        Student st = (Student)session.get(Student.class, studentId);
        
        if(st != null && st.getPassword().equals(password)){
            return st;
        }
        }catch(Exception e){   
        }
        return null;
    }
}
