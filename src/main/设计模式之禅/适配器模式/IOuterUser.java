package 设计模式之禅.适配器模式;

import java.util.Map;

/**
 * 外系统的人员信息
 */
public interface IOuterUser {
    //基本信息，比如名称，性别，手机号码了等
    public Map getUserBaseInfo();

    //工作区域信息
    public Map getUserOfficeInfo();

    //用户的家庭信息
    public Map getUserHomeInfo();
}
