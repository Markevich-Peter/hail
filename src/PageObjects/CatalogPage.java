package PageObjects;

import PageObjects.Widgets.PreviewCardWidget;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public abstract class CatalogPage extends Page{

    public List<PreviewCardWidget> getPreviewCard(){
        return driver.findElements(By.xpath("//div[@class='packages_slider s_slider slick-initialized slick-slider slick-dotted']")).
                stream().map(e->new PreviewCardWidget(e)).collect(Collectors.toList());
    }


}
