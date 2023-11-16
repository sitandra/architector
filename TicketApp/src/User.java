import java.util.ArrayList;
import java.util.List;

public class User {
    private long id;
    private String name;
    private List<Ticket> tickets;
    private String login;
    private long passwordHashCode;
    private long accountId;

    public User () {
        this.tickets = new ArrayList<>();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswordHashCode(long passwordHashCode) {
        this.passwordHashCode = passwordHashCode;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }

    public String getLogin() {
        return this.login;
    }

    public long getPasswordHashCode() {
        return this.passwordHashCode;
    }

    public long getAccountId() {
        return this.accountId;
    }


}
