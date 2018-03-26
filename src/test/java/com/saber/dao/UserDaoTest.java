package com.saber.dao;

import com.saber.BaseTest;
import com.saber.zq.dao.SysUserMapper;
import com.saber.zq.entity.SysUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Archar on 2018/3/26.
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    public void testQueryById() throws Exception {
        long bookId = 1000;
        SysUser user = sysUserMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
