
package courseregistrationsystem.dao;

import courseregistrationsystem.entity.Student;
import java.util.*;
import org.hibernate.*;

public class StudentDAO {
    private final SessionFactory sf = HibernateUtil.getSessionFactory();
    
    public List<Student> findAdd(){
        try{
            sf.getCurrentSession().beginTransaction();
            return sf.getCurrentSession().createCriteria(Student.class).list();
        }catch(Exception ex){
            return null;
        }
    }
    
    public Student find(String studentId){
        try{
            sf.getCurrentSession().beginTransaction();
            return (Student)sf.getCurrentSession().get(Student.class, studentId);
        }catch (Exception ex){
            return null;
        }
    }
    
    public boolean delete(Student st){
        try{
            sf.getCurrentSession().beginTransaction();
            //Delete
            sf.getCurrentSession().delete(st);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }catch(Exception e){
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    
    public boolean saveOrUpdate(Student st){
        try{
            sf.getCurrentSession().beginTransaction();
            //Save or Update
            
            sf.getCurrentSession().saveOrUpdate(st);
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }catch(Exception e){
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
    
    public boolean resetPassWord(Student st){
        try{
            sf.getCurrentSession().beginTransaction();
            //Save or Update
            
            
            sf.getCurrentSession().getTransaction().commit();
            return true;
        }catch(Exception e){
            sf.getCurrentSession().getTransaction().rollback();
            return false;
        }
    }
}
