/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This structure indicates the metric data to return, and whether this call is just retrieving a batch set of data for
 * one metric, or is performing a math expression on metric data. A single <code>GetMetricData</code> call can include
 * up to 100 <code>MetricDataQuery</code> structures.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/MetricDataQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataQuery implements Serializable, Cloneable {

    /**
     * <p>
     * A short name used to tie this structure to the results in the response. This name must be unique within a single
     * call to <code>GetMetricData</code>. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the mathematical expression. The valid characters are
     * letters, numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this structure is
     * performing a data retrieval and not performing a math expression on the returned data.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     */
    private MetricStat metricStat;
    /**
     * <p>
     * The math expression to be performed on the returned data, if this structure is performing a math expression. For
     * more information about metric math expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If Label is omitted, CloudWatch generates a default.
     * </p>
     */
    private String label;
    /**
     * <p>
     * Indicates whether to return the time stamps and raw data values of this metric. If you are performing this call
     * just to do math expressions and do not also need the raw data returned, you can specify <code>False</code>. If
     * you omit this, the default of <code>True</code> is used.
     * </p>
     */
    private Boolean returnData;

    /**
     * <p>
     * A short name used to tie this structure to the results in the response. This name must be unique within a single
     * call to <code>GetMetricData</code>. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the mathematical expression. The valid characters are
     * letters, numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     * 
     * @param id
     *        A short name used to tie this structure to the results in the response. This name must be unique within a
     *        single call to <code>GetMetricData</code>. If you are performing math expressions on this set of data,
     *        this name represents that data and can serve as a variable in the mathematical expression. The valid
     *        characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A short name used to tie this structure to the results in the response. This name must be unique within a single
     * call to <code>GetMetricData</code>. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the mathematical expression. The valid characters are
     * letters, numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     * 
     * @return A short name used to tie this structure to the results in the response. This name must be unique within a
     *         single call to <code>GetMetricData</code>. If you are performing math expressions on this set of data,
     *         this name represents that data and can serve as a variable in the mathematical expression. The valid
     *         characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A short name used to tie this structure to the results in the response. This name must be unique within a single
     * call to <code>GetMetricData</code>. If you are performing math expressions on this set of data, this name
     * represents that data and can serve as a variable in the mathematical expression. The valid characters are
     * letters, numbers, and underscore. The first character must be a lowercase letter.
     * </p>
     * 
     * @param id
     *        A short name used to tie this structure to the results in the response. This name must be unique within a
     *        single call to <code>GetMetricData</code>. If you are performing math expressions on this set of data,
     *        this name represents that data and can serve as a variable in the mathematical expression. The valid
     *        characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this structure is
     * performing a data retrieval and not performing a math expression on the returned data.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     * 
     * @param metricStat
     *        The metric to be returned, along with statistics, period, and units. Use this parameter only if this
     *        structure is performing a data retrieval and not performing a math expression on the returned data.</p>
     *        <p>
     *        Within one MetricDataQuery structure, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     */

    public void setMetricStat(MetricStat metricStat) {
        this.metricStat = metricStat;
    }

    /**
     * <p>
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this structure is
     * performing a data retrieval and not performing a math expression on the returned data.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     * 
     * @return The metric to be returned, along with statistics, period, and units. Use this parameter only if this
     *         structure is performing a data retrieval and not performing a math expression on the returned data.</p>
     *         <p>
     *         Within one MetricDataQuery structure, you must specify either <code>Expression</code> or
     *         <code>MetricStat</code> but not both.
     */

    public MetricStat getMetricStat() {
        return this.metricStat;
    }

    /**
     * <p>
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this structure is
     * performing a data retrieval and not performing a math expression on the returned data.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     * 
     * @param metricStat
     *        The metric to be returned, along with statistics, period, and units. Use this parameter only if this
     *        structure is performing a data retrieval and not performing a math expression on the returned data.</p>
     *        <p>
     *        Within one MetricDataQuery structure, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withMetricStat(MetricStat metricStat) {
        setMetricStat(metricStat);
        return this;
    }

    /**
     * <p>
     * The math expression to be performed on the returned data, if this structure is performing a math expression. For
     * more information about metric math expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     * 
     * @param expression
     *        The math expression to be performed on the returned data, if this structure is performing a math
     *        expression. For more information about metric math expressions, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     *        >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.</p>
     *        <p>
     *        Within one MetricDataQuery structure, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The math expression to be performed on the returned data, if this structure is performing a math expression. For
     * more information about metric math expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     * 
     * @return The math expression to be performed on the returned data, if this structure is performing a math
     *         expression. For more information about metric math expressions, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     *         >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.</p>
     *         <p>
     *         Within one MetricDataQuery structure, you must specify either <code>Expression</code> or
     *         <code>MetricStat</code> but not both.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The math expression to be performed on the returned data, if this structure is performing a math expression. For
     * more information about metric math expressions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     * >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * Within one MetricDataQuery structure, you must specify either <code>Expression</code> or <code>MetricStat</code>
     * but not both.
     * </p>
     * 
     * @param expression
     *        The math expression to be performed on the returned data, if this structure is performing a math
     *        expression. For more information about metric math expressions, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax"
     *        >Metric Math Syntax and Functions</a> in the <i>Amazon CloudWatch User Guide</i>.</p>
     *        <p>
     *        Within one MetricDataQuery structure, you must specify either <code>Expression</code> or
     *        <code>MetricStat</code> but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If Label is omitted, CloudWatch generates a default.
     * </p>
     * 
     * @param label
     *        A human-readable label for this metric or expression. This is especially useful if this is an expression,
     *        so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard
     *        widget, the label is shown. If Label is omitted, CloudWatch generates a default.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If Label is omitted, CloudWatch generates a default.
     * </p>
     * 
     * @return A human-readable label for this metric or expression. This is especially useful if this is an expression,
     *         so that you know what the value represents. If the metric or expression is shown in a CloudWatch
     *         dashboard widget, the label is shown. If Label is omitted, CloudWatch generates a default.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that
     * you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the
     * label is shown. If Label is omitted, CloudWatch generates a default.
     * </p>
     * 
     * @param label
     *        A human-readable label for this metric or expression. This is especially useful if this is an expression,
     *        so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard
     *        widget, the label is shown. If Label is omitted, CloudWatch generates a default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * Indicates whether to return the time stamps and raw data values of this metric. If you are performing this call
     * just to do math expressions and do not also need the raw data returned, you can specify <code>False</code>. If
     * you omit this, the default of <code>True</code> is used.
     * </p>
     * 
     * @param returnData
     *        Indicates whether to return the time stamps and raw data values of this metric. If you are performing this
     *        call just to do math expressions and do not also need the raw data returned, you can specify
     *        <code>False</code>. If you omit this, the default of <code>True</code> is used.
     */

    public void setReturnData(Boolean returnData) {
        this.returnData = returnData;
    }

    /**
     * <p>
     * Indicates whether to return the time stamps and raw data values of this metric. If you are performing this call
     * just to do math expressions and do not also need the raw data returned, you can specify <code>False</code>. If
     * you omit this, the default of <code>True</code> is used.
     * </p>
     * 
     * @return Indicates whether to return the time stamps and raw data values of this metric. If you are performing
     *         this call just to do math expressions and do not also need the raw data returned, you can specify
     *         <code>False</code>. If you omit this, the default of <code>True</code> is used.
     */

    public Boolean getReturnData() {
        return this.returnData;
    }

    /**
     * <p>
     * Indicates whether to return the time stamps and raw data values of this metric. If you are performing this call
     * just to do math expressions and do not also need the raw data returned, you can specify <code>False</code>. If
     * you omit this, the default of <code>True</code> is used.
     * </p>
     * 
     * @param returnData
     *        Indicates whether to return the time stamps and raw data values of this metric. If you are performing this
     *        call just to do math expressions and do not also need the raw data returned, you can specify
     *        <code>False</code>. If you omit this, the default of <code>True</code> is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataQuery withReturnData(Boolean returnData) {
        setReturnData(returnData);
        return this;
    }

    /**
     * <p>
     * Indicates whether to return the time stamps and raw data values of this metric. If you are performing this call
     * just to do math expressions and do not also need the raw data returned, you can specify <code>False</code>. If
     * you omit this, the default of <code>True</code> is used.
     * </p>
     * 
     * @return Indicates whether to return the time stamps and raw data values of this metric. If you are performing
     *         this call just to do math expressions and do not also need the raw data returned, you can specify
     *         <code>False</code>. If you omit this, the default of <code>True</code> is used.
     */

    public Boolean isReturnData() {
        return this.returnData;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetricStat() != null)
            sb.append("MetricStat: ").append(getMetricStat()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getReturnData() != null)
            sb.append("ReturnData: ").append(getReturnData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDataQuery == false)
            return false;
        MetricDataQuery other = (MetricDataQuery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetricStat() == null ^ this.getMetricStat() == null)
            return false;
        if (other.getMetricStat() != null && other.getMetricStat().equals(this.getMetricStat()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getReturnData() == null ^ this.getReturnData() == null)
            return false;
        if (other.getReturnData() != null && other.getReturnData().equals(this.getReturnData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetricStat() == null) ? 0 : getMetricStat().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getReturnData() == null) ? 0 : getReturnData().hashCode());
        return hashCode;
    }

    @Override
    public MetricDataQuery clone() {
        try {
            return (MetricDataQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
