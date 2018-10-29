package bank;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {
    @Test
    public void 계좌생성(){
        Account account = new Account();
    }

    @Test
    public void 계좌1000입금(){
        //Arrange
        Account account = new Account();

        //Act
        account.deposit(1000);

        //Assert
        assertThat(account.getBalance()).isEqualTo(1000);
    }

    @Test
    public void 계좌2000입금(){
        //Arrange
        Account account = new Account();

        //Act
        account.deposit(2000);

        //Assert
        assertThat(account.getBalance()).isEqualTo(2000);
    }

    @Test
    public void 계좌1000두번입금(){
        //Arrange
        Account account = new Account();

        //Act
        account.deposit(1000);
        account.deposit(1000);

        //Assert
        assertThat(account.getBalance()).isEqualTo(2000);
    }

    @Test
    public void 계좌2000두번입금(){
        //Arrange
        Account account = new Account();

        //Act
        account.deposit(2000);
        account.deposit(2000);

        //Assert
        assertThat(account.getBalance()).isEqualTo(4000);
    }

    @Test
    public void 계좌조회_금액0(){
        //Arrange
        Account account = new Account();

        //Act
        int balance = account.getBalance();

        //Assert
        assertThat(balance).isEqualTo(0);
    }

    @Test
    public void 계좌조회_금액1000(){
        //Arrange
        Account account = new Account();
        account.deposit(1000);
        //Act
        int balance = account.getBalance();

        //Assert
        assertThat(balance).isEqualTo(1000);
    }


}
