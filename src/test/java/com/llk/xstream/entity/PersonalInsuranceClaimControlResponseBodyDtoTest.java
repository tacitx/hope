package com.llk.xstream.entity;


import java.util.ArrayList;


import com.thoughtworks.xstream.XStream;
import org.junit.jupiter.api.Test;

import java.util.List;


class PersonalInsuranceClaimControlResponseBodyDtoTest {

    @Test
    void t1() {
        XStream xStream = new XStream();
        xStream.processAnnotations(PersonalInsuranceClaimControlResponseBodyDto.class);
        PersonalInsuranceClaimControlResponseBodyDto o = (PersonalInsuranceClaimControlResponseBodyDto) xStream
                .fromXML("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<responseBody>\n" +
                        "    <subSystem>claim</subSystem>\n" +
                        "    <system>ebao</system>\n" +
                        "    <businessModule>billInput</businessModule>\n" +
                        "    <caseID>1852737</caseID>\n" +
                        "    <!-- billData billInput调用返回节点 -->\n" +
                        "    <billData>\n" +
                        "        <liabData>\n" +
                        "            <billType>2</billType>\n" +
                        "            <itemId>116596663</itemId>\n" +
                        "            <liabId>80001</liabId>\n" +
                        "            <policyId>11561240</policyId>\n" +
                        "            <productNum>2400</productNum>\n" +
                        "        </liabData>\n" +
                        "    </billData>\n" +
                        "    <!-- caseAuditLevelList audit调用返回节点 -->\n" +
                        "    <caseAuditLevelList>\n" +
                        "        <permissionLevel>\n" +
                        "            <caseLevelCode>101</caseLevelCode>\n" +
                        "            <permissionCode>1</permissionCode>\n" +
                        "        </permissionLevel>\n" +
                        "    </caseAuditLevelList>\n" +
                        "    <casePriority>0</casePriority>\n" +
                        "    <isApproved>1</isApproved>\n" +
                        "    <isBreakrule>0</isBreakrule>\n" +
                        "    <isSpotChecked>N</isSpotChecked>\n" +
                        "    <isTest>0</isTest>\n" +
                        "    <manageOrgan>11507</manageOrgan>\n" +
                        "    <needDealProblem>N</needDealProblem>\n" +
                        "    <needInputBill>Y</needInputBill>\n" +
                        "    <needManualAudit>N</needManualAudit>\n" +
                        "    <needManualSubscribe>N</needManualSubscribe>\n" +
                        "    <policyType>1</policyType>\n" +
                        "    <verifyResultList>\n" +
                        "        <verifyResult>\n" +
                        "            <returnInfo>保单号为11561240，保单险种序号为2400，险种为116596663，责任为门诊费用，索赔类别为意外门诊医疗，需录入门诊账单</returnInfo>\n" +
                        "            <ruleName>CBCC0001</ruleName>\n" +
                        "        </verifyResult>\n" +
                        "    </verifyResultList>\n" +
                        "</responseBody>");
        System.out.println(o);
    }

    @Test
    void t2() {
        PersonalInsuranceClaimControlResponseBodyDto responseBodyDto = new PersonalInsuranceClaimControlResponseBodyDto();

        responseBodyDto.setSubSystem("claim");
        responseBodyDto.setSystem("ebao");
        responseBodyDto.setBusinessModule("billInput");
        responseBodyDto.setCaseId("1852737");

        PersonalInsuranceClaimControlResponseBodyDto.LiabData liabData = new PersonalInsuranceClaimControlResponseBodyDto.LiabData();
        liabData.setBillType("2");
        liabData.setItemId("116596663");
        liabData.setLiabId("80001");
        liabData.setPolicyId("11561240");
        liabData.setProductNum("2400");
        List<PersonalInsuranceClaimControlResponseBodyDto.LiabData> liabDataList = new ArrayList<>();
        liabDataList.add(liabData);
        responseBodyDto.setBillData(liabDataList);

        PersonalInsuranceClaimControlResponseBodyDto.PermissionLevel permissionLevel = new PersonalInsuranceClaimControlResponseBodyDto.PermissionLevel();
        permissionLevel.setCaseLevelCode("101");
        permissionLevel.setPermissionCode("1");
        List<PersonalInsuranceClaimControlResponseBodyDto.PermissionLevel> caseAuditLevelList = new ArrayList<>();
        caseAuditLevelList.add(permissionLevel);
        responseBodyDto.setCaseAuditLevelList(caseAuditLevelList);

        responseBodyDto.setCasePriority("0");
        responseBodyDto.setIsApproved("1");
        responseBodyDto.setIsBreakrule("0");
        responseBodyDto.setIsSpotChecked("N");
        responseBodyDto.setIsTest("0");
        responseBodyDto.setManageOrgan("11507");
        responseBodyDto.setNeedDealProblem("N");
        responseBodyDto.setNeedInputBill("Y");
        responseBodyDto.setNeedManualAudit("N");
        responseBodyDto.setNeedManualSubscribe("N");
        responseBodyDto.setPolicyType(PersonalInsuranceClaimControlResponseBodyDto.PolicyType.PERSONAL_INSURANCE.getPolicyType());

        VerifyResultDto verifyResultDto = new VerifyResultDto();
        verifyResultDto.setReturnInfo("保单号为11561240，保单险种序号为2400，险种为116596663，责任为门诊费用，索赔类别为意外门诊医疗，需录入门诊账单");
        verifyResultDto.setRuleName("CBCC0001");
        List<VerifyResultDto> verifyResultDtoList = new ArrayList<>();
        verifyResultDtoList.add(verifyResultDto);
        responseBodyDto.setVerifyResultList(verifyResultDtoList);

        XStream stream = new XStream();
        stream.processAnnotations(PersonalInsuranceClaimControlResponseBodyDto.class);
        String xml = stream.toXML(responseBodyDto);
        System.out.println(xml);

    }

    @Test
    void test2() {
        String a =null;
        System.out.println(a);
    }
}