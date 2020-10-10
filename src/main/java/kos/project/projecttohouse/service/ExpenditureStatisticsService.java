package kos.project.projecttohouse.service;

import kos.project.projecttohouse.model.Expenses;
import kos.project.projecttohouse.repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenditureStatisticsService {

    @Autowired
    private ExpensesRepository expensesRepository;

    public List<Expenses> getAll(){
        return expensesRepository.findAll();
    }

}
