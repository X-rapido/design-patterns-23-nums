package com.example.实例2.enums;


import java.util.HashMap;
import java.util.Map;

public enum ItemFactoryEnum {

    A("A_Req", "A_ItemRequestHandler", "A请求"),
    B("B_Req", "B_ItemRequestHandler", "B请求");

    /**
     * 添加缓存
     */
    private static final Map<String, ItemFactoryEnum> map = new HashMap<>();

    static {
        for (ItemFactoryEnum type : ItemFactoryEnum.values()) {
            map.put(type.type, type);
        }
    }

    public static String getValue(String value) {
        if (null != map.get(value)) {
            return map.get(value).getMethodName();
        }
        return null;
    }

    ItemFactoryEnum(String type, String methodName, String desc) {
        this.type = type;
        this.methodName = methodName;
        this.desc = desc;
    }

    /**
     * 类型
     */
    private String type;

    /**
     * 方法名称
     */
    private String methodName;
    /**
     * 方法描述
     */
    private String desc;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
