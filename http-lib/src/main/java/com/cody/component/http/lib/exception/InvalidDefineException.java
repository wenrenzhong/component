/*
 * ************************************************************
 * 文件：InvalidDefineException.java  模块：http-lib  项目：component
 * 当前修改时间：2019年04月23日 18:23:19
 * 上次修改时间：2019年04月13日 08:43:54
 * 作者：Cody.yi   https://github.com/codyer
 *
 * 描述：http-lib
 * Copyright (c) 2019
 * ************************************************************
 */

package com.cody.component.http.lib.exception;


import com.cody.component.http.lib.config.HttpCode;
import com.cody.component.http.lib.exception.base.BaseException;

/**
 * Created by xu.yi. on 2019/4/6.
 * 用注解 @Domain("http://www.abc.com/")注解接口定义
 */
public class InvalidDefineException extends BaseException {

    private static final long serialVersionUID = -1004291191431701343L;

    public InvalidDefineException() {
        super(HttpCode.CODE_DOMAIN_DEFINE_INVALID, "Domain注解未定义在接口上");
    }

}