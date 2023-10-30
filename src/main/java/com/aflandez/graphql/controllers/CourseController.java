package com.aflandez.graphql.controllers;

import com.aflandez.graphql.entity.Book;
import com.aflandez.graphql.entity.Course;
import com.aflandez.graphql.inputs.BookInput;
import com.aflandez.graphql.repositories.BookRepository;
import com.aflandez.graphql.repositories.CourseRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {

    private final CourseRepository courseRepository;

    private final BookRepository bookRepository;

    public CourseController(CourseRepository courseRepository, BookRepository bookRepository) {
        this.courseRepository = courseRepository;
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    List<Course> courses() {
        return courseRepository.findAll();
    }

    @MutationMapping
    Book addBook(@Argument BookInput book) {
        Course course = courseRepository.findById(book.getCourseId()).get();
        Book newBook = new Book();
        newBook.setCourse(course);
        newBook.setIsbn(book.getIsbn());
        newBook.setName(book.getName());
        return bookRepository.save(newBook);
    }

}
