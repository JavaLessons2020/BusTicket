package org.itstep.TrainWebApp.model;

import lombok.*;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "role")
public class Role implements GrantedAuthority {

    @Id
    private Long id;
    private String name;

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @ManyToMany(mappedBy = "roles")
    Set<Customer> customers = new HashSet<>();

    @Override
    public String getAuthority() {
        return name;
    }
}
