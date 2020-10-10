package kos.project.projecttohouse.service;

import kos.project.projecttohouse.model.Expenses;
import kos.project.projecttohouse.model.ExpensesForm;
import kos.project.projecttohouse.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExpensesService {

    @Autowired
    private ExpensesRepository expensesRepository;

    public void add(ExpensesForm expensesForm){

        Expenses expenses = new Expenses();

        String amountToPars = expensesForm.getAmount().replace(",",".");
        double amountAfterPars = Double.parseDouble(amountToPars);

        expenses.setAmount(amountAfterPars);
        expenses.setExpensesCategory(expensesForm.getExpensesCategory());
        expenses.setExpensesDate(LocalDate.parse(expensesForm.getExpensesDate()));
        expenses.setComment(expensesForm.getComment());

        expensesRepository.save(expenses);
    }

    public void deleteExpensesById(Long expensesId){
        expensesRepository.deleteById(expensesId);

    }

   public List<Expenses> getAll(){

       return expensesRepository.findAll();
   }

    public List<Expenses> findByOrderByIdDesc() {
        return expensesRepository.findByOrderByIdDesc();
    }




}
