package courseregistrationsystem.entity;
// Generated May 18, 2021 7:59:37 PM by Hibernate Tools 4.3.1



/**
 * Class generated by hbm2java
 */
public class Class  implements java.io.Serializable {


     private String classId;
     private Integer total;
     private Integer totalMales;
     private Integer totalFemales;

    public Class() {
    }

	
    public Class(String classId) {
        this.classId = classId;
    }
    public Class(String classId, Integer total, Integer totalMales, Integer totalFemales) {
       this.classId = classId;
       this.total = total;
       this.totalMales = totalMales;
       this.totalFemales = totalFemales;
    }
   
    public String getClassId() {
        return this.classId;
    }
    
    public void setClassId(String classId) {
        this.classId = classId;
    }
    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }
    public Integer getTotalMales() {
        return this.totalMales;
    }
    
    public void setTotalMales(Integer totalMales) {
        this.totalMales = totalMales;
    }
    public Integer getTotalFemales() {
        return this.totalFemales;
    }
    
    public void setTotalFemales(Integer totalFemales) {
        this.totalFemales = totalFemales;
    }




}


