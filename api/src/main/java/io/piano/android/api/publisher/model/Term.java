package io.piano.android.api.publisher.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Term {
  
  private String termId = null;
  private String aid = null;
  private Resource resource = null;
  private String type = null;
  private String typeName = null;
  private String name = null;
  private String description = null;
  private Boolean verifyOnRenewal = null;
  private Date createDate = null;
  private String paymentBillingPlan = null;
  private String paymentBillingPlanDescription = null;
  private List<Object> paymentBillingPlanTable = null;
  private Integer paymentAllowRenewDays = null;
  private Boolean paymentForceAutoRenew = null;
  private Boolean paymentIsCustomPriceAvailable = null;
  private Boolean paymentIsSubscription = null;
  private Boolean paymentHasFreeTrial = null;
  private Boolean paymentNewCustomersOnly = null;
  private Boolean paymentTrialNewCustomersOnly = null;
  private Boolean paymentAllowPromoCodes = null;
  private Integer paymentRenewGracePeriod = null;
  private Boolean paymentAllowGift = null;
  private String paymentCurrency = null;
  private Double paymentFirstPrice = null;
  private Schedule schedule = null;
  private String scheduleBilling = null;
  private Boolean customRequireUser = null;
  private Integer customDefaultAccessPeriod = null;
  private String adviewVastUrl = null;
  private Integer adviewAccessPeriod = null;
  private Integer registrationAccessPeriod = null;
  private Integer registrationGracePeriod = null;
  private String externalApiId = null;
  private String externalApiName = null;
  private Integer evtVerificationPeriod = null;
  private Integer evtFixedTimeAccessPeriod = null;
  private Integer evtGracePeriod = null;
  private String evtItunesBundleId = null;
  private String evtItunesProductId = null;
  private String evtGooglePlayProductId = null;
  private Boolean collectAddress = null;
  private List<DeliveryZone> deliveryZone = null;
  private Country defaultCountry = null;
  private VoucheringPolicy voucheringPolicy = null;
  private String billingConfig = null;
  private Boolean isAllowedToChangeSchedulePeriodInPast = null;
  
  /**
   * Term ID
   **/
  public String getTermId() {
    return termId;
  }

  public void setTermId(String termId) {
    this.termId = termId;
  }
  
  /**
   * Application aid
   **/
  public String getAid() {
    return aid;
  }

  public void setAid(String aid) {
    this.aid = aid;
  }
  
  /**
   * The resource
   **/
  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }
  
  /**
   * Term type
   **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  /**
   * Term type name
   **/
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }
  
  /**
   * Term name
   **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * Term description
   **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
  
  /**
   * Is term should be verified before renewal or it skips this step
   **/
  public Boolean getVerifyOnRenewal() {
    return verifyOnRenewal;
  }

  public void setVerifyOnRenewal(Boolean verifyOnRenewal) {
    this.verifyOnRenewal = verifyOnRenewal;
  }
  
  /**
   * The creation date
   **/
  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
  
  /**
   * Term billing plan
   **/
  public String getPaymentBillingPlan() {
    return paymentBillingPlan;
  }

  public void setPaymentBillingPlan(String paymentBillingPlan) {
    this.paymentBillingPlan = paymentBillingPlan;
  }
  
  /**
   * Term billing plan description
   **/
  public String getPaymentBillingPlanDescription() {
    return paymentBillingPlanDescription;
  }

  public void setPaymentBillingPlanDescription(String paymentBillingPlanDescription) {
    this.paymentBillingPlanDescription = paymentBillingPlanDescription;
  }
  
  /**
   **/
  public List<Object> getPaymentBillingPlanTable() {
    return paymentBillingPlanTable;
  }

  public void setPaymentBillingPlanTable(List<Object> paymentBillingPlanTable) {
    this.paymentBillingPlanTable = paymentBillingPlanTable;
  }
  
  /**
   * How many days in advance a user can renew
   **/
  public Integer getPaymentAllowRenewDays() {
    return paymentAllowRenewDays;
  }

  public void setPaymentAllowRenewDays(Integer paymentAllowRenewDays) {
    this.paymentAllowRenewDays = paymentAllowRenewDays;
  }
  
  /**
   * Payment forces the auto renewal of subscriptions
   **/
  public Boolean getPaymentForceAutoRenew() {
    return paymentForceAutoRenew;
  }

  public void setPaymentForceAutoRenew(Boolean paymentForceAutoRenew) {
    this.paymentForceAutoRenew = paymentForceAutoRenew;
  }
  
  /**
   * Payment is available custom price
   **/
  public Boolean getPaymentIsCustomPriceAvailable() {
    return paymentIsCustomPriceAvailable;
  }

  public void setPaymentIsCustomPriceAvailable(Boolean paymentIsCustomPriceAvailable) {
    this.paymentIsCustomPriceAvailable = paymentIsCustomPriceAvailable;
  }
  
  /**
   * Payment is subscription
   **/
  public Boolean getPaymentIsSubscription() {
    return paymentIsSubscription;
  }

  public void setPaymentIsSubscription(Boolean paymentIsSubscription) {
    this.paymentIsSubscription = paymentIsSubscription;
  }
  
  /**
   * Payment has free trial
   **/
  public Boolean getPaymentHasFreeTrial() {
    return paymentHasFreeTrial;
  }

  public void setPaymentHasFreeTrial(Boolean paymentHasFreeTrial) {
    this.paymentHasFreeTrial = paymentHasFreeTrial;
  }
  
  /**
   * Whether to allow buy only first time
   **/
  public Boolean getPaymentNewCustomersOnly() {
    return paymentNewCustomersOnly;
  }

  public void setPaymentNewCustomersOnly(Boolean paymentNewCustomersOnly) {
    this.paymentNewCustomersOnly = paymentNewCustomersOnly;
  }
  
  /**
   * Whether to allow trial period only first time
   **/
  public Boolean getPaymentTrialNewCustomersOnly() {
    return paymentTrialNewCustomersOnly;
  }

  public void setPaymentTrialNewCustomersOnly(Boolean paymentTrialNewCustomersOnly) {
    this.paymentTrialNewCustomersOnly = paymentTrialNewCustomersOnly;
  }
  
  /**
   * Whether to allow promo codes to be applied
   **/
  public Boolean getPaymentAllowPromoCodes() {
    return paymentAllowPromoCodes;
  }

  public void setPaymentAllowPromoCodes(Boolean paymentAllowPromoCodes) {
    this.paymentAllowPromoCodes = paymentAllowPromoCodes;
  }
  
  /**
   * The number of days after expiration to still allow access to the resource
   **/
  public Integer getPaymentRenewGracePeriod() {
    return paymentRenewGracePeriod;
  }

  public void setPaymentRenewGracePeriod(Integer paymentRenewGracePeriod) {
    this.paymentRenewGracePeriod = paymentRenewGracePeriod;
  }
  
  /**
   * Whether the term can be gifted
   **/
  public Boolean getPaymentAllowGift() {
    return paymentAllowGift;
  }

  public void setPaymentAllowGift(Boolean paymentAllowGift) {
    this.paymentAllowGift = paymentAllowGift;
  }
  
  /**
   * Currency of the term
   **/
  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }
  
  /**
   * First price of the term
   **/
  public Double getPaymentFirstPrice() {
    return paymentFirstPrice;
  }

  public void setPaymentFirstPrice(Double paymentFirstPrice) {
    this.paymentFirstPrice = paymentFirstPrice;
  }
  
  /**
   **/
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }
  
  /**
   * The schedule billing
   **/
  public String getScheduleBilling() {
    return scheduleBilling;
  }

  public void setScheduleBilling(String scheduleBilling) {
    this.scheduleBilling = scheduleBilling;
  }
  
  /**
   * Whether a valid user is required to complete the term
   **/
  public Boolean getCustomRequireUser() {
    return customRequireUser;
  }

  public void setCustomRequireUser(Boolean customRequireUser) {
    this.customRequireUser = customRequireUser;
  }
  
  /**
   * The default access period
   **/
  public Integer getCustomDefaultAccessPeriod() {
    return customDefaultAccessPeriod;
  }

  public void setCustomDefaultAccessPeriod(Integer customDefaultAccessPeriod) {
    this.customDefaultAccessPeriod = customDefaultAccessPeriod;
  }
  
  /**
   * The VAST URL to use
   **/
  public String getAdviewVastUrl() {
    return adviewVastUrl;
  }

  public void setAdviewVastUrl(String adviewVastUrl) {
    this.adviewVastUrl = adviewVastUrl;
  }
  
  /**
   * The length of time a user gets access for
   **/
  public Integer getAdviewAccessPeriod() {
    return adviewAccessPeriod;
  }

  public void setAdviewAccessPeriod(Integer adviewAccessPeriod) {
    this.adviewAccessPeriod = adviewAccessPeriod;
  }
  
  /**
   * The access time period 
   **/
  public Integer getRegistrationAccessPeriod() {
    return registrationAccessPeriod;
  }

  public void setRegistrationAccessPeriod(Integer registrationAccessPeriod) {
    this.registrationAccessPeriod = registrationAccessPeriod;
  }
  
  /**
   * The time period after registration that will count it as a valid registration conversion
   **/
  public Integer getRegistrationGracePeriod() {
    return registrationGracePeriod;
  }

  public void setRegistrationGracePeriod(Integer registrationGracePeriod) {
    this.registrationGracePeriod = registrationGracePeriod;
  }
  
  /**
   * External API Configuration ID
   **/
  public String getExternalApiId() {
    return externalApiId;
  }

  public void setExternalApiId(String externalApiId) {
    this.externalApiId = externalApiId;
  }
  
  /**
   * External API Configuration name
   **/
  public String getExternalApiName() {
    return externalApiName;
  }

  public void setExternalApiName(String externalApiName) {
    this.externalApiName = externalApiName;
  }
  
  /**
   * External verification period
   **/
  public Integer getEvtVerificationPeriod() {
    return evtVerificationPeriod;
  }

  public void setEvtVerificationPeriod(Integer evtVerificationPeriod) {
    this.evtVerificationPeriod = evtVerificationPeriod;
  }
  
  /**
   * Period to grant access for in days
   **/
  public Integer getEvtFixedTimeAccessPeriod() {
    return evtFixedTimeAccessPeriod;
  }

  public void setEvtFixedTimeAccessPeriod(Integer evtFixedTimeAccessPeriod) {
    this.evtFixedTimeAccessPeriod = evtFixedTimeAccessPeriod;
  }
  
  /**
   * External API grace period
   **/
  public Integer getEvtGracePeriod() {
    return evtGracePeriod;
  }

  public void setEvtGracePeriod(Integer evtGracePeriod) {
    this.evtGracePeriod = evtGracePeriod;
  }
  
  /**
   * iTunes bundle id
   **/
  public String getEvtItunesBundleId() {
    return evtItunesBundleId;
  }

  public void setEvtItunesBundleId(String evtItunesBundleId) {
    this.evtItunesBundleId = evtItunesBundleId;
  }
  
  /**
   * iTunes  product id
   **/
  public String getEvtItunesProductId() {
    return evtItunesProductId;
  }

  public void setEvtItunesProductId(String evtItunesProductId) {
    this.evtItunesProductId = evtItunesProductId;
  }
  
  /**
   * Google Play product id
   **/
  public String getEvtGooglePlayProductId() {
    return evtGooglePlayProductId;
  }

  public void setEvtGooglePlayProductId(String evtGooglePlayProductId) {
    this.evtGooglePlayProductId = evtGooglePlayProductId;
  }
  
  /**
   * Collect address for this term
   **/
  public Boolean getCollectAddress() {
    return collectAddress;
  }

  public void setCollectAddress(Boolean collectAddress) {
    this.collectAddress = collectAddress;
  }
  
  /**
   **/
  public List<DeliveryZone> getDeliveryZone() {
    return deliveryZone;
  }

  public void setDeliveryZone(List<DeliveryZone> deliveryZone) {
    this.deliveryZone = deliveryZone;
  }
  
  /**
   **/
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }
  
  /**
   * Vouchering policy for term
   **/
  public VoucheringPolicy getVoucheringPolicy() {
    return voucheringPolicy;
  }

  public void setVoucheringPolicy(VoucheringPolicy voucheringPolicy) {
    this.voucheringPolicy = voucheringPolicy;
  }
  
  /**
   * The type of billing config
   **/
  public String getBillingConfig() {
    return billingConfig;
  }

  public void setBillingConfig(String billingConfig) {
    this.billingConfig = billingConfig;
  }
  
  /**
   * Whether term allows to change its schedule period which was created in past
   **/
  public Boolean getIsAllowedToChangeSchedulePeriodInPast() {
    return isAllowedToChangeSchedulePeriodInPast;
  }

  public void setIsAllowedToChangeSchedulePeriodInPast(Boolean isAllowedToChangeSchedulePeriodInPast) {
    this.isAllowedToChangeSchedulePeriodInPast = isAllowedToChangeSchedulePeriodInPast;
  }
  
  public static Term fromJson(JSONObject json) throws JSONException {
    Term term = new Term();

    term.termId = json.optString("term_id");
    term.aid = json.optString("aid");
    term.resource = Resource.fromJson(json.optJSONObject("resource"));
    term.type = json.optString("type");
    term.typeName = json.optString("type_name");
    term.name = json.optString("name");
    term.description = json.optString("description");
    term.verifyOnRenewal = json.optBoolean("verify_on_renewal");
    term.createDate = new Date(json.optLong("create_date") * 1000);
    term.paymentBillingPlan = json.optString("payment_billing_plan");
    term.paymentBillingPlanDescription = json.optString("payment_billing_plan_description");
    term.paymentBillingPlanTable = new ArrayList<>();
    JSONArray paymentBillingPlanTableJsonArray = json.optJSONArray("payment_billing_plan_table");
    int paymentBillingPlanTableLength = paymentBillingPlanTableJsonArray.length();
    for (int ii = 0; ii < paymentBillingPlanTableLength; ii++) {
      term.paymentBillingPlanTable.add(paymentBillingPlanTableJsonArray.optString(ii));
    }
    term.paymentAllowRenewDays = json.optInt("payment_allow_renew_days");
    term.paymentForceAutoRenew = json.optBoolean("payment_force_auto_renew");
    term.paymentIsCustomPriceAvailable = json.optBoolean("payment_is_custom_price_available");
    term.paymentIsSubscription = json.optBoolean("payment_is_subscription");
    term.paymentHasFreeTrial = json.optBoolean("payment_has_free_trial");
    term.paymentNewCustomersOnly = json.optBoolean("payment_new_customers_only");
    term.paymentTrialNewCustomersOnly = json.optBoolean("payment_trial_new_customers_only");
    term.paymentAllowPromoCodes = json.optBoolean("payment_allow_promo_codes");
    term.paymentRenewGracePeriod = json.optInt("payment_renew_grace_period");
    term.paymentAllowGift = json.optBoolean("payment_allow_gift");
    term.paymentCurrency = json.optString("payment_currency");
    term.paymentFirstPrice = json.optDouble("payment_first_price");
    term.schedule = Schedule.fromJson(json.optJSONObject("schedule"));
    term.scheduleBilling = json.optString("schedule_billing");
    term.customRequireUser = json.optBoolean("custom_require_user");
    term.customDefaultAccessPeriod = json.optInt("custom_default_access_period");
    term.adviewVastUrl = json.optString("adview_vast_url");
    term.adviewAccessPeriod = json.optInt("adview_access_period");
    term.registrationAccessPeriod = json.optInt("registration_access_period");
    term.registrationGracePeriod = json.optInt("registration_grace_period");
    term.externalApiId = json.optString("external_api_id");
    term.externalApiName = json.optString("external_api_name");
    term.evtVerificationPeriod = json.optInt("evt_verification_period");
    term.evtFixedTimeAccessPeriod = json.optInt("evt_fixed_time_access_period");
    term.evtGracePeriod = json.optInt("evt_grace_period");
    term.evtItunesBundleId = json.optString("evt_itunes_bundle_id");
    term.evtItunesProductId = json.optString("evt_itunes_product_id");
    term.evtGooglePlayProductId = json.optString("evt_google_play_product_id");
    term.collectAddress = json.optBoolean("collect_address");
    term.deliveryZone = new ArrayList<>();
    JSONArray deliveryZoneJsonArray = json.optJSONArray("delivery_zone");
    int deliveryZoneLength = deliveryZoneJsonArray.length();
    for (int ii = 0; ii < deliveryZoneLength; ii++) {
      term.deliveryZone.add(DeliveryZone.fromJson(deliveryZoneJsonArray.optJSONObject(ii)));
    }
    term.defaultCountry = Country.fromJson(json.optJSONObject("default_country"));
    term.voucheringPolicy = VoucheringPolicy.fromJson(json.optJSONObject("vouchering_policy"));
    term.billingConfig = json.optString("billing_config");
    term.isAllowedToChangeSchedulePeriodInPast = json.optBoolean("is_allowed_to_change_schedule_period_in_past");
    
    return term;
  }
}
