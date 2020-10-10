package kos.project.projecttohouse.repository;

import kos.project.projecttohouse.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ExpensesRepository extends JpaRepository<Expenses,Long> {


    List<Expenses> findByOrderByIdDesc();

}
