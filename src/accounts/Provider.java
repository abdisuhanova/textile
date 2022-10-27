package accounts;

public class Provider {
    private String keyWord;
    private int password;
    static int count = 0;
    public Provider(String keyWord, int password) {
        this.keyWord = keyWord;
        this.password = password;
        count ++;
    }

    public int getPassword() {
        return password;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
