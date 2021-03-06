package io.piano.android.api.anon.api;

import android.util.Pair;

import io.piano.android.api.anon.model.UserSubscription;
import io.piano.android.api.common.ApiException;
import io.piano.android.api.common.ApiInvoker;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class SubscriptionApi {

  private ApiInvoker apiInvoker;

  public SubscriptionApi(ApiInvoker apiInvoker) {
    this.apiInvoker = apiInvoker;
  }
  
  /**
   * Lists a user&#39;s subscription
   * 
   * @param aid Application aid
   * @param userToken User token
   * @param userProvider User token provider
   * @param userRef Encrypted user reference
   * @return List<UserSubscription>
   */
  public List<UserSubscription> list(String aid, String userToken, String userProvider, String userRef) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'aid' is set
    if (aid == null) {
       throw new ApiException(400, "Missing the required parameter 'aid' when calling list");
    }
    

    // create path and map variables
    String path = "/subscription/list";

    // query params
    List<Pair<String, String>> queryParams = new ArrayList<>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      /*
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (aid != null) {
        builder.addTextBody("aid", ApiInvoker.parameterToString(aid), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (userToken != null) {
        builder.addTextBody("user_token", ApiInvoker.parameterToString(userToken), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (userProvider != null) {
        builder.addTextBody("user_provider", ApiInvoker.parameterToString(userProvider), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (userRef != null) {
        builder.addTextBody("user_ref", ApiInvoker.parameterToString(userRef), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
      */
    } else {
      // normal form params
      formParams.put("aid", ApiInvoker.parameterToString(aid));
      formParams.put("user_token", ApiInvoker.parameterToString(userToken));
      formParams.put("user_provider", ApiInvoker.parameterToString(userProvider));
      formParams.put("user_ref", ApiInvoker.parameterToString(userRef));
      
    }

    try {
      String response = apiInvoker.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<UserSubscription>) ApiInvoker.deserialize(response, "array", UserSubscription.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
