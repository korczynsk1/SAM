package com.mateuszkorczynski.raq.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by MAKORCZY on 2017-10-16.
 */
@Document
@Getter
@Setter
public class EmailAddress {
    @Id
    private String id;
    private String value;
}
