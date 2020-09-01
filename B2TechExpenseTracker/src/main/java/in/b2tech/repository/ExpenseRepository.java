package in.b2tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.b2tech.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
