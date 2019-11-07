package com.example.medical_dream.http;

import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.bean.login.regiter.RegisterBean;
import com.example.medical_dream.bean.question.DaysBean;
import com.example.medical_dream.bean.question.TikuBean;

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
}
