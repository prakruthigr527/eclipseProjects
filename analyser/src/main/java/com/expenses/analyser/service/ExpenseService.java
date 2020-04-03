package com.expenses.analyser.service;

import com.expenses.analyser.model.Expense;
import com.expenses.analyser.model.ExpenseCategory;
import com.expenses.analyser.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses(){
        List<Expense> allExpenses = new ArrayList<>();
        expenseRepository.findAll().forEach(allExpenses::add);
        return allExpenses;
    }

    public Optional<Expense> getExpense(int id){
        return expenseRepository.findById(id);

    }

    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public void updateExpense(Expense expense){
        expenseRepository.save(expense);
    }
}
