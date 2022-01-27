package bank;

import clients.Client;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Getter
@Setter
public class Bank {
    private List<Client> clients = new ArrayList<>();
    private Logger LOG;

    public Bank() {
    }

    public Bank(List<Client> clients) {
        this.clients = clients;
    }

    public boolean giveCredit(Client client, double credit){
        if (client.getSalary() * 12 * 1.1 > credit) {
            client.setCredit(true);
            return true;
        }
        return false;
    }

    public boolean getDeposit(Client client, double deposit){
        if (deposit > 1000) {
            client.setDeposit(true);
            return true;
        }
        return false;
    }

}
