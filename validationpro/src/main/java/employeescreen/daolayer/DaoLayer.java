package employeescreen.daolayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employeescreen.modellayer.Employee;
@Repository
public interface DaoLayer extends JpaRepository<Employee, Integer>{

}
