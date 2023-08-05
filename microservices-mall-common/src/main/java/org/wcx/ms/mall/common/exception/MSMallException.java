package org.wcx.ms.mall.common.exception;

/**
 *
 * @author wcx
 * @date 2023/8/5 21:29
 */
public class MSMallException extends RuntimeException {
    private final Integer code;
    private final String message;

    public MSMallException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public MSMallException(MSMallExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
