package com.HL.test;

import com.HL.dao.StudentDao;
import com.HL.entity.Student;
import com.HL.utils.MybatisUtils;
import lombok.Data;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProxyTest {

//    @Test
//    public void testSelectStudents(){
////        使用动态代理，使用SqlSession.getMapper(dao接口)
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
////        调用dao方法，执行数据库的操作
//        List<Student> students = dao.selectStudent();
//        for (Student stu:students){
//            System.out.println("学生:"+stu);
//        }
//
//    }

//    @Test
//    public void testInsertStudents(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        Student student = new Student();
//        student.setId(1004);
//        student.setName("李白");
//        student.setEmail("libai@qq.com");
//        student.setAge(20);
//        int nums = dao.insertStudent(student);
//        sqlSession.commit();
//    }

//    通过id查询
//    @Test
//    public void selectStudentById(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        Student student = dao.selectStudentById(1002);
//        System.out.println(student);
//    }

//    @Test
//    public void testSelectMultiParam(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        List<Student> students = dao.selectMultiParam("李四",20);
//        for (Student stu:students){
//            System.out.println("学生:"+stu);
//        }
//        sqlSession.close();
//    }

//    @Test
//    public void testSelectUser$order(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        List<Student> students = dao.SelectUser$order("name");
//        for (Student stu:students){
//            System.out.println("学生:"+stu);
//        }
//        sqlSession.close();
//    }

//    @Test
//    public void testSelectIf(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        Student student = new Student();
//        student.setName("李四");
//        student.setAge(19);
//        List<Student> students = dao.SelectIf(student);
//        for (Student stu:students){
//            System.out.println("if==="+stu);
//        }

//    @Test
//    public void testSelectWhere(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        Student student = new Student();
////        student.setName("李四");
//        student.setAge(20);
//        List<Student> students = dao.SelectWhere(student);
//        for (Student stu:students){
//            System.out.println("Where==="+stu);
//        }
//
//
//    }
//
//    @Test
//    public void testFor(){
//        List<Integer> list = new ArrayList<>();
//        list.add(1001);
//        list.add(1002);
//        list.add(1003);
//
////        得到 select * from student where id in (1001,1002,1003)
//        String string = new String("select * from student where id in");
//        StringBuilder builder = new StringBuilder("");
////        添加开始的（
//        builder.append("(");
//        for (Integer id:list){
//            builder.append(id).append(",");
//        }
//        builder.deleteCharAt(builder.length()-1);
////        添加最后的）
//        builder.append(")");
//        System.out.println(string+builder.toString());
//    }

//    @Test
//    public void testSelectForeach(){
//        SqlSession sqlSession = MybatisUtils.getsqlSession();
//        StudentDao dao = sqlSession.getMapper(StudentDao.class);
//        List<Integer> list = new ArrayList<>();
//        list.add(1001);
//        list.add(1002);
//        list.add(1003);
//        List<Student> students = dao.SelectForeach(list);
//        for (Student stu:students){
//            System.out.println("foreach=="+stu);
//        }
//    }

    @Test
    public void testSelectForeach2(){
        SqlSession sqlSession = MybatisUtils.getsqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> studlist = new ArrayList<>();
        Student s1 = new Student();
        s1.setId(1002);
        studlist.add(s1);

        Student s2 = new Student();
        s2.setId(1003);
        studlist.add(s2);
        List<Student> students = dao.SelectForeach2(studlist);
        for (Student stu:students){
            System.out.println("foreach2=="+stu);
        }
    }



}
