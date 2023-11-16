public class Deal {
    private User user;
    private Ticket ticket;
    private Account account;
    private Account baseAccount;

    public Deal(User user, Ticket ticket, Account account, Account baseAccount) {
        this.user = user;
        this.ticket = ticket;
        this.account = account;
        this.baseAccount = baseAccount;
    }

    public void Fix() {
        this.user.addTicket(ticket);
        // уменьшить баланас на счету юзера
        // увеличить баланс на счету организации
        // зафиксировать изменения
        // в случае неудачи откатить
    }
    /* логику покупки билетов сходжу реализовать довольно сложно. 
    Во-первых, она производится асинхронно. Нужно ведь дождаться, 
    когда платеж в банке пройдет и деньги поступят на счет.
    Во-вторых, нужно изучить интерфейсы и API платежных систем.
    Ничего этого нет в ТЗ и UML. Думать над этой задачей бесплатно мне не хочется.
    */ 
}
