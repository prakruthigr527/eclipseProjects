package com.expenses.analyser.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Expense {

    @Id
    private int id;
    private int enterBillAmount;
    private ExpenseCategory expenseCategory;

    public Expense() {

    }

    public Expense(int id, int enterBillAmount, ExpenseCategory expenseCategory){
        super();
        this.id=id;
        this.enterBillAmount=enterBillAmount;
        this.expenseCategory=expenseCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnterBillAmount() {
        return enterBillAmount;
    }

    public void setEnterBillAmount(int enterBillAmount) {
        this.enterBillAmount = enterBillAmount;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
}
