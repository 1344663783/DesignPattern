package 设计模式之禅.适配器模式;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("员工姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("员工地址");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工手机号");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工办公室电话");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("员工职位");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工家庭电话");
        return null;
    }
}
