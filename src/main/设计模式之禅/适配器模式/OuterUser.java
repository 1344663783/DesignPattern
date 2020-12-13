package 设计模式之禅.适配器模式;

import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        return null;
    }

    @Override
    public Map getUserOfficeInfo() {
        return null;
    }

    @Override
    public Map getUserHomeInfo() {
        return null;
    }
}
