package com.example.medical_dream.bean.forum;

import java.util.List;

public class SchoolRlv {

    /**
     * ret : 200
     * info : [{"id":"160","cate_id":"68","title":"医学英语缩写词-心血管系统","ping_num":"9","guan_num":"4","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d25969f06e78.jpg","school_name":"医学英语缩写"},{"id":"159","cate_id":"68","title":"医学英语缩写词-心血管系统（2）","ping_num":"2","guan_num":"1","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d25960bba2d6.jpg","school_name":"医学英语缩写"},{"id":"158","cate_id":"68","title":"医学英语缩写词-心血管系统（3）","ping_num":"4","guan_num":"2","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2595ccccc2c.jpg","school_name":"医学英语缩写"},{"id":"157","cate_id":"68","title":"医学英语缩写词-心血管系统（4）","ping_num":"2","guan_num":"2","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d25957bcb73a.jpg","school_name":"医学英语缩写"},{"id":"156","cate_id":"68","title":"医学英语缩写词-呼吸系统（1）","ping_num":"1","guan_num":"0","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2594dbb15ed.jpg","school_name":"医学英语缩写"},{"id":"155","cate_id":"68","title":"医学英语缩写词-呼吸系统（2）","ping_num":"0","guan_num":"0","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2594945fc59.jpg","school_name":"医学英语缩写"},{"id":"154","cate_id":"68","title":"医学英语缩写词-呼吸系统（3）","ping_num":"2","guan_num":"0","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2594163fc7b.jpg","school_name":"医学英语缩写"},{"id":"153","cate_id":"68","title":"医学英语缩写词-呼吸系统（4）","ping_num":"1","guan_num":"0","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2591f12128b.jpg","school_name":"医学英语缩写"},{"id":"152","cate_id":"68","title":"医学英语缩写词-消化系统","ping_num":"1","guan_num":"2","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2591909c079.jpg","school_name":"医学英语缩写"},{"id":"151","cate_id":"68","title":"医学英语缩写词-神经系统（1）","ping_num":"1","guan_num":"1","thumb":"https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d2590eb5a3e4.jpg","school_name":"医学英语缩写"}]
     * mas : 成功
     */

    private String ret;
    private String mas;
    private List<InfoBean> info;

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * id : 160
         * cate_id : 68
         * title : 医学英语缩写词-心血管系统
         * ping_num : 9
         * guan_num : 4
         * thumb : https://app.yiyanmeng.com:443/Upload/article/2019-07-10/5d25969f06e78.jpg
         * school_name : 医学英语缩写
         */

        private String id;
        private String cate_id;
        private String title;
        private String ping_num;
        private String guan_num;
        private String thumb;
        private String school_name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCate_id() {
            return cate_id;
        }

        public void setCate_id(String cate_id) {
            this.cate_id = cate_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPing_num() {
            return ping_num;
        }

        public void setPing_num(String ping_num) {
            this.ping_num = ping_num;
        }

        public String getGuan_num() {
            return guan_num;
        }

        public void setGuan_num(String guan_num) {
            this.guan_num = guan_num;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getSchool_name() {
            return school_name;
        }

        public void setSchool_name(String school_name) {
            this.school_name = school_name;
        }
    }
}
