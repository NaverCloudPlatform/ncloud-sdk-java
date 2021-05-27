/*
 * vloadbalancer
 * VPC Load Balancer 관련 API<br/>https://ncloud.apigw.ntruss.com/vloadbalancer/v2
 *
 * OpenAPI spec version: 2020-12-22T09:19:59Z
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ncloud.vloadbalancer.model;

import java.util.Objects;
import com.ncloud.vloadbalancer.model.CommonCode;
import com.ncloud.vloadbalancer.model.RedirectionAction;
import com.ncloud.vloadbalancer.model.TargetGroupAction;

/**
 * LoadBalancerRuleAction
 */
public class LoadBalancerRuleAction {
	private CommonCode ruleActionType = null;

	private TargetGroupAction targetGroupAction = null;

	private RedirectionAction redirectionAction = null;

	public LoadBalancerRuleAction ruleActionType(CommonCode ruleActionType) {
		this.ruleActionType = ruleActionType;
		return this;
	}

	 /**
	 * 룰액션유형
	 * @return ruleActionType
	**/
	public CommonCode getRuleActionType() {
		return ruleActionType;
	}

	public void setRuleActionType(CommonCode ruleActionType) {
		this.ruleActionType = ruleActionType;
	}

	public LoadBalancerRuleAction targetGroupAction(TargetGroupAction targetGroupAction) {
		this.targetGroupAction = targetGroupAction;
		return this;
	}

	 /**
	 * 타겟그룹액션
	 * @return targetGroupAction
	**/
	public TargetGroupAction getTargetGroupAction() {
		return targetGroupAction;
	}

	public void setTargetGroupAction(TargetGroupAction targetGroupAction) {
		this.targetGroupAction = targetGroupAction;
	}

	public LoadBalancerRuleAction redirectionAction(RedirectionAction redirectionAction) {
		this.redirectionAction = redirectionAction;
		return this;
	}

	 /**
	 * 리다이렉션액션
	 * @return redirectionAction
	**/
	public RedirectionAction getRedirectionAction() {
		return redirectionAction;
	}

	public void setRedirectionAction(RedirectionAction redirectionAction) {
		this.redirectionAction = redirectionAction;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoadBalancerRuleAction loadBalancerRuleAction = (LoadBalancerRuleAction) o;
		return Objects.equals(this.ruleActionType, loadBalancerRuleAction.ruleActionType) &&
				Objects.equals(this.targetGroupAction, loadBalancerRuleAction.targetGroupAction) &&
				Objects.equals(this.redirectionAction, loadBalancerRuleAction.redirectionAction);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ruleActionType, targetGroupAction, redirectionAction);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoadBalancerRuleAction {\n");
		
		sb.append("		ruleActionType: ").append(toIndentedString(ruleActionType)).append("\n");
		sb.append("		targetGroupAction: ").append(toIndentedString(targetGroupAction)).append("\n");
		sb.append("		redirectionAction: ").append(toIndentedString(redirectionAction)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

