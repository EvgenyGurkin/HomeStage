package elements;

import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.ExtendedWebElement;

public interface AddressAndTheme extends ExtendedWebElement {
    @FindBy(".//div[@class='js-compose-field mail-Bubbles']")
    @Description("Поле для ввода адреса")
    ExtendedWebElement mailAddressField();

    @FindBy(".//div[contains(@class , 'field-to-error')]")
    @Description("Сообщение об ошибке при отправке")
    ExtendedWebElement mailAddressError();
}

