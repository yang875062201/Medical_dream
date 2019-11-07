package com.example.medical_dream.bean.login.regiter;

public class AuthCodeBean {


    /**
     * info : {"code":912171,"msg":"短信发送成功","type":"ture"}
     * mas : 成功
     * ret : 200
     */

    private String info;
    private String mas;
    private String ret;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }
}
