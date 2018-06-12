package com.wmj.utils;

public enum RespCodeEnum {
    SUCCESS("000", "成功"),
    PARAM_CODE_ERR("001","请求参数错误"),
    PASSWORD_ERROR("002","密码错误"),
    PHONE_EXIST_ERROR("003","该手机号已被注册"),

    SYSTEM_ERROR("999", "系统异常"),


            ;
    private String code;
    private String desc;

    /**
     * @param code
     * @param desc
     */
    private RespCodeEnum(String code, String desc) {
        this.code =code;
        this.desc =desc;
    }



    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
