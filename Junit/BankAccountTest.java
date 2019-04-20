


import static org.junit.assert.*;

public class BankAccountTest{

    @test
    public void test(){
        BankAccount acc = new BankAccount();
        acc.deposit(50);
        assertEquals(acc.balance, 50)
    }

}