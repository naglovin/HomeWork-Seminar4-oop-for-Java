//Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User

package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;

public interface DataService<T, User> {
    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    public default <T extends User> void method() {
    }
}
