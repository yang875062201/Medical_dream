package com.example.medical_dream.bean.question;

public class DaysBean {

    /**
     * ret : 200
     * info : {"tian":44,"time":"2019-12-21 00:00:00","xiao":{"id":"161","name":"解放军医学院"},"headBgImage":"","blessing":"经过持续不断的更新，医研梦在您的陪伴下逐渐完善，功能也逐渐丰富起来"}
     * mas : 成功!
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
         * tian : 44
         * time : 2019-12-21 00:00:00
         * xiao : {"id":"161","name":"解放军医学院"}
         * headBgImage :
         * blessing : 经过持续不断的更新，医研梦在您的陪伴下逐渐完善，功能也逐渐丰富起来
         */

        private int tian;
        private String time;
        private XiaoBean xiao;
        private String headBgImage;
        private String blessing;

        @Override
        public String toString() {
            return "InfoBean{" +
                    "tian=" + tian +
                    ", time='" + time + '\'' +
                    ", xiao=" + xiao +
                    ", headBgImage='" + headBgImage + '\'' +
                    ", blessing='" + blessing + '\'' +
                    '}';
        }

        public int getTian() {
            return tian;
        }

        public void setTian(int tian) {
            this.tian = tian;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public XiaoBean getXiao() {
            return xiao;
        }

        public void setXiao(XiaoBean xiao) {
            this.xiao = xiao;
        }

        public String getHeadBgImage() {
            return headBgImage;
        }

        public void setHeadBgImage(String headBgImage) {
            this.headBgImage = headBgImage;
        }

        public String getBlessing() {
            return blessing;
        }

        public void setBlessing(String blessing) {
            this.blessing = blessing;
        }

        public static class XiaoBean {
            /**
             * id : 161
             * name : 解放军医学院
             */

            private String id;
            private String name;

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
        }
    }
}
