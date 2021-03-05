package org.itstep.TrainWebApp.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vendor;
    private String model;
    private int countOfSits;
    private String regNumber;

}
