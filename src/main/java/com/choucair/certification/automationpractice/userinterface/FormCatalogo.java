package com.choucair.certification.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormCatalogo {
    public static final Target MENU_OPTION_CATEGORIA = Target.the("")
            .locatedBy("//*[@id='block_top_menu']//a[contains(text(),'{0}')][@title='{0}']");
    public static final Target MENU_OPTION_SUBCATEGORIA = Target.the("")
            .locatedBy("(//*[@id='block_top_menu']//a[contains(text(),'{0}')])[1]");

    public static final Target OPTION_PRODUCTO = Target.the("")
            .locatedBy("//*[contains(text(),'{0}')]");

    public static final Target BUTTON_ADD_PRODUCT = Target.the("")
            .located(By.xpath("//*[@id='add_to_cart']//button/span"));

    public static final Target BUTTON_PROCEED_TO_CHECKOUT = Target.the("")
            .located(By.xpath("//span[contains(text(),'Proceed to checkout')]"));

    public static final Target LABEL_NOMBRE_PRODUCTO = Target.the("")
            .located(By.xpath("(//p[@class='product-name']//a)[2]"));







}
