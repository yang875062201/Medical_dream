package com.example.medical_dream.bean.login.regiter;

public class LoginBean {

    /**
     * info : {"token":{"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTUwMiIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzQ5MjEyNn0.9aa8PTNh8oTuiLPT5pktf4AQoq7KrSpKhDBSJTvuWnI","expires":"2021-10-06 11:48:46","refreshTokenExpires":"2020-09-01 11:48:46","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTUwMiIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTU5ODkzMjEyNn0.oBrU4p5F5RQ8gUyWlt-NbFrxakl_VDbwWn7T9XvceR0"},"user_info":{"id":"21502","pass":"e10adc3949ba59abbe56e057f20f883e","phnoe":"18161629697","u_name":"YYM_5bgL5wPa_","u_pic":"https://app.yiyanmeng.com:443/Public/user/","xinxi":"0"}}
     * mas : 成功
     * ret : 200
     */

    private InfoBean info;
    private String mas;
    private String ret;

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

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public static class InfoBean {
        /**
         * token : {"access_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTUwMiIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzQ5MjEyNn0.9aa8PTNh8oTuiLPT5pktf4AQoq7KrSpKhDBSJTvuWnI","expires":"2021-10-06 11:48:46","refreshTokenExpires":"2020-09-01 11:48:46","refresh_token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTUwMiIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTU5ODkzMjEyNn0.oBrU4p5F5RQ8gUyWlt-NbFrxakl_VDbwWn7T9XvceR0"}
         * user_info : {"id":"21502","pass":"e10adc3949ba59abbe56e057f20f883e","phnoe":"18161629697","u_name":"YYM_5bgL5wPa_","u_pic":"https://app.yiyanmeng.com:443/Public/user/","xinxi":"0"}
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
             * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTUwMiIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTYzMzQ5MjEyNn0.9aa8PTNh8oTuiLPT5pktf4AQoq7KrSpKhDBSJTvuWnI
             * expires : 2021-10-06 11:48:46
             * refreshTokenExpires : 2020-09-01 11:48:46
             * refresh_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1aWQiOiIyMTUwMiIsInR5cGUiOiJQb3N0bWFuUnVudGltZVwvNy4xOS4wIiwidGltZSI6MTU5ODkzMjEyNn0.oBrU4p5F5RQ8gUyWlt-NbFrxakl_VDbwWn7T9XvceR0
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
             * phnoe : 18161629697
             * u_name : YYM_5bgL5wPa_
             * u_pic : https://app.yiyanmeng.com:443/Public/user/
             * xinxi : 0
             */

            private String id;
            private String pass;
            private String phnoe;
            private String u_name;
            private String u_pic;
            private String xinxi;

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

            public String getPhnoe() {
                return phnoe;
            }

            public void setPhnoe(String phnoe) {
                this.phnoe = phnoe;
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

            public String getXinxi() {
                return xinxi;
            }

            public void setXinxi(String xinxi) {
                this.xinxi = xinxi;
            }

            @Override
            public String toString() {
                return "UserInfoBean{" +
                        "id='" + id + '\'' +
                        ", pass='" + pass + '\'' +
                        ", phnoe='" + phnoe + '\'' +
                        ", u_name='" + u_name + '\'' +
                        ", u_pic='" + u_pic + '\'' +
                        ", xinxi='" + xinxi + '\'' +
                        '}';
            }
        }

        public InfoBean(TokenBean token, UserInfoBean user_info) {
            this.token = token;
            this.user_info = user_info;
        }
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "info=" + info +
                ", mas='" + mas + '\'' +
                ", ret='" + ret + '\'' +
                '}';
    }
}
