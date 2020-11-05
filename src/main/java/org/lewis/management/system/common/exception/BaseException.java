package org.lewis.management.system.common.exception;


/**
 * @author : lewis[1005859278@qq.com]
 * @date : 2020/11/4
 * @desc :
 */
public class BaseException extends RuntimeException{

    private static final int code = 00000;
    private static final long serialVersion = -5679241599209889046L;

    protected Integer errorCode;

    public BaseException(String message) {
        super(message);
    }

    public BaseException of(String message){
        BaseException baseException = new BaseException(message);
        baseException.errorCode = code;
        return baseException;
    }
}
