package kos.project.projecttohouse.controller;

import kos.project.projecttohouse.model.Expenses;
import kos.project.projecttohouse.model.ExpensesForm;
import kos.project.projecttohouse.service.ExpensesService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesService expensesService;

    @GetMapping("/addAndList")
    public String expensesAdd(Model model){
        model.addAttribute("newExpenses", new ExpensesForm());
        model.addAttribute("listOfExpenses",expensesService.findByOrderByIdDesc());
        return "expenses";
    }

    @PostMapping("/addAndList")
    public String expensesAdd(ExpensesForm expensesForm){
        expensesService.add(expensesForm);
        return"redirect:/expenses/addAndList";
    }

    @GetMapping("/delete/{expensesId}")
    public String expensesDelete(@PathVariable Long expensesId){
        expensesService.deleteExpensesById(expensesId);
        return"redirect:/expenses/addAndList";
    }

}
