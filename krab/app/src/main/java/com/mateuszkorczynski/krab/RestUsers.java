package com.mateuszkorczynski.krab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by MAKORCZY on 2017-10-17.
 */

@JsonIgnoreProperties(value = { "age", "emailAddress", "yearOfBirth" })
public class RestUsers {
    private String id;
    private String name;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}