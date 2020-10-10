package kos.project.projecttohouse.controller;

import kos.project.projecttohouse.model.ExpensesForm;
import kos.project.projecttohouse.service.ExpenditureStatisticsService;
import kos.project.projecttohouse.service.ExpensesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/expenditure_statistics")
public class ExpenditureStatisticsController {


    @Autowired
    private ExpenditureStatisticsService expenditureStatisticsService;

    @GetMapping("/getList")
    public String getList(Model model){
        model.addAttribute("expenditureStatisticsList",expenditureStatisticsService.getAll());
        return "expenditure_statistics";
    }







}
