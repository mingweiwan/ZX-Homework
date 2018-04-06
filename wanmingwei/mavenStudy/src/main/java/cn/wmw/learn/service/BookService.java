package cn.wmw.learn.service;

import cn.wmw.learn.domain.BookDO;
import cn.wmw.learn.to.req.GetInsectBookReq;
import cn.wmw.learn.to.req.GetUpdateBookReq;
import cn.wmw.learn.to.req.UserRegisterReq;
import cn.wmw.learn.to.resp.BooleanResp;

import java.util.List;

/**
 * Created by mingwei on 18-4-6
 */
public interface BookService {

    List<BookDO> getAllBooks();

    //查询
    BookDO getWantedBooks(int number);
    List<BookDO> getWantedBooks(String name);

    //插入
    void insectBooks(GetInsectBookReq req);

    //删除
    void deleteBooks(int number);
    void deleteBooks(String name);

    //更新
    void updateBooks(GetUpdateBookReq req);

    //登录
    BooleanResp userLogin(UserRegisterReq userRegisterReq);

    //注册
    BooleanResp userRegister(UserRegisterReq req);
}
