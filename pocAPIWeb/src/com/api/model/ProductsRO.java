package com.api.model;

import java.util.List;

public class ProductsRO {
	
List<UnifiedAutoPolicyBO> unifiedAutoPolicyBO;
List<UnifiedPropertyPolicyBO> unifiedPropertyPolicyBO;

public List<UnifiedAutoPolicyBO> getUnifiedAutoPolicyBO() {
	return unifiedAutoPolicyBO;
}
public void setUnifiedAutoPolicyBO(List<UnifiedAutoPolicyBO> unifiedAutoPolicyBO) {
	this.unifiedAutoPolicyBO = unifiedAutoPolicyBO;
}
public List<UnifiedPropertyPolicyBO> getUnifiedPropertyPolicyBO() {
	return unifiedPropertyPolicyBO;
}
public void setUnifiedPropertyPolicyBO(List<UnifiedPropertyPolicyBO> unifiedPropertyPolicyBO) {
	this.unifiedPropertyPolicyBO = unifiedPropertyPolicyBO;
}



}
