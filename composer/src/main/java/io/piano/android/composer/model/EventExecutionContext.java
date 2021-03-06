package io.piano.android.composer.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class EventExecutionContext {

    public String experienceId;
    public String executionId;
    public String trackingId;
    public List<SplitTest> splitTests;
    public String currentMeterName;
    public User user;
    public String region;
    public String country;
    public List<Access> accessList;
    public List<ActiveMeter> activeMeters;
    public JSONArray activeMetersJson;

    static EventExecutionContext fromJson(JSONObject json) {
        EventExecutionContext eventExecutionContext = null;

        if (!json.isNull("eventExecutionContext")) {
            eventExecutionContext = new EventExecutionContext();

            JSONObject eventExecutionContextJson = json.optJSONObject("eventExecutionContext");

            eventExecutionContext.experienceId = eventExecutionContextJson.optString("experienceId");
            eventExecutionContext.executionId = eventExecutionContextJson.optString("executionId");
            eventExecutionContext.trackingId = eventExecutionContextJson.optString("trackingId");
            JSONArray splitTestsJson = eventExecutionContextJson.optJSONArray("splitTests");
            if ((splitTestsJson != null) && (splitTestsJson.length() > 0)) {
                eventExecutionContext.splitTests = new ArrayList<>();
                for (int ii = 0; ii < splitTestsJson.length(); ii++) {
                    JSONObject splitTestJson = splitTestsJson.optJSONObject(ii);
                    SplitTest splitTest = SplitTest.fromJson(splitTestJson);
                    eventExecutionContext.splitTests.add(splitTest);
                }
            }
            eventExecutionContext.currentMeterName = eventExecutionContextJson.optString("currentMeterName");
            eventExecutionContext.user = User.fromJson(eventExecutionContextJson.optJSONObject("user"));
            eventExecutionContext.region = eventExecutionContextJson.optString("region");
            eventExecutionContext.country = eventExecutionContextJson.optString("country");
            JSONArray accessListJson = eventExecutionContextJson.optJSONArray("accessList");
            if ((accessListJson != null) && (accessListJson.length() > 0)) {
                eventExecutionContext.accessList = new ArrayList<>();
                for (int ii = 0; ii < accessListJson.length(); ii++) {
                    JSONObject accessJson = accessListJson.optJSONObject(ii);
                    Access access = Access.fromJson(accessJson);
                    eventExecutionContext.accessList.add(access);
                }
            }
            JSONArray activeMetersJson = eventExecutionContextJson.optJSONArray("activeMeters");
            if ((activeMetersJson != null) && (activeMetersJson.length() > 0)) {
                eventExecutionContext.activeMeters = new ArrayList<>();
                for (int ii = 0; ii < activeMetersJson.length(); ii++) {
                    JSONObject activeMeterJson = activeMetersJson.optJSONObject(ii);
                    ActiveMeter activeMeter = ActiveMeter.fromJson(activeMeterJson);
                    eventExecutionContext.activeMeters.add(activeMeter);
                }
                eventExecutionContext.activeMetersJson = activeMetersJson;
            }
        }

        return eventExecutionContext;
    }
}
