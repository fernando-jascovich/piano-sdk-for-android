package io.piano.android.api.publisher.api;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.piano.android.api.common.ApiException;
import io.piano.android.api.common.ApiInvoker;
import io.piano.android.api.publisher.model.OfferTemplateVersion;

public class PublisherOfferTemplateCreateApi {

  private ApiInvoker apiInvoker;

  public PublisherOfferTemplateCreateApi(ApiInvoker apiInvoker) {
    this.apiInvoker = apiInvoker;
  }
  
  /**
   * Creates an empty template
   * 
   * @param aid Application aid
   * @param name The name
   * @param description The description
   * @param categoryId The id of Category
   * @param historyComment Offer Template History Comment
   * @return OfferTemplateVersion
   */
  public OfferTemplateVersion createEmpty(String aid, String name, String description, String categoryId, String historyComment) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'aid' is set
    if (aid == null) {
       throw new ApiException(400, "Missing the required parameter 'aid' when calling createEmpty");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
       throw new ApiException(400, "Missing the required parameter 'name' when calling createEmpty");
    }
    

    // create path and map variables
    String path = "/publisher/offer/template/create/empty";

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
      
      if (name != null) {
        builder.addTextBody("name", ApiInvoker.parameterToString(name), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (description != null) {
        builder.addTextBody("description", ApiInvoker.parameterToString(description), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (categoryId != null) {
        builder.addTextBody("category_id", ApiInvoker.parameterToString(categoryId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (historyComment != null) {
        builder.addTextBody("history_comment", ApiInvoker.parameterToString(historyComment), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
      */
    } else {
      // normal form params
      formParams.put("aid", ApiInvoker.parameterToString(aid));
      formParams.put("name", ApiInvoker.parameterToString(name));
      formParams.put("description", ApiInvoker.parameterToString(description));
      formParams.put("category_id", ApiInvoker.parameterToString(categoryId));
      formParams.put("history_comment", ApiInvoker.parameterToString(historyComment));
      
    }

    try {
      String response = apiInvoker.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (OfferTemplateVersion) ApiInvoker.deserialize(response, "", OfferTemplateVersion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
