package cn.cooper.uestc.service.serviceImplementClass;


import cn.cooper.uestc.mapper.StudentsInformationMapper;
import cn.cooper.uestc.service.UserRegisterReqService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * By GuPei 18-3-18
 */
@Service
public class UserRegisterReqServiceImplement implements UserRegisterReqService {
    @Resource
    private StudentsInformationMapper studentsInformationMapper;




}
