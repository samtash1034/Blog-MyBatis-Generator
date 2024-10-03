package com.sam.blog.mybatisgenerator.mapper;

import com.sam.blog.mybatisgenerator.model.CourseModel;
import java.util.List;

public interface CourseModelMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(CourseModel row);

    CourseModel selectByPrimaryKey(Integer courseId);

    List<CourseModel> selectAll();

    int updateByPrimaryKey(CourseModel row);
}