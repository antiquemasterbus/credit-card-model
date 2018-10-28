package pl.msz.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {
    
    
    @Test
    public void allowAssignLimit(){
        //Arrange   /given
        CreditCard card = new CreditCard();
        //Act       /when
        card.assignLimit(2000);
        //Asser     /then 
        Assert.assertTrue(card.getBalance() ==2000);
    }
}