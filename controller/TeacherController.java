package controller;

import controller.Controller;
import data.Student;
import data.StudentGroup;
import data.Teacher;
import service.DataService;
import service.GroupStreamService;

public class StudentController extends Controller<String, Integer> {
    public StudentController(DataService groupService, GroupStreamService groupStreamService) {
        super(groupService, groupStreamService);
    }
    @Override
    public String save(Teacher entity) {
        return null;
    }

    @Override
    public String findById(Integer id) {
        return null;
    }

}