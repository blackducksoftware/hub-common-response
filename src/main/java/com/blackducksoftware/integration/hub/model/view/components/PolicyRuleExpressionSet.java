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

import org.apache.commons.lang3.builder.RecursiveToStringStyle;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PolicyRuleExpressionSet {
    private final String operator;

    private final List<PolicyRuleExpression> expressions;

    public PolicyRuleExpressionSet(final String operator, final List<PolicyRuleExpression> expressions) {
        this.operator = operator;
        this.expressions = expressions;
    }

    public String getOperator() {
        return operator;
    }

    public List<PolicyRuleExpression> getExpressions() {
        return expressions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((expressions == null) ? 0 : expressions.hashCode());
        result = prime * result + ((operator == null) ? 0 : operator.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof PolicyRuleExpressionSet)) {
            return false;
        }
        final PolicyRuleExpressionSet other = (PolicyRuleExpressionSet) obj;
        if (expressions == null) {
            if (other.expressions != null) {
                return false;
            }
        } else if (!expressions.equals(other.expressions)) {
            return false;
        }
        if (operator == null) {
            if (other.operator != null) {
                return false;
            }
        } else if (!operator.equals(other.operator)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, RecursiveToStringStyle.JSON_STYLE);
    }

}
