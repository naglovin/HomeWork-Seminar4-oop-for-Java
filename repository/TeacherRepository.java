//Реализовать класc TeacherRepository


package repository;

import data.Student;
import data.Teacher;

public class TeacherRepository implements UserRepository<Teacher, Integer> {

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Object findById(Object id) {
        return null;
    }

    @Override
    public void save(Student entity) {

    }

    @Override
    public Teacher findByFio(String fio) {
        return null;
    }
}
