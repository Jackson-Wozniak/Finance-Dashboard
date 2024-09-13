package internal.api.application.service;

import internal.api.application.repository.AccountRepository;
import internal.api.application.repository.LoanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountService {

    private AccountRepository accountRepository;
    private LoanRepository loanRepository;
}
