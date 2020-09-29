 class User {
    int keyCode;
    int password;
    float money;

    public User (int sKeyCode, int sPassword, float sMoney)
    {
        this.keyCode = sKeyCode;
        this.password = sPassword;
        this.money = sMoney;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}