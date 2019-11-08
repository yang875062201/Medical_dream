package com.example.medical_dream.ui.activity.denglu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medical_dream.R;
import com.example.medical_dream.app.BaseApp;
import com.example.medical_dream.base.BaseActivity;
import com.example.medical_dream.bean.login.regiter.LoginBean;
import com.example.medical_dream.bean.login.regiter.AuthCodeBean;
import com.example.medical_dream.contract.login.LoginContract;
import com.example.medical_dream.http.Logger;
import com.example.medical_dream.persenter.login.LoginPresente;
import com.example.medical_dream.ui.activity.MainActivity;
import com.example.medical_dream.ui.activity.RegisterActivity;
import com.example.medical_dream.utils.SharedPrefrenceUtils;
import com.example.medical_dream.utils.ToastUtil;

public class LoginActivity extends BaseActivity<LoginContract.LoginView,
        LoginPresente<LoginContract.LoginView>> implements
        LoginContract.LoginView ,View.OnClickListener {

    private RelativeLayout mImg;
    private ImageView mIvBack;
    /**
     * 手机号快速登录
     */
    private TextView mTvQuickLogin;
    private View mViewQuick;
    private View mPosView;
    /**
     * 账号密码登录
     */
    private TextView mTvPassLogin;
    private View mViewPass;
    /**
     * +86
     */
    private TextView mTxt1;
    private View mView1;
    /**
     * 请输入手机号
     */
    private EditText mEtQuickPhone;
    /**
     * 请输入验证码
     */
    private EditText mEtQuickCode;
    private View mView2;
    /**
     * 获取验证码
     */
    private TextView mTvQuickGetCode;
    /**
     * 登录
     */
    private TextView mTvSubmitQuickLogin;
    /**
     * 用户注册
     */
    private TextView mTvQuickRegister;
    private LinearLayout mLlQuick;
    /**
     * 请输入用户名/手机号
     */
    private EditText mEtPhone;
    /**
     * 请输入密码
     */
    private EditText mEtPass;
    /**
     * 登录
     */
    private TextView mTvLogin;
    /**
     * 忘记密码
     */
    private TextView mTvFindPass;
    private View mView;
    /**
     * 用户注册
     */
    private TextView mTvRegister;
    private LinearLayout mLlPass;
    /**
     * 记住密码
     */
    private CheckBox mCheckbox;
    /**
     * 忘记密码
     */
    private TextView mTvFindPass1;
    private RelativeLayout mRl1;
    /**
     * 还没有账号?
     */
    private TextView mTvNoNum;

    final Handler handlerStop = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    times1 = 0;
                    mTvQuickGetCode.setText("获取验证码");
                    handler.removeCallbacks(update_thread);
                    break;
            }
            super.handleMessage(msg);
        }

    };

    Handler handler = new Handler();
    private long times1 = 0;
    Runnable update_thread = new Runnable() {
        @Override
        public void run() {
            times1 = times1 - 1000;
            if (times1 > 0) {
                //倒计时效果展示
                mTvQuickGetCode.setText(times1 / 1000 + "秒重新获取");
                //每一秒执行一次
                handler.postDelayed(this, 1000);
            } else {//倒计时结束
                //处理业务流程

                //发送消息，结束倒计时
                Message message = new Message();
                message.what = 1;
                handlerStop.sendMessage(message);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    @Override
    protected void initData() {

    }
    @Override
    protected void initView() {
        mImg = (RelativeLayout) findViewById(R.id.img);
        mImg.setOnClickListener(this);
        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvBack.setOnClickListener(this);
        mTvQuickLogin = (TextView) findViewById(R.id.tv_quick_login);
        mTvQuickLogin.setOnClickListener(this);
        mViewQuick = (View) findViewById(R.id.view_quick);
        mViewQuick.setOnClickListener(this);
        mPosView = (View) findViewById(R.id.pos_view);
        mPosView.setOnClickListener(this);
        mTvPassLogin = (TextView) findViewById(R.id.tv_pass_login);
        mTvPassLogin.setOnClickListener(this);
        mViewPass = (View) findViewById(R.id.view_pass);
        mViewPass.setOnClickListener(this);
        mTxt1 = (TextView) findViewById(R.id.txt1);
        mTxt1.setOnClickListener(this);
        mView1 = (View) findViewById(R.id.view1);
        mView1.setOnClickListener(this);
        mEtQuickPhone = (EditText) findViewById(R.id.et_quick_phone);
        mEtQuickPhone.setOnClickListener(this);
        mEtQuickCode = (EditText) findViewById(R.id.et_quick_code);
        mEtQuickCode.setOnClickListener(this);
        mView2 = (View) findViewById(R.id.view2);
        mView2.setOnClickListener(this);
        mTvQuickGetCode = (TextView) findViewById(R.id.tv_quick_get_code);
        mTvQuickGetCode.setOnClickListener(this);
        mTvSubmitQuickLogin = (TextView) findViewById(R.id.tv_submit_quick_login);
        mTvSubmitQuickLogin.setOnClickListener(this);
        mTvQuickRegister = (TextView) findViewById(R.id.tv_quick_register);
        mTvQuickRegister.setOnClickListener(this);
        mLlQuick = (LinearLayout) findViewById(R.id.ll_quick);
        mLlQuick.setOnClickListener(this);
        mEtPhone = (EditText) findViewById(R.id.et_phone);
        mEtPhone.setOnClickListener(this);
        mEtPass = (EditText) findViewById(R.id.et_pass);
        mEtPass.setOnClickListener(this);
        mTvLogin = (TextView) findViewById(R.id.tv_login);
        mTvLogin.setOnClickListener(this);
        mTvFindPass = (TextView) findViewById(R.id.tv_find_pass);
        mTvFindPass.setOnClickListener(this);
        mView = (View) findViewById(R.id.view);
        mView.setOnClickListener(this);
        mTvRegister = (TextView) findViewById(R.id.tv_register);
        mTvRegister.setOnClickListener(this);
        mLlPass = (LinearLayout) findViewById(R.id.ll_pass);
        mLlPass.setOnClickListener(this);
        mCheckbox = (CheckBox) findViewById(R.id.checkbox);
        mCheckbox.setOnClickListener(this);
        mTvFindPass1 = (TextView) findViewById(R.id.tv_find_pass_1);
        mTvFindPass1.setOnClickListener(this);
        mRl1 = (RelativeLayout) findViewById(R.id.rl_1);
        mRl1.setOnClickListener(this);
        mTvNoNum = (TextView) findViewById(R.id.tv_no_num);
        mTvNoNum.setOnClickListener(this);
        mTvQuickGetCode.setText("获取验证码");
    }

    @Override
    protected int createLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.iv_back:
               
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                break;
            case R.id.tv_quick_login:
                mLlQuick.setVisibility(View.VISIBLE);
                mViewQuick.setVisibility(View.VISIBLE);
                mLlPass.setVisibility(View.GONE);
                mViewPass.setVisibility(View.GONE);
                break;
            case R.id.tv_pass_login:
                mLlPass.setVisibility(View.VISIBLE);
                mViewPass.setVisibility(View.VISIBLE);
                mLlQuick.setVisibility(View.GONE);
                mViewQuick.setVisibility(View.GONE);
                break;
            case R.id.tv_register:
//                timerUtil.cancelTimer();
                handler.removeCallbacks(update_thread);
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.tv_login:
                String phone = mEtPhone.getText().toString();
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String pass =mEtPass.getText().toString();
                if (TextUtils.isEmpty(pass)) {
                    ToastUtil.showShort("密码不能为空");
                    return;
                }
                mPersenter.getDatapass(phone,pass);

                break;
            case R.id.tv_find_pass:

                startActivity(new Intent(this, FindPassActivity.class));
                break;
            //快速登录
            case R.id.tv_quick_get_code:
                phone = mEtQuickPhone.getText().toString();
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                times1 = 60000;
                mPersenter.getcode(phone);
                handler.postDelayed(update_thread, 0);

//                timerUtil.timersStart();
                break;
            case R.id.tv_submit_quick_login:
                phone = mEtQuickPhone.getText().toString();
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                String code = mEtQuickCode.getText().toString();
                if (TextUtils.isEmpty(code)) {
                    Toast.makeText(this, "验证码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPersenter.getCode(phone,code);

                break;
            case R.id.tv_quick_register:
//                timerUtil.cancelTimer();
                times1 = 0;
                handler.removeCallbacks(update_thread);
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }


    @Override
    protected LoginPresente<LoginContract.LoginView> createPersenter() {
        return new LoginPresente<>();
    }

    @Override
    public void getData(LoginBean loginBean) {
        Logger.log("loginBeanbean",loginBean.toString());
        if (loginBean.getRet().equals("200")){

            BaseApp.access_token=loginBean.getInfo().getToken().getAccess_token();
            BaseApp.isLogin=true;
            SharedPrefrenceUtils.putSharePre(LoginActivity.this,"access_token",loginBean.getInfo().getToken().getAccess_token());
            SharedPrefrenceUtils.putSharePre(LoginActivity.this,"isLogin",true);
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
        }else {
            ToastUtil.showShort("登录失败");
        }
    }

    @Override
    public void getCode(LoginBean loginBean) {
        Logger.log("loginBeanbean",loginBean.toString());
        if (loginBean.getRet().equals("200")){
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
        }else {
            ToastUtil.showShort("登录失败");
        }
    }

    @Override
    public void getcode(AuthCodeBean authCodeBean) {
        ToastUtil.showShort(authCodeBean.getMas());
    }

    @Override
    public void onError(String error) {

    }
}
