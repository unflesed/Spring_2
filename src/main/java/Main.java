import bank.Bank;
import clients.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger("myLogger");

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Client client1 = ctx.getBean("client1", Client.class);
        Client client2 = ctx.getBean("client2", Client.class);
        Client client3 = ctx.getBean("client3", Client.class);
        Client client4 = ctx.getBean("client4", Client.class);

        Bank bank = ctx.getBean("bank", Bank.class);
        boolean credit = bank.giveCredit(client2, 100000);
        boolean deposit = bank.getDeposit(client3, 10000);

        LOG.info("Credit for client two: " + credit + "\n");
        LOG.info("Deposit from client three: " + deposit + "\n");
    }
}
