package org.sfe.springbootsample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", length = 35, nullable = false)
    private String firstname;

    @Column(name = "last_name", length = 25)
    private String lastname;

    @Column(name = "email",length = 50, unique = true, nullable = false)
    private String email;

    @Column(name = "address")
    private String address;
}
