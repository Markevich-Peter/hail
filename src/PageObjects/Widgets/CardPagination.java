package PageObjects.Widgets;

import PageObjects.Page;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPagination extends Page {

    List<WebElement> pagination;

    CardPagination(List<WebElement> elements) {
        super();
        pagination = elements; //как скопировать НЕ ссылку на елемент а елемент
    }

    public void clickElement(int n){
        pagination.get(n).click();
    }

    public void clickLastElement(){
        pagination.get(pagination.size()).click();
    }

}
