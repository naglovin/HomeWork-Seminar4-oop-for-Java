//- Создать интерфейс UserRepository<U extends User,I> унаследовав его от Repository<E, I>
 //       - В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio (String fio)

package repository;

import data.Student;
import data.User;

public interface UserRepository <E extends User, I> extends Repository {
    void save(Student entity);

    E findByFio(String fio);
}
