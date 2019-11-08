package com.example.medical_dream.bean.currculumBean;

import java.util.List;

public class CurriculumBean {



    /**
     * ret : 200
     * info : {"kecheng":[{"id":"44","name":"全国模考（一）视频讲解","class_hour":"17","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-05/5d9812e42b957.jpg","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["持续更新"]},{"id":"37","name":"十年真题详解--内科","class_hour":"26","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-19/5d834d9f97e86.png","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["配套真题书","官方权威","持续更新"]},{"id":"36","name":"二十年真题详解--外科","class_hour":"32","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-20/5d843ba9f1800.png","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["配套真题书","官方权威"]},{"id":"38","name":"北大肖林考研经验分享","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-07-18/5d2fce3ed8cd6.jpg","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["北大学长","经验传授","必听"]},{"id":"34","name":"2020内科呼吸系统","class_hour":"28","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-20/5d8447fd79c8c.jpg","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["最新"]},{"id":"28","name":"内科思维导图","class_hour":"20","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-19/5d8340a8468c1.png","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["最新"]},{"id":"11","name":"2020外科总论","class_hour":"49","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-20/5d845098b87bc.jpg","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["最新","热门"]},{"id":"26","name":"北医协和首医301名师复试指导","class_hour":"8","type":"1","pic":"https://app.yiyanmeng.com:443/Public/user/2019-07-03/5d1c80aa11526.jpg","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":["最新"]},{"id":"27","name":"医学英语术语课程","class_hour":"8","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-07-03/5d1c7ce58d597.jpg","jia_ge":"0.00","yuan_jia_ge":"0.00","price_status":"1","type_str":[]}],"lunbo":[{"id":"27","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15687845345806.jpg","url":"http://www.52bang.club/landing/exam.html "},{"id":"26","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15687840734158.jpg","url":"http://www.52bang.club/landing/exam.html"},{"id":"24","pic":"https://app.yiyanmeng.com:443/Public/lunbo/15687852356215.jpg","url":"http://m.yiyanmeng.com/col.jsp?id=114"}],"gong_gao":[{"id":"5","name":"八月考研高端优惠活动","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/5.html"},{"id":"4","name":"八月份试听课程","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/4.html"},{"id":"3","name":"20医考全年集训","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/3.html"},{"id":"2","name":"2020医考寒假超越计划","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/2.html"},{"id":"1","name":"2019课程设置","url":"https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/1.html"}]}
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
        private List<KechengBean> kecheng;
        private List<LunboBean> lunbo;
        private List<GongGaoBean> gong_gao;

        public List<KechengBean> getKecheng() {
            return kecheng;
        }

        public void setKecheng(List<KechengBean> kecheng) {
            this.kecheng = kecheng;
        }

        public List<LunboBean> getLunbo() {
            return lunbo;
        }

        public void setLunbo(List<LunboBean> lunbo) {
            this.lunbo = lunbo;
        }

        public List<GongGaoBean> getGong_gao() {
            return gong_gao;
        }

        public void setGong_gao(List<GongGaoBean> gong_gao) {
            this.gong_gao = gong_gao;
        }

        public static class KechengBean {
            /**
             * id : 44
             * name : 全国模考（一）视频讲解
             * class_hour : 17
             * type : 0
             * pic : https://app.yiyanmeng.com:443/Public/user/2019-10-05/5d9812e42b957.jpg
             * jia_ge : 0.00
             * yuan_jia_ge : 0.00
             * price_status : 1
             * type_str : ["持续更新"]
             */

            private String id;
            private String name;
            private String class_hour;
            private String type;
            private String pic;
            private String jia_ge;
            private String yuan_jia_ge;
            private String price_status;
            private List<String> type_str;

            @Override
            public String toString() {
                return "KechengBean{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", class_hour='" + class_hour + '\'' +
                        ", type='" + type + '\'' +
                        ", pic='" + pic + '\'' +
                        ", jia_ge='" + jia_ge + '\'' +
                        ", yuan_jia_ge='" + yuan_jia_ge + '\'' +
                        ", price_status='" + price_status + '\'' +
                        ", type_str=" + type_str +
                        '}';
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getClass_hour() {
                return class_hour;
            }

            public void setClass_hour(String class_hour) {
                this.class_hour = class_hour;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getJia_ge() {
                return jia_ge;
            }

            public void setJia_ge(String jia_ge) {
                this.jia_ge = jia_ge;
            }

            public String getYuan_jia_ge() {
                return yuan_jia_ge;
            }

            public void setYuan_jia_ge(String yuan_jia_ge) {
                this.yuan_jia_ge = yuan_jia_ge;
            }

            public String getPrice_status() {
                return price_status;
            }

            public void setPrice_status(String price_status) {
                this.price_status = price_status;
            }

            public List<String> getType_str() {
                return type_str;
            }

            public void setType_str(List<String> type_str) {
                this.type_str = type_str;
            }
        }

        public static class LunboBean {
            /**
             * id : 27
             * pic : https://app.yiyanmeng.com:443/Public/lunbo/15687845345806.jpg
             * url : http://www.52bang.club/landing/exam.html
             */

            private String id;
            private String pic;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class GongGaoBean {
            @Override
            public String toString() {
                return "GongGaoBean{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", url='" + url + '\'' +
                        '}';
            }

            /**
             * id : 5
             * name : 八月考研高端优惠活动
             * url : https://app.yiyanmeng.com:443/index.php/index/gong_gao/id/5.html
             */

            private String id;
            private String name;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
