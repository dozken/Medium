package com.medium;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
public class AppModel implements Serializable {
    private static final long serialVersionUID = 876688928410084519L;
    @Id
    private long id;
    private String message;
}