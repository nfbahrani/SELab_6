package com.unittest.codecoverage.repositories;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {
    PersonRepository repository;
    Person p1;
    Person p2;

    @BeforeEach
    void setUp() {
        this.repository = new PersonRepository();

        p1 = new Person();
        p1.setName("Atena Sadat");
        p1.setAge(22);
        p1.setGender(Gender.F);

        p2 = new Person();
        p2.setName("Niloufar Bahrani");
        p2.setAge(23);
        p2.setGender(Gender.M);
    }

    @Test
    void insert() {
        repository.insert(p1);
        repository.insert(p2);
        System.out.println("Inserted successfully!");
    }

    @Test
    void get() {
        Person temp = repository.get("Atena sadat");
        assertEquals(null, temp);
    }

    @Test
    void update() {
        p2.setGender(Gender.F);
        repository.update(p2);
    }

    @Test
    void delete() {
        repository.delete("Niloufar Bahrani");
    }
}