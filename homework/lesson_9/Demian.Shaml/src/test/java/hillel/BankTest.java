package hillel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {

    private Bank b;

    @Before
    public void init(){
        b = new Bank();
    }

    @Test
    public void addClient(){
        b.creatCl("Tim", "Fander");
        assertEquals(new String[]{"Tim", "Fander"}, b.getClientBase(0));
        b.creatCl("Marry", "Stuart");
        assertEquals(new String[]{"Marry", "Stuart"}, b.getClientBase(1));
        b.delClient(1);
        b.creatCl("Tom", "Galle");
        assertEquals(new String[]{"Tom", "Galle"}, b.getClientBase(1));

    }

    @Test
    public void delClient(){
        b.creatCl("Nick", "Mol");
        b.creatCl("Harry", "Anderson");
        b.delClient(0);
        assertEquals(new String[]{"Nick", "Mol"}, b.getClientArch(0));
        b.delClient(0);
        assertEquals(new String[]{"Harry", "Anderson"}, b.getClientArch(1));

    }

    @Test
    public void transact(){
        b.creatCl("Nick", "Mol");
        b.transact(0,"Money transfer");
        assertEquals(new String[]{"Money transfer", "Nick Mol"}, b.getTransact(0));
        b.transact(0, "Rent fee");
        assertEquals(new String[]{"Rent fee", "Nick Mol"}, b.getTransact(1));
        b.showAllTransact();
    }
}
