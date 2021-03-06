package io.piano.android.api.publisher.model;

import org.json.JSONException;
import org.json.JSONObject;

public class UserPayment {
  
  private String userPaymentId = null;
  private String createDate = null;
  private Boolean renewal = null;
  private Double amount = null;
  private String price = null;
  private String currency = null;
  private Boolean refundable = null;
  private UserSubscription subscription = null;
  private Term term = null;
  private Double tax = null;
  private String taxBillingPlan = null;
  private String paymentMethod = null;
  private String upiExtCustomerId = null;
  private String upiExtCustomerIdLabel = null;
  private String externalTransactionId = null;
  private String trackingId = null;
  private String originalPrice = null;
  
  /**
   * User payment id
   **/
  public String getUserPaymentId() {
    return userPaymentId;
  }

  public void setUserPaymentId(String userPaymentId) {
    this.userPaymentId = userPaymentId;
  }
  
  /**
   * User payment creation date
   **/
  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }
  
  /**
   * User payment renewal
   **/
  public Boolean getRenewal() {
    return renewal;
  }

  public void setRenewal(Boolean renewal) {
    this.renewal = renewal;
  }
  
  /**
   * User payment amount
   **/
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
  
  /**
   * Formatted user payment price include/plus tax
   **/
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }
  
  /**
   * User payment currency
   **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
  
  /**
   * User payment is refundable
   **/
  public Boolean getRefundable() {
    return refundable;
  }

  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }
  
  /**
   **/
  public UserSubscription getSubscription() {
    return subscription;
  }

  public void setSubscription(UserSubscription subscription) {
    this.subscription = subscription;
  }
  
  /**
   **/
  public Term getTerm() {
    return term;
  }

  public void setTerm(Term term) {
    this.term = term;
  }
  
  /**
   * User payment tax
   **/
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }
  
  /**
   * Tax billing plan
   **/
  public String getTaxBillingPlan() {
    return taxBillingPlan;
  }

  public void setTaxBillingPlan(String taxBillingPlan) {
    this.taxBillingPlan = taxBillingPlan;
  }
  
  /**
   * payment method
   **/
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  
  /**
   * External customer id
   **/
  public String getUpiExtCustomerId() {
    return upiExtCustomerId;
  }

  public void setUpiExtCustomerId(String upiExtCustomerId) {
    this.upiExtCustomerId = upiExtCustomerId;
  }
  
  /**
   * Label for external customer id
   **/
  public String getUpiExtCustomerIdLabel() {
    return upiExtCustomerIdLabel;
  }

  public void setUpiExtCustomerIdLabel(String upiExtCustomerIdLabel) {
    this.upiExtCustomerIdLabel = upiExtCustomerIdLabel;
  }
  
  /**
   * External transaction id
   **/
  public String getExternalTransactionId() {
    return externalTransactionId;
  }

  public void setExternalTransactionId(String externalTransactionId) {
    this.externalTransactionId = externalTransactionId;
  }
  
  /**
   * Tracking id
   **/
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }
  
  /**
   * Original price
   **/
  public String getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(String originalPrice) {
    this.originalPrice = originalPrice;
  }
  
  public static UserPayment fromJson(JSONObject json) throws JSONException {
    UserPayment userPayment = new UserPayment();

    userPayment.userPaymentId = json.optString("user_payment_id");
    userPayment.createDate = json.optString("create_date");
    userPayment.renewal = json.optBoolean("renewal");
    userPayment.amount = json.optDouble("amount");
    userPayment.price = json.optString("price");
    userPayment.currency = json.optString("currency");
    userPayment.refundable = json.optBoolean("refundable");
    userPayment.subscription = UserSubscription.fromJson(json.optJSONObject("subscription"));
    userPayment.term = Term.fromJson(json.optJSONObject("term"));
    userPayment.tax = json.optDouble("tax");
    userPayment.taxBillingPlan = json.optString("tax_billing_plan");
    userPayment.paymentMethod = json.optString("payment_method");
    userPayment.upiExtCustomerId = json.optString("upi_ext_customer_id");
    userPayment.upiExtCustomerIdLabel = json.optString("upi_ext_customer_id_label");
    userPayment.externalTransactionId = json.optString("external_transaction_id");
    userPayment.trackingId = json.optString("tracking_id");
    userPayment.originalPrice = json.optString("original_price");
    
    return userPayment;
  }
}
