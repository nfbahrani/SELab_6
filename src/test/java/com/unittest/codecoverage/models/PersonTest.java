package com.unittest.codecoverage.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person();

    @BeforeEach
    void setUp() {
        person.setName("Zahra");
        person.setAge(25);
        person.setGender(Gender.F);
    }

    @Test
    void getName() {
        assertEquals(person.getName(), "Zahra");
    }

    @Test
    void setName() {
        person.setName("Amin");
    }

    @Test
    void getAge() {
        assertEquals(person.getAge(), 25);
    }

    @Test
    void setAge() {
        person.setAge(24);
    }

    @Test
    void getGender() {
        assertEquals(person.getGender(), Gender.F);
    }

    @Test
    void setGender() {
        person.setGender(Gender.M);
    }
}