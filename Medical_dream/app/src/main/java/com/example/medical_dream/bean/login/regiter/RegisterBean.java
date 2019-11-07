package com.example.medical_dream.bean.login.regiter;

public class RegisterBean {

    /**
     * ret : 200
     * info : {"token":{"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjIxNTAyLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzM2MTYyNzB9.LpLmQsXSYTmiX-CQnGOa9fCFg42IU1mWAzofTIBsXno","expires":"2019-11-13 11:37:50","refreshTokenExpires":"2019-12-06 11:37:50","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjIxNTAyLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzU2MDM0NzB9.i_347V-slk_YKd74dRCa9wJCuEMXOKk0XlAYi94cdoU"},"user_info":{"id":"21502","pass":"e10adc3949ba59abbe56e057f20f883e","u_name":"YYM_5bgL5wPa_","u_pic":"https://app.yiyanmeng.com:443/Public/user/","phnoe":"18161629697","sex":null,"yu_bao_ming":null,"xinxi":0}}
     * mas : 成功
     */

    private String ret;
    private InfoBean info;
    private String mas;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public static class InfoBean {
        /**
         * token : {"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjIxNTAyLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzM2MTYyNzB9.LpLmQsXSYTmiX-CQnGOa9fCFg42IU1mWAzofTIBsXno","expires":"2019-11-13 11:37:50","refreshTokenExpires":"2019-12-06 11:37:50","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjIxNTAyLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzU2MDM0NzB9.i_347V-slk_YKd74dRCa9wJCuEMXOKk0XlAYi94cdoU"}
         * user_info : {"id":"21502","pass":"e10adc3949ba59abbe56e057f20f883e","u_name":"YYM_5bgL5wPa_","u_pic":"https://app.yiyanmeng.com:443/Public/user/","phnoe":"18161629697","sex":null,"yu_bao_ming":null,"xinxi":0}
         */

        private TokenBean token;
        private UserInfoBean user_info;

        public TokenBean getToken() {
            return token;
        }

        public void setToken(TokenBean token) {
            this.token = token;
        }

        public UserInfoBean getUser_info() {
            return user_info;
        }

        public void setUser_info(UserInfoBean user_info) {
            this.user_info = user_info;
        }

        public static class TokenBean {
            /**
             * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjIxNTAyLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzM2MTYyNzB9.LpLmQsXSYTmiX-CQnGOa9fCFg42IU1mWAzofTIBsXno
             * expires : 2019-11-13 11:37:50
             * refreshTokenExpires : 2019-12-06 11:37:50
             * refresh_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjIxNTAyLCJ0eXBlIjoiUG9zdG1hblJ1bnRpbWVcLzcuMTkuMCIsInRpbWUiOjE1NzU2MDM0NzB9.i_347V-slk_YKd74dRCa9wJCuEMXOKk0XlAYi94cdoU
             */

            private String access_token;
            private String expires;
            private String refreshTokenExpires;
            private String refresh_token;

            public String getAccess_token() {
                return access_token;
            }

            public void setAccess_token(String access_token) {
                this.access_token = access_token;
            }

            public String getExpires() {
                return expires;
            }

            public void setExpires(String expires) {
                this.expires = expires;
            }

            public String getRefreshTokenExpires() {
                return refreshTokenExpires;
            }

            public void setRefreshTokenExpires(String refreshTokenExpires) {
                this.refreshTokenExpires = refreshTokenExpires;
            }

            public String getRefresh_token() {
                return refresh_token;
            }

            public void setRefresh_token(String refresh_token) {
                this.refresh_token = refresh_token;
            }
        }

        public static class UserInfoBean {
            /**
             * id : 21502
             * pass : e10adc3949ba59abbe56e057f20f883e
             * u_name : YYM_5bgL5wPa_
             * u_pic : https://app.yiyanmeng.com:443/Public/user/
             * phnoe : 18161629697
             * sex : null
             * yu_bao_ming : null
             * xinxi : 0
             */

            private String id;
            private String pass;
            private String u_name;
            private String u_pic;
            private String phnoe;
            private Object sex;
            private Object yu_bao_ming;
            private int xinxi;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPass() {
                return pass;
            }

            public void setPass(String pass) {
                this.pass = pass;
            }

            public String getU_name() {
                return u_name;
            }

            public void setU_name(String u_name) {
                this.u_name = u_name;
            }

            public String getU_pic() {
                return u_pic;
            }

            public void setU_pic(String u_pic) {
                this.u_pic = u_pic;
            }

            public String getPhnoe() {
                return phnoe;
            }

            public void setPhnoe(String phnoe) {
                this.phnoe = phnoe;
            }

            public Object getSex() {
                return sex;
            }

            public void setSex(Object sex) {
                this.sex = sex;
            }

            public Object getYu_bao_ming() {
                return yu_bao_ming;
            }

            public void setYu_bao_ming(Object yu_bao_ming) {
                this.yu_bao_ming = yu_bao_ming;
            }

            public int getXinxi() {
                return xinxi;
            }

            public void setXinxi(int xinxi) {
                this.xinxi = xinxi;
            }
        }
    }
}
