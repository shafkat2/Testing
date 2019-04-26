


import static org.junit.Assert.*;

public class BankAccountTest{

    @test
    public void test(){
        BankAccount acc = new BankAccount();
        acc.deposit(50);
        assertEquals(acc.balance, 50);
    }

}