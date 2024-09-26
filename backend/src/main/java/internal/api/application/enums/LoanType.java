package internal.api.application.enums;

public enum LoanType {
    PERSONAL {
        @Override
        public String toString(){
            return "Personal Loan";
        }
    },
    AUTO {
        @Override
        public String toString(){
            return "Auto Loan";
        }
    },
    STUDENT {
        @Override
        public String toString(){
            return "Student Loan";
        }
    },
    MORTGAGE {
        @Override
        public String toString(){
            return "Mortgage";
        }
    }
}
