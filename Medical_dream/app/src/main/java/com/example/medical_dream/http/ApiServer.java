package com.example.medical_dream.http;

import com.example.medical_dream.bean.currculumBean.CurriculumBean;
import com.example.medical_dream.bean.forum.ExperienceBean;
import com.example.medical_dream.bean.forum.OfficialBean;
import com.example.medical_dream.bean.forum.SchoolRlv;
import com.example.medical_dream.bean.forum.SchoolTab;
import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.bean.login.regiter.RegisterBean;
import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;
import com.example.medical_dream.bean.shopping.AllBean;
import com.example.medical_dream.bean.shopping.BookBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiServer {
    String Url="https://app.yiyanmeng.com/index.php/";

    //账号密码登录
    //login/login
    @POST("login/login")
    @FormUrlEncoded
    Observable<LoginBean> getLogin(@Field("name")String name,@Field("pass")String pass);
    @POST("login/login")
    @FormUrlEncoded
    Observable<LoginBean> getZLogin(@Field("type")String type, @Field("phnoe")String phnoe, @Field("code")String code);

    //获取验证码
    //https://app.yiyanmeng.com/index.php/paywx/massage
    @POST("paywx/massage")
    @FormUrlEncoded
    Observable<AuthCodeBean> getCode(@Field("phnoe")String phone, @Field("type")String type);
    //注册
    //https://app.yiyanmeng.com/index.php//login/login_zhuce
    @POST("login/login_zhuce")
    @FormUrlEncoded
    Observable<RegisterBean> getregister(@Field("name")String name, @Field("phnoe")String phnoe,@Field("code")String code,@Field("pass")String pass);

    //找回密码
    //https://app.yiyanmeng.com/index.php/paywx/massage
    @POST("login/edit_phnoe")
    @FormUrlEncoded
    Observable<FindPassBean> getPass(@Field("phnoe")String phone,  @Field("y_pass")String y_pass,@Field("c_pass")String c_pass,@Field("code")String code);

    //天数
    //https://app.yiyanmeng.com/index.php/
    @GET("user/get_tian")
    Observable<DaysBean> getDays(@Header("A-uthorization")String header);

    //题库
    //https://app.yiyanmeng.com/index.php/
    @GET("Shiti/ti_type_list")
    Observable<TikuBean> getTiku(@Header("A-uthorization")String header);

    //未写


    //question 签到
    //https://app.yiyanmeng.com/index.php/signin/signin_add
    @GET("signin/signin_add")
    Observable<TikuBean> getSignin(@Header("A-uthorization")String header);

    //shopping
    //全部
    @POST("shop/get_shop_and_vedio_list")
    @FormUrlEncoded
    Observable<AllBean> getAll(@Header("A-uthorization")String header,@Field("start")String start,@Field("end")String end);
    //图书
    @POST("shop/get_shop_list")
    @FormUrlEncoded
    Observable<BookBean> getBook(@Header("A-uthorization")String header, @Field("p")String p);
    //课程
    @POST("kecheng/ke_index_list")
    @FormUrlEncoded
    Observable<AllBean> getCourse(@Header("A-uthorization")String header,@Field("p")String p);

    //Curriculum
    @POST("kecheng/ke_index_list")
    @FormUrlEncoded
    Observable<CurriculumBean> getCurriculum(@Header("A-uthorization")String header, @Field("type")String type,@Field("p")String p);


    //Forum
    // tab学校
    @POST("forumsc/type_select")
    @FormUrlEncoded

    Observable<SchoolTab> getSchoolTab(@Header("A-uthorization")String header, @Field("p")String p);
    // rlv学校
    @POST("forumsc/article_select")
    @FormUrlEncoded
    Observable<SchoolRlv> getSchoolRlv(@Header("A-uthorization")String header, @Field("id")String id, @Field("p")String p);

    //官方论坛
    @POST("forum/official_index")
    @FormUrlEncoded
    Observable<OfficialBean> getOffcial(@Header("A-uthorization")String header, @Field("p")String p);
    //经验论坛
    // forumjy/forum_jy_index
    @POST("forumjy/forum_jy_index")
    @FormUrlEncoded
    Observable<ExperienceBean> getExperience(@Header("A-uthorization")String header, @Field("p")String p);

}
