package com.example.medical_dream.bean.shopping;

import java.util.List;

public class AllBean {


    /**
     * ret : 200
     * info : {"start":20,"end":20,"shop":[{"id":"56","name":"全套押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg","hao_ping":"5","xian_price":"580.00","re_mai":"1"},{"id":"57","name":"内 外 人文套餐","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/39a35ec6110fe0fb26b83605c8f57c5c.jpg","hao_ping":"5","xian_price":"300.00","re_mai":"1"},{"id":"55","name":"小三门套餐","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/4e00edfd89206f054b13fedc43f09218.jpg","hao_ping":"5","xian_price":"280.00","re_mai":"1"},{"id":"59","name":"外科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/276d87c91096e7e6fedd52bde25fbaa6.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"58","name":"内科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/f0e97cc2ad56d9eba055523ad0f46af9.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"54","name":"生化三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/64e9e546d43df67eab17b0e0f9ee21ca.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"53","name":"生理三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/8c3cd864cf18c7d015ba8627e770d55c.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"52","name":"病理三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/0f4dcd8a79ef610dafa6b2b2b5f13bab.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"51","name":"十天玩转内科","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/9ee3ce397e80bf2912772b4b6d55e7aa.jpg","hao_ping":"5","xian_price":"79.00","re_mai":"1"},{"id":"42","name":"2020马上爱内科","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/440bf4d06388b777c127257716783ad5.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"}],"course":[{"id":"45","name":"三科冲刺押题","class_hour":"0","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68c259c62a.jpg","jia_ge":"6800.00","yuan_jia_ge":"6800.00","price_status":"0","type_str":["最新","冲刺阶段",""]},{"id":"46","name":"西综冲刺押题","class_hour":"0","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68cded9ebf.jpg","jia_ge":"5800.00","yuan_jia_ge":"5800.00","price_status":"0","type_str":["最新"," 冲刺阶段",""]},{"id":"43","name":"面授课程咨询","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d1e38b125.jpg","jia_ge":"1.00","yuan_jia_ge":"1.00","price_status":"0","type_str":["","咨询课程","免费试学"]},{"id":"41","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d105d8b5a.jpg","jia_ge":"13990.00","yuan_jia_ge":"14990.00","price_status":"0","type_str":["三科直播课",""]},{"id":"42","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d15d1386f.jpg","jia_ge":"10990.00","yuan_jia_ge":"11990.00","price_status":"0","type_str":["西综直播课"]},{"id":"39","name":"三科百天冲刺直播","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cfcf3b87b.jpg","jia_ge":"9500.00","yuan_jia_ge":"10000.00","price_status":"0","type_str":["","百天冲刺"]},{"id":"30","name":"西综百天冲刺直播","class_hour":"64","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cf6bca5ec.jpg","jia_ge":"7500.00","yuan_jia_ge":"8000.00","price_status":"0","type_str":["百天冲刺",""]},{"id":"32","name":"无忧视频课-三科全程","class_hour":"28","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cb9366ce9.jpg","jia_ge":"1680.00","yuan_jia_ge":"1780.00","price_status":"0","type_str":["三科无忧",""]},{"id":"40","name":"无忧视频课-西综无忧","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d0635f78b.jpg","jia_ge":"1080.00","yuan_jia_ge":"1180.00","price_status":"0","type_str":["西综无忧"]}]}
     * mas : 成功!!
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
         * start : 20
         * end : 20
         * shop : [{"id":"56","name":"全套押题三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg","hao_ping":"5","xian_price":"580.00","re_mai":"1"},{"id":"57","name":"内 外 人文套餐","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/39a35ec6110fe0fb26b83605c8f57c5c.jpg","hao_ping":"5","xian_price":"300.00","re_mai":"1"},{"id":"55","name":"小三门套餐","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/4e00edfd89206f054b13fedc43f09218.jpg","hao_ping":"5","xian_price":"280.00","re_mai":"1"},{"id":"59","name":"外科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/276d87c91096e7e6fedd52bde25fbaa6.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"58","name":"内科三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/f0e97cc2ad56d9eba055523ad0f46af9.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"},{"id":"54","name":"生化三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/64e9e546d43df67eab17b0e0f9ee21ca.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"53","name":"生理三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/8c3cd864cf18c7d015ba8627e770d55c.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"52","name":"病理三套卷","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/0f4dcd8a79ef610dafa6b2b2b5f13bab.jpg","hao_ping":"5","xian_price":"99.00","re_mai":"1"},{"id":"51","name":"十天玩转内科","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/9ee3ce397e80bf2912772b4b6d55e7aa.jpg","hao_ping":"5","xian_price":"79.00","re_mai":"1"},{"id":"42","name":"2020马上爱内科","pic":"https://app.yiyanmeng.com:443/Public/shop_xiang_qing/440bf4d06388b777c127257716783ad5.jpg","hao_ping":"5","xian_price":"109.00","re_mai":"1"}]
         * course : [{"id":"45","name":"三科冲刺押题","class_hour":"0","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68c259c62a.jpg","jia_ge":"6800.00","yuan_jia_ge":"6800.00","price_status":"0","type_str":["最新","冲刺阶段",""]},{"id":"46","name":"西综冲刺押题","class_hour":"0","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68cded9ebf.jpg","jia_ge":"5800.00","yuan_jia_ge":"5800.00","price_status":"0","type_str":["最新"," 冲刺阶段",""]},{"id":"43","name":"面授课程咨询","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d1e38b125.jpg","jia_ge":"1.00","yuan_jia_ge":"1.00","price_status":"0","type_str":["","咨询课程","免费试学"]},{"id":"41","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d105d8b5a.jpg","jia_ge":"13990.00","yuan_jia_ge":"14990.00","price_status":"0","type_str":["三科直播课",""]},{"id":"42","name":"2021雏鹰计划","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d15d1386f.jpg","jia_ge":"10990.00","yuan_jia_ge":"11990.00","price_status":"0","type_str":["西综直播课"]},{"id":"39","name":"三科百天冲刺直播","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cfcf3b87b.jpg","jia_ge":"9500.00","yuan_jia_ge":"10000.00","price_status":"0","type_str":["","百天冲刺"]},{"id":"30","name":"西综百天冲刺直播","class_hour":"64","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cf6bca5ec.jpg","jia_ge":"7500.00","yuan_jia_ge":"8000.00","price_status":"0","type_str":["百天冲刺",""]},{"id":"32","name":"无忧视频课-三科全程","class_hour":"28","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86cb9366ce9.jpg","jia_ge":"1680.00","yuan_jia_ge":"1780.00","price_status":"0","type_str":["三科无忧",""]},{"id":"40","name":"无忧视频课-西综无忧","class_hour":"1","type":"0","pic":"https://app.yiyanmeng.com:443/Public/user/2019-09-22/5d86d0635f78b.jpg","jia_ge":"1080.00","yuan_jia_ge":"1180.00","price_status":"0","type_str":["西综无忧"]}]
         */

        private int start;
        private int end;
        private List<ShopBean> shop;
        private List<CourseBean> course;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public List<ShopBean> getShop() {
            return shop;
        }

        public void setShop(List<ShopBean> shop) {
            this.shop = shop;
        }

        public List<CourseBean> getCourse() {
            return course;
        }

        public void setCourse(List<CourseBean> course) {
            this.course = course;
        }

        public static class ShopBean {
            /**
             * id : 56
             * name : 全套押题三套卷
             * pic : https://app.yiyanmeng.com:443/Public/shop_xiang_qing/e5f0fbf1916f3aa646d2749b72f7688c.jpg
             * hao_ping : 5
             * xian_price : 580.00
             * re_mai : 1
             */

            private String id;
            private String name;
            private String pic;
            private String hao_ping;
            private String xian_price;
            private String re_mai;

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

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getHao_ping() {
                return hao_ping;
            }

            public void setHao_ping(String hao_ping) {
                this.hao_ping = hao_ping;
            }

            public String getXian_price() {
                return xian_price;
            }

            public void setXian_price(String xian_price) {
                this.xian_price = xian_price;
            }

            public String getRe_mai() {
                return re_mai;
            }

            public void setRe_mai(String re_mai) {
                this.re_mai = re_mai;
            }
        }

        public static class CourseBean {
            /**
             * id : 45
             * name : 三科冲刺押题
             * class_hour : 0
             * type : 0
             * pic : https://app.yiyanmeng.com:443/Public/user/2019-10-28/5db68c259c62a.jpg
             * jia_ge : 6800.00
             * yuan_jia_ge : 6800.00
             * price_status : 0
             * type_str : ["最新","冲刺阶段",""]
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
    }
}
