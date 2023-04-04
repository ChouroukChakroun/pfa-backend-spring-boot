package com.PFA.doc_Tunisia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appointment {
    @Id
    private Long id;

    @Column(name = "date_appointment")
    private Date dateAppointment;

    @Column(name = "hour_appointment")
    private LocalDateTime hourAppointment;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Patient patient;

    private String status;
}
