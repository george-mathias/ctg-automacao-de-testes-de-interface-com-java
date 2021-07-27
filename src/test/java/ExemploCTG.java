import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ExemploCTG {

    @Test
    @DisplayName("Quando acessar o site principal, Entao devo ver o titulo viniciuspessoni ")
    void verificaHomePage() {

        WebDriver driver = new ChromeDriver();
        String URL = "http://www.viniciuspessoni.com";
        String tituloEsperado = "por Vinicius Pessoni*";
        String tituloEncontrado = "";

        driver.get(URL);

        tituloEncontrado = driver.findElement(By.cssSelector("div .et_pb_text_inner p[style='text-align: right;']")).getText();

        assertThat(tituloEncontrado, containsString(tituloEsperado));

        driver.quit();
    }
}
