package io.piano.android.api.anon.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class Access {
  
  private String accessId = null;
  private String parentAccessId = null;
  private Boolean granted = null;
  private User user = null;
  private Resource resource = null;
  private Date expireDate = null;
  private Date startDate = null;
  
  /**
   * The access id
   **/
  public String getAccessId() {
    return accessId;
  }

  public void setAccessId(String accessId) {
    this.accessId = accessId;
  }
  
  /**
   * The access parent id (for accesses from bundled resources)
   **/
  public String getParentAccessId() {
    return parentAccessId;
  }

  public void setParentAccessId(String parentAccessId) {
    this.parentAccessId = parentAccessId;
  }
  
  /**
   * Granted == true if the user has access
   **/
  public Boolean getGranted() {
    return granted;
  }

  public void setGranted(Boolean granted) {
    this.granted = granted;
  }
  
  /**
   * The user
   **/
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
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
   * The access item expire date; null means unlimited
   **/
  public Date getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }
  
  /**
   * The start date.
   **/
  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  
  public static Access fromJson(JSONObject json) throws JSONException {
    Access access = new Access();

    access.accessId = json.optString("access_id");
    access.parentAccessId = json.optString("parent_access_id");
    access.granted = json.optBoolean("granted");
    access.user = User.fromJson(json.optJSONObject("user"));
    access.resource = Resource.fromJson(json.optJSONObject("resource"));
    access.expireDate = new Date(json.optLong("expire_date") * 1000);
    access.startDate = new Date(json.optLong("start_date") * 1000);
    
    return access;
  }
}
