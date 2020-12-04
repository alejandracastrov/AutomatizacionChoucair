package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchDressesPage {

    public static final Target LINK_DRESS = Target.the("Link Dress")
            .located(org.openqa.selenium.By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
    public static final Target IMG_DRESS = Target.the("Img of Dress")
            .located(org.openqa.selenium.By.xpath("//*[@id=\'center_column\']/ul/li[5]/div/div[1]/div/a[1]/img"));
    /*public static final Target CART = Target.the("Add Cart")
            .located(org.openqa.selenium.By.xpath("//*[@id='add_to_cart']/button"));*/
    public static final Target CART = Target.the("Add Cart")
            .located(org.openqa.selenium.By.xpath("//*[@id=\"add_to_cart\"]//span"));
}
