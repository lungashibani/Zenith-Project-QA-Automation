package StepDefinitions;

import PageObjects.Asifs_HudPage;
import PageObjects.Asifs_LoginPage;
import PageObjects.Asifs_NewCandidatePage;
import PageObjects.BasePage;
import PageObjects.Blockers.OrganisationClientContactAddClientToOrganisationPage;
import PageObjects.Sprint29.FEAndBETransitionToCVSentStageSingleOrMultiPage;
import PageObjects.Sprint29.FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage;
import PageObjects.Working.OrganisationAddListPage;
import PageObjects.Blockers.OrganisationRecordLocationEditLocationPage;
import PageObjects.Working.LoginNewPage;
import PageObjects.Working.JobsEditActivityPage;
import PageObjects.Working.ClientAddAlertPage;
import PageObjects.Working.CandidateActivityEditActivityPage;
import PageObjects.Working.PipelineManagementEmptyStatesforGridPage;
import PageObjects.Working.FEChangeStageDropdownPage;
import PageObjects.Working.*;
import PageObjects.Working.OrganisationPlusTopButtonAddAlertToRecord;
import PageObjects.Working.ClientLinkCandidatePage;
import PageObjects.Working.CandidatePlusTopButtonAddToListNewListPage;
import PageObjects.Working.CandidatePlusTopButtonAddToListPage;
import PageObjects.Working.OrganisationLinkedJobsSubsidiaryOrganisationPage;
import PageObjects.Working.JobsAddAlertPage;
import PageObjects.Working.ClientContactRecordRemoveCandidatePage;
import PageObjects.Working.ClientContactRecordJobsTabPage;
import PageObjects.Working.CandidateRecordModalsMandatoryLocationFieldPage;
import PageObjects.Working.OrganisationEditListPage;
import PageObjects.Working.FEAddCandidateToJobTransitionToLonglistPage;
import PageObjects.newFeatures.Blockers.FECandidateViewActivityActivityFilterPage;
import PageObjects.Working.FEDirectTransitionsToShortlistStagePage;
import PageObjects.Working.FEGridViewOfferPlacedPage;
import PageObjects.Working.FEClientContactCreateActivityActivityModalPage;
import PageObjects.Working.FEJobCreateActivityActivityModalPage;
import PageObjects.Working.FEOrganisationCreateActivityActivityModalPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.hotkey.Keys;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class Steps {

    public WebDriver driver;
    public WebDriverWait wait;
    public CreateNewJobPage lp;
    public CreateCandidatesPage ccp;
    public CreateNewJobPage cjp;
    public CreateNewClientContactPage cnc;
    public CandidateRemoveLinkClientContactPage lop;
    public CandidateSummaryAddQualificationPage csp;
    public CandidatePersonalUpdateAddressPage cpp;
    public CandidateCareerAddNewRolePage nrp;
    public CreateNewCandidateListPage nlp;
    public CandidateActivityAddNewActivityPage ana;
    public CreateNewOrganisationPage cno;
    public OrganisationLocationPlusBtnMiddleAddLocationPage oal;
    public CandidateEditCandidateListPage elp;
    public ClientInformationMiddleplusBtnAddNewPositionPage cnpp;
    public CandidateAddCandidateReviewPage acrp;
    public ClientPlusButtonTopAddClientToListPage aclp;
    public ClientPlusButtonTopAddClientToListNewList aclnlp;
    public OrganisationPlusTopButtonAddAlertToRecord arp;
    public OrganisationAddToListPage oalp;
    public OrganisationAddToListNewListPage nolp;
    public ClientLinkCandidatePage clcp;
    public ClientAddAlertPage caap;
    public CandidatePlusTopButtonAddToListPage catlp;
    public CandidatePlusTopButtonAddToListNewListPage catlnlp;
    public OrganisationEditListPage oelp;
    public OrganisationLinkedJobsSubsidiaryOrganisationPage sop;
    public JobsAddAlertPage jaap;
    public CandidateRecordModalsMandatoryLocationFieldPage mlfp;
    public ClientContactRecordJobsTabPage ccrjp;
    public ClientContactRecordRemoveCandidatePage ccrrcp;
    public CandidateActivityEditActivityPage caeap;
    public FEChangeStageDropdownPage fecsdp;
    public PipelineManagementEmptyStatesforGridPage pmesgp;
    public OrganisationEditActivityPage oeap;
    public JobsEditActivityPage jeap;
    public LoginNewPage lgnp;
    public FECandidateViewActivityActivityFilterPage cvafp;
    public FEGridViewOfferPlacedPage gvop;
    public FEAddCandidateToJobTransitionToLonglistPage acjtlp;
    public FEDirectTransitionsToShortlistStagePage dttslp;
    public FEOrganisationCreateActivityActivityModalPage ocamp;
    public FEClientContactCreateActivityActivityModalPage cccamp;
    public FEJobCreateActivityActivityModalPage jcamp;
    public OrganisationClientContactAddClientToOrganisationPage olocp;
    public OrganisationPlusTopButtonAddAlertToRecord opbaatrp;
    public OrganisationRecordLocationEditLocationPage orlelp;
    public OrganisationAddListPage oalnp;
    public FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage iptos;
    public FEAndBETransitionToCVSentStageSingleOrMultiPage ttcvs;

    public Asifs_LoginPage asifs_loginPage;
    public Asifs_HudPage asifs_hudPage;
    public Asifs_NewCandidatePage asifs_newCandidatePage;


    @Before
    public void doSomethingBefore(Scenario scenario) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver_v90.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        asifs_hudPage = new Asifs_HudPage(driver, wait);
        asifs_loginPage = new Asifs_LoginPage(driver, wait);
        asifs_newCandidatePage = new Asifs_NewCandidatePage(driver, wait);
    }

    @After
    public void doSomethingAfter(Scenario scenario) {
        if (driver != null) {
            //driver.quit();
        }

    }

    @Given("User launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver/chromedriver_v90.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lp = new CreateNewJobPage(driver);
        ccp = new CreateCandidatesPage(driver);
        cjp = new CreateNewJobPage(driver);
        cnc = new CreateNewClientContactPage(driver);
        lop = new CandidateRemoveLinkClientContactPage(driver);
        csp = new CandidateSummaryAddQualificationPage(driver);
        cpp = new CandidatePersonalUpdateAddressPage(driver);
        nrp = new CandidateCareerAddNewRolePage(driver);
        nlp = new CreateNewCandidateListPage(driver);
        ana = new CandidateActivityAddNewActivityPage(driver);
        cno = new CreateNewOrganisationPage(driver);
        oal = new OrganisationLocationPlusBtnMiddleAddLocationPage(driver);
        elp = new CandidateEditCandidateListPage(driver);
        cnpp = new ClientInformationMiddleplusBtnAddNewPositionPage(driver);
        acrp = new CandidateAddCandidateReviewPage(driver);
        aclp = new ClientPlusButtonTopAddClientToListPage(driver);
        aclnlp = new ClientPlusButtonTopAddClientToListNewList(driver);
        arp = new OrganisationPlusTopButtonAddAlertToRecord(driver);
        oalp = new OrganisationAddToListPage(driver);
        nolp = new OrganisationAddToListNewListPage(driver);
        clcp = new ClientLinkCandidatePage(driver);
        caap = new ClientAddAlertPage(driver);
        catlp = new CandidatePlusTopButtonAddToListPage(driver);
        catlnlp = new CandidatePlusTopButtonAddToListNewListPage(driver);
        oelp = new OrganisationEditListPage(driver);
        sop = new OrganisationLinkedJobsSubsidiaryOrganisationPage(driver);
        jaap = new JobsAddAlertPage(driver);
        mlfp = new CandidateRecordModalsMandatoryLocationFieldPage(driver);
        ccrjp = new ClientContactRecordJobsTabPage(driver);
        ccrrcp = new ClientContactRecordRemoveCandidatePage(driver);
        caeap = new CandidateActivityEditActivityPage(driver);
        //crccp = new CandidateRemoveClientContactPage(driver);
        fecsdp = new FEChangeStageDropdownPage(driver);
        pmesgp = new PipelineManagementEmptyStatesforGridPage(driver);
        oeap = new OrganisationEditActivityPage(driver);
        jeap = new JobsEditActivityPage(driver);
        lgnp = new LoginNewPage(driver);
        cvafp = new FECandidateViewActivityActivityFilterPage(driver);
        gvop = new FEGridViewOfferPlacedPage(driver);
        acjtlp = new FEAddCandidateToJobTransitionToLonglistPage(driver);
        dttslp = new FEDirectTransitionsToShortlistStagePage(driver);
        ocamp = new FEOrganisationCreateActivityActivityModalPage(driver);
        cccamp = new FEClientContactCreateActivityActivityModalPage(driver);
        jcamp = new FEJobCreateActivityActivityModalPage(driver);
        olocp = new OrganisationClientContactAddClientToOrganisationPage(driver);
        opbaatrp = new OrganisationPlusTopButtonAddAlertToRecord(driver);
        orlelp = new OrganisationRecordLocationEditLocationPage(driver);
        oalnp = new OrganisationAddListPage(driver);
        iptos = new FEImplementPaginationToTransitionToOfferStageSingleOrMultiPage(driver);
        ttcvs = new FEAndBETransitionToCVSentStageSingleOrMultiPage(driver);
    }


    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("User enters Username as {string}")
    public void user_enters_username_as(String username) {
        lp.setTxtUsername(username);
    }

    @Then("User enters Password as {string}")
    public void user_enters_password_as(String password) {
        lp.setTxtPassword(password);
    }

    @Then("Clicks on SignIn button")
    public void click_on_sign_in_button() {
        lp.clickBtnSignIn();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @When("User Clicks on Universal Plus Button")
    public void user_clicks_on_universal_plus_button() {
        lp.clickBtnUniversalPlusSign();
    }


    //########################################CREATE CANDIDATE####################################################

    @When("Clicks on Create Candidate Button")
    public void clicks_on_create_candidate_button() {
        ccp.clickBtnCreateCandidate();
    }

    @Then("User enters First Name as {string}")
    public void user_enters_first_name_as(String fName) {
        ccp.setTxtFirstName(fName);
    }

    @Then("User enters Family Name as {string}")
    public void user_enters_family_name_as(String lName) {
        ccp.setTxtFamilyName(lName);
    }

    @Then("User enters City as {string}")
    public void user_enters_cit_as(String cName) {
        ccp.setTxtCityOrTownOrSuburbs(cName);
    }


    @Then("User clicks on Add Contacts button")
    public void user_clicks_on_add_contacts_button() {
        ccp.clickBtnAddContacts();
    }

    @Then("User Adds Mobile Contacts as {string}")
    public void user_adds_mobile_contacts_as(String contactNumber) {
        ccp.setTxtAddMobile(contactNumber);
    }


    @Then("Enters Job Title as {string}")
    public void enters_job_title_as(String title) {
        ccp.setTxtJobTitle(title);
    }

    @Then("User enter Organisation as {string}")
    public void user_enter_organisation_as(String organisation) throws Exception{
        ccp.setTxtOrganisation_menu(organisation);
    }

    @Then("User selects Position Type")
    public void user_selects_position_type() {
        ccp.clickLnkPositionTypeMenu();
    }

    @Then("User selects Position Type Item")
    public void user_selects_position_type_item() {
        ccp.clickLnkPositionTypeMenuItem();
    }

    @Then("User enters Desired Work Location as {string}")
    public void user_enters_desired_work_location_as(String location) {
        ccp.setTxtDesiredWorkLocation(location);
    }


    @Then("User clicks on Create")
    public void user_clicks_on_create() {
        ccp.clickBtnCreate();
    }

    @Then("User clicks on View button")
    public void user_clicks_on_view_button() throws Exception {
        ccp.clickViewButton();
    }

    //##############################################CREATE JOB STEPS##############################################


    @When("Clicks on Create Job Button")
    public void click_on_create_new_job_button() {
        cjp.clickBtnCreateJob();
    }

    @When("User enters Job Title as {string}")
    public void user_enters_job_title_as(String title) {
        cjp.setTxtJobTitle(title);
    }


    @Then("User searches for Organisation Menu as {string}")
    public void user_searches_for_organisation_menu_as(String oName) {
        cjp.setTxtOrganisation_menu(oName);
    }

    @Then("User selects an Organisation Menu Item")
    public void user_selects_an_organisation_menu_item() {
        //cjp.clickOrganisation_menuitem();
        cjp.clickOrganisation_menuitem_firstOption();
    }

    @Then("User searches for Location Menu as {string}")
    public void user_searches_for_location_menu_as(String location) throws Exception {
        cjp.setTxtLocation_menu(location);
    }

    @When("User selects Location Menu Item")
    public void user_selects_location_menu_item() {
        cjp.clickLocation_menuitem_firstOption();
    }

    @When("User searches for Main Client Contact Menu as {string}")
    public void user_searches_for_main_client_contact_menu_as(String clientContact) throws Exception {
        cjp.setTxtMainClientContact_menu(clientContact);
    }

    @Then("User selects Main Client Contact Menu Item")
    public void user_selects_main_client_contact_menu_item() {
        cjp.clickMainClientContact_menuitem_firstOption();
    }


    @Then("User clicks on selected Job Status Item")
    public void user_clicks_on_selected_job_status_item() {
        cjp.clickLnkJobStatus_menuitem();
    }

    @When("User clicks on Agreement Type menu")
    public void user_clicks_on_agreement_type_menu() throws Exception {
        cjp.clickLnkAgreementType_menu();
    }

    @Then("User clicks on selected Agreement Type Item")
    public void user_clicks_on_selected_agreement_type_item() {
        cjp.clickLnkAgreementType_menuitem_firstOption();
    }

    @When("User clicks on Exclusivity Type menu")
    public void user_clicks_on_exclusivity_type_menu() throws Exception{
        cjp.clickLnkExclusivityType_menu();
    }

    @Then("User clicks on selected Exclusivity Type Item")
    public void user_clicks_on_selected_exclusivity_type_item() throws Exception{
        cjp.clickLnkExclusivityType_menuitem_firstOption();
    }

    @When("User clicks on Source Item")
    public void user_clicks_on_source_item() throws Exception{
        cjp.clickLnkSourceType_menu();
    }

    @Then("User clicks on selected Source Type Item")
    public void user_clicks_on_selected_source_type_item() {
        cjp.clickLnkSourceType_menuitem_firstOption();
    }


    @Then("User clicks on Job Type Item")
    public void user_clicks_on_job_type_item() throws Exception{
        cjp.clickLnkJobType_menu();
    }

    @Then("User clicks on selected Job Type Item")
    public void user_clicks_on_selected_job_type_item() {
        cjp.clickLnkJobType_menuitem_firstOption();
    }





    @Then("Click on Client Email button")
    public void click_on_client_email_button() {
        cjp.clickBtnEmailPortalButton();
    }

    @Then("User enters Link as {string}")
    public void user_enters_link_as(String lName) {
        cjp.setTxtLink(lName);
    }

    @Then("Click Check Box")
    public void click_check_box() {
        cjp.clickCbxSelectIfJobPostingIsRequired();
    }

    @Then("User enters Background info as {string}")
    public void user_enters_background_info_as(String information) {
        cjp.setTxtBackgroundInfo(information);
    }

    @Then("Click on Create button")
    public void click_on_create_button() {
        cjp.clickBtnCreate();
    }
//
//    @Then("Click on Cancel button")
//    public void click_on_cancel_button() {
//        cjp.clickBtnCancel();
//    }


    //###############################################CREATE NEW CLIENT CONTACT#########################################

    @Then("Clicks on Client Contact Button")
    public void clicks_on_client_contact_button() {
        cnc.clickBtnClientContact();
    }

    @Then("User enters First Name of New Client as {string}")
    public void user_enters_first_name_of_new_client_as(String fName) {
        cnc.setTxtFirstName(fName);
    }

    @Then("User enters family Name of New Client as {string}")
    public void user_enters_family_name_of_new_client_as(String familyName) {
        cnc.setTxtFamilyName(familyName);
    }

    @When("User Enters Job Title of New Client as {string}")
    public void user_enters_job_title_of_new_client_as(String jobTitle) {
        cnc.setTxtJobTitle(jobTitle);
    }


    @When("User enters an Organisation Menu Item of New client as {string}")
    public void user_enters_an_organisation_menu_item_of_new_client_as(String orgName) {
        cnc.setTxtOrganisation_menu(orgName);
    }

    @Then("User selects an Organisation Menu Items")
    public void user_selects_an_organisation_menu_items() {
        //cjp.clickOrganisation_menuitem();
        cnc.clickOrganisation_menuitem_firstOption();
    }

    @Then("User Searches for Locations Menu as {string}")
    public void user_searches_for_locations_menu_as(String location) throws Exception {
        cnc.setTxtLocation_menu(location);
    }

    @When("User Selects Locations Menu Item")
    public void user_selects_locations_menu_item() {
        cnc.clickLocation_menuitem_firstOption();
    }


    //##################################ClickOpen##################################################


    //##################################ClickOpen##################################################


    @Then("User clicks on Organisation Name")
    public void user_clicks_on_organisation_name() {
        cnc.clickOrganisation_menuitem();
    }


    @Then("Clicks on Current Position Contact Details Plus button")
    public void clicks_on_current_position_contact_details_plus_button() {
        cnc.clickBtnCurrentPositionContactDetails();
    }

    @Then("Clicks on Mobile Phone")
    public void clicks_on_mobile_phone() {
        cnc.clickBtnMobilePhone();
    }

    @Then("Enters Mobile Phone as {string}")
    public void enters_mobile_phone_as(String mobilePhone) {
        cnc.setTxtMobilePhone(mobilePhone);
    }


    @Then("Click on Create button for new Client")
    public void click_on_create_button_for_new_client() {
        cnc.clickCreate();
    }


    //###############################################Link Client Contact###################################

    @When("User clicks on Ellipses")
    public void user_clicks_on_ellipses() {
        lp.clickBtnEllipses();
    }

    @Then("Clicks on Link Client Contact")
    public void clicks_on_link_client_contact() {
        lp.clickBtnLinkClientContact();
    }

    @When("User enters Organisation as \\{string}")
    public void user_enters_organisation_as() {

    }

    @When("User enters Client Contact as \\{string}")
    public void user_enters_client_contact_as() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Clicks on Select button")
    public void clicks_on_select_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //###########################################LINK ORGANISATION TO A CLIENT###############################

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        lop.clickBtnSearch();
    }

    @Then("Searches for Candidate name as {string}")
    public void searches_for_candidate_name_as(String cName) {
        lop.setTxtSearch(cName);

    }

    @Then("User clicks on Candidate {string}")
    public void user_clicks_on_on_candidate(String text) {
        lop.clickLnkCandidate_Option(text);
    }

    @Then("User click on the Top Three Dots")
    public void user_click_on_top_three_dots() {
        lop.clickBtnThreeDots();
    }

    @Then("User clicks on Link Client Contact")
    public void user_clicks_on_link_client_contact() {
        lop.clickBtnLinkClientContact();
    }

    @When("User enters Client Contact as {string}")
    public void user_enters_client_contact_as(String clientContact) {
        lop.setTxtClientContact(clientContact);
    }

    @Then("User clicks on Create to submit Client Contact")
    public void user_clicks_on_create_to_submit_client_contact() {
        lop.clickBtnCreateClientContact();
    }



    //#######################################Candidate - Summary - Add Qualification#############################

    @When("User clicks on the middle plus button")
    public void user_clicks_on_the_middle_plus_button() throws Exception{
        csp.clickBtnMiddlePlus();
    }

    @Then("User enters Qualification Name {string}")
    public void user_enters_qualification_name(String qualification) {
        csp.setTxtQualification(qualification);
    }

    @Then("User enters name of Institution {string}")
    public void user_enters_name_of_institution(String institution) {
        csp.setTxtInstitution(institution);
    }

    @When("User selects Date Issued")
    public void user_selects_date_issued() {
        csp.clickBtnDateIssued();
    }

    @Then("User enters achieved Grade {string}")
    public void user_enters_achieved_grade(String grade) {
        csp.setTxtGrade(grade);
    }

    @Then("User clicks on Create button")
    public void user_clicks_on_create_button() {
        csp.clickBtnCreate();
    }

    //################################################Candidate-Personal-Update Address############################

    @When("User clicks on Personal link")
    public void user_clicks_on_personal_link() {
        cpp.clickLnkPersonal();
    }

//    @Then("User clicks on Change button")
//    public void user_clicks_on_change_button_as() throws Exception{
//        cpp.clickBtnChangeAddress();
//    }

    @Then("User clicks on Change button as {string}")
    public void user_clicks_on_change_button_as(String text) {
        cpp.click(text);
    }

    @Then("Selects Country")
    public void selects_country() {
        cpp.clickBtnCountry_menuitem();
    }

    @When("User enters Address Line {int} {string}")
    public void user_enters_address_line(Integer int1, String addressLine1) {
        cpp.setTxtAddressLine1(addressLine1);
    }

    @Then("User enters City name as {string}")
    public void user_enters_city_name_as(String city) {
        cpp.setTxtCity(city);
    }

    @Then("User enters Province name as {string}")
    public void user_enters_province_name_as(String province) {
        cpp.setTxtProvince(province);
    }

    @When("User enters Post Code as {string}")
    public void user_enters_post_code_as(String postCode) {
        cpp.setTxtPostCode(postCode);
    }

    @Then("User clicks on Save button")
    public void user_clicks_on_save_button() {
        cpp.clickBtnSave();
    }

    //###########################################Candidate - Career - Add New Role#########################

    @When("User clicks on the Candidate {string}")
    public void user_clicks_on_the_candidate(String string) {
        nrp.clickLnkCandidateItem();
    }


    @When("User clicks on Career")
    public void user_clicks_on_career() {
        nrp.clickLnkCareer();
    }

    @Then("User clicks on the current roles plus button")
    public void user_clicks_on_the_current_roles_plus_button() {
        nrp.clickBtnCurrentRolesPlus();
    }

    @Then("User enters Job Tile as {string}")
    public void user_enters_job_tile_as(String jobTitle) {
        nrp.setTxtJobTile(jobTitle);
    }

    @When("User enters Position Type")
    public void user_enters_position_type() {
        nrp.clickBtnPositionType();
    }

    @Then("User enters Salary rate {string}")
    public void user_enters_salary_rate(String rate) {
        nrp.setTxtRate(rate);
    }

    @Then("User selects Pay Period")
    public void user_selects_pay_period() {
        nrp.clickBtnPayPeriod();
    }

    @When("User clicks Add button")
    public void user_clicks_add_button() {
        nrp.clickBtnAdd();
    }


    //#################################################Candidate-Activity - Add New Activity#############################

    @When("User click on Candidate {string}")
    public void user_click_on_candidate(String string) {
        ana.clickLnkCandidateItem();
    }

    @When("User clicks on Activity")
    public void user_clicks_on_activity() {
        ana.clickLnkActivity();
    }

    @Then("User clicks on the activity plus button")
    public void user_clicks_on_the_activity_plus_button() {
        ana.clickBtnActivityRolesPlus();
    }

    @When("User enters Activity Type")
    public void user_enters_activity_type() throws Exception{
        ana.clickBtnActivityType_menu();
    }

    @Then("User clicks on the Create button")
    public void user_clicks_on_the_create_button() throws Exception{
        ana.clickBtnCreate();
    }

    //##########################################Create New Organisation##################################################

    @When("User clicks on Organisation")
    public void user_clicks_on_organisation() {
        cno.clickBtnOrganisation();
    }

    @Then("User enters an Organisation Name as {string}")
    public void user_enters_an_organisation_name_as(String organisationName) {
        cno.setTxtOrganisation(organisationName);
    }

    @When("User enters Location Name as {string}")
    public void user_enters_location_name_as(String locationName) {
        cno.setTxtLocation(locationName);
    }

    @When("User selects Country")
    public void user_selects_country() {
        cno.clickCountry_menuitem();
    }

    @When("User enter City as {string}")
    public void user_enter_city_as(String cityName) {
        cno.setTxtCity(cityName);
    }


    @Then("User clicks the Create button")
    public void user_clicks_the_create_button() {
        cno.clickBtnCreate();
    }

    //#############################Organisations - Location - Plus Middle Button - Add Location ####################


//    @When("User clicks on the Menu button")
//    public void user_clicks_on_the_menu_button() {
//        oal.clickBtnMenuOpen();
//    }
    @When("User clicks on the Menu button as {string}")
    public void user_clicks_on_the_menu_button_as(String menu) {
        oal.click(menu);
    }

    @Then("User clicks on the Organisation link")
    public void user_clicks_on_the_organisation_link() throws Exception{
        oal.clickBtnOrganisationLink();
    }

    @When("User clicks on the Organisation link item as {string}")
    public void user_clicks_on_the_organisation_link_item_as(String organisationItem) {
        oal.clickOrganisation_menu(organisationItem);
    }

    @When("User clicks on the Organisation link menu item as {string}")
    public void user_clicks_on_the_organisation_link_menu_item_as(String organisationMeniItem) {
        oal.clickOrganisation_menuitem(organisationMeniItem);
    }

    @When("User clicks on the Location link")
    public void user_clicks_on_the_location_link() {
        oal.setLnkLocation();
    }

    @When("User clicks on the Location Plus button")
    public void user_clicks_on_the_location_plus_button() {
        oal.clickBtnLocationPlus();
    }

    @Then("User enters the Location Name as {string}")
    public void user_enters_the_location_name_as(String locationName) throws Exception{
        oal.setTxtLocationName(locationName);
    }

    @When("User selects their Country")
    public void user_selects_their_country() throws Exception{
        oal.clickCountry_menuitem();
    }

    @Then("Clicks on Make this primary location")
    public void clicks_on_make_this_primary_location() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User enters their City as {string}")
    public void user_enters_their_city_as(String city) {
        oal.setTxtCity(city);
    }

    @When("User clicks Create button")
    public void user_clicks_create_button() {
        oal.clickBtnCreate();
    }

    //##########################################Create New Candidate List###########################################

    @Then("User clicks on the universal Plus button")
    public void user_clicks_on_the_universal_plus_button() {
        nlp.clickBtnUniversalPlusSign();
    }

    @Then("User clicks on List")
    public void user_clicks_on_list() {
        nlp.clickBtnList();
    }

    @When("User clicks on Candidate")
    public void user_clicks_on_candidate() {
        nlp.clickBtnCandidate();
    }

    @Then("User enters List Name as {string}")
    public void user_enters_list_name_as(String listName) {
        nlp.setTxtListName(listName);
    }

    @Then("User click on the Create button")
    public void user_click_on_the_create_button() {
        nlp.clickBtnCreate();
    }

    //################################################Edit Candidate List###############################################


    @Then("User clicks on the Candidate List link")
    public void user_clicks_on_the_candidate_list_link() throws Exception{
        elp.clickBtnCandidateList();
    }

    @When("User clicks on a Personal List link as {string}")
    public void user_clicks_on_a_personal_list_link_as(String personal) {
        elp.clickBtnPersonalList(personal);
    }

    @When("User clicks the Edit button")
    public void user_clicks_the_edit_button() throws Exception{
        elp.clickBtnEdit();
    }

    @Then("User enters the List new  Name as {string}")
    public void user_enters_the_listnew_name_as(String listName) throws Exception{
        elp.setTxtListName(listName);
    }

    @When("User clicks the Update button")
    public void user_clicks_the_update_button() {
        elp.clickBtnUpdate();

    }


    //#########################################Clint - Middle Plus Button - Add New Position################################

    @Then("User clicks on the Client link")
    public void user_clicks_on_the_client_link() throws Exception{
        cnpp.clickLnkClient();
    }


    @When("User clicks on the Client link item as {string}")
    public void user_clicks_on_the_client_link_item_as(String text) {
        cnpp.click(text);
    }

    @When("User clicks on Information link")
    public void user_clicks_on_information_link() {
        cnpp.setLnkInformation();
    }

    @When("User clicks on Position History Plus button")
    public void user_clicks_on_position_history_plus_button() {
        cnpp.clickBtnPositionHistoryPlus();
    }

    @Then("User enter Job Title as {string}")
    public void user_enter_job_title_as(String jobTitle) {
        cnpp.setTxtJobTitle(jobTitle);
    }

    @When("User search for Organisation Menu as {string}")
    public void user_search_for_organisation_menu_as(String organisation) {
        cnpp.setTxtOrganisation_menu(organisation);
    }

    @When("User select an Organisation Menu Items")
    public void user_select_an_organisation_menu_items() {
        cnpp.clickOrganisation_menuitem_firstOption();
    }

    @Then("User search for Location Menu as {string}")
    public void user_search_for_location_menu_as(String location) throws Exception{
        cnpp.setTxtLocation_menu(location);
    }

    @When("User select Location Menu Item")
    public void user_select_location_menu_item() {
        cnpp.clickLocation_menuitem_firstOption();
    }


    @Then("User selects Duration")
    public void user_selects_duration() {
        cnpp.setTxtDuration();
    }

    @Then("User clicks on OK")
    public void user_clicks_on_ok() {
        cnpp.clickBtnOK();
    }

    @When("User clicks on Current at this role")
    public void user_clicks_on_current_at_this_role() {
        cnpp.clickBtnCurrentlyAtThiRole();
    }

    @When("Clicks on Current Position Contact Details Plus")
    public void clicks_on_current_position_contact_details_plus() throws Exception{
        cnpp.clickBtnCurrentPositionContactDetails();
    }

    @Then("Click on Mobile Phone")
    public void click_on_mobile_phone() {
        cnpp.clickBtnMobilePhone();
    }

    @When("Enter Mobile Phone as {string}")
    public void enter_mobile_phone_as(String mobile) throws Exception{
        cnpp.setTxtMobilePhone(mobile);
    }

    @When("Clicks on the Create button")
    public void clicks_on_the_create_button() {
        cnpp.clickCreate();
    }

    //##########################################################Candidate - Plus Button Top - Add Candidate Review List########################################

    @When("user clicks on the Plus Top button")
    public void user_clicks_on_the_plus_top_button() {
        acrp.clickPlusBtnTop();
    }

    @When("User click on Candidate Review")
    public void user_click_on_candidate_review() {
        acrp.clickBtnCandidateReview();
    }

    @Then("User adds Notes reviews as {string}")
    public void user_adds_notes_reviews_as(String reviewNotes) {
        acrp.setTxtNotesReview(reviewNotes);
    }

    @When("User selects the Create button")
    public void user_selects_the_create_button() {
        acrp.clickBtnCreate();
    }

    //################################################Client - PlusButtonTop - Add Client To List#######################################################

    @Then("User click on Client link")
    public void user_click_on_client_link() throws Exception{
        cnpp.clickLnkClient();
    }


    @When("User click on Client link item as {string}")
    public void user_click_on_client_link_item_as(String text) {
        cnpp.click(text);
    }

    @Then("Selects List item")
    public void selects_list_item() throws Exception{
        aclp.clickLnkListItem();
    }

    @When("User clicks on Add button")
    public void user_clicks_on_add_button() throws Exception{
        aclp.clickBtnAdd();
    }

    //################################################Client - PlusButtonTop - Add Client To List - New List##########################################################

    @Then("User click on the Client link")
    public void user_click_on_the_client_link() throws Exception{
        cnpp.clickLnkClient();
    }


    @When("User click on the Client link item as {string}")
    public void user_click_on_the_client_link_item_as(String text) {
        cnpp.click(text);
    }

    @When("User clicks on New List button")
    public void user_clicks_on_new_list_button() throws Exception{
        aclnlp.btnNewList();
    }

    @Then("User enters the List Name as {string}")
    public void user_enters_the_list_name_as(String listName) throws Exception{
        aclnlp.setTxtListName(listName);
    }

    @When("User select the Create button")
    public void user_select_the_create_button() {
        aclnlp.clickBtnCreate();
    }

    //###################################################Organisation - Plus Top Button - Add Alert To Record##############################

    @When("User click on the Menu button as {string}")
    public void user_click_on_the_menu_button_as(String menu) {
        arp.click(menu);
    }

    @Then("User click on the Organisation link")
    public void user_click_on_the_organisation_link() throws Exception{
        arp.clickBtnOrganisationLink();
    }

    @When("User click on the Organisation link item as {string}")
    public void user_click_on_the_organisation_link_item_as(String organisationItem) {
        arp.clickOrganisation_menu(organisationItem);
    }

    @When("User click on the Organisation link menu item as {string}")
    public void user_click_on_the_organisation_link_menu_item_as(String organisationMeniItem) {
        arp.clickOrganisation_menuitem(organisationMeniItem);
    }


    @When("User selects on Plus Top button")
    public void user_selects_on_plus_top_button() throws Exception{
        arp.clickBtnPlusTop();
    }

    @Then("User selects Add Alert button")
    public void user_selects_add_alert_button() throws Exception{
        arp.clickBtnAddAlert();
    }

    @Then("User selects Type")
    public void user_selects_type() throws Exception{
        arp.clickType_menuitem();
    }

    @When("User writes Reason as {string}")
    public void user_writes_reason_as(String reason) {
        arp.stTxtReason(reason);
    }

    @When("User selects Expiry Date")
    public void user_selects_expiry_date() {
        arp.clickOnBtnExpiryDate();
    }

    @Then("User clicks on button OK")
    public void user_clicks_on_button_ok() {
        arp.clickOnBtnOK();
    }

    @When("User click on button Add")
    public void user_click_on_button_add() {
        arp.clickOnBtnAdd();
    }

    //###########################################Organisation - Add Location To List#########################

    @When("User clicks on Menu button as {string}")
    public void user_clicks_on_menu_button_as(String menu) {
        oalp.click(menu);
    }

    @Then("User clicks on Organisation link")
    public void user_clicks_on_organisation_link() throws Exception{
        oalp.clickBtnOrganisationLink();
    }

    @When("User clicks on Organisation link item as {string}")
    public void user_clicks_on_organisation_link_item_as(String organisationItem) {
        oalp.clickOrganisation_menu(organisationItem);
    }

    @When("User clicks on Organisation link menu item as {string}")
    public void user_clicks_on_organisation_link_menu_item_as(String organisationMeniItem) {
        oalp.clickOrganisation_menuitem(organisationMeniItem);
    }

    @Then("User clicks on Add To List")
    public void user_clicks_on_add_to_list() throws Exception{
        oalp.clickBtnAddToList();
    }

    @When("User selects an Organisation")
    public void user_selects_an_organisation() throws Exception{
        oalp.clickRbtOrganisation();
    }

    @When("User Clicks on Add organisation")
    public void user_clicks_on_add_organisation() throws Exception{
        oalp.clickBtnAdd();
    }

    //#######################################Organisation - Create New Organisation List###############################

    @When("User click on Menu button as {string}")
    public void user_click_on_menu_button_as(String menu) {
        nolp.click(menu);
    }

    @Then("User click on Organisation link")
    public void user_click_on_organisation_link() throws Exception{
        nolp.clickBtnOrganisationLink();
    }

    @When("User click on Organisation link item as {string}")
    public void user_click_on_organisation_link_item_as(String organisationItem) {
        nolp.clickOrganisation_menu(organisationItem);
    }

    @When("User click on Organisation link menu item as {string}")
    public void user_click_on_organisation_link_menu_item_as(String organisationMeniItem) {
        nolp.clickOrganisation_menuitem(organisationMeniItem);
    }

    @Then("User click on Add To List")
    public void user_click_on_add_to_list() throws Exception{
        nolp.clickBtnAddToList();
    }

    @When("User clicks on the New List button")
    public void user_clicks_on_the_new_list_button() throws Exception{
        nolp.clickBtnNewList();
    }

    @When("User enters the new Organisation List Name as {string}")
    public void user_enters_the_new_organisation_list_name_as(String listName) throws Exception{
        nolp.setTxtListName(listName);
    }

    @When("User clicks on Add")
    public void user_clicks_on_add() throws Exception{
        nolp.setBtnAdd();
    }

    //#################################################Client - Link Candidate######################################################################

    @When("User clicks on the Top Three Dots")
    public void user_clicks_on_the_top_three_dots() throws Exception{
        clcp.setBtnTopThreeDots();
    }

    @Then("User clicks on Link Candidate")
    public void user_clicks_on_link_candidate() throws Exception{
        clcp.clickBtnLinkCandidate();
    }

    @When("User enters Candidate {string}")
    public void user_enters_candidate(String candidateName) throws Exception{
        clcp.setTxtCandidateName(candidateName);
    }

    @When("User clicks on select")
    public void user_clicks_on_select() {
        clcp.clickBtnSelect();
    }

    //################################################Client - Add Alert############################################################################

    @Then("User selects Client link")
    public void user_selects_client_link() throws Exception{
        caap.clickLnkClient();
    }

    @When("User selects Client link item as {string}")
    public void user_selects_client_link_item_as(String text) {
        caap.click(text);
    }

    @When("user click on the Plus Top button")
    public void user_click_on_the_plus_top_button() throws Exception{
    // Write code here that turns the phrase above into concrete actions
        caap.clickBtnClientTopPlus();
    }

    @Then("Clicks on Add Alert")
    public void clicks_on_add_alert() throws Exception{
        caap.clickBtnAddAlert();
    }

    @When("User selects Alert Type")
    public void user_selects_alert_type() throws Exception{
        caap.clicksBtnAlertType();
    }

    @When("User adds alert to record")
    public void user_adds_alert_to_record() {
        caap.clickBtnAdd();
    }

    //##################################Candidate - Plus Top Button - Add To List###########################

    @Then("User clicks on Add To List button")
    public void user_clicks_on_add_to_list_button() throws Exception{
        catlp.clickBtnAddToList();
    }

    @Then("User selects a List")
    public void user_selects_a_list() throws Exception{
        catlp.clicksListItem();
    }

    @When("User clicks on Add candidate to list")
    public void user_clicks_on_add_candidate_to_list() {
        catlp.clickBtnAdd();
    }

    //##################################Candidate - Plus Plus Button - Add To List - New List###########################



    @Then("User clicks on New List")
    public void user_clicks_on_new_list() throws Exception{
        catlnlp.clickBtnNewList();
    }

    @When("user enters the new List Name {string}")
    public void user_enters_the_new_list_name(String listName) throws Exception{
        catlnlp.setTxtOnListName(listName);
    }

    @When("User clicks on create new list")
    public void user_clicks_on_create_new_list() {
        catlnlp.clickOnBtnCreate();
    }

    //###############################################Organisation - Edit List###########################################

    @Then("User selects the Organisation List link")
    public void user_selects_the_organisation_list_link() throws Exception{
        oelp.clickLnkOrgList();
    }

    @When("User clinks on Organisation list item")
    public void user_clinks_on_organisation_list_item() throws Exception{
        oelp.clickBtnOrgList_item();
    }

    @Then("User clicks on the Edit button")
    public void user_clicks_on_the_edit_button() throws Exception{
        oelp.clickBtnEdit();
    }

    @When("User edits List Name as {string}")
    public void user_edits_list_name_as(String listName) throws Exception{
        oelp.setTxtListName(listName);
    }

    @When("User clicks on Update edited organisation")
    public void user_clicks_on_update_edited_organisation() throws Exception{
        oelp.setBtnUpdate();
    }

    //##################################Organisation - Linked Jobs - Subsidiary Organisation############################

    @Then("User clicks on Linked Jobs link")
    public void user_clicks_on_linked_jobs_link() throws Exception{
        sop.clickLnkLinkedOrgs();
    }

    @When("User clicks on Subsidiary Plus button")
    public void user_clicks_on_subsidiary_plus_button() throws Exception{
        sop.clickBtnSubsidiaryOrganisation();
    }

    @When("User looks for Organisation Menu as {string}")
    public void user_looks_for_organisation_menu_as(String organisation) {
        cnpp.setTxtOrganisation_menu(organisation);
    }

    @When("User clicks an Organisation Menu Items")
    public void user_clicks_an_organisation_menu_items() {
        cnpp.clickOrganisation_menuitem_firstOption();
    }


    @Then("User clicks on Select to create Subsidiary Organisation")
    public void user_clicks_on_select_to_create_subsidiary_organisation() throws Exception{
        sop.setBtnSelect();
    }

    //#########################################################Jobs - Add Alert#########################################

    @Then("User click on My Jobs link")
    public void user_click_on_my_jobs_link() throws Exception{
        jaap.clickBtnMyJobs();
    }

    @When("User click on a Job link item as {string}")
    public void user_click_on_a_job_link_item_as(String organisation) {
        jaap.clickOrganisation_menu(organisation);
    }

    @When("Click on the Plus Top button as {string}")
    public void click_on_the_plus_top_button_as(String textb) {
        jaap.clickBtnPlusTop(textb);
    }

    @Then("User clicks on  add Alert")
    public void user_clicks_on_add_alert() throws Exception{
        jaap.clickBtnAddAlert();
    }

    @Then("User select Type")
    public void user_select_type() throws Exception{
        jaap.clickType_menuitem();
    }

    @When("User writes a Reason as {string}")
    public void user_writes_a_reason_as(String reason) {
        jaap.stTxtReason(reason);
    }

    @When("User select Expiry Date")
    public void user_select_expiry_date() {
        jaap.clickOnBtnExpiryDate();
    }

    @Then("User click on button OK")
    public void user_click_on_button_ok() {
        jaap.clickOnBtnOK();
    }

    @When("User clicks on button Add")
    public void user_clicks_on_button_add() {
        jaap.clickOnBtnAdd();
    }

    //###############################CandidateRecordModals-MandatoryLocationField#######################################

    @Then("User looks up for Organisation Menu as {string}")
    public void user_looks_up_for_organisation_menu_as(String oName) {

        mlfp.setTxtOrganisation_menu(oName);
    }

    @Then("User selects desired an Organisation Menu Item")
    public void user_selects_desired_an_organisation_menu_item() {
        //cjp.clickOrganisation_menuitem();
        mlfp.clickOrganisation_menuitem_firstOption();
    }

    @Then("User enters nothing onLocation to validate if message appears {string}")
    public void user_enters_nothing_on_location_to_validate_if_message_appears(String location) throws Exception{
        mlfp.setTxtLocation_menuitem(location);
    }


    //############################################Client Contact Record - Jobs Tab######################################

    @When("User clicks on Jobs link")
    public void user_clicks_on_jobs_link() throws Exception{
        ccrjp.clickBtnLinkJobs();
    }

    @Then("clicks on the Job Item")
    public void clicks_on_the_job_item() throws Exception{
        ccrjp.clickBtnJobItem();
    }

    //#########################################Client Contact Record - Remove Candidate################################

    @When("User clicks on Three Dots button")
    public void user_clicks_on_three_dots_button() throws Exception{
        ccrrcp.clickBtnThreeDots();
    }

    @Then("clicks on unlink Candidate button")
    public void clicks_on_unlink_candidate_button() throws Exception{
        ccrrcp.clickBtnUnlinkCandidate();
    }

    //#######################################Candidate Activity Edit Activity###########################################

    @When("User clicks on Edit Activity link")
    public void user_clicks_on_edit_activity_link() {
    }


    //##########################################Candidate Remove Client Contact#########################################

    @Then("User clicks on Remove Client Contact")
    public void user_clicks_on_remove_client_contact() {
        lop.clickBtnLinkClientContact();
    }

    //#########################################FE-Change Stage dropdown#####################################

    @When("User clicks on Job link item as {string}")
    public void user_clicks_on_job_link_item_as(String text) {
        fecsdp.clickLnkJobItem_menu(text);
    }

    @When("User clicks on Short list link")
    public void user_clicks_on_short_list_link() throws Exception{
        fecsdp.clickLnkShortList();
    }

    @Then("User clicks on Job Checkbox")
    public void user_clicks_on_job_checkbox() throws Exception{
        fecsdp.clickJobCheckboxItem();
    }

    @When("User clicks on Change Stage link")
    public void user_clicks_on_change_stage_link() throws Exception{
        fecsdp.clickLnkChangeStage();
    }

    @When("User clicks on Job record")
    public void user_clicks_on_job_record() throws Exception{
        fecsdp.clickBtnReject();
    }
    //###############################################PipelineManagement-EmptyStatesforGrid######################################################

    @When("User clicks on a Job link item as {string}")
    public void user_clicks_on_a_job_link_item_as(String jobItem) {
        pmesgp.clickLnkJobItem(jobItem);
    }

    @When("User clicks on Long list link")
    public void user_clicks_on_long_list_link() throws Exception{
        pmesgp.clickLnkLongList();
    }

    //#########################################Candidate Activity - Edit Activity##############################################################

    @When("User click on Edit Activity link")
    public void user_click_on_edit_activity_link() {
        caeap.clickLnkEditActivity();
    }

    @When("User clicks on the Save button")
    public void user_clicks_on_the_save_button() throws Exception{
        caeap.clickBtnSave();
    }

    //###########################################Organisation - Edit Activity###########################################

    @Then("User selects the Organisation link")
    public void user_selects_the_organisation_link() throws Exception{
        oeap.clickBtnOrganisation_menu();
    }


    @Then("User clinks on Organisation item")
    public void user_clinks_on_organisation_item() throws Exception{
        oeap.clickLnkOrganisation_item();
    }

    @When("User edits an Activity")
    public void user_edits_an_activity() {
        oeap.clickLnkEditActivity();
    }

    @Then("User enters Candidate")
    public void user_enters_candidate() throws Exception{
        oeap.setTxtCandidate();
    }

    @When("User selects Job")
    public void user_selects_job() throws Exception{
        oeap.clickBtnJob_menu();
    }

    //#######################################Jobs - Edit Activity################################################

    @Then("User selects My Jobs link")
    public void user_selects_my_jobs_link() throws Exception{
        jeap.clickLnkMyJobs();
    }

    @When("User selects a Job link item as {string}")
    public void user_selects_a_job_link_item_as(String job) throws Exception{
        jeap.clickLnkJobItem();
    }

    @When("User click on Activity link")
    public void user_click_on_activity_link() throws Exception{
        jeap.clickLnkActivity();
    }

    //#########################################Login New Page#####################################################

    @Then("User enters their Username as {string}")
    public void user_enters_their_username_as(String username) throws Exception{
        lgnp.setTxtUsername(username);
    }

    @When("User enters their Password as {string}")
    public void user_enters_their_password_as(String password) throws Exception{
        lgnp.setTxtPassword(password);
    }

    @When("User clicks on the SignIn button")
    public void user_clicks_on_the_sign_in_button() throws Exception{
        lgnp.clickBtnSignIn();
    }

    //####################################Candidate - View Activity - Activity - Filter#############################

    @Then("User clicks on the Filter Activities button")
    public void user_clicks_on_the_filter_activities_button() throws Exception{
        cvafp.clickBtnFilterActivities();
    }

    @When("User clicks on the Email radio button")
    public void user_clicks_on_the_email_radio_button() throws Exception{
        cvafp.clickRdBtnEmail();
    }

    //##############################################FE - GRID VIEW - OFFER/PLACED###################################

    @When("User clicks on Offer link")
    public void user_clicks_on_offer_link() throws Exception{
        gvop.clickLnkOffers();
    }

    //#########################################FE - Add candidate to Job - Transition to Longlist######################

    @Then("User clicks on Add to List or Job")
    public void user_clicks_on_add_to_list_or_job() throws Exception{
        acjtlp.clickBtnAddToListOrJob();
    }

    @When("User clicks on Add to Job")
    public void user_clicks_on_add_to_job() throws Exception{
        acjtlp.clickBtnAddToJob();
    }

    @When("User selects a Job link item")
    public void user_selects_a_job_link_item() throws Exception{
        acjtlp.clickRdBtnJobItem();
    }

    @Then("User clicks ADD")
    public void user_clicks_add() throws Exception{
        acjtlp.clickBtnAdd();
    }

    //####################################FE - Add candidate to Job - Transition to Longlist###########################

    @When("User clicks on link Short List")
    public void user_clicks_on_link_short_list() throws Exception{
        dttslp.clickLnkShortList();
    }

    @When("User clicks on left pane Short List")
    public void user_clicks_on_left_pane_short_list() throws Exception{
        dttslp.clickLnkLeftPaneShortListt();
    }

    //########################################FE-Organisation-CreateActivity-ActivityModal##############################

    @Then("User clicks on organisation activity plus button")
    public void user_clicks_on_organisation_activity_plus_button() throws Exception{
        ocamp.clickBtnOrgPlus();
    }

    @When("User enters organisation Activity Type")
    public void user_enters_organisation_activity_type() throws Exception{
        ocamp.clickBtnActivityType_menu();
    }

    @When("User searches for Client Contact Menu as {string}")
    public void user_searches_for_client_contact_menu_as(String clintContact) throws Exception{
        ocamp.setTxtMainClientContact_menu(clintContact);
    }

    @Then("User selects an Client Contact Menu Item")
    public void user_selects_an_client_contact_menu_item() {
        ocamp.clickMainClientContact_menuitem_firstOption();
    }

    @When("User clicks on Create Organisation Activity")
    public void user_clicks_on_create_organisation_activity() throws Exception{
        ocamp.clickBtnCreateOrgActivity();
    }

    //###############################################FE-ClientContact-CreateActivity-Activity Modal#####################

    @Then("User clicks on Client Contact activity plus button")
    public void user_clicks_on_client_contact_activity_plus_button() throws Exception{
        cccamp.clickBtnCCPlus();
    }

    @When("User clicks on Create Client Contact Activity")
    public void user_clicks_on_create_client_contact_activity() throws Exception{
        cccamp.clickBtnCreateCCActivity();
    }

    //###############################################FE-Job-CreateActivity-ActivityModal################################

    @Then("User clicks on the Job Plus button")
    public void user_clicks_on_the_job_plus_button() throws Exception{
        jcamp.clickBtnJobPlus();
    }

    @When("User enters Job Activity Type")
    public void user_enters_job_activity_type() throws Exception{
        jcamp.clickBtnActivityType_menu();
    }

    //###############################################Organisation-LinkAnOrganisationToAClient###########################

    @When("User clicks on Client Contacts link")
    public void user_clicks_on_client_contacts_link() throws Exception{
        olocp.clickLnkClientContacts();
    }

    @Then("User selects a client radio button")
    public void user_selects_a_client_radio_button() throws Exception{
        olocp.clickRdBtnClient();
    }

    @When("User clicks on Add To")
    public void user_clicks_on_add_to() throws Exception{
        olocp.clickBtnAddTo();
    }

    @When("User click on Add To List button")
    public void user_click_on_add_to_list_button() throws Exception{
        olocp.clickBtnAddToList();
    }

    //###############################################Organisation-PlusTopBtn-AddAlertToRecord###########################

    @Then("User clicks on the Add alert button")
    public void user_clicks_on_the_add_alert_button() throws Exception{
        opbaatrp.clickBtnAddAlert();
    }

    //oaatrp

    //###########################################Organisation - Location - Edit Location################################

    @Then("User clicks on the Three Dots to Edit Location")
    public void user_clicks_on_the_three_dots_to_edit_location() throws Exception{
        orlelp.clickBtnThreeDots();
    }

    @When("User clicks on Edit Location")
    public void user_clicks_on_edit_location() throws Exception{
        orlelp.clickBtnEditLocation();
    }

    @When("User enters Address Line One as {string}")
    public void user_enters_address_line_one_as(String addressLineOne) throws Exception{
        orlelp.setTxtAddressLineOne(addressLineOne);
    }

    @Then("User enters Province as {string}")
    public void user_enters_province_as(String province) throws Exception{
        orlelp.setTxtProvinceName(province);
    }

    @When("User enters the Post Code as {string}")
    public void user_enters_the_post_code_as(String postCode) throws Exception{
        orlelp.setTxtPostCodeNumber(postCode);
    }

    @When("Clicks on radio button Make this primary location")
    public void clicks_on_radio_button_make_this_primary_location() throws Exception{
        orlelp.clickRdBtnMakeThisPrimaryLocation();
    }

    @When("User clicks on to the Save button")
    public void user_clicks_on_to_the_save_button() throws Exception{
        orlelp.clickBtnSave();
    }

    //######################################Organisation -Add List######################################################

    @Then("User clicks on Add List button")
    public void user_clicks_on_add_list_button() throws Exception{
        oalnp.clickBtnAddList();
    }

    @Then("User Enters new List Name as {string}")
    public void user_enters_new_list_name_as(String listName) throws Exception{
        oalnp.getTxtListName(listName);
    }

    @When("User clicks on Create Org List")
    public void user_clicks_on_create_org_list() throws Exception{
        oalnp.clickBtnCREATE();
    }

    //########################FE - Implement Pagination To Transition To Offer Stage - Single or Multi##################

    @Then("User clicks on Additional Rounds")
    public void user_clicks_on_additional_rounds() throws Exception{
        iptos.clickLnkAdditionalRounds();
    }

    @Then("User selects all checkboxes")
    public void user_selects_all_checkboxes() throws Exception{
        iptos.clickRdBtnCheckBox();
    }

    @When("User clicks on link Offer")
    public void user_clicks_on_link_offer() throws Exception{
        iptos.clickBtnOffer();
    }

    @When("User clicks on Offer Date")
    public void user_clicks_on_offer_date() throws Exception{
        iptos.clickLnkOfferDate();
    }

    @Then("User selects Date")
    public void user_selects_date() throws Exception{
        iptos.clickLnkSelectOfferDate();
    }

    @When("User enter Salary as {string}")
    public void user_enter_salary_as(String salary) throws Exception{
        iptos.setTxtSalary(salary);
    }

    @When("User enters Activity Notes as {string}")
    public void user_enters_activity_notes_as(String activityNotes) throws Exception{
        iptos.setTxtActivityNotes(activityNotes);
    }

    @Then("User clicks on Save and Continue button")
    public void user_clicks_on_save_and_continue_button() throws Exception{
        iptos.clickBtnSaveAndContinue();
    }

    //##########################################FE And BE Transition To CV Sent Stage Single/Multi Page#################


    @When("User clicks on link Send CV")
    public void user_clicks_on_link_send_cv() throws Exception{
        ttcvs.clickBtnSendCV();
    }

    @When("User sends Placeholder as {string}")
    public void user_sends_placeholder_as(String responsibleUser) throws Exception{
        ttcvs.setTxtResponsibleUser(responsibleUser);
    }

    @Then("User selects an Client Contact as {string}")
    public void user_selects_an_client_contact_as(String clientClient) throws Exception{
        ttcvs.setTxtClientContact(clientClient);
    }

    @When("User selects an Client Contact item")
    public void user_selects_an_client_contact_item() {
        ttcvs.clickClientContact_menuitem();
    }

    /*
        THIS IS JUST FOR EXPERIMENTAL PURPOSES
     */
    @Given("this is test step one")
    public void thisIsTestStepOne() {
        asifs_loginPage.OpenPage();
        asifs_loginPage.emailTextField.sendKeys("jjonzz@digitalzenith.io");
        asifs_loginPage.passwordField.sendKeys("MartianM@nhunt3r");
        asifs_loginPage.submitButton.click();
        asifs_hudPage.WaitForElementToBeVisible(asifs_hudPage.universalPlusIcon);
        asifs_hudPage.universalPlusIcon.click();
        asifs_hudPage.WaitForElementToBeVisible(asifs_hudPage.universalPlusIcon_CreateCandidate);
        asifs_hudPage.universalPlusIcon_CreateCandidate.click();
        asifs_newCandidatePage.firstNameTextfield.sendKeys("First Name Test");
        asifs_newCandidatePage.familyNameTextfield.sendKeys("Family Name Test");
    }

    @Given("I have logged into the application")
    public void iHaveLoggedIntoTheApplication() {
        // Open the login page
        asifs_loginPage.OpenPage();
        // Enter Email details
        asifs_loginPage.emailTextField.sendKeys("jjonzz@digitalzenith.io");
        // Enter password
        asifs_loginPage.passwordField.sendKeys("MartianM@nhunt3r");
        // Submit the login details
        asifs_loginPage.submitButton.click();
        // Verify you have logged in by verifying the Universal Plus icon is visible
        asifs_hudPage.WaitForElementToBeVisible(asifs_hudPage.universalPlusIcon);
    }

    @When("I create a new candidate via the Plus Icon")
    public void iCreateANewCandidateViaThePlusIcon() {
        wait.until(ExpectedConditions.visibilityOf(asifs_hudPage.universalPlusIcon));
        asifs_hudPage.universalPlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(asifs_hudPage.universalPlusIcon_CreateCandidate));
        asifs_hudPage.universalPlusIcon_CreateCandidate.click();
        /** * Set Personal Details ** */
        asifs_newCandidatePage.firstNameTextfield.sendKeys("Tony");
        asifs_newCandidatePage.familyNameTextfield.sendKeys("Stark");
        asifs_newCandidatePage.ciyTextfield.sendKeys("New York ");
        /** * Set Contact Details ** */
        asifs_newCandidatePage.contact_PlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(asifs_newCandidatePage.contact_MobileNumber));
        asifs_newCandidatePage.contact_MobileNumber.click();
        Actions actions = new Actions(driver);
        actions.sendKeys("07777777777" + Keys.ENTER)
                .perform();
        asifs_newCandidatePage.contact_PlusIcon.click();
        wait.until(ExpectedConditions.visibilityOf(asifs_newCandidatePage.contact_EmailAddress));
        asifs_newCandidatePage.contact_EmailAddress.click();
        actions.sendKeys("cypress@test.com" + Keys.ENTER)
                .perform();
        /** * Set Current Role Details ** */
        /** * Set Looking for Details ** */
        /** * Set Candidate Registration Details ** */
        /** * Set Interview Notes ** */

        // Submit
        asifs_newCandidatePage.createButton.click();
    }

    @Then("verify I can view the new candidate")
    public void verifyICanViewTheNewCandidate() {
        wait.until(ExpectedConditions.visibilityOf(asifs_hudPage.notification_CreatedCandidate));
        assertEquals("TEST",asifs_hudPage.notification_CreatedCandidate.getText());
    }
}



