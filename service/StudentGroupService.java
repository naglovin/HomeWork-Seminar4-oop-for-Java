package service;

import data.GroupStream;
import data.StudentGroup;

import java.util.List;

public interface StudentGroupService {

    StudentGroup getGroup(int number);

    StudentGroup getGroup();

    void removeStudent(String firstName, String lastName);

    void sortStudents(StudentGroup studentGroup);
}
