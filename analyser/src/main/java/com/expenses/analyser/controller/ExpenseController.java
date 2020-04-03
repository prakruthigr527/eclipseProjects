package com.expenses.analyser.controller;

import com.expenses.analyser.model.Expense;
import com.expenses.analyser.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping("/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }

    @RequestMapping("expenses/{id}")
    public Optional<Expense> getExpenseByID(@PathVariable int id){
        return expenseService.getExpense(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/expenses")
    public void addExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/expenses")
    public void updateExpense(@RequestBody Expense expense){
        expenseService.updateExpense(expense);
    }

}
