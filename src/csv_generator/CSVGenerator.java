package csv_generator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CSVGenerator {

    // Główna metoda
    public static void main(String[] args) {
        // Definiowanie danych
        List<String[]> data = defineData();

        // Zapis do pliku CSV
        writeCSV(data, "applications.csv");
    }

    // Metoda do definiowania danych
    public static List<String[]> defineData() {
        // Używamy LinkedHashSet, aby zachować unikalność i kolejność danych
        Set<String[]> dataSet = new LinkedHashSet<>();

        dataSet.add(new String[]{"JIRA", "Popularne narzędzie do zarządzania projektami i śledzenia błędów."});
        dataSet.add(new String[]{"Selenium", "Framework do automatyzacji testów przeglądarek."});
        dataSet.add(new String[]{"Postman", "Narzędzie do testowania API."});
        dataSet.add(new String[]{"TestRail", "Platforma do zarządzania przypadkami testowymi."});
        dataSet.add(new String[]{"Jenkins", "Narzędzie do automatyzacji ciągłej integracji i ciągłego dostarczania (CI/CD)."});
        dataSet.add(new String[]{"Appium", "Narzędzie do automatyzacji testów aplikacji mobilnych."});
        dataSet.add(new String[]{"QTest", "Kompleksowe narzędzie do zarządzania testami."});
        dataSet.add(new String[]{"SoapUI", "Narzędzie do testowania usług webowych."});
        dataSet.add(new String[]{"Charles Proxy", "Narzędzie do debugowania sieci."});
        dataSet.add(new String[]{"Katalon Studio", "Kompleksowe narzędzie do automatyzacji testów."});
        dataSet.add(new String[]{"Git", "System kontroli wersji."});
        dataSet.add(new String[]{"Cypress", "Narzędzie do automatyzacji testów end-to-end."});
        dataSet.add(new String[]{"Bugzilla", "Narzędzie do śledzenia błędów."});
        dataSet.add(new String[]{"Visual Studio Code", "Edytor kodu z wsparciem dla wielu języków programowania."});
        dataSet.add(new String[]{"BrowserStack", "Platforma do testowania kompatybilności przeglądarek."});
        dataSet.add(new String[]{"Xray", "Rozszerzenie JIRA do zarządzania testami."});
        dataSet.add(new String[]{"Cucumber", "Narzędzie do testowania akceptacyjnego."});
        dataSet.add(new String[]{"HP ALM (Quality Center)", "Platforma do zarządzania cyklem życia aplikacji."});
        dataSet.add(new String[]{"TestComplete", "Narzędzie do automatyzacji testów UI."});
        dataSet.add(new String[]{"PyTest", "Framework do testowania w języku Python."});
        dataSet.add(new String[]{"Telerik Test Studio", "Narzędzie do automatyzacji testów aplikacji webowych, mobilnych i desktopowych."});
        dataSet.add(new String[]{"Robot Framework", "Open-source'owy framework do automatyzacji testów."});
        dataSet.add(new String[]{"Apache JMeter", "Narzędzie do testowania wydajności."});
        dataSet.add(new String[]{"Zephyr", "Rozszerzenie JIRA do zarządzania testami."});
        dataSet.add(new String[]{"LoadRunner", "Narzędzie do testowania wydajności aplikacji."});
        dataSet.add(new String[]{"Mocha", "Framework do testowania JavaScript."});
        dataSet.add(new String[]{"TestNG", "Framework do testowania dla języka Java."});
        dataSet.add(new String[]{"Ranorex", "Narzędzie do automatyzacji testów UI."});
        dataSet.add(new String[]{"QTP (UFT)", "Narzędzie do automatyzacji testów funkcjonalnych."});
        dataSet.add(new String[]{"Chai", "Biblioteka do asercji w JavaScript."});
        dataSet.add(new String[]{"NUnit", "Framework do testowania dla języka C#."});
        dataSet.add(new String[]{"SpecFlow", "Narzędzie do testowania akceptacyjnego dla .NET."});
        dataSet.add(new String[]{"Appium Desktop", "GUI dla Appium."});
        dataSet.add(new String[]{"Protractor", "Framework do testowania end-to-end dla aplikacji AngularJS."});
        dataSet.add(new String[]{"TestLink", "Narzędzie do zarządzania testami."});
        dataSet.add(new String[]{"TestProject", "Platforma do automatyzacji testów."});
        dataSet.add(new String[]{"Gauge", "Framework do automatyzacji testów."});
        dataSet.add(new String[]{"Calabash", "Narzędzie do automatyzacji testów aplikacji mobilnych."});
        dataSet.add(new String[]{"Applitools", "Narzędzie do wizualnego testowania UI."});
        dataSet.add(new String[]{"TestArchitect", "Narzędzie do automatyzacji testów."});
        dataSet.add(new String[]{"Eggplant", "Narzędzie do automatyzacji testów."});
        dataSet.add(new String[]{"Fiddler", "Narzędzie do debugowania sieci."});
        dataSet.add(new String[]{"Tricentis Tosca", "Narzędzie do automatyzacji testów."});
        dataSet.add(new String[]{"JUnit", "Framework do testowania dla języka Java."});
        dataSet.add(new String[]{"PyCharm", "Zintegrowane środowisko programistyczne (IDE) dla języka Python."});
        dataSet.add(new String[]{"AirTest", "Framework do automatyzacji testów dla aplikacji mobilnych i gier."});
        dataSet.add(new String[]{"Gatling", "Narzędzie do testowania wydajności."});
        dataSet.add(new String[]{"Coded UI Tests (CUIT)", "Narzędzie do automatyzacji testów UI dla aplikacji Windows."});
        dataSet.add(new String[]{"K6", "Narzędzie do testowania wydajności."});
        dataSet.add(new String[]{"Cucumber.js", "Narzędzie do testowania akceptacyjnego dla aplikacji JavaScript."});
        dataSet.add(new String[]{"LoadUI", "Narzędzie do testowania wydajności aplikacji webowych i usług."});
        dataSet.add(new String[]{"Micro Focus Silk Test", "Narzędzie do automatyzacji testów."});
        dataSet.add(new String[]{"Apache Benchmark (ab)", "Proste narzędzie do testowania wydajności serwerów HTTP."});
        dataSet.add(new String[]{"Kobiton", "Platforma do testowania aplikacji mobilnych w chmurze."});
        dataSet.add(new String[]{"Sikuli", "Narzędzie do automatyzacji testów wizualnych."});
        dataSet.add(new String[]{"Rational Functional Tester (RFT)", "Narzędzie do automatyzacji testów IBM."});
        dataSet.add(new String[]{"Testim", "Narzędzie do automatyzacji testów wspierane przez sztuczną inteligencję."});
        dataSet.add(new String[]{"Telerik JustMock", "Narzędzie do tworzenia mocków dla testów jednostkowych w .NET."});
        dataSet.add(new String[]{"Robotium", "Narzędzie do automatyzacji testów aplikacji Android."});
        dataSet.add(new String[]{"Test Studio", "Narzędzie do automatyzacji testów aplikacji webowych, mobilnych i desktopowych."});
        dataSet.add(new String[]{"SpiraTest", "Narzędzie do zarządzania testami i wymaganiami."});
        dataSet.add(new String[]{"Nightwatch.js", "Narzędzie do automatyzacji testów end-to-end dla aplikacji webowych."});
        dataSet.add(new String[]{"WebLOAD", "Narzędzie do testowania wydajności."});
        dataSet.add(new String[]{"Sahi", "Narzędzie do automatyzacji testów webowych."});
        dataSet.add(new String[]{"Behat", "Narzędzie do testowania akceptacyjnego dla PHP."});
        dataSet.add(new String[]{"NeoLoad", "Narzędzie do testowania wydajności."});
        dataSet.add(new String[]{"Karate", "Framework do testowania API."});
        dataSet.add(new String[]{"AppDynamics", "Narzędzie do monitorowania wydajności aplikacji."});
        dataSet.add(new String[]{"Jasmine", "Framework do testowania JavaScript."});
        dataSet.add(new String[]{"WireMock", "Narzędzie do tworzenia mocków dla API."});
        dataSet.add(new String[]{"Allure", "Framework do raportowania wyników testów."});
        dataSet.add(new String[]{"Browserling", "Narzędzie do testowania kompatybilności przeglądarek."});
        dataSet.add(new String[]{"Sitespeed.io", "Narzędzie do analizy wydajności stron internetowych."});
        dataSet.add(new String[]{"Xamarin Test Cloud", "Platforma do automatyzacji testów aplikacji mobilnych."});
        dataSet.add(new String[]{"Galen Framework", "Narzędzie do testowania układu stron internetowych."});
        dataSet.add(new String[]{"QF-Test", "Narzędzie do automatyzacji testów aplikacji Java i webowych."});
        dataSet.add(new String[]{"EggPlant Performance", "Narzędzie do testowania wydajności aplikacji."});
        dataSet.add(new String[]{"FitNesse", "Narzędzie do testowania akceptacyjnego."});
        dataSet.add(new String[]{"SoapSonar", "Narzędzie do testowania API."});
        dataSet.add(new String[]{"Micro Focus UFT One", "Narzędzie do automatyzacji testów funkcjonalnych."});
        dataSet.add(new String[]{"Serenity BDD", "Framework do testowania akceptacyjnego i automatyzacji testów."});
        dataSet.add(new String[]{"ZAP (Zed Attack Proxy)", "Narzędzie do testowania bezpieczeństwa aplikacji webowych."});
        dataSet.add(new String[]{"LoadNinja", "Narzędzie do testowania wydajności aplikacji webowych."});
        dataSet.add(new String[]{"IBM Rational Quality Manager", "Narzędzie do zarządzania jakością oprogramowania."});
        dataSet.add(new String[]{"TestCafe", "Narzędzie do automatyzacji testów end-to-end dla aplikacji webowych."});
        dataSet.add(new String[]{"BrowserShots", "Narzędzie do testowania kompatybilności przeglądarek."});
        dataSet.add(new String[]{"BlazeMeter", "Narzędzie do testowania wydajności w chmurze."});
        dataSet.add(new String[]{"Leapwork", "Narzędzie do automatyzacji testów wizualnych."});
        dataSet.add(new String[]{"WebInject", "Narzędzie do testowania aplikacji webowych i API."});
        dataSet.add(new String[]{"Capybara", "Narzędzie do testowania aplikacji webowych napisanych w Ruby."});
        dataSet.add(new String[]{"BrowserSync", "Narzędzie do testowania i synchronizacji przeglądarek."});
        dataSet.add(new String[]{"Citrus", "Framework do testowania integracyjnego."});
        dataSet.add(new String[]{"Geb", "Narzędzie do automatyzacji testów aplikacji webowych napisanych w Groovy."});
        dataSet.add(new String[]{"Arquillian", "Framework do testowania aplikacji Java."});
        dataSet.add(new String[]{"Tessy", "Narzędzie do testowania jednostkowego dla wbudowanych systemów C/C++."});
        dataSet.add(new String[]{"Faker", "Biblioteka do generowania fałszywych danych testowych."});
        dataSet.add(new String[]{"Karma", "Narzędzie do testowania JavaScript."});
        dataSet.add(new String[]{"Artillery", "Narzędzie do testowania wydajności aplikacji webowych."});

        // Konwersja do listy
        return new ArrayList<>(dataSet);

    }

    // Metoda do zapisu do pliku CSV
    public static void writeCSV(List<String[]> data, String fileName) {
        try (BufferedWriter csvWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), StandardCharsets.UTF_8))) {
            // Zapis nagłówków z BOM (Byte Order Mark) dla poprawnego odczytu UTF-8 w niektórych edytorach
            csvWriter.write('\uFEFF');
            csvWriter.write("Name,Description\n");

            // Zapis danych
            for (String[] rowData : data) {
                csvWriter.write(String.join(",", rowData));
                csvWriter.write("\n");
            }

            csvWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}