package controller;

import data.Student;
import data.StudentGroup;
import service.DataService;
import service.GroupStreamService;

public class StudentController extends Controller <String, Integer> {
    public StudentController(DataService groupService, GroupStreamService groupStreamService) {
        super(groupService, groupStreamService);
    }
    @Override
    public String save(Student entity) {
        return null;
    }

    @Override
    public String findById(Integer id) {
        return null;
    }

}
