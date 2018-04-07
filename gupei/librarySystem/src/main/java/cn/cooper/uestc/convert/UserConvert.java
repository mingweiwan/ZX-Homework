package cn.cooper.uestc.convert;


import cn.cooper.uestc.To.RequestFromClient.UserRegisterReq;
import cn.cooper.uestc.domain.StudentsInformationDo;

/**
 * By GuPei 18-3-18
 */
//Convert类存在的目的是让TO作为参数传入
public class UserConvert {
   public static StudentsInformationDo convert(UserRegisterReq req) {
       StudentsInformationDo stuInformationDo = new StudentsInformationDo();
       stuInformationDo.setStudentsName(req.getName());
       stuInformationDo.setStudentsId(req.getStudentsId());
       stuInformationDo.setInstitute(req.getInstitute());
       return stuInformationDo;
   }


}
