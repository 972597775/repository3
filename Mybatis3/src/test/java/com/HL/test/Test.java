package com.HL.test;

import com.HL.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {

//    测试方法 测试功能

    @org.junit.Test
    public void testInsert() throws IOException {

        String config = "config.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
//        指定要执行的sql语句的标识
        String sqlId = "com.HL.dao.StudentDao.insertStudent";
//        执行sql语句，通过sql找到语句
        Student student = new Student();
        student.setId(1003);
        student.setName("张飞");
        student.setEmail("zhangfei@qq.com");
        student.setAge(25);
        int nums = sqlSession.insert(sqlId, student);
//        mybatis默认不是自动提交事务的，所以在insert，update，delete后要手动提交事务
        sqlSession.commit();
        System.out.println("执行insert结果:" + nums);
        sqlSession.close();

    }

}
