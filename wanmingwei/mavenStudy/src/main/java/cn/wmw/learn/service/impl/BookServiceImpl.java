package cn.wmw.learn.service.impl;

import cn.wmw.learn.domain.BookDO;
import cn.wmw.learn.domain.UserDO;
import cn.wmw.learn.domain.condition.BookCondition;
import cn.wmw.learn.domain.condition.UserCondition;
import cn.wmw.learn.mapper.BookMapper;
import cn.wmw.learn.mapper.UserMapper;
import cn.wmw.learn.service.BookService;
import cn.wmw.learn.to.req.UserRegisterReq;
import cn.wmw.learn.to.resp.BooleanResp;
import cn.wmw.learn.to.req.GetInsectBookReq;
import cn.wmw.learn.to.req.GetUpdateBookReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingwei on 18-1-26
 */
@Service
public class BookServiceImpl implements BookService{
    @Resource
    private BookMapper bookMapper;
    @Resource
    private UserMapper userMapper;

    public List<BookDO> getAllBooks() {
        BookCondition bookCondition = new BookCondition();
        return bookMapper.selectByExample(bookCondition);
    }

    //按书籍编号查询
    public BookDO getWantedBooks(int number) {
        return bookMapper.selectByPrimaryKey(number);
    }

    //按书名查询
    public List<BookDO> getWantedBooks(String name) {
        BookCondition bookCondition = new BookCondition();
        BookCondition.Criteria criteria = bookCondition.createCriteria();
        criteria.andNameEqualTo(name);
        return bookMapper.selectByExample(bookCondition);
    }

    //插入
    public void insectBooks(GetInsectBookReq req) {
        BookDO bookDO = new BookDO();
        bookDO.setName(req.getName());
        bookDO.setAuthor(req.getAuthor());
        bookDO.setIntro(req.getIntro());
        bookDO.setCatalogue(req.getCatalogue());
        bookMapper.insert(bookDO);
    }

    //按照书籍编号删除
    public void deleteBooks(int number) {
        bookMapper.deleteByPrimaryKey(number);
    }

    //按照书籍名称删除
    public void deleteBooks(String name) {
        BookCondition bookCondition = new BookCondition();
        BookCondition.Criteria criteria = bookCondition.createCriteria();
        criteria.andNameEqualTo(name);
        bookMapper.deleteByExample(bookCondition);
    }

    //按书籍编号更新
    public void updateBooks(GetUpdateBookReq req) {
        BookDO bookDO = bookMapper.selectByPrimaryKey(req.getNumber());
        if (req.getName() != null) {
            bookDO.setName(req.getName());
        }
        if (req.getAuthor() != null) {
            bookDO.setAuthor(req.getAuthor());
        }
        if (req.getCatalogue() != null) {
            bookDO.setCatalogue(req.getCatalogue());
        }
        if (req.getIntro() != null) {
            bookDO.setIntro(req.getIntro());
        }
        bookMapper.updateByPrimaryKey(bookDO);
    }

    //登录处理
    public BooleanResp userLogin(UserRegisterReq userRegisterReq) {
        UserCondition userCondition = new UserCondition();
        userCondition.createCriteria()
                .andUserNameEqualTo(userRegisterReq.getUsername())
                .andUserPwEqualTo(userRegisterReq.getPassword());
        if (userMapper.selectByExample(userCondition).size() != 0) {
            return new BooleanResp(true, "登录成功!");
        } else {
            return new BooleanResp(false, "无法登录!");
        }
    }

    //注册处理
    public BooleanResp userRegister(UserRegisterReq req) {
        UserDO userDO = new UserDO();
        if (req.getUsername() != null) {
    //判断重复
            UserCondition userCondition = new UserCondition();
            userCondition.createCriteria()
                    .andUserNameEqualTo(req.getUsername());
            if (userMapper.selectByExample(userCondition).size() == 0) {
                if (req.getPassword() != null) {
                    userDO.setUserPw(req.getPassword());
                }
                if (req.getUser_tel() != null) {
                    userDO.setUserTel(req.getUser_tel());
                }
                userDO.setIsAdmin(0);
                userDO.setUserName(req.getUsername());
                userMapper.insert(userDO);
                return new BooleanResp(true, "注册成功!");
            } else {
                return new BooleanResp(false, "用户名重复!");
            }
        } else {
            return new BooleanResp(false, "注册失败");
        }
    }
}
