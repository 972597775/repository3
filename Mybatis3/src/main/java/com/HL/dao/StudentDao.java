package com.HL.dao;


import com.HL.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//接口操作Student表
public interface StudentDao {
//    查询Student表的所有数据
    public List<Student> selectStudent();
//    插入方法
    public int insertStudent(Student student);
//    通过id获取信息
    public Student selectStudentById(Integer id);
//    多个参数，命名参数，在形参定义的前面加入@param（“自定义参数名称”）
    List<Student> selectMultiParam(@Param("myname") String name,     @Param("myage") Integer age);
//    排序方式
    List<Student> SelectUser$order(@Param("colName") String colName);
//    if语句
    List<Student> SelectIf(Student student);
//    where语句下面定义多个if，只要一个if成立，会自动去掉后面的and、or等
    List<Student> SelectWhere(Student student);
//    foreach方法1
    List<Student> SelectForeach(List<Integer> idlist);
//    foreach方法2
    List<Student> SelectForeach2(List<Student> stulist);
}
