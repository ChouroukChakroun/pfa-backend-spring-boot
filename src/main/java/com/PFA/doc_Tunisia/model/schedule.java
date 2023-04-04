package com.PFA.doc_Tunisia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class schedule {
    @Id
    private Long id;

    @JoinColumn(name = "schedule_date")
    private Date scheduleDate;

    @JoinColumn(name="schedule_hour")
    private LocalDateTime scheduleHour;

    @ManyToOne
    private Doctor doctor;
}
