package com.virtusa.isq.vtaf.runtime.pages;

/**
 *  Class APIPublisherBrowse implements corresponding UI page
 *  UI objects in the page are stored in the class.
 */

public enum APIPublisherBrowse {

        btn_StateCreated("//input[@id='actionButton2']"), ele_lblImplement("//a/span[text()='Implement']"), ele_lblApiResources("//tr[@class='resource_container']/td/span[contains(text(),'<param_APIResource>')]"), lnk_Edit("//div[2]/div/nav/div/div[2]/ul/li[1]/a"), ele_lblPrototype("//div[text()='Prototyped API']"), btn_SavePrototype("//button[@id='savePrototypeBtn']"), btn_DeployAsPrototype("//button[@id='prototyped_api']"), btn_StatePublish("//input[@value='Publish']"), btn_StatePrototype("//input[@id='actionButton1']"), btn_OkDeployAsPrototype("//button[text()='OK']"), ele_lblManagedAPI("//div[text()='Managed API']"), btn_SaveManagedAPI("//button[@id='saveBtn']"), btn_NextManage("//button[@id='go_to_manage']"), tf_ProductionEndPoint("css=input[id=\"jsonform-0-elt-production_endpoints\"]"), tf_SandBoxEndPoint("css=input[id=\"jsonform-0-elt-sandbox_endpoints\"]"), ele_ddTierAvilability("//button[@class='multiselect dropdown-toggle btn']"), chk_Unlimited("//label[contains(text(),'Unlimited')]"), chk_Gold("//label[contains(text(),'Gold')]"), chk_Silver("//label[contains(text(),'Silver')]"), chk_Bronze("//label[contains(text(),'Bronze')]"), btn_SaveManageAPI("//button[@id='save_api']"), btn_Add("//button[@id='add_resource']"), tf_UrlPattern("//input[@id='resource_url_pattern']"), chk_verbMethod("//input[@class='http_verb_select' and @value='<verb>']"), img_deleteIcon("//a[@data-operation='<param_verbmethodPost>' and @data-path-name='/<param_UrlPattern>']"), ele_lblVerbMethod("//td/span[contains(text(),'<verb>')]/../../td[2]/a[contains(text(),'<urlPattern>')]"), btn_Yes("//a[@class='btn btn btn-primary']"), ele_lblpopupError("//span[contains(text(),'Resource already exist for URL Pattern')]"), btn_Ok("//a[text()='OK']"), btn_Save("//button[@id='saveBtn']"), ele_ddVisibility("//select[@id='visibility']"), btn_SaveAndPublish("//a[contains(text(),'Save & Publish')]"), btn_Close("//div[@class=\"modal-header\"]/button[@class=\"close\"]"), ele_lblGeneralDetails("//div[text()='General Details']"), btn_NextImplement("//a[@id='go_to_implement']"), ele_ddEndpointType("//select[@id='endpoint_type']"), tf_productionEndpoint("//div/label[contains(text(),'Production Endpoint:')]/../div/div/input"), tf_sandboxEndpoint("//div/label[contains(text(),'Sandbox Endpoint:')]/../div/div/input"), tf_prototypeEndpoint("//div/label[contains(text(),'Prototype Endpoint:')]/../div/div/input"), btn_test("//input[@id='prototype_endpoint']/../button"), ele_lblInvalid("//span[contains(text(),'Invalid')]"), ele_lblValid("//span[contains(text(),'Valid')]"), lnk_ShowmoreOption("//a[contains(text(),'Show More Options')]"), ele_ddEndpointSecurityScheme("//label[contains(text(),'Endpoint Security Scheme:')]/../div/select"), ele_lbl_credentialErrorMessege("xpath=(//label[contains(text(),'This field is required.')])[1]"), tf_endpointUserName("//input[@id='epUsername']"), tf_endPointPassword("//input[@id='epPassword']"), btn_testProductionEndpoint("//input[@id='jsonform-0-elt-production_endpoints']/../button[2]"), btn_testSandBoxEndPoint("//input[@id='jsonform-0-elt-sandbox_endpoints']/../button[2]"), ele_lblSandboxEndpointValid("//span[text()='Valid']"), btn_Subscribe("//button[@id='subscribe-button']"), btn_deleteAPI("//a[contains(text(),'<param_APIName>')]/../../a[@title='DELETE']"), ele_lblAPIdeleteError("//h3[contains(text(),'API Publisher - Error')]"), lnk_Overview("//a[@id='viewLink']"), ele_lblVersionAndUser("//h4/a[text()='<param_APIName>']/../../h5[contains(text(),'<param_version>')]/../p[contains(text(),'<param_creater>')]/../h5/../h4/a"), ele_lblUsers("//div/h5[contains(text(),'<param_version>')]/../p[2]/a/span[contains(text(),'<param_users>')]"), ele_lblAPIStatus("//div[contains(text(),'1.0.1')]/../p[contains(text(),'<param_status>')]"), lnk_DuplicateAPI("xpath=(//a[contains(text(),'<param_APIName>')])[2]"), btn_Manage("//span[text()='Manage']"), ele_lblPopupPublisherError("//h3[contains(text(),'API Publisher - Error')]"), lnk_ChangeIcon("link=Change Icon"), btn_BrowseImage("//input[@id='apiThumb']"), ele_lblInvalidImageError("//label[@class='error']"), btn_Save1("//button[contains(text(),'Save')]"), chk_ActiveUnlimited("//li[@class='active']//input[@value='Unlimited']"), chk_ActiveGold("//li[@class='active']//input[@value='Gold']"), chk_ActiveSilver("//li[@class='active']//input[@value='Silver']"), chk_ActiveBronze("//li[@class='active']//input[@value='Bronze']"), ele_lblThisFieldisRequired("//label[contains(text(),'This field is required.')]"), tf_VisibilityToRole("//input[@id='roles']"), btn_No("//div[@id=\"messageModal\"]/div[@class=\"modal-footer\"]/a[@class=\"btn btn\"]"), lnk_ApiNameWithVersion("//a[contains(text(),'<param_APIName>')]/../../h5[contains(text(),'<param_APIVersion>')]/../h4/a[contains(text(),'<param_APIName>')] "), ele_lblMore("//label[@id='more']"), lnk_ResourceLevelType("//span[contains(text(),'<param_verbMethod>')]/../../td[4]/a"), ele_ddResourseLevelType("//select[@class='input-medium']"), btn_right("//button[@class='btn btn-primary editable-submit']"), ele_lblResourceLevelType("//a[contains(text(),'<param_verbType>')]/../../td[1]/span[contains(text(),'<param_ResourceLevelType>')]"), btn_GoToOverview("//a[contains(text(),'Go to Overview')]"), ele_lblResourceLevelType1("//span[contains(text(),'<param_verbType>')]/../../td/a[contains(text(),'<param_ResourceLevelType>')]"), lnk_APIName("//div[@class='row']/div/div/div/h4/a[contains(text(),'<param_APIName>')]"), ele_lblAPILifeCycleStatus("//div[contains(text(),'<param_version>')]/../p[contains(text(),'<param_status>')]"), ele_ddSubscription("//select[@id='subscriptions']"), tf_Tenantname("//input[@id='tenants']"), ele_lblEndpoints("//legend[text()='Endpoints']"), ele_lblAPIManagePopupSuccess("//label[contains(text(),'You have successfully published your API')]"), lnk_APINameMultiple("xpath=//a[contains(text(),'<param_APIName>')]"), ele_lblNoMachingAPI("//b[text()='No matching APIs found.']"), lnk_APINameOverall("//a[contains(text(),'<param_APIName>')]/../../h5[contains(text(),'<param_version>')]/../p[contains(text(),'<param_provider>')]/../p/a/span[contains(text(),'<param_numberOfUsers>')]/../../../h5[contains(text(),'<param_status>')]/../h4/a"), chk_ConfigurationDefaultVersion("//input[@id=\"default_version\"]"), btn_UpdateState("//input[@id=\"updateStateButton\"]"), ele_lblAPIZeroUsers("//span[contains(text(),'0 Users')]"), ele_lblStateChangeMessage("//div[@id='statusUpdateMsg' and contains(text(),'Successfully updated the API status')]"), btn_CreateNewVersion("//a[@title='Create New Version']"), tf_NewVersion("//input[@id='new-version']"), btn_done("//button[@class='btn btn-primary copy-button']"), btn_retiredVerificationPopUp("//body/div[4]/div[3]/a"), btn_Lifecycle("//a[@id='lifecyclesLink']"), chk_deprecateOldVersion("//input[@id='deprecateOldVersions']"), ele_lblStatus("//h4/a[text()='<param_APIName>']/../../h5[contains(text(),'<param_version>')]/../p[contains(text(),'<param_creater>')]/../h5[contains(text(),'<param_status>')]"), chk_requireReSubmision("//input[@id='requireResubscription']"), lnk_Users("//a[@id='usersLink']"), ele_lblActiveSubscriptionGrid("//th[@class='span4']"), ele_lblDesign("//span[text()='Design']"), ele_lblManage("//a[@title='Manage']"), ele_ddResponseCaching("//select[@id='responseCache']"), btn_EditSource("//a[@id='swaggerEditor']"), btn_SwaggerFile("//button[@id='fileMenu']"), frm_SwaggerEditIframe("id=se-iframe"), btn_DownloadYAML("//span[contains(text(),'Download YAML')]"), btn_DownloadJSON("//span[contains(text(),'Download JSON')]"), ele_lblNextPage("//a[text()='>>']"), ele_lblDeleteAPI("//a[@title='DELETE']"), ele_ddAPIManage_responseCaching("//select[@id='responseCache']"), tf_APIMange_cacheTimeout("//input[@id='cacheTimeout']"), ele_lblAPIManage_ResourcesVerificationPutAndPost("//div[@id='resource_details']/table/tbody/tr[@data-path=\"$.paths./customerservice/customers.<param_invokeCommand>\"]"), ele_lblAPIManage_ResourcesVerificationGetHeadAndDelete("//div[@id='resource_details']/table/tbody/tr[@data-path=\"$.paths./customerservice/customers/{id}.<param_invokeCommand>\"]"), btn_keepEditting("//button[@id='editAPI-btn']"), btn_gotoAPIStore("//a[@id='goToStore-btn']"), ele_lblSearchTermIsMissing("//label/b[contains(text(),\"<param_errorSearchTearmMissing>\")]"), chk_CustomTier("//label[contains(text(),'Custom')]"), ele_lblAPIDeletePleaseWait("//body/div[4]/div[1]/h3[contains(text(),'Please wait')]"), ele_lblBrowse_Users_userName("//tbody[@id='userList']/tr/td[contains(text(),'<param_userName>')]"), ele_lnkMangedAPI("//div[@id='headingOne']"), btn_StateBlock("//input[@id='actionButton0']"), btn_StateDeprecate("//input[@id='actionButton3']"), ele_ddApiTier("//select[@id='apiTier']"), ele_lblConfigurations("//div[text()='Configurations']"), lnk_EditIcon("//i[@class='fw fw-edit fw-stack-1x']"), ele_lblResourseTierLevel("//span[text()='<param_APIResource>']/../../td/a[text()='<param_tierLevel>']");

    private String searchPath;
  
    /**
    *  Page APIPublisherBrowse.
    */
    private APIPublisherBrowse(final String psearchPath) {
        this.searchPath = psearchPath;
    }
    
    /**
     *  Get search path.
     * @param searchPath search path.
     */
    public final String getSearchPath() {
        return searchPath;
    }
}