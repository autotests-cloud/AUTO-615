package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("main page test")
    void generatedTest() {
        step("Open https://kupithai.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("common-home us-main-shop-title shouldHave text \"Тайская косметика и товары из Тайланда\"", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://kupithai.ru/'", () ->
            open("https://kupithai.ru/"));

        step("Page title should have text 'Тайская косметика купить в интернет магазине в Москве | Товары из Тайланда'", () -> {
            String expectedTitle = "Тайская косметика купить в интернет магазине в Москве | Товары из Тайланда";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://kupithai.ru/'", () ->
            open("https://kupithai.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}