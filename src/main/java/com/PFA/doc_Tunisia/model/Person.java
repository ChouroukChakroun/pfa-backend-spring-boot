package com.PFA.doc_Tunisia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Person {
    @Id
    private  Long id;

    private String firstname;

    private String lastname;

    private String userName;

    private String password;

    private String email;

    @Column(name = "phone_number")
    private int phoneNumber;






}
