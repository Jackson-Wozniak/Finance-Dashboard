package internal.api.application.entity;

import internal.api.application.enums.BankAccountType;
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

    @Column(name = "balance")
    private Double balance;

    protected Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public static Loan loan(String name, double balance, double percentageRate,
                                  double monthlyPayment, int loanDurationMonths,
                                  LoanType loanType){
        return new Loan(name, balance, percentageRate, monthlyPayment, loanDurationMonths, loanType);
    }

    public static BankAccount savingsAccount(String name, double interestRate, double balance){
        return new BankAccount(name, interestRate, balance, BankAccountType.SAVINGS);
    }

    public static BankAccount checkingAccount(String name, double interestRate, double balance){
        return new BankAccount(name, interestRate, balance, BankAccountType.CHECKING);
    }
}
