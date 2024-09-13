package internal.api.application.entity;

import internal.api.application.enums.LoanType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "account")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "account_name")
    private String name;

    protected Account(String name){
        this.name = name;
    }

    public static Loan createLoan(String name, double percentageRate,
                                  double monthlyPayment, int loanDurationMonths,
                                  LoanType loanType){
        return new Loan(name, percentageRate, monthlyPayment, loanDurationMonths, loanType);
    }
}
