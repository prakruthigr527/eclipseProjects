package com.expenses.analyser.repository;

import com.expenses.analyser.model.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {


}
