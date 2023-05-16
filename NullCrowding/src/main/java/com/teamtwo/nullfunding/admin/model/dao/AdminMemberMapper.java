package com.teamtwo.nullfunding.admin.model.dao;

import com.teamtwo.nullfunding.admin.model.dto.AdminInquiry;
import com.teamtwo.nullfunding.common.paging.SelectCriteria;
import com.teamtwo.nullfunding.member.dto.MemberDTO;
import com.teamtwo.nullfunding.project.model.dto.ProjectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMemberMapper {

    // 페이징 처리를 위한 전체 개수 조회
    int selectTotalCount(Map<String, String> searchMap);

    // 모든 회원 정보 조회
    List<MemberDTO> selectAllMemberList(SelectCriteria selectCriteria);

    List<AdminInquiry> unreadInquiry(Map<String, Object> map);

    int selectInquiryCount(Map<String, Object> map);

    List<MemberDTO> selectAllPersonal();

    List<ProjectDTO> selectAllProject();


    int confirmProject(int projectNo, int decision);
}
