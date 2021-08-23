package org.javajarvis.SistemCuti_UASJava.repository;

import org.javajarvis.SistemCuti_UASJava.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Optional<Employee> findByUsername(String name);

    @Query("select e from Employee e where e.namaLengkap like :name")
    public List<Employee> findEmployeeByNameLike(@PathParam("name") String name);


}
