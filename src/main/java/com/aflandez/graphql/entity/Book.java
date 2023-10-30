package com.aflandez.graphql.entity;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "libros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre")
    String name;

    @Column(name = "isbn")
    String isbn;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    Course course;

}
