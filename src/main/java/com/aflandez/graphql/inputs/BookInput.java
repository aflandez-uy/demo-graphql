package com.aflandez.graphql.inputs;

import lombok.Data;

@Data
public class BookInput {

    String name;

    String isbn;

    Long courseId;
}
