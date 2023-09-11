

import java.util.ArrayList;
import java.util.List;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;


public class App {
    public static void main(String[] args) throws Exception {
       
        StudentRepository repo = new StudentRepository();
       
        /*
        StudentEntity  entity = new StudentEntity();
        entity.setNic("921676767V");
        StudentName studentName = new StudentName("Stu 5", "stu Last 5");
        entity.setName(studentName);
        List<String> mobiles = new ArrayList<>();
        mobiles.add("0772346745");
        mobiles.add("0712782345");
        entity.setMobiles(mobiles);
        repo.saveStudent(entity);
         */

        StudentEntity studentEntity = repo.getStudent(3);
        System.out.println(studentEntity.toString());
        
        studentEntity.setNic("899879789V");
        studentEntity.getName().setFirstName("stu 3");
        studentEntity.getName().setLastName("stu Last 3");
        
        repo.updateStudent(studentEntity);

        studentEntity = repo.getStudent(3);
        System.out.println(studentEntity.toString());

        
        repo.deleteStudent(studentEntity);

    }
}
