package io.piano.android.api.user.api;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.piano.android.api.common.ApiException;
import io.piano.android.api.common.ApiInvoker;
import io.piano.android.api.user.model.Access;

public class UserAccessApi {

  private ApiInvoker apiInvoker;

  public UserAccessApi(ApiInvoker apiInvoker) {
    this.apiInvoker = apiInvoker;
  }
  
  /**
   * Returns the access details for aid and rid in JWS format
   * 
   * @param aid Application aid
   * @param rid Unique id for resource
   * @param crossApp Provide cross application access for resource
   * @return String
   */
  public String checkJWT(String aid, String rid, Boolean crossApp) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'aid' is set
    if (aid == null) {
       throw new ApiException(400, "Missing the required parameter 'aid' when calling checkJWT");
    }
    
    // verify the required parameter 'rid' is set
    if (rid == null) {
       throw new ApiException(400, "Missing the required parameter 'rid' when calling checkJWT");
    }
    

    // create path and map variables
    String path = "/user/access/check.jwt";

    // query params
    List<Pair<String, String>> queryParams = new ArrayList<>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "aid", aid));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "rid", rid));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cross_app", crossApp));
    

    

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Gets access details for current user
   * 
   * @param accessId The access id
   * @return Access
   */
  public Access get(String accessId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'accessId' is set
    if (accessId == null) {
       throw new ApiException(400, "Missing the required parameter 'accessId' when calling get");
    }
    

    // create path and map variables
    String path = "/user/access/get";

    // query params
    List<Pair<String, String>> queryParams = new ArrayList<>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "access_id", accessId));
    

    

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
        return (Access) ApiInvoker.deserialize(response, "", Access.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Query list of access for current user
   * 
   * @param aid Application aid
   * @param expandBundled Expand bundled accesses
   * @param crossApp Provide cross application access for resource
   * @return List<Access>
   */
  public List<Access> list(String aid, Boolean expandBundled, Boolean crossApp) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'aid' is set
    if (aid == null) {
       throw new ApiException(400, "Missing the required parameter 'aid' when calling list");
    }
    

    // create path and map variables
    String path = "/user/access/list";

    // query params
    List<Pair<String, String>> queryParams = new ArrayList<>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "aid", aid));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "expand_bundled", expandBundled));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cross_app", crossApp));
    

    

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
        return (List<Access>) ApiInvoker.deserialize(response, "array", Access.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
