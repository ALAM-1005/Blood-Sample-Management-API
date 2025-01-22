package com.jsp.bsm.entity;


import com.jsp.bsm.enums.BloodGroup;
import com.jsp.bsm.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int userId;
    private  String userName;
    private String email;
    private String password;
    private String PhoneNumber;
    private BloodGroup bloodGroup;
    private Gender gender;
    private String availableCity;
    private int age;
    private LocalDate lastDonatedAt;
    private boolean Verified;

}
