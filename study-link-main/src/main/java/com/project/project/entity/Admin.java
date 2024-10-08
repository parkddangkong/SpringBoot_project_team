package com.project.project.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name ="username", unique = true, nullable = false)
    private String username;

    @Column(name ="email", unique = true, nullable = false)
    private String email;


    @Column(name = "pass_word", nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="status")
    private String status;

    @Column(name ="admin_role")
    private String Role;
    //upper - lower 으로 두개 구분할 예정

}
