package com.conpany.project;

import com.company.project.dao.UserInfoMapper;
import com.company.project.model.UserInfo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @author : LiuYang
 * @date : 2020/4/2
 */
public class UnitTest  extends Tester{

    @Autowired
    private static SqlSessionFactory mSessionFactory;
    @Test
    public void testSelectGetName(){
        //获取sqlSession
        SqlSession sqlSession = mSessionFactory.openSession();
        try {
            UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
            Long id = Long.valueOf("1");
            List<UserInfo> name = mapper.getName(id);

            Assert.assertEquals(1,name.size());
        }catch (SqlSessionException e){
                throw e;
        }finally {
            //关闭sqlSession
            sqlSession.close();
        }

    }
}
