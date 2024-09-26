package internal.api.application.controller;

import internal.api.application.entity.Account;
import internal.api.application.entity.BankAccount;
import internal.api.application.enums.LoanType;
import internal.api.application.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/accounts")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts(){
        return ResponseEntity.ok(accountService.findAllAccounts());
    }

    @PostMapping
    public void saveAccount(){
        accountService.saveAccount(Account.loan("UNH 1", 2500.0, 5.0,
                100.0, 84, LoanType.STUDENT));
        accountService.saveAccount(Account.loan("Mortgage", 1000.0, 5.0,
                100.0, 84, LoanType.MORTGAGE));
        accountService.saveAccount(Account.savingsAccount("Savings", 1.0, 1000.0));
    }
}
