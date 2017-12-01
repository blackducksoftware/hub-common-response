package com.blackducksoftware.integration.hub.model.view;

import com.blackducksoftware.integration.hub.model.HubView;
import com.google.gson.annotations.SerializedName;

public class AssignedGroupView extends HubView {
    public String name;
    @SerializedName("group")
    public String groupUrl;
}
