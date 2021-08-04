package com.demoqa.pageObjects;

import com.demoqa.configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends Base{
    /*
    Переменная логгирования.
     */
    protected static final Logger logger = Logger.getLogger(MenuPage.class);

    /*
    Переменная основной конфигурации.
     */
    protected GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
    /*
    Время ожидания элемента.
     */
    int sec = config.secWait();

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='main-header']")
    private WebElement header;

    @FindBy(xpath = ".//div[@class='col-12 mt-4 col-md-6']")
    private WebElement textInBlock;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Text Box']")
    private WebElement textBox;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Check Box']")
    private WebElement checkBox;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Radio Button']")
    private WebElement radioButton;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Web Tables']")
    private WebElement webTables;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Buttons']")
    private WebElement buttons;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Links']")
    private WebElement links;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Broken Links - Images']")
    private WebElement brokenLinksImages;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Upload and Download']")
    private WebElement uploadAndDownload;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Dynamic Properties']")
    private WebElement dynamicProperties;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Practice Form']")
    private WebElement practiceForm;


    @FindBy(xpath = ".//span[@class='text' and text() = 'Browser Windows']")
    private WebElement browserWindows;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Alerts']")
    private WebElement alerts2;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Frames']")
    private WebElement frames;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Nested Frames']")
    private WebElement nestedFrames;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Modal Dialogs']")
    private WebElement modalDialogs;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Accordian']")
    private WebElement accordian;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Auto Complete']")
    private WebElement autoComplete;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Date Picker']")
    private WebElement datePicker;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Slider']")
    private WebElement slider;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Progress Bar']")
    private WebElement progressBar;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Tabs']")
    private WebElement tabs;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Tool Tips']")
    private WebElement toolTips;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Menu']")
    private WebElement menu;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Select Menu']")
    private WebElement selectMenu;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Sortable']")
    private WebElement sortable;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Selectable']")
    private WebElement selectable;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Resizable']")
    private WebElement resizable;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Droppable']")
    private WebElement droppable;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Dragabble']")
    private WebElement dragabble;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Login']")
    private WebElement login;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Book Store']")
    private WebElement bookStore;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Profile']")
    private WebElement profile;

    @FindBy(xpath = ".//span[@class='text' and text() = 'Book Store API']")
    private WebElement bookStoreAPI;

    @FindBy(xpath = ".//div[@class='element-list collapse show']")
    private WebElement elementListShow;


    @FindBy(xpath = ".//div[@class='header-text' and text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "(.//div[@class='card-up'])[1]")
    private WebElement elementsBlock;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Alerts, Frame & Windows']")
    private WebElement alerts;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Widgets']")
    private WebElement widgets;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Interactions']")
    private WebElement interactions;

    @FindBy(xpath = ".//div[@class='header-text' and text()='Book Store Application']")
    private WebElement book;


    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleElements(){
        logger.info("Проверяем что элемент elements есть на странице.");
        return waitVisibilityOfElement(elements, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleForms(){
        logger.info("Проверяем что элемент forms есть на странице.");
        return waitVisibilityOfElement(forms, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleAlerts(){
        logger.info("Проверяем что элемент alerts есть на странице.");
        return waitVisibilityOfElement(alerts, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleWidgets(){
        logger.info("Проверяем что элемент widgets есть на странице.");
        return waitVisibilityOfElement(widgets, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleInteractions(){
        logger.info("Проверяем что элемент interactions есть на странице.");
        return waitVisibilityOfElement(interactions, sec);
    }

    /**
     * Проверяем что блок меню есть.
     * @return true/false
     */
    public Boolean visibleBook(){
        logger.info("Проверяем что элемент book есть на странице.");
        return waitVisibilityOfElement(book, sec);
    }



    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleTextBox(){
        logger.info("Проверяем что элемент textBox есть на странице.");
        return waitToBeClickable(textBox);
    }
    /**
     * Проверяем что раздел Elements закрыт.
     * @return true/false
     */
    public Boolean visibleTextBoxFalse(){
        logger.info("Проверяем что раздел Elements закрыт.");
        return waitToBeClickable(textBox, 0);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleCheckBox(){
        logger.info("Проверяем что элемент checkBox есть на странице.");
        return waitToBeClickable(checkBox);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleRadioButton(){
        logger.info("Проверяем что элемент radioButton есть на странице.");
        return waitToBeClickable(radioButton);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleWebTables(){
        logger.info("Проверяем что элемент webTables есть на странице.");
        return waitToBeClickable(webTables);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleButtons(){
        logger.info("Проверяем что элемент buttons есть на странице.");
        return waitToBeClickable(buttons);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleLinks(){
        logger.info("Проверяем что элемент links есть на странице.");
        return waitToBeClickable(links);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleBrokenLinksImages(){
        logger.info("Проверяем что элемент brokenLinksImages есть на странице.");
        return waitToBeClickable(brokenLinksImages);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleUploadAndDownload(){
        logger.info("Проверяем что элемент uploadAndDownload есть на странице.");
        return waitToBeClickable(uploadAndDownload);
    }

    /**
     * Проверяем что раздел есть.
     * @return true/false
     */
    public Boolean visibleDynamicProperties(){
        logger.info("Проверяем что элемент dynamicProperties есть на странице.");
        return waitToBeClickable(dynamicProperties);
    }

    /**
     * Проверка что блок раскрыт.
     * @return true/false
     */
    public Boolean visibleElementListShow(){
        logger.info("Проверяем что элемент elementListShow есть на странице.");
        return waitVisibilityOfElement(elementListShow, sec);
    }

    /**
     * Проверка что elements header на странице.
     * @return true/false
     */
    public Boolean visibleHeader(){
        logger.info("Проверяем что элемент Elements есть на странице.");
        return waitVisibilityOfElement(header, sec);
    }

    /**
     * Возвращаем текст элемента header.
     * @return текст элемента.
     */
    public String getHeaderText(){
        logger.info("Возвращаем текст элемента header.");
        return header.getText();
    }


    /**
     * Возвращаем текст элемента textBox.
     * @return текст элемента.
     */
    public String getTextBoxText(){
        logger.info("Возвращаем текст элемента textBox.");
        return textBox.getText();
    }

    /**
     * Возвращаем текст элемента checkBox.
     * @return текст элемента.
     */
    public String getCheckBoxText(){
        logger.info("Возвращаем текст элемента checkBox.");
        return checkBox.getText();
    }

    /**
     * Возвращаем текст элемента radioButton.
     * @return текст элемента.
     */
    public String getRadioButtonText(){
        logger.info("Возвращаем текст элемента radioButton.");
        return radioButton.getText();
    }

    /**
     * Возвращаем текст элемента webTables.
     * @return текст элемента.
     */
    public String getWebTablesText(){
        logger.info("Возвращаем текст элемента webTables.");
        return webTables.getText();
    }

    /**
     * Возвращаем текст элемента buttons.
     * @return текст элемента.
     */
    public String getButtonsText(){
        logger.info("Возвращаем текст элемента buttons.");
        return buttons.getText();
    }

    /**
     * Возвращаем текст элемента links.
     * @return текст элемента.
     */
    public String getLinksText(){
        logger.info("Возвращаем текст элемента links.");
        return links.getText();
    }

    /**
     * Возвращаем текст элемента brokenLinksImages.
     * @return текст элемента.
     */
    public String getBrokenLinksImagesText(){
        logger.info("Возвращаем текст элемента brokenLinksImages.");
        return brokenLinksImages.getText();
    }

    /**
     * Возвращаем текст элемента uploadAndDownload.
     * @return текст элемента.
     */
    public String getUploadDownloadText(){
        logger.info("Возвращаем текст элемента uploadAndDownload.");
        return uploadAndDownload.getText();
    }

    /**
     * Возвращаем текст элемента dynamicProperties.
     * @return текст элемента.
     */
    public String getDynamicPropertiesText(){
        logger.info("Возвращаем текст элемента dynamicProperties.");
        return dynamicProperties.getText();
    }

    /**
     * Возвращаем текст элемента practiceForm.
     * @return текст элемента.
     */
    public String getPracticeFormText(){
        logger.info("Возвращаем текст элемента practiceForm.");
        return practiceForm.getText();
    }

    /**
     * Возвращаем текст элемента browserWindows.
     * @return текст элемента.
     */
    public String getBrowserWindowsText(){
        logger.info("Возвращаем текст элемента browserWindows.");
        return browserWindows.getText();
    }

    /**
     * Возвращаем текст элемента alerts2.
     * @return текст элемента.
     */
    public String getAlerts2Text(){
        logger.info("Возвращаем текст элемента alerts2.");
        return alerts2.getText();
    }

    /**
     * Возвращаем текст элемента frames.
     * @return текст элемента.
     */
    public String getFramesText(){
        logger.info("Возвращаем текст элемента frames.");
        return frames.getText();
    }

    /**
     * Возвращаем текст элемента nestedFrames.
     * @return текст элемента.
     */
    public String getNestedFramesText(){
        logger.info("Возвращаем текст элемента nestedFrames.");
        return nestedFrames.getText();
    }

    /**
     * Возвращаем текст элемента modalDialogs.
     * @return текст элемента.
     */
    public String getModalDialogsText(){
        logger.info("Возвращаем текст элемента modalDialogs.");
        return modalDialogs.getText();
    }

    /**
     * Возвращаем текст элемента accordian.
     * @return текст элемента.
     */
    public String getAccordianText(){
        logger.info("Возвращаем текст элемента accordian.");
        return accordian.getText();
    }

    /**
     * Возвращаем текст элемента autoComplete.
     * @return текст элемента.
     */
    public String getAutoCompleteText(){
        logger.info("Возвращаем текст элемента autoComplete.");
        return autoComplete.getText();
    }

    /**
     * Возвращаем текст элемента datePicker.
     * @return текст элемента.
     */
    public String getDatePickerText(){
        logger.info("Возвращаем текст элемента datePicker.");
        return datePicker.getText();
    }

    /**
     * Возвращаем текст элемента slider.
     * @return текст элемента.
     */
    public String getSliderText(){
        logger.info("Возвращаем текст элемента slider.");
        return slider.getText();
    }

    /**
     * Возвращаем текст элемента progressBar.
     * @return текст элемента.
     */
    public String getProgressBarText(){
        logger.info("Возвращаем текст элемента progressBar.");
        return progressBar.getText();
    }

    /**
     * Возвращаем текст элемента tabs.
     * @return текст элемента.
     */
    public String getTabsText(){
        logger.info("Возвращаем текст элемента tabs.");
        return tabs.getText();
    }

    /**
     * Возвращаем текст элемента toolTips.
     * @return текст элемента.
     */
    public String getToolTipsText(){
        logger.info("Возвращаем текст элемента toolTips.");
        return toolTips.getText();
    }

    /**
     * Возвращаем текст элемента menu.
     * @return текст элемента.
     */
    public String getMenuText(){
        logger.info("Возвращаем текст элемента menu.");
        return menu.getText();
    }

    /**
     * Возвращаем текст элемента selectMenu.
     * @return текст элемента.
     */
    public String getSelectMenuText(){
        logger.info("Возвращаем текст элемента selectMenu.");
        return selectMenu.getText();
    }

    /**
     * Возвращаем текст элемента sortable.
     * @return текст элемента.
     */
    public String getSortableText(){
        logger.info("Возвращаем текст элемента sortable.");
        return sortable.getText();
    }

    /**
     * Возвращаем текст элемента selectable.
     * @return текст элемента.
     */
    public String getSelectableText(){
        logger.info("Возвращаем текст элемента selectable.");
        return selectable.getText();
    }

    /**
     * Возвращаем текст элемента resizable.
     * @return текст элемента.
     */
    public String getResizableText(){
        logger.info("Возвращаем текст элемента resizable.");
        return resizable.getText();
    }

    /**
     * Возвращаем текст элемента dragabble.
     * @return текст элемента.
     */
    public String getDragabbleText(){
        logger.info("Возвращаем текст элемента dragabble.");
        return dragabble.getText();
    }

    /**
     * Возвращаем текст элемента droppable.
     * @return текст элемента.
     */
    public String getDroppableText(){
        logger.info("Возвращаем текст элемента droppable.");
        return droppable.getText();
    }

    /**
     * Возвращаем текст элемента login.
     * @return текст элемента.
     */
    public String getLoginText(){
        logger.info("Возвращаем текст элемента login.");
        return login.getText();
    }

    /**
     * Возвращаем текст элемента bookStore.
     * @return текст элемента.
     */
    public String getBookStoreText(){
        logger.info("Возвращаем текст элемента bookStore.");
        return bookStore.getText();
    }

    /**
     * Возвращаем текст элемента profile.
     * @return текст элемента.
     */
    public String getProfileText(){
        logger.info("Возвращаем текст элемента profile.");
        return profile.getText();
    }

    /**
     * Возвращаем текст элемента bookStoreAPI.
     * @return текст элемента.
     */
    public String getBookStoreAPIText(){
        logger.info("Возвращаем текст элемента bookStoreAPI.");
        return bookStoreAPI.getText();
    }

    /**
     * Проверка что textInBlock  на странице.
     * @return true/false
     */
    public Boolean visibleTextInBlock(){
        logger.info("Проверяем что элемент textInBlock есть на странице.");
        return waitVisibilityOfElement(textInBlock, sec);
    }

    /**
     * Возвращаем текст элемента textInBlock.
     * @return текст элемента.
     */
    public String getTextInBlock(){
        logger.info("Возвращаем текст элемента textInBlock.");
        return textInBlock.getText();
    }


    /**
     * Кликаем по Forms
     */
    public void clickForms(){
        logger.info("Кликаем по блоку Forms");
        click(forms);
    }

    /**
     * Кликаем по Alerts, Frame & Windows
     */
    public void clickAlerts(){
        logger.info("Кликаем по блоку Alerts, Frame & Windows");
        click(alerts);
    }


    /**
     * Кликаем по elements
     */
    public void clickElements(){
        logger.info("Кликаем по блоку Elements");
        click(elementsBlock);
    }

    /**
     * Кликаем по Text Box
     */
    public void clickTextBox(){
        logger.info("Кликаем по разделу Text Box");
        click(textBox);
    }

    /**
     * Кликаем по Check Box
     */
    public void clickCheckBox(){
        logger.info("Кликаем по разделу Check Box");
        click(checkBox);
    }

    /**
     * Кликаем по Radio Button
     */
    public void clickRadioButton(){
        logger.info("Кликаем по разделу Radio Button");
        click(radioButton);
    }

    /**
     * Кликаем по webTables
     */
    public void clickWebTables(){
        logger.info("Кликаем по разделу web Tables");
        click(webTables);
    }

    /**
     * Кликаем по webTables
     */
    public void scrollToWebTables(){
        logger.info("Прокручиваем страницу к разделу web Tables");
        scrollToElement(webTables);
    }

    /**
     * Кликаем по Upload And Download
     */
    public void scrollToBrowserWindows(){
        logger.info("Прокручиваем страницу к разделу browserWindows");
        scrollToElement(browserWindows);
    }

    /**
     * Кликаем по Upload And Download
     */
    public void scrollToUploadAndDownload(){
        logger.info("Прокручиваем страницу к разделу Upload And Download");
        scrollToElement(uploadAndDownload);
    }

    /**
     * Кликаем по buttons
     */
    public void clickButtons(){
        logger.info("Кликаем по разделу buttons");
        click(buttons);
    }

    /**
     * Кликаем по Links
     */
    public void clickLinks(){
        logger.info("Кликаем по разделу Links");
        click(links);
    }

    /**
     * Кликаем по Broken Links - Images
     */
    public void clickBrokenLinksImages(){
        logger.info("Кликаем по разделу Broken Links - Images");
        click(brokenLinksImages);
    }

    /**
     * Кликаем по Upload and Download
     */
    public void clickUploadDownload(){
        logger.info("Кликаем по разделу Upload and Download");
        click(uploadAndDownload);
    }

    /**
     * Кликаем по Dynamic Properties
     */
    public void clickDynamicProperties(){
        logger.info("Кликаем по разделу Dynamic Properties");
        click(dynamicProperties);
    }

    /**
     * Кликаем по Practice Form
     */
    public void clickPracticeForm(){
        logger.info("Кликаем по разделу Practice Form");
        click(practiceForm);
    }

    /**
     * Кликаем по Browser Windows
     */
    public void clickBrowserWindows(){
        logger.info("Кликаем по разделу Browser Windows");
        click(browserWindows);
    }

    /**
     * Кликаем по Alerts
     */
    public void clickAlerts2(){
        logger.info("Кликаем по разделу Alerts");
        click(alerts2);
    }

    /**
     * Кликаем по Frames
     */
    public void clickFrames(){
        logger.info("Кликаем по разделу Frames");
        click(frames);
    }

    /**
     * Кликаем по Nested Frames
     */
    public void clickNestedFrames(){
        logger.info("Кликаем по разделу Nested Frames");
        click(nestedFrames);
    }

    /**
     * Кликаем по Modal Dialogs
     */
    public void clickModalDialogs(){
        logger.info("Кликаем по разделу Modal Dialogs");
        click(modalDialogs);
    }

    /**
     * Кликаем по Accordian
     */
    public void clickAccordian(){
        logger.info("Кликаем по разделу Accordian");
        click(accordian);
    }

    /**
     * Кликаем по Auto Complete
     */
    public void clickAutoComplete(){
        logger.info("Кликаем по разделу Auto Complete");
        click(autoComplete);
    }

    /**
     * Кликаем по Date Picker
     */
    public void clickDatePicker(){
        logger.info("Кликаем по разделу Date Picker");
        click(datePicker);
    }

    /**
     * Кликаем по Slider
     */
    public void clickSlider(){
        logger.info("Кликаем по разделу Slider");
        click(slider);
    }

    /**
     * Кликаем по Progress Bar
     */
    public void clickProgressBar(){
        logger.info("Кликаем по разделу Progress Bar");
        click(progressBar);
    }

    /**
     * Кликаем по Tabs
     */
    public void clickTabs(){
        logger.info("Кликаем по разделу Tabs");
        click(tabs);
    }

    /**
     * Кликаем по Tool Tips
     */
    public void clickToolTips(){
        logger.info("Кликаем по разделу Tool Tips");
        click(toolTips);
    }

    /**
     * Кликаем по Menu
     */
    public void clickMenu(){
        logger.info("Кликаем по разделу Menu");
        click(menu);
    }

    /**
     * Кликаем по Select Menu
     */
    public void clickSelectMenu(){
        logger.info("Кликаем по разделу Select Menu");
        click(selectMenu);
    }

    /**
     * Кликаем по Sortable
     */
    public void clickSortable(){
        logger.info("Кликаем по разделу Sortable");
        click(sortable);
    }

    /**
     * Кликаем по Selectable
     */
    public void clickSelectable(){
        logger.info("Кликаем по разделу Selectable");
        click(selectable);
    }

    /**
     * Кликаем по Resizable
     */
    public void clickResizable(){
        logger.info("Кликаем по разделу Resizable");
        click(resizable);
    }

    /**
     * Кликаем по Droppable
     */
    public void clickDroppable(){
        logger.info("Кликаем по разделу Droppable");
        click(droppable);
    }

    /**
     * Кликаем по Dragabble
     */
    public void clickDragabble(){
        logger.info("Кликаем по разделу Dragabble");
        click(dragabble);
    }

    /**
     * Кликаем по Login
     */
    public void clickLogin(){
        logger.info("Кликаем по разделу Login");
        click(login);
    }

    /**
     * Кликаем по Book Store
     */
    public void clickBookStore(){
        logger.info("Кликаем по разделу Book Store");
        click(bookStore);
    }

    /**
     * Кликаем по Profile
     */
    public void clickProfile(){
        logger.info("Кликаем по разделу Profile");
        click(profile);
    }

    /**
     * Кликаем по Book Store API
     */
    public void clickBookStoreAPI(){
        logger.info("Кликаем по разделу Book Store API");
        click(bookStoreAPI);
    }


}
