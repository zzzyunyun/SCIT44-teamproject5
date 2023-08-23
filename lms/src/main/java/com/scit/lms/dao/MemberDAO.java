package com.scit.lms.dao;

import com.scit.lms.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {
    public int join(Member member);

    public Member selectOne(String searchid);

    //회원정보 불러오기
    public Member memberInfor(String userid);

    //회원정보 수정
    public int memberUpdate(Member member);

    //회원탈퇴
    public int memberDelete(String userid);
}
