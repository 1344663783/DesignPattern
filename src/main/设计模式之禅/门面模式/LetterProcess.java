package 设计模式之禅.门面模式;

public interface LetterProcess {
    //首先要写信的内容
    public void writeContext(String context);

    //其次写封信
    public void fillEnvelope(String address);

    //把信放到信封里
    public void letterInotoEnvelope();

    //然后邮递
    public void sendLetter();
}
