package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class NewsPage extends Page {

    public class RegistrationPage extends Page {
        private String buttonAddNews = ".//html/body/div[2]/div/a/span";                                          //Добавить новость
        private String txtSearch = ".//*[@id=\"news_search\"]";                                                   //Строка Поиск новостей
        private String buttonSearch = ".//*[@id=\"Capa_1\"]";                                                     // Кнобка поиска новостей
        private String buttonReadNews = ".//html/body/div[2]/div/div[3]/div[2]/a";                                // Кнопка читать полностью
        private String buttonSelectPeriodMonth = ".//html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/span[3]";                           // пока не понятно как сделать
        private String buttonSelectPeriodYear = ".///html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[3]/div/div/span[7]";
        private String buttonFaceBookLink = ".//html/body/div[2]/div/div[4]/div[2]/div[1]/div[3]/a/svg";           // Ссылка на фейсбук
        private String buttonFaceBookLink2 = ".//html/body/div[3]/div/div[1]/a[1]/svg";                            // Ссылка на фейсбук номер два
        private String buttonInstagramLink = ".//html/body/div[3]/div/div[1]/a[2]/svg";                            // Ссылка на инстаграм

        public void openRegistrationPage() {
            driver.get("http://http://test.dirtmixer.com/news");
            driver.manage().window().setSize(new Dimension(1600, 900));
            String currentWindow = driver.getWindowHandle();
            driver.switchTo().window(currentWindow);
        }

        public void clickAddNews() {
            driver.findElement(By.xpath(buttonAddNews)).click();
        }

        public void fillSearch(String textnews) {
            driver.findElement(By.xpath(txtSearch)).sendKeys(textnews);
        }

        public void clickSearch() {
            driver.findElement(By.xpath(buttonSearch)).click();
        }

        public void clickReadNews() {
            driver.findElement(By.xpath(buttonReadNews)).click();
        }

        public void clickSelectPeriodMonth() {
            driver.findElement(By.xpath(buttonSelectPeriodMonth)).click();
        }

        public void clickSelectPeriodYear() {
            driver.findElement(By.xpath(buttonSelectPeriodYear)).click();
        }

        public void clickFacebookLink() {
            driver.findElement(By.xpath(buttonFaceBookLink)).click();
        }

        public void clickFacebookLink2() {
            driver.findElement(By.xpath(buttonFaceBookLink2)).click();
        }

        public void clickInstagramLink() {
            driver.findElement(By.xpath(buttonInstagramLink)).click();
        }

    }
}
