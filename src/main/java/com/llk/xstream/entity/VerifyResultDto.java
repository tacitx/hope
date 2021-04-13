package com.llk.xstream.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * title: VerifyResultDto
 * description:
 *
 * @author Cao yuxuan
 * @version 1.0 sinosoft corporation©
 * @date 2021/2/23  首次创建
 * @date 2021/2/23  最后修改
 */
@Data
@XStreamAlias("verifyResult")
public class VerifyResultDto {
    @XStreamAlias("productID")
    private String productId;
    private String returnInfo;
    private String ruleName;
}
