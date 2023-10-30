package com.aflandez.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cursos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    Long id;

    @Column(name = "nombre")
    String name;

    @Column(name = "duracion")
    Integer period;

    @Column(name = "comienzo")
    Date start;

    @Column(name = "fin")
    Date finish;

    @OneToMany(mappedBy = "course")
    Set<Book> books;

}
