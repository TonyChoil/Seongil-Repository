package com.teamtwo.nullfunding.member.dto;

import com.teamtwo.nullfunding.inquiry.model.dto.InquiryDTO;
import com.teamtwo.nullfunding.inquiry.model.dto.InquiryTypeDTO;
import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class MemberDTO {

    private int memCode;
    private String authName;
    private String memEmail;
    private String memPwd;
    private String isActive;
    private Date regiDate;
    private String nickName;
    private Date recentLogin;

    private PersonalInfoDTO personalInfoDTO;

    private FundRaiserDTO fundRaiserDTO;



}