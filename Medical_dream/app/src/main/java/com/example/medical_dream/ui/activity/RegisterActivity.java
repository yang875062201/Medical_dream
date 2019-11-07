package com.example.medical_dream.ui.activity;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medical_dream.R;
import com.example.medical_dream.base.BaseActivity;
import com.example.medical_dream.bean.login.regiter.RegisterBean;
import com.example.medical_dream.contract.login.RegisterContract;
import com.example.medical_dream.persenter.login.RegisterPresente;
import com.example.medical_dream.utils.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity<RegisterContract.RegisterView,
        RegisterPresente<RegisterContract.RegisterView>> implements
        RegisterContract.RegisterView {
    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.txt1)
    TextView mTxt1;
    @BindView(R.id.view1)
    View mView1;
    @BindView(R.id.et_quick_phone)
    EditText mEtQuickPhone;
    @BindView(R.id.et_quick_code)
    EditText mEtQuickCode;
    @BindView(R.id.view2)
    View mView2;
    @BindView(R.id.tv_quick_get_code)
    TextView mTvQuickGetCode;
    @BindView(R.id.tv_submit_quick_login)
    TextView mTvSubmitQuickLogin;
    @BindView(R.id.et_submit_quick_pass)
    EditText mEt_submit_quick_pass;
    String phone;
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
    protected int createLayout() {
        return R.layout.activity_register;
    }

    @Override
    protected RegisterPresente<RegisterContract.RegisterView> createPersenter() {
        return new RegisterPresente<>();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mTvQuickGetCode.setText("获取验证码");
    }


    @Override
    public void getData(RegisterBean registerBean) {
        ToastUtil.showShort(registerBean.getMas());
    }

    @Override
    public void onError(String error) {
        ToastUtil.showShort(error);
    }


    @OnClick({R.id.iv_back, R.id.tv_quick_get_code, R.id.tv_submit_quick_login})
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_quick_get_code:
                phone = mEtQuickPhone.getText().toString();
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                times1 = 60000;
                mPersenter.getcode(phone);
                handler.postDelayed(update_thread, 0);



                break;
            case R.id.tv_submit_quick_login:
                String code = mEtQuickCode.getText().toString();
                if (!TextUtils.isEmpty(code)){
                    String pass = mEt_submit_quick_pass.getText().toString();
                    mPersenter.getData(phone,code,pass);
                }

                break;
        }
    }
}
