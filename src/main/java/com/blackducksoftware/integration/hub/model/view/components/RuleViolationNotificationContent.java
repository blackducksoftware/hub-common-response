/**
 * Hub Common Response
 *
 * Copyright (C) 2017 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.blackducksoftware.integration.hub.model.view.components;

import java.util.List;

import com.blackducksoftware.integration.hub.model.HubComponent;
import com.google.gson.annotations.SerializedName;

public class RuleViolationNotificationContent extends HubComponent {
    private String projectName;

    private String projectVersionName;

    private int componentVersionsInViolation;

    private List<ComponentVersionStatus> componentVersionStatuses;

    @SerializedName("projectVersion")
    private String projectVersionLink;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersionName() {
        return projectVersionName;
    }

    public void setProjectVersionName(final String projectVersionName) {
        this.projectVersionName = projectVersionName;
    }

    public int getComponentVersionsInViolation() {
        return componentVersionsInViolation;
    }

    public void setComponentVersionsInViolation(final int componentVersionsInViolation) {
        this.componentVersionsInViolation = componentVersionsInViolation;
    }

    public List<ComponentVersionStatus> getComponentVersionStatuses() {
        return componentVersionStatuses;
    }

    public void setComponentVersionStatuses(final List<ComponentVersionStatus> componentVersionStatuses) {
        this.componentVersionStatuses = componentVersionStatuses;
    }

    public String getProjectVersionLink() {
        return projectVersionLink;
    }

    public void setProjectVersionLink(final String projectVersionLink) {
        this.projectVersionLink = projectVersionLink;
    }
}
