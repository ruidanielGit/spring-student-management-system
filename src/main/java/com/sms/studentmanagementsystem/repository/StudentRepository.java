package com.sms.studentmanagementsystem.repository;

import com.sms.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface is used to perform CRUD operations on the database.
 * It extends the JpaRepository interface which provides the basic CRUD operations.
 * The JpaRepository interface takes two parameters:
 * 1. The entity class
 * 2. The primary key type of the entity class
 *
 * The JpaRepository interface provides the following methods:
 * 1. save() - to save an entity
 * 2. findAll() - to retrieve all entities
 * 3. findById() - to retrieve an entity by its primary key
 * 4. deleteById() - to delete an entity by its primary key
 * 5. count() - to count the number of entities
 * 6. existsById() - to check if an entity exists by its primary key
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
