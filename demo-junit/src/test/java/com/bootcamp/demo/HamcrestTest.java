package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.bootcamp.demo.matcher.EmailAddressMatcher;
import com.bootcamp.demo.matcher.PasswordMatcher;
import com.bootcamp.demo.matcher.UppercaseStringMatcher;

class HamcrestTest {
    @Test
    void testSum() {
        // MatcherAssert.class
        // Hamcrest Framework design is similar to English scentence
        assertThat(Calculator.sum(3, 4), is(equalTo(7)));
        assertThat(Calculator.sum(3, 4), is(not(equalTo(8))));
        // Junit5
        assertEquals(7, Calculator.sum(3, 4));
    }

    @Test
    void testComparison() {
        // Junit5
        assertTrue(Calculator.sum(3, 5) == 8);
        // Hamcrest
        assertThat(Calculator.sum(3, 5), is(greaterThanOrEqualTo(8)));
        assertThat(Calculator.sum(3, 5), is(lessThanOrEqualTo(8)));
        assertThat(Calculator.sum(3, 5), is(lessThan(9)));
        assertThat(Calculator.sum(3, 5), is(greaterThan(7)));
        // <, >, <=, >=

        // null check
        String result = null;
        assertThat(result, is(nullValue()));
        assertThat("abc", is(notNullValue()));
    }

    @Test
    void testString() {
        // contains
        String result = "vincent";
        assertThat(result, containsString("nce"));
        assertThat(result, not(containsString("abc")));
        assertThat(result, startsWith("vin"));
        assertThat(result, not(startsWith("abc")));
        // endsWith ...
    }

    @Test
    void testList() {
        // !!! 背後machanium係check equal
        List<String> fruits = List.of("apple", "orange", "cherry");
        assertThat(fruits, hasItem("apple"));
        assertThat(fruits, not(hasItem("banana")));
        assertThat(fruits, hasItems("apple", "cherry"));
        assertThat(fruits, not(hasItems("apple", "cherry", "banana")));
        assertThat(fruits, hasSize(3));
        // !!! 黎度既contains 係要次序正確 兼包含所有values先過到TEST
        assertThat(fruits, contains("apple", "orange", "cherry"));
        assertThat(fruits, not(contains("apple", "orange")));
        assertThat(fruits, not(contains("apple", "cherry", "orange")));
        // !!! containsInAnyOrder
        assertThat(fruits, containsInAnyOrder("apple", "cherry", "orange"));
        // Check empty List
        List<String> emptyList = new LinkedList<>();
        assertThat(emptyList, hasSize(0));
        assertThat(emptyList, is(empty()));
    }

    @Test
    void testObjectType() {
        assertThat(new Student(18, "John"), instanceOf(Person.class));
        // test if Student.class is extending Person.class
        assertThat(Student.class, typeCompatibleWith(Person.class));
        assertThat(Person.class, not(typeCompatibleWith(Student.class)));
    }

    @Test
    void testCustomMatcher() {
        assertThat("ABC", UppercaseStringMatcher.create()); // Matcher Object
        assertThat("Abc", not(UppercaseStringMatcher.create())); // Matcher Object
    }

    @Test
    void testEmailAddress() {
        assertThat("vincentlau@gmail.com", EmailAddressMatcher.create());
        assertThat("vincentlau@gmailcom", not(EmailAddressMatcher.create()));
        assertThat("vincentlaugmail.com", not(EmailAddressMatcher.create()));
        assertThat("@gmail.com", not(EmailAddressMatcher.create()));
    }

    @Test
    void testPassword() {
        assertThat("Admin1234$", PasswordMatcher.create());
        assertThat("Admin1234", not(PasswordMatcher.create()));
        assertThat("admin1234#", not(PasswordMatcher.create()));
        assertThat("AdminAdmin#", not(PasswordMatcher.create()));
        assertThat("Admin1234#.", not(PasswordMatcher.create()));
    }
}
