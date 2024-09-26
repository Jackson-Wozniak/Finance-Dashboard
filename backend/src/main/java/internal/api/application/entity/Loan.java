package internal.api.application.entity;

import internal.api.application.enums.LoanType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Loan extends Account{

    @Column(name = "percentage_rate")
    private Double percentageRate;

    @Column(name = "monthly_payment")
    private Double monthlyPayment;

    @Column(name = "loanDurationMonths")
    private Integer loanDurationMonths;

    @Enumerated(EnumType.STRING)
    private LoanType loanType;

    protected Loan(String name, double balance, double percentageRate,
                   double monthlyPayment, int loanDurationMonths,
                   LoanType loanType){
        super(name, balance);
        this.percentageRate = percentageRate;
        this.monthlyPayment = monthlyPayment;
        this.loanDurationMonths = loanDurationMonths;
        this.loanType = loanType;
    }
}
