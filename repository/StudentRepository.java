//- Создать класc StudentRepository имплементировав интерфейс UserRepository

package repository;

import data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {


    @Override
    public void save(Student entity) {

    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
    @Override
    public Student findByFio(String fio) {
        return null;
    }

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Object findById(Object id) {
        return null;
    }
}
