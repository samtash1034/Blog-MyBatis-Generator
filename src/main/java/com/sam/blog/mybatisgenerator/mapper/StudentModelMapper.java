package com.sam.blog.mybatisgenerator.mapper;

import com.sam.blog.mybatisgenerator.model.StudentModel;
import java.util.List;

public interface StudentModelMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentModel row);

    StudentModel selectByPrimaryKey(Integer studentId);

    List<StudentModel> selectAll();

    int updateByPrimaryKey(StudentModel row);
}