package io.piano.android.api.user.api;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.piano.android.api.common.ApiException;
import io.piano.android.api.common.ApiInvoker;
import io.piano.android.api.user.model.ConsentBoxEntry;

public class UserConsentApi {

  private ApiInvoker apiInvoker;

  public UserConsentApi(ApiInvoker apiInvoker) {
    this.apiInvoker = apiInvoker;
  }
  
  /**
   * Find consent box entries
   * 
   * @param offset Offset from which to start returning results
   * @param limit Maximum index of returned results
   * @param q Search value
   * @param orderBy Field to order by
   * @param orderDirection Order direction (asc/desc)
   * @return List<ConsentBoxEntry>
   */
  public List<ConsentBoxEntry> entryList(Integer offset, Integer limit, String q, String orderBy, String orderDirection) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'offset' is set
    if (offset == null) {
       throw new ApiException(400, "Missing the required parameter 'offset' when calling entryList");
    }
    
    // verify the required parameter 'limit' is set
    if (limit == null) {
       throw new ApiException(400, "Missing the required parameter 'limit' when calling entryList");
    }
    

    // create path and map variables
    String path = "/user/consent/list";

    // query params
    List<Pair<String, String>> queryParams = new ArrayList<>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "q", q));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_by", orderBy));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order_direction", orderDirection));
    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      /*
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
      */
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<ConsentBoxEntry>) ApiInvoker.deserialize(response, "array", ConsentBoxEntry.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
