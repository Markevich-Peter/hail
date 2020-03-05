package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

public class TrainingPage {
    public class RegistrationPage extends Page {
        private String buttonPrice = ".//html/body/div[2]/div/a/span";                                          //Добавить новость
        private String buttonPromotion = ".//*[@id=\"news_search\"]";                                                   //Строка Поиск новостей
        private String buttonRating = ".//*[@id=\"Capa_1\"]";                                                     // Кнобка поиска новостей
        private String buttonCity = ".//html/body/div[2]/div/div[3]/div[2]/a";                                // Кнопка читать полностью
        private String buttonRewindLeft = ".//html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[2]/span[3]";                           // пока не понятно как сделать
        private String buttonRewindRight = ".///html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[3]/div/div/span[7]";
        private String buttonMoreDitails = ".//html/body/div[2]/div/div[4]/div[2]/div[1]/div[3]/a/svg";           // Ссылка на фейсбук
        private String button2WheelGoLink = ".//html/body/div[3]/div/div[1]/a[1]/svg";                            // Ссылка на фейсбук номер два
        private String buttonSendEmail = ".//html/body/div[3]/div/div[1]/a[2]/svg";                            // Ссылка на инстаграм
        private String buttonBackCall = ".//html/body/div[3]/div/div[1]/a[2]/svg";                            // Ссылка на инстаграм

        public void openRegistrationPage() {
            driver.get("http://http://test.dirtmixer.com/news");
            driver.manage().window().setSize(new Dimension(1600, 900));
            String currentWindow = driver.getWindowHandle();
            driver.switchTo().window(currentWindow);
        }

        public void clickPrice() {
            driver.findElement(By.xpath(buttonPrice)).click();
        }
        public void clickProtion() {
            driver.findElement(By.xpath(buttonPromotion)).click();
        }
        public void clickRating() { driver.findElement(By.xpath(buttonRating)).click(); }
        public void clickCity() { driver.findElement(By.xpath(buttonCity)).click(); }
        public void clickRewindLeft() { driver.findElement(By.xpath(buttonRewindLeft)).click(); }
        public void clickRewindRight() { driver.findElement(By.xpath(buttonRewindRight)).click(); }
        public void clickMoreDitails() { driver.findElement(By.xpath(buttonMoreDitails)).click(); }
        public void click2WheeGoLink() { driver.findElement(By.xpath(button2WheelGoLink)).click(); }
        public void clickSendEmail() { driver.findElement(By.xpath(buttonSendEmail)).click(); }
        public void clickBackCall() { driver.findElement(By.xpath(buttonBackCall)).click(); }

    }
}
