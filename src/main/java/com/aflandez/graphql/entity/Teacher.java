package com.aflandez.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    Long id;

    @Column(name = "nombre")
    String name;

    @Column(name = "documento")
    String document;
}
