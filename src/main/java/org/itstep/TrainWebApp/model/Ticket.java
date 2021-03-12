package org.itstep.TrainWebApp.model;


import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ticketNumber;

    @ManyToOne
    @JoinColumn(name = "route_id")
    Route route;

    @OneToOne
    Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    Bus bus;
}
