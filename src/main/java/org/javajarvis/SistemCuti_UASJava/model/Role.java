package org.javajarvis.SistemCuti_UASJava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_role")
@Data
@Getter @Setter
public class Role {

    private Integer id;
//    @JsonIgnoreProperties({"employees"})
//    private List<Employee> employee;

    @Column(name = "nama_role")
    private String nameRole;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    public Integer getId() {
        return id;
    }

//    @OneToMany(mappedBy = "role",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    @JsonIgnoreProperties({"role"})
//    public List<Employee> getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(List<Employee> employee) {
//        for(Employee e : employee){
//            e.setRole(this);
//        }
//        this.employee = employee;
//    }
}
