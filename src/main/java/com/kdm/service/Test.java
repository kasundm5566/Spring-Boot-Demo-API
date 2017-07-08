package com.kdm.service;

import com.kdm.domain.Student;
import com.mongodb.MongoClient;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kasun Dinesh on 08-Jul-17.
 */
public class Test {

    public static MongoDbFactory mongoDbFactory() throws Exception {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        return new SimpleMongoDbFactory(mongoClient, "school");
    }
    public static MongoTemplate getmongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }

    public static void main(String[] args) throws Exception {
        MongoTemplate mongoTemplate=getmongoTemplate();
        List<Student> studentList=new ArrayList<>();
        System.out.println("IN");
        studentList = mongoTemplate.findAll(Student.class, "student");
        System.out.println("OUT");
        System.out.println(studentList.get(0).getFirstName());
    }
}
