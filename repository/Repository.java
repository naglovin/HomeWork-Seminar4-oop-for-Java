//Создать пекедж repository. Дальнейшие работы ведем в нем
//        - Реализовать в нем интерфейс Repository<E,I>
//- Задать в созданном интерфейсе 2 абстрактных метода:
//        E save(E entity)
//        E findById (I id)
//        - Создать класс GroupRepository, имплементировав его от Repository
//- Создать класс GroupRepository имплементировав его от Repository<Group, Integer>
package repository;

public interface Repository <E, I>{
    E save(E entity);   //дженерики
    E findById (I id);  // дженерики
}
