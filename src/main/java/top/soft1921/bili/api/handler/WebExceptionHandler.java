package top.soft1921.bili.api.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.soft1921.bili.api.common.AjaxResponse;
import top.soft1921.bili.api.common.CustomExceptionEnum;
import top.soft1921.bili.api.exception.CustomException;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/8
 * @description :
 */

@ControllerAdvice(basePackages = "top.soft1921.bili.api.controller")
@Slf4j
public class WebExceptionHandler {
    /**
     * 处理程序员主动转换的⾃定义异常
     *
     * @param e ⾃定义异常对象
     * @return 统⼀响应对象
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse customerException(CustomException
                                                  e) {
        if (e.getCode() ==
                CustomExceptionEnum.SYSTEM_ERROR.getCode()) {
            //将500异常信息持久化处理，⽅便运维⼈员处理
            log.error(e.getMessage());
        }
        return AjaxResponse.error(e);
    }

    /**
     * 处理程序员在程序中未能捕获（遗漏的）异常
     *
     * @param e ⾃定义异常对象
     * @return 统⼀响应对象
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e) {
        //将异常信息持久化处理，⽅便运维⼈员处理
        log.error(e.getMessage());
        return AjaxResponse.error(new CustomException(
                CustomExceptionEnum.OTHER_ERROR));
    }
}