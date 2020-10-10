package kos.project.projecttohouse.model;

import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class ExpensesForm {


    private String amount;

    @Enumerated(EnumType.STRING)
    private ExpensesCategory expensesCategory;

    private String expensesDate;

    private String comment;
}
