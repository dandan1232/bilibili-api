package top.soft1921.bili.api.common;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :自定义响应码
 */

public enum CustomExceptionEnum {
    /**
     * 错误枚举值
     */
    USER_INPUT_ERROR(400, "您输⼊的数据错误或您没有权限访问资源！"),
    SYSTEM_ERROR(500, "系统出现异常，请您稍后再试或联系管理 员！"),
    OTHER_ERROR(999, "系统出现未知异常，请联系管理员！");

    CustomExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private final int code;
    private final String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

