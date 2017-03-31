package zautomate.zadoqa.commands;

public interface OR {

	/**
	 * Uploading images and CSV Files
	 */
	public static String UPLOAD_BUFFERING_ICON="//div[@class='file-upload btn']//i";
	public static String UPLOADED_IMAGE_NAME="//span[@class='file-upload-name ng-binding']";
	public static String UPLOADED_IMAGE_ERROR="//dd[@class='error']/span[@class='ng-binding ng-scope']";
	public static String UPLOADED_CSV_FILE_NAME="//span[@class='file-upload-name']";
	public static String UPLOADED_IMAGE_ERROR_FOR_CODE_REWARD="//div[@class='ct-error notification notification-error']//span[@class='ng-binding ng-scope']";
	public static String UPLOADED_CSV_FILE_NAME_FOR_CODE_REWARD="//div[@class='ng-scope']/p[@class='ng-binding']";

	public static String PROGRAM_TAB="//div[text()='Program']";
	public static String WIDGETS_LINK="//ul//a[text()='Widgets']";
	public static String ADDWIDGETS_LINK="//a[text()='Add Widget']";
	public static String ACTIVITYHISTORY_LINK="//a[contains(text(),'Activity History')]";
	public static String WIDGETNAME_INPUT="widget-name-input";
	public static String WIDGETLOGIN_HEADERTEXT="widget-header-text-input";
	public static String WIDGETLOGIN_CUSTOMCSSURL="widget-css-url-input";
	public static String WIDGETLOGIN_MAXHEIGHT="input-max-height";
	public static String WIDGETLOGOUT_DISPLAYSIGNUP_RADIO="onboarding-logout-state-label";
	public static String WIDGETLOGOUT_HEADLINETEXT="reg-widget-form-heading";
	public static String WIDGETLOGOUT_SUBHEADLINETEXT="reg-widget-form-subheading";
	public static String WIDGETLOGOUT_BACKGROUNGIMAGE_UPLOADBUTTON="logout-background-image-url";
	public static String WIDGETLOGOUT_CUSTOMCSSURL="reg-widget-form-css-url";
	public static String WIDGETSUBMIT_BUTTON="//span[text()='Submit']";
	public static String WIDGET_GENERATEDCODE_URL="//p[@class='code']/code";
	public static String REWARDHISTORY_LINK="//a[contains(text(),'Reward History')]";
	public static String REWARDHISTORY_PAGEHEADER="//h1[contains(text(),'Reward History')]";
	public static String REWARDLIST_LINK="//a[contains(text(),'Reward List')]";
	public static String REWARDLIST_PAGEHEADER="//h1[contains(text(),'Reward List')]";
	public static String REWARDLIST_SELECTREWARD_DROPDOWN="//select[@class='ng-invalid ng-invalid-required select2-offscreen ng-dirty ng-valid-integer']";
	public static String REWARDLIST_SELECTREWARD_DROPDOWN1="//select[@class='ng-valid ng-valid-required select2-offscreen ng-dirty ng-valid-integer']";
	public static String ACTIVITYLIST_LINK="//a[contains(text(),'Activity List')]";
	public static String ACTIVITYLIST_PAGEHEADER="//h1[contains(text(),'Activity List')]";
	public static String CATEGORYNAME_TEXTBOX="category-form-name";
	public static String NEWCATEGORY_ENABLE_BRANDINGIMAGE="category-form-has-branding-true";
	public static String NEWCATEGORY_IMAGE_UPLOADBUTTON="category-form-branded-image-url";
	public static String NEWCATEGORY_PREVIEWBUTTON="//span[text()='Preview']";
	public static String NEWCATEGORY_CREATEDNAME="//h1[text()='Preview Category']/following-sibling::dl//dd/p";
	public static String ADDCATEGORY_BUTTON="//a[text()='Add Category']";
	public static String CTADMIN_TAB="//div[text()='CT Admin']";
	public static String CMSUSER_LINK="//a[text()='CMS User']";
	public static String ADDNEWUSER_BUTTON="//a[text()='Add new user']";
	public static String ADDNEWUSER_PAGEHEADER="//h1[text()='New User']";
	public static String ADDNEWUSER_EMAILADDRESS_TEXTBOX="cms-user-form-email-address";
	public static String ADDNEWUSER_FIRSTNAME_TEXTBOX="cms-user-form-first-name";
	public static String ADDNEWUSER_LASTNAME_TEXTBOX="cms-user-form-last-name";
	public static String ADDNEWUSER_PASSWORD_TEXTBOX="cms-user-form-password";
	public static String ADDNEWUSER_CONFIRMPASSWORD_TEXTBOX="cms-user-form-confirm-password";
	public static String CMSUSER_SIGNUP_PERMISSION_RADIOBUTTON_START="//div[@name='permissions']//tbody/tr[";
	public static String CMSUSER_SIGNUP_PERMISSION_RADIOBUTTON_END="]//td[4]/div//input";
	public static String CMSUSER_SIGNUP_READ_ONLY_PERMISSION_RADIOBUTTON_END="]//td[3]/div//input";
	public static String CMSUSER_SIGNUP_NA_PERMISSION_RADIOBUTTON_END="]//td[2]/div//input";
	public static String BACKTOALLCMSUSER_LINK="//a[text()='Back to all CMS users']";
	public static String CODEREDEMPTION_LINK="//a[contains(text(),'Code Redemption')]";
	public static String CODEREDEMPTION_PAGEHEADER="//h1[contains(text(),'Code Redemption')]";
	public static String CODEREDEMPTION_SELECTCAMPAIGN_DROPDOWN="code-redemption-widget-select-campaign";
	public static String ACTIVITYLIST_SELECTACTIVITY_DROPDOWN="//select[@class='ng-pristine ng-invalid ng-invalid-required']";
	public static String WIDGET_FB_LOGIN_BUTTON="//button[@class='btn btn-facebook ng-scope']//span[text()='Log In with Facebook']";
	public static String REWARD_LIST_NO_MATCHES_FOUND="//ul[@class='select2-results']/li[@class='select2-no-results' and contains(text(),'No matches found')]";
	public static String REWARD_LIST_INPUT_TEXTBOX="//div[@id='select2-drop']//input[@class='select2-input']";
	public static String REWARD_LIST_SELECT_ARROW="//a[@class='select2-choice select2-default']/span[@class='select2-chosen']";
	public static String CMSUSERS_EMAILADDRESS_START="//div[@id='cms-user-list']//tbody/tr[";
	public static String CMSUSERS_EMAILADDRESS_END="]//div";
	public static String SEARCH_TEXTBOX="//input[@class='search-box-input']";
	/**
	 * Create rewards for Code Type
	 */
	public static String REWARDS_MENU="//div[text()='Rewards']";
	public static String REWARDS_SUBMENU="//a[text()='Rewards']";
	public static String CATEGORIES_SUBMENU="//a[text()='Categories']";
	public static String ADD_REWARD_BUTTON="//a[text()='Add Reward']";
	public static String REWARDS_BASIC_INFO_TITLE="//h3[text()='Basic Information']";
	public static String REWARD_NAME="reward-form-title";
	public static String SELECT_REWARD_CAMPAIGN="reward-form-category-id";
	public static String REWARD_UPLOAD_IMAGE="reward-form-image-url";
	public static String REWARD_DESCRIPTION="reward-form-description";
	public static String REWARD_POINTS="reward-form-num-points";
	public static String REWARD_STANDARD="//span[contains(text(),'Standard')]/preceding-sibling::input";
	public static String REWARD_TYPE_CODE="//span[contains(text(),'Codes')]/preceding-sibling::input";
	public static String REWARD_CONTINUE_STEP1="//span[contains(text(),'Continue to Settings 1/4')]";
	public static String REWARD_CONTINUE_STEP2="//span[contains(text(),'Continue to Settings 2/4')]";
	public static String REWARD_CONTINUE_STEP3="//span[contains(text(),'Continue to Settings 3/4')]";
	public static String REWARD_CONTINUE_STEP4="//span[contains(text(),'Continue to Settings 4/4')]";
	public static String REWARD_CODE_PAGE1_TITLE="//div[@class='wizard']/div//p[text()='Codes']";
	public static String REWARD_KIND_OF_REWARD_CHECKBOX="reward-form-is-one-of-a-kind-true";
	public static String REWARD_REFERENCE_ID="reward-form-reference-id";
	public static String REWARD_MAXIMUM_NUMBER_OF_ENTRY="reward-form-is-max-per-user-false";
	public static String REWARD_START_DATE_TEXTBOX="reward-form-date-start";
	public static String REWARD_SELECT_START_DATE="//td[@class='text-center ng-scope enabled today']/button";
	public static String REWARD_NO_END_DATE="reward-form-has-end-date-false";
	public static String REWARD_ENABLE_THIS_REWARD_CHECKBOX="reward-form-is-enabled-true";
	public static String REWARD_ADD_CSV_FILE="reward-code-form-csv";
	public static String REWARD_MINIMUM_LEVEL_REQUIRED="//span[contains(text(),'Bronze')]/preceding-sibling::input";
	public static String REWARD_SHOW_AS_LOCKED="reward-form-has-show-as-locked-false";
	public static String REWARD_CONTINUE_TO_PREVIEW_BUTTON="//button[@class='btn']/span[text()='Continue to Preview']";
	public static String REWARD_TITLE_FOR_AFTER_CREATION="//div[@class='module']//dl[@class='form']//dd/p[@class='ng-binding']";
	public static String REWARD_BUTTON_COMPLETE="//div[@class='preview-container']/button[@class='btn']/span[text()='Complete']";
	public static String REWARD_BACK_TO_REWARD_BUTTON="//div[@class='btn ng-binding' and text()='Back to Rewards']";
	public static String CREATED_REWARD = "//div[@class='ng-binding' and text()='sdsas']";
	public static String CREATED_REWARD1 = "//div[@class='ng-binding' and text()='";
	public static String CREATED_REWARD2 = "']";
	public static String REWARD_DELETE="//*[@id='wizard-list-page']/table/tbody/tr[";
	public static String REWARD_DELETE1="]/td[1]/div[2]/span[5]/a";
	public static String REWARD_DELETE_NAME="//div[@class='ng-binding' and text()='";
	public static String REWARD_DELETE_NAME1="']/following-sibling::div//span/a[text()='Delete']";
	public static String REWARD_DELETE_BUFFERING_ICON="//a[@class='btn btn-danger']//i";
	public static String REWARD_DELETE_BUTTON="//a[@class='btn btn-danger']/span[text()='Delete']";
	public static String REWARD_DELETE_ERROR_MESSAGE="//div[@class='ct-error notification notification-error']";
	public static String REWARD_DELETE_CANCELL_BUTTON="//a[@class='btn btn-secondary ng-binding' and text()='Cancel']";
	public static String REWARD_VIEW_NAME="//div[@class='ng-binding' and text()='";
	public static String REWARD_VIEW_NAME1="']/following-sibling::div//span/a[text()='View']";	
	public static String REWARD_TITLE="//div[@class='module']/h3[text()='Basic Information']//following-sibling::dl//dd/p[@class='ng-binding' and text()='";
	public static String REWARD_TITLE1="']";	
	public static String BACK_TO_REWARDS_LINK="//span[@class='ng-binding' and text()='Back to Rewards']";
	public static String MEMBERCARE_SEARCH_BUTTON="//button[text()='Search']";
	public static String SURVEY_DELETE_BUTTON="//a[@class='btn btn-danger ng-scope']/span[text()='Delete']";
	/**
	 * Gobi.E
	 **/
	public static String REWARD_FEATURED_LINK="//a[@class='ng-binding ng-scope' and text()='Featured']";	
	public static String FEATURED_PAGE_TITLE="//div[@class='page-heading']/h1[@class='ng-binding']";
	public static String REWARD_LIST_REWARD_NAME="//div[@class='ng-binding' and text()='";
	public static String REWARD_LIST_REWARD_NAME1="']";
	public static String FEATURED_LIST_REWARD_NAME="//td[@class='ng-binding' and text()='";
	public static String FEATURED_LIST_REWARD_NAME1="']";		
	public static String REWARD_STATUS_BAR="//div[@class='ng-binding' and text()='";
	public static String REWARD_STATUS_BAR1="']/parent::td/following-sibling::td[8]";
	public static String REWARD_DISABLE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_DISABLE_LINK1="']/following-sibling::div//span/a[text()='Disable']";
	public static String REWARD_ENABLE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_ENABLE_LINK1="']/following-sibling::div//span/a[text()='Enable']";
	public static String REWARD_DISABLE_BUTTON="//a[@class='btn btn-danger']/span[text()='Disable']";
	public static String REWARD_ENABLE_BUTTON="//a[@class='btn btn-danger']/span[text()='Enable']";	
	public static String ADD_TO_FAVORITE_LINK="//div[@class='ng-binding' and text()='";
	public static String ADD_TO_FAVORITE_LINK1="']/following-sibling::div//span/a[text()='Add to Featured']";
	public static String REWARD_ALREADY_ADD_TO_FAVORITE="//div[@class='ng-binding' and text()='";
	public static String REWARD_ALREADY_ADD_TO_FAVORITE1="']/span[@class='flag' and text()='Featured']";
	public static String REWARD_REMOVE_FROM_FEATURED="//div[@class='ng-binding' and text()='";
	public static String REWARD_REMOVE_FROM_FEATURED1="']/following-sibling::div//span/a[text()='Remove from Featured']";
	public static String REWARD_DUPLICATE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_DUPLICATE_LINK1="']/following-sibling::div//span/a[text()='Duplicate']";
	public static String REWARD_DUPLICATE_TITLE_PAGE="//div[@class='wizard']/div//p";
	///Reward History
	public static String WIDGET_ACCOUNTOVERVIEW_FRAME="//html/body/iframe[1]";
	public static String WIDGET_REWARD_HISTORY_FRAME="//html/body/iframe[2]";
	public static String WIDGET_REWARD_LIST_FRAME="//html/body/iframe[3]";
	public static String WIDGET_REWARD_LIST_REDEEM_FRAME="//html/body/div[1]/div/iframe";	
	public static String WIDGET_REDEEMABLE_POINTS="//div[@id='account-overview']//div[@class='container']/div[@class='user-container']//div[@class='points-info']//div[@class='redeemable-points ct-points-color']";
	public static String WIDGET_LIFETIME_POINTS="//div[@id='account-overview']//div[@class='container']/div[@class='progress-bar-container']//ct-progress-bar/span/span[@class='bar']/span";
	public static String WIDGET_REWARD_LIST_REWARD_NAME="//div[@id='reward-list']//div[@class='container']/div[@class='rewards']//div[@class='content']/a[@class='title ct-link-color ng-binding']";
	public static String WIDGET_REDEEM_REWARD_TITLE="//div[@id='details']/div[@class='reward-title ng-binding']";
	public static String WIDGET_SELECT_QUANTITY="//select[@class='ng-pristine ng-valid ng-valid-required']";
	public static String WIDGET_REWARD_CONTINUE_BUTTON="//button[@class='btn ct-button ng-binding' and text()='Continue']";
	public static String WIDGET_REWARD_COMPLETE_BUTTON="//button[@class='btn ct-button btn-danger ng-binding' and text()='Complete']";
	public static String WIDGET_REWARD_CLOSE_BUTTON="//a[@class='btn btn-secondary ng-binding' and text()='Close']";
	public static String WIDGET_REWARD_HISTORY_REWARD_TITLE="//html//div[@id='reward-history']//div[@class='container']/table/thead/tr/th[text()='Reward']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='";
	public static String WIDGET_REWARD_HISTORY_REWARD_TITLE1="']";
	public static String WIDGET_REWARD_HISTORY_REWARD_DATE="//html//div[@id='reward-history']//div[@class='container']/table/thead/tr/th[text()='Reward']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='";
	public static String WIDGET_REWARD_HISTORY_REWARD_DATE1="']/parent::p/parent::td/parent::tr/td";
	public static String WIDGET_REWARD_HISTORY_REWARD_TRANSACTION="//html//div[@id='reward-history']//div[@class='container']/table/thead/tr/th[text()='Reward']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='";
	public static String WIDGET_REWARD_HISTORY_REWARD_TRANSACTION1="']/parent::p/parent::td/parent::tr/td/span";
	public static String WIDGET_REWARD_HISTORY_TRANSACTION_VALUE="//html//div[@id='reward-history']//div[@class='container']/table/thead/tr/th[text()='Reward']/parent::tr/parent::thead/parent::table//following-sibling::tbody/tr[";
	public static String WIDGET_REWARD_HISTORY_TRANSACTION_VALUE1="]/td/span";
	public static String WIDGET_REWARD_DOWNLOAD_BUTTON="//a[@class='btn ct-button ng-binding ng-scope' and text()='Download']";
	public static String WIDGET_REWARD_TITLE_DOWNLOAD_BUTTON="//html//div[@id='reward-history']//div[@class='container']/table/thead/tr/th[text()='Reward']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='";
	public static String WIDGET_REWARD_TITLE_DOWNLOAD_BUTTON1="']/parent::p/parent::td//a[ text()='Download']";
	/**
	 * Prateep
	 * */
	public static String UPLOAD_IMAGE="logout-background-image-url";
	public static String REWARD_IMAGE="reward-form-image-url";
	public static String REWARD_IMAGE_NAME="//p[contains(text(),'Max size is 5MB and allowed formats are jpg, jpeg and png.')]/following::span";
	public static String CMS_LOGIN_LOGO="//img[@id='img-logo']";
	public static String WIDGET_LOGOUT="//a[@class='logout-link ct-link-color ng-binding' and contains(text(),'Log out')]";
	public static String WIDGET_LOGIN="//a[@class='ct-link-color ng-binding' and contains(text(),'Log In')]";
	public static String WIDGET_LOGIN_TITLE="//*[@id='sign-up']/div[1]/h3";
	public static String WIDGET_LOGIN_USERNAME="//*[@id='sign-up']/div[2]/div[5]/form/dl[1]/dd/input";
	public static String WIDGET_LOGIN_PASSWORD="//*[@id='sign-up']/div[2]/div[5]/form/dl[2]/dd/input";
	public static String WIDGET_LOGIN_BUTTON="//*[@id='sign-up']/div[2]/div[5]/form/button";
	public static String WIDGET_LOGIN_ACCOUNT_NAME="//*[@id='account-overview']/div[2]/div[1]/div[2]/div[1]";
	public static String WIDGET_LOGIN_ERROR_MSG="//*[@id='sign-up']/div[2]/div[5]/form/div[1]";
	public static String WIDGETLOGINFRAME1 = "//html/body/iframe[1]";
	public static String ACCOUNT_OVERVIEW_LINK="//a[contains(text(),'Account Overview')]";
	public static String WIDGETLOGINFRAME2 = "//html/body/div[1]/div/iframe";
	public static String WIDGETLOGINFRAME3 = "//html/body/iframe[1]";//"//html/body/div[1]/div/iframe";
	public static String FOURSQUARE_CAMPAIGN_LINK="//a[contains(text(),'Foursquare Campaign')]";
	public static String FOURSQUARE_SELECT_CAMPAIGN="//select[@id='checkin-campaign-widget-select-campaign']";
	public static String FOURSQUARE_CAMPAIGN01="//*[@id='checkin-campaign-widget-select-campaign']/option[2]";
	public static String INVITE_FRIENDS_LINK="//a[contains(text(),'Invite Friends')]";
	public static String SOCIAL_CONNECT_LINK="//a[contains(text(),'Social Connect')]";
	public static String WIDGET_SURVEY_LINK="//a[contains(text(),'Survey')]";
	public static String SURVEY_SELECT="//select[@id='survey-widget-select-survey']";
	public static String CMS_LOGO="//div[@class='logo']";
	public static String CMS_CC="//h1[text()='Control Center']";
	public static String CMS_LOGIN_NAME="//i[@class='icon-user']/parent::span[@class='ng-binding']";
	public static String CMS_LOGOUT="//i[@class='icon-logout']/parent::a";
	public static String WIDGET_SIGNUP_BUTTON="//div[@id='registration']/div[2]/div/button";
	public static String WIDGET_SIGNUP_EMAIL_BUTTON="//span[text()='Sign Up With Email']";
	public static String WIDGET_BASIC_INFO_TITLE="//h3[text()='Basic Info']";
	public static String WIDGET_COMPLETE_SIGNUP_TITLE="//h3[text()='Complete Sign Up']";
	public static String WIDGET_FIRSTNAME="//input[@name='firstName']";
	public static String WIDGET_LASTNAME="//input[@name='lastName']";
	public static String WIDGET_EMAIL_ADDRESS="//input[@name='email_address']";
	public static String WIDGET_USERNAME="//input[@name='username']";
	public static String WIDGET_SUBMIT_BUTTON="//button[@type='submit']"; 
	public static String WIDGET_PASSWORD="//input[@name='password']";
	public static String WIDGET_CONFIRM_PASSWORD="//input[@name='confirmPassword']";
	public static String WIDGET_POSTALCODE="//input[@name='postal_code']";
	public static String WIDGET_TERMS_RADIOBUTTON="//input[@name='tos']";
	public static String WIDGET_COMPLETE_BUTTON="//span[text()='Complete']"; 
	public static String WIDGET_USERNAME_ERRORMSG="//dd[text()='This username is taken.']";
	public static String WIDGET_EMAIL_ERRORMSG="//dd[text()='This email address is taken.']";
	public static String SIGNUP_USERNAME="//div[@id='account-overview']//div//div/div[@class='name ng-binding']";//"//*[@id='account-overview']/div[2]/div[1]/div[2]/div[1]";	
	public static String REWARD_DOWNLOAD="//span[contains(text(),'Download')]/preceding-sibling::input";
	public static String REWARD_SWEEPSTAKES="//span[contains(text(),'Sweepstakes')]/preceding-sibling::input";	 
	public static String REWARDS_SETTINGS_PAGE1="//h3[@class='settings-page ng-binding ng-scope' and contains(text(),'Settings (1/4)')]";
	public static String REWARDS_SETTINGS_PAGE2="//h3[@class='settings-page ng-binding ng-scope' and contains(text(),'Settings (2/4)')]";
	public static String REWARDS_SETTINGS_PAGE3="//h3[@class='settings-page ng-binding ng-scope' and contains(text(),'Settings (3/4)')]";
	public static String REWARDS_SETTINGS_PAGE4="//h3[@class='settings-page ng-binding ng-scope' and contains(text(),'Settings (4/4)')]";
	public static String REWARDS_ONEKIND_RADIOBUTTON="reward-form-is-one-of-a-kind-true";
	public static String REWARDS_QUANTITY="reward-form-quantity";
	public static String REWARDS_SHIPPING_ADDRESS_RADIOBUTTON="reward-form-shipping-required-true";
	public static String REWARDS_PHONE_NUMBER_RADIOBUTTON="reward-form-phone-number-required-true";
	public static String REWARDS_START_DATE="reward-form-date-start";
	public static String REWARDS_END_DATE="reward-form-date-end";
	public static String REWARDS_DEADLINE_DATE="reward-form-entries-date";
	public static String REWARDS_END_DATE_RIGHT_BUTTON="//input[@id='reward-form-date-end']/following-sibling::ul//thead//th[3]//button";
	public static String REWARDS_END_DATE_01="//input[@id='reward-form-date-end']/following-sibling::ul//tbody//tr//button/span[text()='01']";
	public static String REWARDS_DEADLINE_DATE_RIGHT_BUTTON="//input[@id='reward-form-entries-date']/following-sibling::ul//thead//th[3]//button";
	public static String REWARDS_DEADLINE_DATE_01="//input[@id='reward-form-entries-date']/following-sibling::ul//tbody//tr//button/span[text()='01']";
	public static String REWARDS_START_DATE_TODAY="//td[@class='text-center ng-scope enabled today']/button";
	public static String REWARDS_NO_END_DATE="reward-form-has-end-date-false";
	public static String REWARDS_ENABLE="reward-form-is-enabled-true";
	public static String REWARDS_UPLOAD="reward-form-asset-url";
	public static String REWARDS_UPLOAD_NAME="//span[@class='file-upload-name ng-binding']";
	public static String REWARDS_BRONZE_RADIOBUTTON="//span[contains(text(),'Bronze')]/preceding-sibling::input";
	public static String REWARDS_SHOWLOCKED_RADIOBUTTON="reward-form-has-show-as-locked-false";
	public static String REWARDS_PREVIEW_BUTTON="//span[contains(text(),'Continue to Preview')]/parent::button";
	public static String REWARDS_COMPLETE_BUTTON="//span[contains(text(),'Complete')]/parent::button";
	public static String REWARDS_COMPLETE="//p[contains(text(),'This reward has been added.')]";
	public static String CREATED_REWARD_NAME="//label[text()='Reward Title']/parent::dt/following-sibling::dd/p";
	public static String REWARDS_LIMIT_PERUSER="reward-form-max-per-user";
	public static String REWARDS_NO_OF_WINNERS="opportunity-form-num-winners";
	public static String REWARDS_WINNER_POINTS="reward-form-num-points";
	public static String BACK_TO_WIDGETS="//a[@class='back-to-list-page ng-binding' and contains(text(),'Back to Widgets')]";
	public static String BACK_TO_REWARDS="//span[@class='ng-binding' and contains(text(),'Back to Rewards')]";
	public static String WIDGET_FB_CONNECT_BUTTON="//button[@class='btn btn-facebook ng-scope']//span[text()='Connect with Facebook']";
	public static String FB_CROWDTWIST="//a[@target='_blank' and contains(text(),'CrowdTwist')]";
	public static String FB_USERNAME="email";
	public static String FB_PASSWORD="pass";
	public static String FB_LOGIN="//label[@id='loginbutton']/input[@name='login']";
	public static String FB_LOGIN_OK_BUTTON="//button[@type='submit' and contains(text(),'Okay')]";	
	public static String WIDGET_FB_SIGNUP_CONTINUE="//button[@class='btn ct-button']/span[text()='Continue']";
	public static String WIDGET_SIGNUP_OUTSIDE_US="//a[@class='location ng-binding' and contains(text(),'Live outside the US?')]";
	public static String WIDGET_COUNTRY="//label[@class='ng-binding' and contains(text(),'Country')]";
	public static String WIDGET_COUNTRY_DROPDOWN_MENU="//select[@class='country-select ng-pristine ng-valid']";
	public static String WIDGET_CITY="//input[@class='form-control ng-pristine ng-valid']";
	public static String WIDGET_CITY_SELECT="//strong[text()='Chennai']";
	public static String WIDGET_TWITTER_CONNECT_BUTTON="//button[@class='btn btn-twitter ng-scope']//span[text()='Connect with Twitter']";
	public static String TWITTER_USERNAME="//input[@id='username_or_email']";
	public static String TWITTER_PASSWORD="//input[@id='password']";
	public static String TWITTER_LOGIN="//input[@id='allow']";
	public static String CATCHOW_FIRSTNAME="//input[@name='first_name']";
	public static String CATCHOW_LASTNAME="//input[@name='last_name']";
	public static String CATCHOW_PASSWORD_MISMATCH="//dd[text()='Your password and confirmation password do not match.']";
	public static String CATCHOW_WEAK_PASSWORD="//dd[text()='Your password is too weak']";
	public static String CATCHOW_CONFIRM_PASSWORD="//input[@name='confirm_password']";
	public static String CATCHOW_TERMS_RADIOBUTTON="terms_of_service";
	public static String CATCHOW_THANKS_MSG="//div[@class='content']//h2";	
	public static String ZUMEIZ_SIGN_UP="//a[@class='btn']/span[text()='Sign up now']";
	public static String ZUMEIZ_FIRSTNAME="//input[@name='first_name']";
	public static String ZUMEIZ_LASTNAME="//input[@name='last_name']";
	public static String ZUMEIZ_CONFIRM_PASSWORD="//input[@name='confirm_password']";
	public static String ZUMEIZ_THANKS_MSG="//div[@class='content']//h2";
	public static String ZUMEIZ_BIRTH_MONTH="//div[@id='s2id_date_of_birth_month']/a/span";
	public static String ZUMEIZ_BIRTH_DAY="//div[@id='s2id_date_of_birth_day']/a/span";
	public static String ZUMEIZ_BIRTH_YEAR="//div[@id='s2id_date_of_birth_year']/a/span";
	public static String ZUMEIZ_TERMS_RADIOBUTTON="terms_of_service";
	public static String ZUMEIZ_AGE_UNDER_13="//div[@class='stash-container']";
	public static String ZUMEIZ_JAN_MONTH="//*[@id='select2-drop']/ul/li[1]/div";
	public static String ZUMEIZ_DEC_MONTH="//*[@id='select2-drop']/ul/li[12]/div";
	public static String ZEMEIZ_DATE_5="//div[@id='select2-drop']/ul/li[5]/div";
	public static String ZEMEIZ_YEAR_2002="//div[@id='select2-drop']/ul/li[14]/div";
	public static String ZEMEIZ_YEAR_2003="//div[@id='select2-drop']/ul/li[13]/div";
	/*
	 * Member care
	 */
	public static String MEMBERCARE_lINK="//a[text()='Member Care']";
	public static String RESETPASSWORD_BUTTON="//a[text()='Reset Password']";
	public static String NEWPASSWORD_TEXTBOX="newpassword";
	public static String SUBMIT_BUTTON="//button[text()='Submit']";
	/**
	 * Gobi
	 * Activity History
	 * **/
	public static String WIDGET_ACTIVITY_HISTORY_FRAME="//html/body/iframe[2]";
	public static String WIDGET_REWARD_VERIFY_ADDRESS_BUTTON="//button[@class='btn btn-secondary ng-binding' and text()='Verify address']";
	public static String WIDGET_REWARD_ACTIVITY_HISTORY_TITLE="//html//div[@id='activity-history']//div[@class='container']/table/thead/tr/th[text()='Activity']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span";
	public static String WIDGET_REWARD_ACTIVITY_HISTORY_DATE="//html//div[@id='activity-history']//div[@class='container']/table/thead/tr/th[text()='Activity']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='";
	public static String WIDGET_REWARD_ACTIVITY_HISTORY_DATE1="']/parent::p/parent::td/parent::tr/td";
	public static String WIDGET_REWARD_ACTIVITY_HISTORY_TRANSACTION="//html//div[@id='activity-history']//div[@class='container']/table/thead/tr/th[text()='Activity']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='";
	public static String WIDGET_REWARD_ACTIVITY_HISTORY_TRANSACTION1="']/parent::p/parent::td/parent::tr/td/span";
	///Code Redeemption
	public static String ACTIVITIES_MENU="//div[text()='Activities']";
	public static String CODE_REDEMPTION_SUB_MENU="//div/a[text()='Code Redemption']";
	public static String LOADING_PAGE = "//div[@class='cg-busy-default-text ng-binding' and text()='Loading...']";
	public static String ADD_CODE_REDEMPTION_BUTTON="//a[@class='btn ng-binding ng-scope' and text()='Add Code Redemption Campaign']";
	public static String CODE_REDEMPTION_BASIC_INFO_TITLE="//h3[text()='Basic Information']";
	public static String CODE_REDEMPTION_FORM_NAME="code-redemption-form-name";
	public static String CODE_REDEMPTION_FORM_DESCRIPTION="code-redemption-form-description";
	public static String CODE_REDEMPTION_FIELD_NAME="code-redemption-form-code-input-field-name";
	public static String CODE_REDEMPTION_ACTIVITY_ICON_IMAGE_BUTTON="code-redemption-form-activity-icon";
	public static String CODE_REDEMPTION_DURATION_IS_ACTIVE_YES="code-redemption-form-is-active-true";
	public static String CODE_REDEMPTION_START_DATE_TEXTBOX="dateStart";
	public static String CODE_REDEMPTION_SELECT_START_DATE="//td[@class='text-center ng-scope enabled today']/button";
	public static String CODE_REDEMPTION_UPLOAD_CSV_FILE_BUTTON="code-redemption-form-csv-url";
	public static String CODE_REDEMPTION_PREVIEW_BUTTON="//button[@class='btn']/span[text()='Preview']";
	public static String ADD_CODE_REDEMPTION_COMPAIGN_BUTTON="//a[@class='btn ng-binding' and text()='Add Code Redemption Campaign']";
	public static String CODE_REDEMPTION_TITLE="//div[@class='module']//dl[@class='form']//dd/p[@class='ng-binding']";
	public static String AFTER_CREATED_CODE_REDEMPTION_TITLE="//div[text()='";
	public static String AFTER_CREATED_CODE_REDEMPTION_TITLE1="']";
	/*
	 * Add Survey
	 */
	public static String SURVEYS_LINK="//a[text()='Surveys']";
	public static String ACTIVITIES_TAB="//div[text()='Activities']";
	public static String ADDSURVEY_BUTTON="//a[text()='Add Survey']";
	public static String SURVEYTITLE_TEXTBOX="survey-form-title";
	public static String SURVEY_POINTSVALUE_TEXTBOX="survey-form-points";
	public static String SURVEY_DESCRIPTION_TEXTAREA="survey-form-description";
	public static String SURVEY_STARTDATE="//input[@name='dateStart']";
	public static String SURVEY_NO_END_DATE="survey-form-has-end-date-true";
	public static String SURVEY_QUESTION_TITLE="survey-form-question-0-title";
	public static String SURVEY_QUESTION_TYPE_DROPDOWN="survey-form-question-0-type";
	public static String SURVEY_QUESTION_ANSWER_TEXTBOX="survey-form-question-0-answers";
	public static String SURVEY_CREATEDNAME="//h1[text()='Preview Survey']/following-sibling::div//dl//dd/p";	
	/**
	 * Program_Membercare_AddDeductPoints
	 */
	public static String ADD_DEDUCTPOINTS_BUTTON="//a[text()='Add / Deduct Points']";
	public static String CUSTOMACTIVITY_TITLE="custom-activity-title";
	public static String CUSTOMACTIVITY_POINTS_TEXTBOX="custom-activity-points";
	public static String CREATED_CUSTOMACTIVITY_TITLE="//div[@class='ng-scope']/div/h3/following-sibling::dl//dd/p";
	public static String MEMBERCARE_LOGGEDIN_USERNAME="//label[text()='Email Address']/parent::dt/following-sibling::dd/p";
	/**
	 * Prabakaran
	 * Bonus Point
	 * **/
	public static String BONUSPOINTS_SUBLINK="//a[text()='Bonus Points']";
	public static String ADD_BONUS_POINT_COMPAIGN_BUTTON="//a[@class='btn ng-binding ng-scope' and text()='Add Bonus Points Campaign']";
	public static String BONUS_POINT_SUB_LINK="//a[@class='ng-binding ng-scope selected' and text()='Bonus Points']";
	public static String BONUS_POINT_NAME="bonus-campaign-form-name";
	public static String BONUS_POINT_ENABLE_THIS_COMPAIGN="bonus-campaign-form-is-active";
	public static String BONUS_POINT_START_DATE_TEXTBOX="campaign-form-date-start";
	public static String BONUS_POINT_SELECT_START_DATE="//td[@class='text-center ng-scope enabled today']/button";
	public static String BONUS_POINT_SELECT_MULTIPLIER="bonus-campaign-form-multiplier";
	public static String BONUS_POINT_GIFT="bonus-addition-type";
	public static String BONUS_POINT_ADDITION="bonus-campaign-form-addition";
	public static String BONUS_POINT_PREVIEW_BUTTON="//button[@class='btn']/span[text()='Preview']";
	public static String BONUS_POINT_TITLE="//h1[@id='bonus-campaign-preview-heading']";
	public static String BONUS_POINT_CREATE_COMPAIGN_BUTTON="//a[@class='btn ng-binding' and text()='Create Campaign']";
	public static String BONUS_POINT_AFTER_CREATED_TITLE="//div[@class='ng-binding' and text()='";
	public static String BONUS_POINT_AFTER_CREATED_TITLE1="']";	
	public static String EDIT_BUTTON="//a[text()='Edit']";
	public static String BONUSPOINT_SELECT_STANDARDACTIVITY_RADIO="bonus-selected-activities-type";
	public static String BONUSPOINT_SELECT_STANDARDACTIVITY_TEXTBOX="//div[@id='s2id_bonus-campaign-form-activity-ids']/ul";
	public static String BONUSPOINT_POINTSGIFTS_RADIO="bonus-addition-type";
	public static String BONUSPOINTS_TEXTBOX="//input[@id='bonus-campaign-form-addition']";
	/**
	 * PRATEEP P
	 * Rewards_StandardReward_Variations
	 */
	public static String REWARD_MULTIPLE_SIZE_COLOR_RADIOBUTTON="reward-form-has-variations-true";
	public static String REWARD_VARIATIONS_SIZE_0="reward-form-variation-0-size";
	public static String REWARD_VARIATIONS_COLOR_0="reward-form-variation-0-color";
	public static String REWARD_VARIATIONS_QUANTITY_0="reward-form-variation-0-quantity";
	public static String REWARD_VARIATIONS_SIZE_1="reward-form-variation-1-size";
	public static String REWARD_VARIATIONS_COLOR_1="reward-form-variation-1-color";
	public static String REWARD_VARIATIONS_QUANTITY_1="reward-form-variation-1-quantity";
	public static String REWARD_VARIATIONS_SIZE_2="reward-form-variation-2-size";
	public static String REWARD_VARIATIONS_COLOR_2="reward-form-variation-2-color";
	public static String REWARD_VARIATIONS_QUANTITY_2="reward-form-variation-2-quantity";
	public static String REWARD_VARIATIONS_ADD_MORE="//a[@class='add ng-binding' and contains(text(),'+ Add More')]";	
	/**
	 * Prabakaran
	 * Automatic Reward creation
	 */
	public static String AUTOMATICREWARD_LINK="//a[text()='Automatic Rewards']";
	public static String LISTOFAUTOMATICREWARD_BUTTON="//a[text()='List of Automatic Rewards']";
	public static String LISTOFAUTOMATICREWARD_HEADER="//h1[text()='List of Automatic Rewards']";
	public static String NEWAUTOMATICREWARD_HEADER="//h1[text()='New Automatic Reward']";
	public static String REWARDTYPE_DROPDOWN="reward-form-type";
	public static String CREATED_AUTOMATICREWARD_TITLE="//div[@id='reward-detail-page']//div[2]//dl[2]//dd/p";
	public static String AUTOMATICREWARD_SUBMITBUTTON="//a[text()='Submit']";
	/**
	 * Gobi.E
	 * verify Preview standard reward
	 * **/
	public static String PREVIEW_STANDARD_REWARD_TITLE="//label[text()='Reward Title']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_STANDARD_REWARD_TITLE1="']";
	public static String PREVIEW_STANDARD_REWARD_CATEGORY="//label[text()='Reward Category']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_STANDARD_REWARD_CATEGORY1="']";
	public static String PREVIEW_STANDARD_REWARD_POINT_VALUE="//label[text()='Point Value']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_STANDARD_REWARD_POINT_VALUE1="']";
	public static String PREVIEW_STANDARD_REWARD_TYPE="//label[text()='Reward Type']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='Standard']";
	public static String PREVIEW_STANDARD_REWARD_POINT_QUANTITY="//label[text()='Reward Quantity']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_STANDARD_REWARD_POINT_QUANTITY1="']";
	public static String PREVIEW_STANDARD_REWARD_MAXIMUM_ENTRY="//dt[text()='Maximum Number of Entries Per Member']/following-sibling::dd/p[@class='ng-binding ng-scope' and contains(text(),'";
	public static String PREVIEW_STANDARD_REWARD_MAXIMUM_ENTRY1="')]";	
	public static String PREVIEW_STANDARD_REWARD_SHIPPING_ADDRESS="//label[text()='Shipping address']/parent::dt/following-sibling::dd/p[@class='ng-binding ng-scope' and text()='";
	public static String PREVIEW_STANDARD_REWARD_SHIPPING_ADDRESS1="']";
	public static String PREVIEW_STANDARD_REWARD_PHONE_NUMBER="//label[text()='Phone Number']/parent::dt/following-sibling::dd/p[@class='ng-binding ng-scope' and text()='";
	public static String PREVIEW_STANDARD_REWARD_PHONE_NUMBER1="']";
	public static String PREVIEW_STANDARD_REWARD_LEVEL="//label[text()='Minimum Level Required to Redeem']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_STANDARD_REWARD_LEVEL1="']";
	public static String PREVIEW_STANDARD_REWARD_MINIMUM_LEVEL="//label[text()='If Member is not at Minimum Level or Above:']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_STANDARD_REWARD_MINIMUM_LEVEL1="']";
	public static String REWARD_FEATURED="//span[@class='flag' and text()='Featured']";
	/**
	 * PRATEEP P
	 * Rewards_Start Date and End Date Future
	 */
	public static String REWARDS_START_DATE_RIGHT_BUTTON="//button[@class='btn btn-default btn-sm pull-right']";
	public static String REWARDS_START_DATE_FUTURE_DATE_01="//button[@class='btn btn-default btn-sm']";
	public static String REWARDS_START_DATE_LEFT_BUTTON="//button[@class='btn btn-default btn-sm pull-left']";
	public static String REWARDS_START_DATE_PAST_DATE_01="//button[@class='btn btn-default btn-sm']";
	public static String REWARDS_END_DATE_LEFT_BUTTON="//input[@id='reward-form-date-end']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-left']";	
	/**
	 * Gobi.E
	 * Verify Reward Address and Phone number
	 * **/
	public static String WIDGET_CONFIRMATION_DETAILS_REWARD_LIST_FRAME="//html/body/iframe[3]";
	public static String WIDGET_REDEEM_EMAIL_ADDRESS = "//div[@class='email-address ng-binding']";
	public static String WIDGET_REDEEM_FIRST_NAME="firstName"; 
	public static String WIDGET_REDEEM_LAST_NAME="lastName";
	public static String WIDGET_REDEEM_ADDRESS_1="streetAddress1";
	public static String WIDGET_REDEEM_ADDRESS_2="streetAddress2";
	public static String WIDGET_REDEEM_ZIP_CODE="zip";
	public static String WIDGET_REDEEM_CITY="city";
	public static String WIDGET_REDEEM_STATE="state";
	public static String WIDGET_REDEEM_PHONE_NUMBER="phone";	
	public static String CONFIRMATION_DETAILS="//div[@class='show-ship-info ng-binding ng-scope']";	
	public static String CONFIRMATION_EMAIL_ADDRESS="//span[@class='no-emphasis ng-binding']";
	public static String CONFIRMATION_ADDRESS_1="//div[@class='show-ship-info ng-binding ng-scope']//div[@class='ng-binding']";
	/**
	 * Gobi.E
	 * Common method for foursquare creation
	 * **/
	public static String FOURSQUARE_SUB_LINK="//a[text()='Foursquare']";
	public static String ADD_CAMPAIGN_BUTTON="//a[@class='btn ng-binding ng-scope' and text()='Add Campaign']";
	public static String CAMPAIGN_PAGE="//*[@id='edit-campaign-form']";
	public static String CAMPAIGN_NAME="checkin-campaign-form-name";
	public static String CAMPAIGN_DESCRIPTION="checkin-campaign-form-description";
	public static String CAMPAIGN_POINT_VALUE="checkin-campaign-form-num-points";
	public static String CAMPAIGN_FREQUENCY_CAP_PERIOD="checkin-campaign-form-freq-period-id";
	public static String CAMPAIGN_FREQUENCY_CAP="checkin-campaign-form-freq-cap";
	public static String CAMPAIGN_ACTIVE_CHECK_BOX="checkin-campaign-form-is-active";
	public static String CAMPAIGN_START_DATE_CHECK_BOX="checkin-campaign-start-date";
	public static String CAMPAIGN_END_DATE_CHECK_BOX="checkin-campaign-end-date";
	public static String SELECT_END_DATE="//input[@id='checkin-campaign-end-date']/following-sibling::ul//tbody//tr//button/span[text()='30']";
	public static String CAMPAIGN_START_TIME="checkin-campaign-start-time";
	public static String CAMPAIGN_END_TIME="checkin-campaign-end-time";
	public static String CAMPAIGN_UPLOAD_BUTTON="upload";
	public static String DELETE_LINK="//a[@class='key-value-pair-delete-button ng-binding']";
	public static String CAMPAIGN_PREVIEW_BUTTON1="//span[text()='Preview']";
	public static String CAMPAIGN_TITLE="//div[@class='module']//div[@class='row']//div[@class='property ng-binding' and text()='Name']/parent::div//div[@class='ng-binding']";
	public static String CREATE_CAMPAIGN_BUTTON="//a[text()='Create Campaign']"; 
	public static String CAMPAIGN_CREATED_TITLE="//tr[@class='ng-scope']/td/div[text()='";
	public static String CAMPAIGN_CREATED_TITLE1="']";
	public static String REWARD_SOLD_OUT_MESSAGE="//div[@class='sold-out ng-scope']";
	public static String REWARD_SOLD_OUT="//span[@class='sold-out ng-binding ng-scope']";
	public static String WIDGET_CLOSE_SYMBOL="//div[@id='ct-modal']/button[text()='✕']";
	/**
	 * PRATEEP P
	 * Widget Redeem Reward Variations and Reward Search
	 */
	public static String WIDGET_REDEEM_REWARD_COLOR="//label[text()='Color']/parent::dt/following-sibling::dd/select";
	public static String WIDGET_REDEEM_REWARD_SIZE="//label[text()='Size']/parent::dt/following-sibling::dd/select";
	public static String WIDGET_REDEEM_REWARD_QUANTITY="//label[text()='Quantity']/parent::dt/following-sibling::dd/select";
	public static String REWARD_SEARCH="//input[@class='search-box-input']";
	/**
	 * Gobi
	 * Sweepstakes Reward Page Title's
	 */
	public static String REWARD_PAGE_TITLE="//div[@class='page-heading']/h1[@class='ng-binding' and text()='Rewards']";
	public static String REWARD_PAGE_SEARCH_BOX="//div[@class='search-box ng-scope']/form";
	public static String REWARD_PAGE_NAME="//thead/tr/th[text()='Name']";
	public static String REWARD_PAGE_IMAGE="//thead/tr/th[text()='Image']";
	public static String REWARD_PAGE_POINTS="//thead/tr/th[text()='Points']";
	public static String REWARD_PAGE_START_DATE="//thead/tr/th[text()='Start Date']";
	public static String REWARD_PAGE_END_DATE="//thead/tr/th[text()='End Date']";
	public static String REWARD_PAGE_REDEEMED="//thead/tr/th[text()='Redeemed']";
	public static String REWARD_PAGE_REMAINING="//thead/tr/th[text()='Remaining']";
	public static String REWARD_PAGE_DATE_CREATED="//thead/tr/th[text()='Date Created']";
	public static String REWARD_PAGE_STATUS="//thead/tr/th[text()='Status']";	
	public static String PREVIEW_SWEEPSTAKES_REWARD_TITLE="//label[text()='Reward Title']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_TITLE1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_CATEGORY="//label[text()='Reward Category']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_CATEGORY1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_TYPE="//label[text()='Reward Type']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='Sweepstakes']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_MAXIMUM_ENTRY="//label[text()='Maximum Number of Entries Per Member']/parent::dl//p[contains(text(),'";
	public static String PREVIEW_SWEEPSTAKES_REWARD_MAXIMUM_ENTRY1="')]";
	public static String PREVIEW_SWEEPSTAKES_REWARD_NUMBER_OF_WINNERS="//label[text()='Number of Winners']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_NUMBER_OF_WINNERS1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_POINT_TO_ENTER="//label[text()='Points To Enter']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_POINT_TO_ENTER1="']";	
	public static String PREVIEW_SWEEPSTAKES_REWARD_SHIPPING_ADDRESS="//label[text()='Shipping address']/parent::dt/following-sibling::dd/p[@class='ng-binding ng-scope' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_SHIPPING_ADDRESS1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_PHONE_NUMBER="//label[text()='Phone Number']/parent::dt/following-sibling::dd/p[@class='ng-binding ng-scope' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_PHONE_NUMBER1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_LEVEL="//label[text()='Minimum Level Required to Redeem']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_LEVEL1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_MINIMUM_LEVEL="//label[text()='If Member is not at Minimum Level or Above:']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_SWEEPSTAKES_REWARD_MINIMUM_LEVEL1="']";
	public static String PREVIEW_SWEEPSTAKES_REWARD_AGE_RESTRICTION="//label[text()='Age Restriction']/parent::dt/following-sibling::dd/p[text()='None']";	
	public static String SWEEPSTAKES_ADDED_LATEST_FOLLOW_FEATURED_SWEEPSTAKES="//span[text()='Featured']/parent::div/parent::td/parent::tr/following-sibling::tr[@class='ng-scope'][1]/td/div[text()='";
	public static String SWEEPSTAKES_ADDED_LATEST_FOLLOW_FEATURED_SWEEPSTAKES1="']";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_NAME="//tr[@class='ng-scope'][1]/td/div[text()='";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_NAME1="']";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_POINT="//tr[@class='ng-scope'][1]/td[@class='number ng-binding' and text()='";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_POINT1="']";	
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_START_TIME="//tr[@class='ng-scope'][1]/td//div[contains(text(),'";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_START_TIME1="')]";	
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_END_TIME="//tr[@class='ng-scope'][1]/td//div[contains(text(),'";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_END_TIME1="')]";	
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_STATUS="//tr[@class='ng-scope'][1]/td/p[text()='Enabled']";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_REMAINNING="//tr[@class='ng-scope'][1]//td/span";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_REDEEMED="//tr[@class='ng-scope'][1]//td[6]";
	public static String SWEEPSTAKES_MOST_RECENTLY_ADDED_DATE="//tr[@class='ng-scope'][1]//td[8]";
	/**
	 * Gobi.E
	 * Reward List Links
	 * **/
	public static String REWARD_VIEW_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_VIEW_LINK1="']/following-sibling::div//span/a[text()='View']";	
	public static String REWARD_EDIT_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_EDIT_LINK1="']/following-sibling::div//span/a[text()='Edit']";	
	public static String REWARD_ADD_TO_FEATURE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_ADD_TO_FEATURE_LINK1="']/following-sibling::div//span/a[text()='Add to Featured']";	
	public static String REWARD_REMOVE_FROM_FEATURE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_REMOVE_FROM_FEATURE_LINK1="']/following-sibling::div//span/a[text()='Remove from Featured']";	
	public static String REWARD_ENABLED_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_ENABLED_LINK1="']/following-sibling::div//span/a[text()='Enable']";	
	public static String REWARD_DISABLED_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_DISABLED_LINK1="']/following-sibling::div//span/a[text()='Disable']";	
	public static String REWARD_DUPLIcATE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_DUPLIcATE_LINK1="']/following-sibling::div//span/a[text()='Duplicate']";
	public static String REWARD_DELETE_LINK="//div[@class='ng-binding' and text()='";
	public static String REWARD_DELETE_LINK1="']/following-sibling::div//span/a[text()='Delete']";
	public static String WIDGET_VIEW_LINK="//div[@class='ng-binding' and text()='";
	public static String WIDGET_VIEW_LINK1="']/following-sibling::div//a[text()='View']";	
	/**
	 * Reward list verification
	 */
	public static String REWARDSLIST_COUNT="//div[@id='wizard-list-page']//table//tbody/tr";
	public static String REWARDSLIST_FIRSTBUTTON_DISABLED="//li[@class='disabled']/a[text()='First']";
	public static String REWARDSLIST_PREVIOUSBUTTON_DISABLED="//li[@class='disabled']/a[text()='Previous']";
	public static String REWARDSLIST_FIRSTBUTTON_ENABLED="//div[@class='ng-isolate-scope'] //a[text()='First']";
	public static String REWARDSLIST_PREVIOUSBUTTON_ENABLED="//div[@class='ng-isolate-scope'] //a[text()='Previous']";
	public static String REWARDSLIST_NEXTBUTTON_ENABLED="//div[@class='ng-isolate-scope'] //a[text()='Next']";
	public static String REWARDSLIST_LASTBUTTON_ENABLED="//div[@class='ng-isolate-scope'] //a[text()='Last']";
	public static String REWARDSLIST_NEXTBUTTON_DISABLED="//li[@class='disabled']/a[text()='Next']";
	public static String REWARDSLIST_LASTBUTTON_DISABLED="//li[@class='disabled']/a[text()='Last']";
	public static String REWARDSLIST_SELECTNEXTPAGE_NUMBER="//li[@class='ng-scope active']/following-sibling::li/a";
	/**
	 * PRATEEP P
	 * Reward Disable
	 */
	public static String REWARD_STATUS_ENABLED="//td/p[text()='Enabled']";
	public static String REWARD_STATUS_DISABLED="//td/p[text()='Disabled']";
	public static String REWARD_DISABLE="//span/a[text()='Disable']";
	public static String REWARD_DISABLE_INFO_MSG="//p/span[text()='Are you sure you want to disable this sweepstakes?']";
	public static String REWARD_DISABLE_CONFIRM_BUTTON="//a/span[text()='Disable']";
	public static String REWARD_ENABLE="//span/a[text()='Enable']";
	public static String REWARD_ENABLE_CONFIRM_BUTTON="//a/span[text()='Enable']";
	public static String REWARD_CANCEL_BUTTON="//div/a[text()='Cancel']";
	/**
	 * Gobi.E
	 * Sweepstakes select start date and end date
	 * **/
	public static String SWEEPS_START_DATE_TEXTBOX ="reward-form-date-start";
	public static String SWEEPS_END_DATE_TEXTBOX ="reward-form-date-end";
	public static String SWEEPS_DEADLINE_DATE_TEXTBOX ="reward-form-entries-date";
	public static String SWEEPS_SELECT_TODAY_DATE ="//td[@class='text-center ng-scope enabled today']";
	public static String SWEEPS_SELECT_START_DATE="//input[@id='reward-form-date-start']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope enabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SWEEPS_SELECT_START_DATE1="']";
	public static String SWEEPS_SELECT_END_DATE="//input[@id='reward-form-date-end']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope enabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SWEEPS_SELECT_END_DATE1="']";
	public static String SWEEPS_SELECT_DEADLINE_DATE="//input[@id='reward-form-entries-date']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope enabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SWEEPS_SELECT_DEADLINE_DATE1="']";	
	public static String SWEEPS_SELECT_START_DISABLED_PARTICULAR_DATE="//input[@id='reward-form-date-start']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope disabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SWEEPS_SELECT_START_DISABLED_PARTICULAR_DATE1="']";
	public static String SWEEPS_SELECT_END_DISABLED_PARTICULAR_DATE="//input[@id='reward-form-date-end']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope disabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SWEEPS_SELECT_END_DISABLED_PARTICULAR_DATE1="']";
	public static String SWEEPS_SELECT_DEADLINE_DISABLED_PARTICULAR_DATE="//input[@id='reward-form-entries-date']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope disabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SWEEPS_SELECT_DEADLINE_DISABLED_PARTICULAR_DATE1="']";
	public static String SWEEPS_END_DATE_RIGHT_BUTTON="//input[@id='reward-form-date-end']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-right']";
	public static String SWEEPS_DEADLINE_DATE_RIGHT_BUTTON="//input[@id='reward-form-entries-date']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-right']";	
	public static String SWEEPS_START_DATE_RIGHT_BUTTON="//input[@id='reward-form-date-start']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-right']";
	public static String SWEEPS_START_DATE_LEFT_BUTTON="//input[@id='reward-form-date-start']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-left']";
	public static String SWEEPS_END_DATE_LEFT_BUTTON="//input[@id='reward-form-date-end']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-left']";	
	public static String SWEEPS_CONTINUE_STEP2="//span[contains(text(),'Continue to Settings 2/4')]";
	public static String SWEEPS_SETTINGS_2_BY_4_PAGE_TITLE="//h3[@class='settings-page ng-binding ng-scope' and text()='Settings (2/4)']";
	public static String SWEEPS_SETTINGE_PAGE_BACK_BUTTON="//a[@class='btn btn-secondary ng-binding ng-scope' and text()='Back']";
	public static String SWEEPS_SETTINGS_1_BY_4_PAGE_TITLE="//h3[@class='settings-page ng-binding ng-scope' and text()='Settings (1/4)']";
	public static String SWEEPS_END_AND_ENTRY_DEADLINE_DATE_ERROR_MESSAGE="//p[text()='End Date, End Time, Entry Deadline Date, Entry Deadline Time']/parent::span/parent::div[@class='ct-error notification notification-error']";
	/**
	 * PRATEEP P
	 * Reward Sort All Columns
	 */
	public static String REWARDS_NAME_COL1="//th[@class='ng-binding' and @st-sort='title' and contains(text(),'Name')]";
	public static String REWARDS_NAME_COL1_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Name')]";
	public static String REWARDS_NAME_COL1_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Name')]";
	public static String REWARDS_POINTS_COL3="//th[@class='ng-binding' and @st-sort='numPoints' and contains(text(),'Points')]";
	public static String REWARDS_POINTS_COL3_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Points')]";
	public static String REWARDS_POINTS_COL3_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Points')]";
	public static String REWARDS_START_DATE_COL4="//th[@class='ng-binding' and @st-sort='dateStart' and contains(text(),'Start Date')]";
	public static String REWARDS_START_DATE_COL4_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Start Date')]";
	public static String REWARDS_START_DATE_COL4_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Start Date')]";
	public static String REWARDS_END_DATE_COL5="//th[@class='ng-binding' and @st-sort='dateEnd' and contains(text(),'End Date')]";
	public static String REWARDS_END_DATE_COL5_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'End Date')]";
	public static String REWARDS_END_DATE_COL5_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'End Date')]";
	public static String REWARDS_REDEEMED_COL6="//th[@class='ng-binding' and @st-sort='numTimesRedeemed' and contains(text(),'Redeemed')]";
	public static String REWARDS_REDEEMED_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Redeemed')]";
	public static String REWARDS_REDEEMED_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Redeemed')]";
	public static String REWARDS_REMAINING_COL7="//th[@class='ng-binding' and @st-sort='totalQuantity()' and contains(text(),'Remaining')]";
	public static String REWARDS_REMAINING_COL7_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Remaining')]";
	public static String REWARDS_REMAINING_COL7_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Remaining')]";
	public static String REWARDS_DATE_CREATED_COL8="//th[@class='ng-binding' and @st-sort='dateCreated' and contains(text(),'Date Created')]";
	public static String REWARDS_DATE_CREATED_COL8_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Date Created')]";
	public static String REWARDS_DATE_CREATED_COL8_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Date Created')]";
	public static String REWARDS_STATUS_COL9="//th[@class='ng-binding' and @st-sort='isEnabled' and contains(text(),'Status')]";
	public static String REWARDS_STATUS_COL9_ASCENDING="//th[@class='ng-binding st-sort-ascent' and contains(text(),'Status')]";
	public static String REWARDS_STATUS_COL9_DESCENDING="//th[@class='ng-binding st-sort-descent' and contains(text(),'Status')]";
	/**
	 * 
	 * Gobi.E
	 * Verify Sweepstakes End Days
	 * */
	public static String SWEEPS_END_DATE_IN_FAN_CENTER="//span[@class='days-remaining ng-scope']/span[text()='";
	public static String SWEEPS_END_DATE_IN_FAN_CENTER1="']";
	public static String WIDGET_SWEEPS_REWARD_LIST_FRAME="//html/body/iframe[2]";
	/**
	 * 
	 * Gobi.E
	 * Verify Entrants page search details
	 * */
	public static String SWEEPS_ENTRANTS_SEARCH_BOX="//input[@class='search-box-input']";
	public static String SWEEPS_ENTRANTS_NO_CONTENT_AVAILABLE="//td/p[@class='ng-binding' and text()='No content available']";
	public static String SWEEPS_ENTRANTS_SEARCH_DETAILS="//td[text()='";
	public static String SWEEPS_ENTRANTS_SEARCH_DETAILS1="']/parent::tr//td[text()='";
	public static String SWEEPS_ENTRANTS_SEARCH_DETAILS2="']";
	public static String BUFFER_LOADING_IMAGE="//div[@class='cg-busy-default-spinner']";
	public static String REWARDS_ENTRANTS_TABLE_FIRST_NAME="//tr/td[1]";
	public static String REWARDS_DEADLINE_DATE_LEFT_BUTTON="//input[@id='reward-form-entries-date']/following-sibling::ul//thead//th[1]//button";
	public static String SWEEPS_DEADLINE_DATE_LEFT_BUTTON="//input[@id='reward-form-entries-date']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-left']";
	public static String SWEEPSTAKES_END_DATE_DISABLED="//div[@class='date-container']//dl//dd//ul/li/table//tbody/tr//td[@class='text-center ng-scope disabled']/button/span[text()='01']";
	/**
	 * Gobi.E
	 * Download Reward Most recently added to least recently added
	 *  
	 **/
	public static String DOWNLOAD_ADDED_LATEST_FOLLOW_FEATURED_DOWNLOAD="//span[text()='Featured']/parent::div/parent::td/parent::tr/following-sibling::tr[@class='ng-scope'][1]/td/div[text()='";
	public static String DOWNLOAD_ADDED_LATEST_FOLLOW_FEATURED_DOWNLOAD1="']";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_NAME="//tr[@class='ng-scope'][1]/td/div[text()='";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_NAME1="']";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_POINT="//tr[@class='ng-scope'][1]//div[text()='";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_POINT1="']";	
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_START_TIME="//tr[@class='ng-scope'][1]//td[contains(text(),'";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_START_TIME1="')]";	
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_END_TIME="//tr[@class='ng-scope'][1]/td//div[contains(text(),'";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_END_TIME1="')]";	
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_STATUS="//tr[@class='ng-scope'][1]/td/p[text()='Enabled']";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_REMAINNING="//tr[@class='ng-scope'][1]//td/span";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_REDEEMED="//tr[@class='ng-scope'][1]//td[6]";
	public static String DOWNLOAD_MOST_RECENTLY_ADDED_DATE="//tr[@class='ng-scope'][1]//td[8]";
	/**
	 * Gobi.E
	 * Downloads select start date and end date
	 * **/
	public static String DOWNLOAD_START_DATE_TEXTBOX ="reward-form-date-start";
	public static String DOWNLOAD_END_DATE_TEXTBOX ="reward-form-date-end";	
	public static String DOWNLOAD_SELECT_TODAY_DATE ="//td[@class='text-center ng-scope enabled today']";
	public static String DOWNLOAD_SELECT_START_DATE="//input[@id='reward-form-date-start']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope enabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String DOWNLOAD_SELECT_START_DATE1="']";
	public static String DOWNLOAD_SELECT_END_DATE="//input[@id='reward-form-date-end']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope enabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String DOWNLOAD_SELECT_END_DATE1="']";	
	public static String DOWNLOAD_SELECT_START_DISABLED_PARTICULAR_DATE="//input[@id='reward-form-date-start']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope disabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String DOWNLOAD_SELECT_START_DISABLED_PARTICULAR_DATE1="']";
	public static String DOWNLOAD_SELECT_END_DISABLED_PARTICULAR_DATE="//input[@id='reward-form-date-end']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope disabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String DOWNLOAD_SELECT_END_DISABLED_PARTICULAR_DATE1="']";
	public static String DOWNLOAD_END_DATE_RIGHT_BUTTON="//input[@id='reward-form-date-end']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-right']";
	public static String DOWNLOAD_START_DATE_RIGHT_BUTTON="//input[@id='reward-form-date-start']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-right']";
	public static String DOWNLOAD_START_DATE_LEFT_BUTTON="//input[@id='reward-form-date-start']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-left']";
	public static String DOWNLOAD_END_DATE_LEFT_BUTTON="//input[@id='reward-form-date-end']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-left']";	
	public static String DOWNLOAD_CONTINUE_STEP2="//span[contains(text(),'Continue to Settings 2/4')]";
	public static String DOWNLOAD_SETTINGS_2_BY_4_PAGE_TITLE="//h3[@class='settings-page ng-binding ng-scope' and text()='Settings (2/4)']";
	public static String DOWNLOAD_SETTINGE_PAGE_BACK_BUTTON="//a[@class='btn btn-secondary ng-binding ng-scope' and text()='Back']";
	public static String DOWNLOAD_SETTINGS_1_BY_4_PAGE_TITLE="//h3[@class='settings-page ng-binding ng-scope' and text()='Settings (1/4)']";
	/**
	 * Gobi.E
	 * Reward Search Details
	 *  
	 **/
	public static String DOWNLOAD_REWARD_NAME="//tr[@class='ng-scope'][1]/td/div[text()='";	
	public static String DOWNLOAD_REWARD_NAME1="']";
	public static String DOWNLOAD_REWARD_POINT="//tr[@class='ng-scope'][1]//td[3]";
	public static String DOWNLOAD_REWARD_START_DATE="//tr[@class='ng-scope'][1]//td[4]";
	public static String DOWNLOAD_REWARD_END_DATE="//tr[@class='ng-scope'][1]//td[5]";
	public static String DOWNLOAD_REWARD_STATUS="//tr[@class='ng-scope'][1]//td[9]";
	public static String DOWNLOAD_REWARD_REMAINNING="//tr[@class='ng-scope'][1]//td/span";
	public static String DOWNLOAD_REWARD_REDEEMED="//tr[@class='ng-scope'][1]//td[6]";
	public static String DOWNLOAD_REWARD_DATE="//tr[@class='ng-scope'][1]//td[8]";
	/**
	 * Gobi.E
	 * verify Preview Download reward
	 * **/
	public static String PREVIEW_DOWNLOAD_REWARD_TITLE="//label[text()='Reward Title']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_TITLE1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_CATEGORY="//label[text()='Reward Category']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_CATEGORY1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_POINT_VALUE="//label[text()='Point Value']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_POINT_VALUE1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_TYPE="//label[text()='Reward Type']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='Download']";
	public static String PREVIEW_DOWNLOAD_REWARD_POINT_QUANTITY="//label[text()='Reward Quantity']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_POINT_QUANTITY1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_MAXIMUM_REDEMPTION="//label[text()='Max Redemptions']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='1']";
	public static String PREVIEW_DOWNLOAD_REWARD_SHIPPING_ADDRESS="//label[text()='Shipping address']/parent::dt/following-sibling::dd/p[@class='ng-binding ng-scope' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_SHIPPING_ADDRESS1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_PHONE_NUMBER="//label[text()='Phone Number']/parent::dt/following-sibling::dd/p[@class='ng-binding ng-scope' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_PHONE_NUMBER1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_FILE_DOWNLOAD="//label[text()='Download file']/parent::dt/following-sibling::dd/a[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_FILE_DOWNLOAD1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_LEVEL="//label[text()='Minimum Level Required to Redeem']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_LEVEL1="']";
	public static String PREVIEW_DOWNLOAD_REWARD_MINIMUM_LEVEL="//label[text()='If Member is not at Minimum Level or Above:']/parent::dt/following-sibling::dd/p[@class='ng-binding' and text()='";
	public static String PREVIEW_DOWNLOAD_REWARD_MINIMUM_LEVEL1="']";
	/**
	 * Gobi.E
	 * Validate three types of questions (ZA-432)
	 * **/
	public static String SURVEY_QUESTION_TYPE_TEXTBOX="survey-form-question-0-type";
	public static String SURVEY_QUESTION_TITLE_TEXTBOX="survey-form-question-0-title";
	public static String SURVEY_QUESTION_TYPE_DROPDWN="survey-form-question-1-type";
	public static String SURVEY_QUESTION_TITLE_DROPDOWN="survey-form-question-1-title";
	public static String SURVEY_QUESTION_TYPE_CHECKBOX="survey-form-question-2-type";
	public static String SURVEY_QUESTION_TITLE_CHECKBOX="survey-form-question-2-title";
	public static String SURVEY_ADD_ANOTHER_QUESTION_LINK="//a[@class='add ng-binding' and text()='+ Add another question']";
	public static String SURVEY_HEADLINE_FOR_QUESTION_2="//h3[@class='ng-binding' and text()='Question 2']";
	public static String SURVEY_HEADLINE_FOR_QUESTION_3="//h3[@class='ng-binding' and text()='Question 3']";
	public static String SURVEY_QUESTION_1_ANSWER="survey-form-question-1-answers";
	public static String SURVEY_QUESTION_2_ANSWER="survey-form-question-2-answers";
	public static String SURVEY_ACTIVE_YES_RADIO_BUTTON="survey-form-is-enabled-true";
	public static String SURVEY_END_DATE_YES_RADIO_BUTTON="survey-form-has-end-date-true";
	public static String SURVEY_START_DATE_TEXT_BOX="dateStart";
	public static String SURVEY_END_DATE_TEXT_BOX="dateEnd";
	public static String SURVEY_START_TODAY_DATE="//td[@class='text-center ng-scope enabled today']";
	public static String SURVEY_END_DATE_RIGHT_BUTTON="//input[@id='survey-form-date-end']/following-sibling::ul//button[@class='btn btn-default btn-sm pull-right']";
	public static String SURVEY_SELECT_END_DATE="//input[@id='survey-form-date-end']/parent::dd//ul/li/table//tbody//tr//td[@class='text-center ng-scope enabled']/button[@class='btn btn-default btn-sm']/span[text()='";
	public static String SURVEY_SELECT_END_DATE1="']";
	public static String SURVEY_START_DATE_TODAY="//td[@class='text-center ng-scope enabled today']/button";
	public static String SURVEY_NO_END_DATE_NO="survey-form-has-end-date-false";
	public static String ADD_SURVEY_BUTTON="//a[contains(text(),'Add Survey')]";
	public static String WIDGET_SURVEY_REDEEMABLE_POINTS="//div[@class='redeemable-points ct-points-color']/span[text()='";
	public static String WIDGET_SURVEY_REDEEMABLE_POINTS1="']";
	/**
	 * Sort survey listpage
	 */
	public static String SURVEYTITLE_TABLEHEADER="//th[@class='ng-binding' and text()='Title']";
	public static String SURVEYTITLE_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='Title']";
	public static String SURVEYTITLE_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='Title']";
	public static String SURVEYSTART_TABLEHEADER="//th[@class='ng-binding' and text()='Start Date']";
	public static String SURVEYSTART_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='Start Date']";
	public static String SURVEYSTART_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='Start Date']";
	public static String SURVEYEND_TABLEHEADER="//th[@class='ng-binding' and text()='End Date']";
	public static String SURVEYEND_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='End Date']";
	public static String SURVEYEND_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='End Date']";
	public static String SURVEYPOINTS_TABLEHEADER="//th[@class='ng-binding' and text()='Point Value']";
	public static String SURVEYPOINTS_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='Point Value']";
	public static String SURVEYPOINTS_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='Point Value']";
	public static String SURVEYQUESTIONCOUNT_TABLEHEADER="//th[@class='ng-binding' and text()='# of Questions']";
	public static String SURVEYQUESTIONCOUNT_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='# of Questions']";
	public static String SURVEYQUESTIONCOUNT_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='# of Questions']";
	public static String SURVEYRESPONSECOUNT_TABLEHEADER="//th[@class='ng-binding' and text()='# of Responses']";
	public static String SURVEYRESPONSECOUNT_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='# of Responses']";
	public static String SURVEYRESPONSECOUNT_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='# of Responses']";
	public static String SURVEYSTATUS_TABLEHEADER="//th[@class='ng-binding' and text()='Status']";
	public static String SURVEYSTATUS_TABLEHEADER_ASCENDING="//th[@class='ng-binding st-sort-ascent' and text()='Status']";
	public static String SURVEYSTATUS_TABLEHEADER_DESCENDING="//th[@class='ng-binding st-sort-descent' and text()='Status']";
	/**
	 * Gobi
	 * Member Care
	 * ***/
	public static String FB_CONFIRM_OK_BUTTON="__CONFIRM__";	
	public static String LODING_SPINNER = "//div[@class='cg-busy-default-spinner']";
	public static String MEMBER_CARE_USER_VIEW_LINK="//div[text()='";
	public static String MEMBER_CARE_USER_VIEW_LINK1="']/parent::td/parent::tr//td//div/span/a[text()='View']";
	public static String MEMBER_CARE_USER_DEACTIVATE_LINK="//div[text()='";
	public static String MEMBER_CARE_USER_DEACTIVATE_LINK1="']/parent::td/parent::tr//td//div/span/a[text()='Deactivate']";
	public static String MEMBER_CARE_USER_ACTIVATE_LINK="//div[text()='";
	public static String MEMBER_CARE_USER_ACTIVATE_LINK1="']/parent::td/parent::tr//td//div/span/a[text()='Activate']";
	public static String MEMBER_CARE_USER_ADD_DETECT_POINTS_LINK="//div[text()='";
	public static String MEMBER_CARE_USER_ADD_DETECT_POINTS_LINK1="']/parent::td/parent::tr//td//div/span/a[text()='Add / Deduct Points']";
	public static String MEMBER_CARE_USER_RESEND_VERIFICATION_LINK="//div[text()='";
	public static String MEMBER_CARE_USER_RESEND_VERIFICATION_LINK1="']/parent::td/parent::tr//td//div/span/a[text()='Resend Verification']";
	public static String MEMBER_CARE_DEACTIVATE_BUTTON="//a[@class='btn btn-danger']/span[text()='Deactivate']";
	public static String MEMBER_CARE_ACTIVATE_CONFIRM_BUTTON="//a[@class='btn btn-danger']/span[text()='Confirm']";
	public static String MEMBER_CARE_RESEND_BUTTON="//a[@class='btn ng-binding' and text()='Resend']";
	public static String WIDGET_SIGNUP="//button[@class='btn ct-button ng-binding' and contains(text(),'Sign up now')]";
	public static String WIDGET_FB_SIGNUP_BUTTON="//button[@class='btn btn-facebook ng-scope']//span[text()='Connect with Facebook']";
	public static String WIDGET_TWITTER_LOGIN_BUTTON="//button[@class='btn btn-twitter ng-scope']//span[text()='Log In with Twitter']";
	public static String VIEW_LINK="//span[@class='table-cell-action']/a[text()='View']";
	/**
	 * Gobi.E
	 * Redemption Log
	 * **/
	public static String DATE_RANGE="//div[@class='date-range-dropdown-container']/label[contains(text(),'Date Range')]/following::span/span[contains(text(),'All')]";
	public static String DATE_RANGE_ALL="dateFilterAll";
	public static String DATE_RANGE_LAST_24HRS="dateFilter24";
	public static String DATE_RANGE_LAST_7DAYS="dateFilter7";
	public static String DATE_RANGE_LAST_30DAYS="dateFilter30";
	public static String OK_BUTTON="//button[contains(text(),'OK')]";
	public static String VIEW_REDEMPTION_LINK="//a[contains(text(),'View Redemptions')]";
	public static String NO_CONTENT="//td/p[contains(text(),'No content available')]";
	/** 
	 * PRATEEP.P
	 * AUTO REWARD - BONUS POINTS AND ACTIVITY LIST
	 * ***/
	public static String ADD_ACTIVITY="//a[contains(text(),'+ Add another activity')]";
	public static String SELECT_ACTIVITY2="//div[2]/form/dl[1]/dd/select";
	public static String AUTO_REWARDS_CAMPAIGN_STATUS_BASED="auto-campaign-status-based";
	public static String AUTO_REWARDS_CAMPAIGN_CURRENT_LEVEL="auto-campaign-event-current-level";
	public static String AUTO_REWARDS_CAMPAIGN_CURRENT_LEVEL_SELECT="auto-campaign-current-level-select";
	public static String AUTO_REWARDS_CAMPAIGN_REACHING_LEVEL="auto-campaign-event-reaching-level";
	public static String AUTO_REWARDS_CAMPAIGN_REACHING_LEVEL_SELECT="auto-campaign-reaching-level-select";
	/**
	 * Gobi.E
	 * Redemption Log
	 * **/
	public static String REDEMPTION_FILTER_FIELD = "//div[@class='reward-type-filter-container']";
	public static String REDEMPTION_FILTER_ARROW = "//div[@class='reward-type-filter-container']//span/span[@class='dropdown-toggle']//i[@class='icon-down-dir']";
	public static String REDEMPTION_STANDARD_OPTION = "//ul[@id='type-filter-dropdown']//li//label[text()='standard']/parent::li/input";
	public static String REDEMPTION_DOWNLOAD_OPTION = "//ul[@id='type-filter-dropdown']//li//label[text()='download']/parent::li/input";
	public static String REDEMPTION_CODE_OPTION = "//ul[@id='type-filter-dropdown']//li//label[text()='coupon']/parent::li/input";
	public static String REDEMPTION_AUTOMATIC_OPTION = "//ul[@id='type-filter-dropdown']//li//label[text()='automatic']/parent::li/input";
	public static String REDEMPTION_FILTER_OK_BUTTON = "//span[@class='dropdown open']//ul//button[@class='btn ng-binding' and text()='OK']";
	public static String REDEMPTION_LOADING_SPINNER = "//div[@class='cg-busy-default-spinner']";
	public static String PAGE_LAST_BUTTON = "//li[@class='']/a[text()='Last']";
	public static String PAGE_COUNT_UPTO_LAST_PAGE = "//li[@class='disabled']/a[text()='Last']/parent::li/preceding-sibling::li/a[text()='Next']/parent::li/preceding-sibling::li[@class='ng-scope active']/a";

	/**
	 * Prabakaran
	 * Fan Center
	 */
	public static String FANCENTER_SIGNUP_BUTTON="//span[text()='Sign up now']";
	public static String FANCENTER_ADDRESS_TEXTBOX="validation_email_address";
	public static String FANCENTER_SIGNUP_PAGEHEADER="//h2[text()='Complete Sign Up']";
	public static String FANCENTER_FIRSTNAME_TEXTBOX="first_name";
	public static String FANCENTER_LASTNAME_TEXTBOX="last_name";
	public static String FANCENTER_USERNAME_TEXTBOX="username";
	public static String FANCENTER_PASSWORD_TEXTBOX="password";
	public static String FANCENTER_CONFORMPASSWORD_TEXTBOX="confirm_password";
	public static String FANCENTER_POSTALCODE_TEXTBOX="postal_code";
	public static String FANCENTER_TERMSOFCONDITION_CHECKBOX="terms_of_service";
	public static String MEMBERCARE_USER_VIEWLINK_START="//div[text()='";
	public static String MEMBERCARE_USER_VIEWLINK_END="']/following-sibling::div//a[text()='View']";
	public static String FANCENTER_EMAILVERIFIED_MESSAGE="//h2[text()='Your email was verified!']";

	/**
	 * Prabakaran
	 * Widget_ActivityList_Add today birthday 
	 */
	public static String ADDBIRTHDAY_LINK="//div[text()='Add Your Birthday']";
	public static String ADDBIRTHDAY_MONTH_DROPDOWN="//select[@name='month']";
	public static String ADDBIRTHDAY_DAY_DROPDOWN="//select[@name='day']";
	public static String ADDBIRTHDAY_YEAR_DROPDOWN="//select[@name='year']";
	public static String ADDBIRTHDAY_SUCCESSMESSAGE="//span[text()='Success']/following-sibling::span";
	public static String ADDBIRTHDAY_FRAME="//html/body/div[1]/div/iframe";
	public static String WIDGET_FRAME1="//html/body/iframe[1]";
	public static String WIDGET_FRAME2="//html/body/iframe[2]";
	public static String WIDGET_FRAME3="//html/body/iframe[3]";
	public static String SUBMIT_DISABLED_BUTTON="//button[text()='Submit' and @disabled='disabled']";
	public static String WIDGET_ADDBIRTHDAY_ACTIVITYHISTORY="//html//div[@id='activity-history']//div[@class='container']/table/thead/tr/th[text()='Activity']/parent::tr/parent::thead/parent::table//following-sibling::tbody//tr/td/p[@class='title']/span[text()='Add Your Birthday']";
	public static String BONUSPOINTS_WIDGET="//div[@class='points-container']/div";
	/**
	 * Gobi.E
	 * Automatic Reward Search Details
	 *  
	 **/
	public static String AUTOMATIC_CAMPAIGN_NAME="//tr[@class='ng-scope'][1]/td/div[text()='";	
	public static String AUTOMATIC_CAMPAIGN_NAME1="']";
	public static String AUTOMATIC_REWARD="//tr[@class='ng-scope']//td//p[text()='";
	public static String AUTOMATIC_REWARD1="']";
	public static String AUTOMATIC_REWARD_QUANTITY="//tr[@class='ng-scope'][1]//td[3]";
	public static String AUTOMATIC_REWARD_CREATED_DATE="//tr[@class='ng-scope'][1]//td[4]";
	public static String AUTOMATIC_REWARD_STATUS="//td[text()='Active']";
	public static String AUTOMATIC_REWARD_STATUS_BAR="//div[@class='ng-binding' and text()='";
	public static String AUTOMATIC_REWARD_STATUS_BAR1="']/parent::td/following-sibling::td[4]";
	public static String AUTOMATIC_REWARD_DISABLE_LINK="//div[@class='ng-binding' and text()='";
	public static String AUTOMATIC_REWARD_DISABLE_LINK1="']/following-sibling::div//span/a[text()='Disable']";
	public static String AUTOMATIC_REWARD_ENABLE_LINK="//div[@class='ng-binding' and text()='";
	public static String AUTOMATIC_REWARD_ENABLE_LINK1="']/following-sibling::div//span/a[text()='Enable']";
	public static String AUTOMATIC_REWARD_DISABLE_BUTTON="//a[@class='btn btn-danger']/span[text()='Disable']";
	public static String AUTOMATIC_REWARD_ENABLE_BUTTON="//a[@class='btn btn-danger']/span[text()='Enable']";	
	/**
	 * Gobi.E
	 * Automatic Reward verify Preview Details
	 *  
	 **/
	public static String AUTO_PREVIEW_PAGE_REWARD_NAME = "//h3[text()='1. Details']/parent::div//dl//dd//p[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_NAME1 = "']";
	public static String AUTO_PREVIEW_PAGE_REWARD_STATUS = "//h3[text()='2. Duration']/parent::div//dl//dd//p[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_STATUS1 = "']";
	public static String AUTO_PREVIEW_PAGE_REWARD_START_DATE = "//label[text()='Start Date']/parent::dt/parent::dl//dd/p[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_START_DATE1 = "']";
	public static String AUTO_PREVIEW_PAGE_REWARD_START_TIME = "//label[text()='Start Time']/parent::dt/parent::dl//dd/p[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_START_TIME1 = "']";
	public static String AUTO_PREVIEW_PAGE_REWARD_END_DATE = "//label[text()='Set End Date?']/parent::dt/parent::dl//dd/p[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_END_DATE1 = "']";
	public static String AUTO_PREVIEW_PAGE_REWARD_TRIGGER = "//h3[text()='3. Reward Trigger']/parent::div//dl//dd//p/span[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_TRIGGER1 = "']";
	public static String AUTO_PREVIEW_PAGE_REWARD_LEVEL = "//h3[text()='4. Reward']/parent::div//dl//dd//p[text()='";
	public static String AUTO_PREVIEW_PAGE_REWARD_LEVEL1 = "']";
	/**
	 * Gobi.E
	 * Verify redeemed reward in redemption log
	 *  
	 **/
	public static String REDEMPTION_LOG_REWARD_NAME = "//tr[@class='ng-scope']//td/div[@class='ng-binding' and text()='";
	public static String REDEMPTION_LOG_REWARD_NAME1 = "']";
	public static String REDEMPTION_LOG_REWARD_VIEW_REDEMPTION_LINK = "//tr[@class='ng-scope']//td/div[@class='ng-binding' and text()='";
	public static String REDEMPTION_LOG_REWARD_VIEW_REDEMPTION_LINK1 = "']/following-sibling::div/span/a[text()='View Redemptions']";
	public static String REDEMPTION_LOG_REWARD_TYPE = "//td/span//p[text()='Standard']";
	public static String REDEMPTION_LOG_QUANTITY_REDEEMED = "//*[@id='redemption-page']/div[2]/div[2]/div[1]/div[2]/div[1]";
	public static String REDEMPTION_LOG_QUANTITY_REMAINING = "//*[@id='redemption-page']/div[2]/div[2]/div[1]/div[2]/div[2]";
	public static String REDEMPTION_LOG_POINT_VALUE = "//*[@id='redemption-page']/div[2]/div[2]/div[2]/div[1]/div[1]/span";
	public static String REDEMPTION_LOG_USER_INFORMATION = "//table[@class='ng-scope ng-isolate-scope']//tbody/tr/td[1]";
	public static String REDEMPTION_LOG_USER_ADDRESS = "//table[@class='ng-scope ng-isolate-scope']//tbody/tr/td[2]";
	public static String REDEMPTION_LOG_USER_PHONE_NUMBER = "//table[@class='ng-scope ng-isolate-scope']//tbody/tr/td[3]";
	public static String REDEMPTION_LOG_USER_DATE = "//table[@class='ng-scope ng-isolate-scope']//tbody/tr/td[4]";
	public static String REDEMPTION_LOG_USER_NOTES = "//table[@class='ng-scope ng-isolate-scope']//tbody/tr/td[5]";
	public static String REDEMPTION_LOG_REWARD_TITLE = "//div[@class='page-heading']/h1/span[text()='";
	public static String REDEMPTION_LOG_REWARD_TITLE1 = "']";
	public static String REDEMPTION_LOG_REWARD_TYPE_DOWN = "//td/span//p[text()='Download']";
	public static String VIEW_REDEMPTION_REQUIRE_PHONE_NUMBER = "//div[text()='tharangobi@gmail.com']/parent::td/following-sibling::td[@ng-show='reward.requiresPhoneNumber']";
	public static String VIEW_REDEMPTION_ADDRESS1="//tr[@class='ng-scope']/td[2]/div";
	public static String VIEW_REDEMPTION_ADDRESS2="//tr[@class='ng-scope']/td[2]/div[2]";
	public static String VIEW_REDEMPTION_ADDRESS3="//tr[@class='ng-scope']/td[2]/div[3]";
	public static String VIEW_REDEMPTION_ADDRESS="//div[3]/div/table/tbody/tr/td[2]";
	public static String ADD_ANOTHER_REWARD_LINK_IN_WIDGET = "//div//a[@class='add']";
	public static String WIDGET_SURVEY_ACTIVITY_LINK="//div[text()='";
	public static String WIDGET_SURVEY_ACTIVITY_LINK1="']";

	//Surveys View, Disable, Delete 
	public static String SURVEY_VIEW_NAME="//div[@class='ng-binding' and text()='";
	public static String SURVEY_VIEW_NAME1="']/following-sibling::div//span/a[text()='View']"; 
	public static String SURVEY_TITLE="//div[@class='module']/h3[text()='Basic Information']//following-sibling::dl//dd/p[@class='ng-binding' and text()='";
	public static String SURVEY_TITLE1="']";
	public static String SURVEY_TITLE_FOR_AFTER_CREATION="//div[@class='module']//dl[@class='form']//dd/p[@class='ng-binding']";
	public static String SURVEY_STATUS_BAR_ENABLED="//div[@class='ng-binding' and text()='";
	public static String SURVEY_STATUS_BAR_ENABLED1="']/parent::td/parent::tr//td[text()='Enabled']";
	public static String SURVEY_STATUS_BAR_DISABLED="//div[@class='ng-binding' and text()='";
	public static String SURVEY_STATUS_BAR_DISABLED1="']/parent::td/parent::tr//td[text()='Disabled']";
	public static String SURVEY_DISABLE_LINK="//div[@class='ng-binding' and text()='";
	public static String SURVEY_DISABLE_LINK1="']/following-sibling::div//span/a[text()='Disable']";
	public static String SURVEY_ENABLE_LINK="//div[@class='ng-binding' and text()='";
	public static String SURVEY_ENABLE_LINK1="']/following-sibling::div//span/a[text()='Enable']";
	public static String SURVEY_DISABLE_BUTTON="//a[@class='btn btn-danger ng-scope']/span[text()='Disable']";
	public static String SURVEY_ENABLE_BUTTON="//a[@class='btn btn-danger ng-scope']/span[text()='Enable']"; 
	public static String DELETE_BUFFERING_ICON="//a[@class='btn btn-danger']//i";
	public static String SURVEY_DELETE="//*[@id='wizard-list-page']/table/tbody/tr[";
	public static String SURVEY_DELETE1="]/td[1]/div[2]/span[5]/a";
	public static String SURVEY_DELETE_NAME="//div[@class='ng-binding' and text()='";
	public static String SURVEY_DELETE_NAME1="']/following-sibling::div//span/a[text()='Delete']";
	public static String SURVEY_DELETE_BUFFERING_ICON="//a[@class='btn btn-danger']//i";
	public static String SURVEYS_DELETE_BUTTON="//a[@class='btn btn-danger ng-scope']/span[text()='Delete']";
	public static String SURVEY_DELETE_ERROR_MESSAGE="//div[@class='ct-error notification notification-error']";
	public static String SURVEY_DELETE_CANCELL_BUTTON="//a[@class='btn btn-secondary ng-binding' and text()='Cancel']";
	public static String VIEW_REDEMPTION_USER_NAME = "//div[text()='";
	public static String VIEW_REDEMPTION_USER_NAME1 = "']/parent::td";
	public static String BEFORE_VIEW_REDEMPTIONS_USER_NAME = "//div[text()='";
	public static String BEFORE_VIEW_REDEMPTIONS_USER_NAME1 = "']/parent::td/following-sibling::td[3]//div[text()='";
	public static String BEFORE_VIEW_REDEMPTIONS_USER_NAME2 = "']";
	
}
