package org.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@ToString
@Entity(name = "planet")
public class Planet {
    @Id
    @Column(name = "id", length = 20)
    private String id;

    @Column(name = "name", length = 500)
    private String name;

    public void setId(String id) {
        String regex = "^[A-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()) {
            this.id = id;
        } else {
            throw new InvalidParameterException("Invalid parameter value");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
