package internal.api.application.service;

import internal.api.application.entity.Account;
import internal.api.application.repository.AccountRepository;
import internal.api.application.repository.LoanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {

    private AccountRepository accountRepository;
    private LoanRepository loanRepository;

    public void saveAccount(Account account){
        accountRepository.save(account);
    }

    public List<Account> findAllAccounts(){
        return accountRepository.findAll();
    }
}
