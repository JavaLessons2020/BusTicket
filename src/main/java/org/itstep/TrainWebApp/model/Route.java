package org.itstep.TrainWebApp.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String routeNumber;
    private String startPoint;
    private String endPoint;
    private LocalDateTime departure;
    private LocalDateTime arrival;

    @OneToMany(mappedBy = "route")
    Set<Ticket> tickets = new HashSet<>();

}
