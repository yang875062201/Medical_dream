package com.example.medical_dream.ui.activity.denglu;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseActivity;
import com.example.medical_dream.bean.login.regiter.FindPassBean;
import com.example.medical_dream.contract.login.FindPassContract;
import com.example.medical_dream.persenter.login.FindPassPresente;
import com.example.medical_dream.utils.ToastUtil;

public class FindPassActivity extends BaseActivity<FindPassContract.FindPassView,
        FindPassPresente<FindPassContract.FindPassView>> implements
        FindPassContract.FindPassView, View.OnClickListener {


    private ImageView mIvBack;
    /**
     * 忘记密码
     */
    private TextView mTvTitle;
    private TextView mTvRight;
    private ImageView mImageRight;
    private RelativeLayout mRl;
    /**
     * +86
     */
    private TextView mTxt1;
    private View mView1;
    /**
     * 请输入手机号
     */
    private EditText mEtPhone;
    /**
     * 请输入验证码
     */
    private EditText mEtCode;
    private View mView2;
    /**
     * 获取验证码
     */
    private TextView mTvGetVer;
    /**
     * 请输入密码
     */
    private EditText mEtPass;
    private LinearLayout mLlQuick;
    /**
     * 确定
     */
    private TextView mTvSubmit;
    final Handler handlerStop = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    times1 = 0;
                    mTvGetVer.setText("获取验证码");
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
                mTvGetVer.setText(times1 / 1000 + "秒重新获取");
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
    private String phone;

    @Override
    protected FindPassPresente<FindPassContract.FindPassView> createPersenter() {
        return new FindPassPresente<>();
    }

    @Override
    protected int createLayout() {
        return R.layout.activity_find_pass;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        mIvBack = (ImageView) findViewById(R.id.iv_back);
        mIvBack.setOnClickListener(this);
        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mTvRight = (TextView) findViewById(R.id.tv_right);
        mImageRight = (ImageView) findViewById(R.id.image_right);
        mRl = (RelativeLayout) findViewById(R.id.rl);
        mTxt1 = (TextView) findViewById(R.id.txt1);
        mView1 = (View) findViewById(R.id.view1);
        mEtPhone = (EditText) findViewById(R.id.et_phone);
        mEtCode = (EditText) findViewById(R.id.et_code);
        mView2 = (View) findViewById(R.id.view2);
        mTvGetVer = (TextView) findViewById(R.id.tv_get_ver);
        mTvGetVer.setOnClickListener(this);
        mEtPass = (EditText) findViewById(R.id.et_pass);
        mLlQuick = (LinearLayout) findViewById(R.id.ll_quick);
        mTvSubmit = (TextView) findViewById(R.id.tv_submit);
        mTvSubmit.setOnClickListener(this);
    }

    @Override
    public void getData(FindPassBean findPassBean) {
        ToastUtil.showShort(findPassBean.getMas());
    }

    @Override
    public void onError(String error) {
        ToastUtil.showShort(error);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_get_ver:
                phone = mEtPhone.getText().toString();
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                mPersenter.getcode(phone);
                times1 = 60000;
                handler.postDelayed(update_thread, 0);

                break;
            case R.id.tv_submit:
                String code = mEtCode.getText().toString();
                if (!TextUtils.isEmpty(code)){
                    String pass = mEtPass.getText().toString();
                    mPersenter.getData(phone,pass,code);
                }
                break;
        }
    }
}
