import java.math.BigDecimal;

public class Account {
    private long userAccountId;
    private BigDecimal balance;

    public Account(long userAccountId, BigDecimal balance) {
        this.userAccountId = userAccountId;
        this.balance = balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public long getUserAccountId() {
        return userAccountId;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
