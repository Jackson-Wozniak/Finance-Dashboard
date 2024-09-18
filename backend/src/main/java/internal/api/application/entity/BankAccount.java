package internal.api.application.entity;

import internal.api.application.enums.BankAccountType;
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
public class BankAccount extends Account{

    @Column(name = "interest_rate")
    private Double interestRate;

    @Column(name = "balance")
    private Double balance;

    @Enumerated(EnumType.STRING)
    private BankAccountType bankAccountType;

    public BankAccount(String name, double interestRate,
                       double balance, BankAccountType bankAccountType){
        super(name);
        this.interestRate = interestRate;
        this.balance = balance;
        this.bankAccountType = bankAccountType;
    }
}
