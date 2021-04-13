package com.llk.xstream.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

/**
 * @author llK
 * @date 2021/2/24
 */
@Data
@XStreamAlias("responseBody")
public class PersonalInsuranceClaimControlResponseBodyDto {

    private String subSystem;
    private String system;
    private String businessModule;
    @XStreamAlias("caseID")
    private String caseId;
    private List<LiabData> billData;
    private List<PermissionLevel> caseAuditLevelList;
    private String casePriority;
    private String isApproved;
    private String isBreakrule;
    private String isSpotChecked;
    private String isTest;
    private String manageOrgan;
    private String needDealProblem;
    private String needInputBill;
    private String needManualAudit;
    private String needManualSubscribe;
    private String policyType;
    private List<VerifyResultDto> verifyResultList;

    @Data
    @XStreamAlias("liabData")
    static class LiabData {
        private String billType;
        private String itemId;
        private String liabId;
        private String policyId;
        private String productNum;
    }

    @Data
    @XStreamAlias("permissionLevel")
    static class PermissionLevel {
        private String caseLevelCode;
        private String permissionCode;
    }

    public enum PolicyType {
        /**
         * 1.个险，2.团险，3.银行代理
         */
        PERSONAL_INSURANCE("1"),
        GROUP_INSURANCE("2"),
        BANK_AGENCY("3");

        private final String policyType;

        PolicyType(String policyType) {
            this.policyType = policyType;
        }

        public String getPolicyType() {
            return policyType;
        }
    }
}
